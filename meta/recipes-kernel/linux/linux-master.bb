SUMMARY = "Linux kernel mainline source"
DESCRIPTION = "Fetch source of the latest linux mainline kernel"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DL_NAME = ".torvalds.linux-master"
KORG_REF = "git.kernel.org.torvalds.linux-5.10"
SRC_URI = "${KORG_URLBASE}/torvalds/linux;rev=master;nobranch=1;dlname=${DL_NAME};packref=${KORG_REF}"

do_fetch[depends] += "linux-5.10:do_fetch"

require recipes-kernel/linux/fetch-only.inc
