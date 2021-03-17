SUMMARY = "Linux kernel v5.10 source"
DESCRIPTION = "Fetch source of the linux kernel up to the v5.10 tag"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KTAG = "5.10"

# We optionally split the v5.10 download via adding refs and depends.
# Multiple splits are achieved by adding more chained dependencies.
# Fragmented downloads can be less apt to timeout, but delta compression
# will lead to object duplication for > 1 objects/pack/*pack file and
# an increase in overall on-disk totals.  The du -hsm for bare repos:
#
# No split:	1521	epoch->5.10
# One split:	1730	epoch->4.0, 4.0->5.10 (854+877)
# Two splits:	1928	epoch->3.8, 3.8->4.12, 4.12->5.10 (628+647+653)
#
# Download sizes will vary depending on server compression settings.

python __anonymous () {
    splits = int(d.getVar("INITIAL_KERNEL_SPLIT") or 0)
    if not splits:
        return
    if splits == 1:
        d.setVar("KREF", "4.0")
        return
    if splits == 2:
        d.setVar("KREF", "4.12")
        return
    bb.fatal("Unsupported number of v5.10 kernel content splits (%s)." % splits)
}

require recipes-kernel/linux/fetch-linux.inc
