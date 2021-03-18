# Boilerplate to fetch a single branch of stable.
# Reference is non-optional; there is no excuse to not use one.
# Use a packref for a fixed tag reference; altref for master.

require recipes-kernel/linux/fetch-only.inc

python __anonymous () {
    kref = d.getVar("KREF") or "master"
    if kref == "master":
        d.setVar("RTYPE", "alt")
    else:
        d.setVar("RTYPE", "pack")
    clonehost = d.getVar("KORG_SERVER")
    d.setVar("KORG_REF", "%s.torvalds.linux-%s" % (clonehost, kref))
    d.setVar("KORG_REFDEP", "linux-%s:do_fetch"% kref)
}

do_fetch[depends] += "${KORG_REFDEP}"

STABLE_REV ?= "${STABLE}"
DL_NAME ?= ".stable.${STABLE}"
GITCLONEARGS = "--bare --single-branch --branch ${STABLE}"
GITFETCHREFS ?= "refs/heads/${STABLE}:refs/heads/${STABLE}"
SRC_URI = "${KORG_URLBASE}/stable/linux-stable;rev=${STABLE_REV};nobranch=1;dlname=${DL_NAME};${RTYPE}ref=${KORG_REF}"
