SUMMARY = "Linux stable kernel v5.10.y source"
DESCRIPTION = "Fetch source of the stable linux kernel up to the end of the v5.10.y series"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

STABLE = "linux-5.10.y"
KREF = "5.10"

require recipes-kernel/linux/fetch-stable.inc
