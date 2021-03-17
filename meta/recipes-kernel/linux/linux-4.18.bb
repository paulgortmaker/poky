SUMMARY = "Linux kernel v4.18 source"
DESCRIPTION = "Fetch source of the linux kernel up to the v4.18 tag"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

KTAG = "4.18"
KREF = "4.3"

require recipes-kernel/linux/fetch-linux.inc
