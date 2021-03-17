# Boilerplate to fetch up to a single tag of mainline

require recipes-kernel/linux/fetch-only.inc

python __anonymous () {
    kref = d.getVar("KREF")
    if not kref:
        d.setVar("KORG_REF", "")
        d.setVar("KORG_REFDEP", "")
        return;
    clonehost = d.getVar("KORG_SERVER")
    d.setVar("KORG_REF", ";packref=%s.torvalds.linux-%s" % (clonehost, kref))
    d.setVar("KORG_REFDEP", "linux-%s:do_fetch"% kref)
}

do_fetch[depends] += "${KORG_REFDEP}"

GITCLONEARGS = "--bare --single-branch --branch v${KTAG}"
DL_NAME = ".torvalds.linux-${KTAG}"
SRC_URI = "${KORG_URLBASE}/torvalds/linux;tag=v${KTAG};nobranch=1;static=1;dlname=${DL_NAME}${KORG_REF}"
