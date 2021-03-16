SUMMARY = "Linux kernel v5.10 source"
DESCRIPTION = "Fetch source of the linux kernel up to the v5.10 tag"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KTAG = "5.10"

require recipes-kernel/linux/fetch-linux.inc
