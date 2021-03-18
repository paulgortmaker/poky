SUMMARY = "Linux preempt-rt v5.10.y kernel source"
DESCRIPTION = "Fetch source of the preempt-rt linux kernel up to the end of the v5.10.y series"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

RT = "5.10"

require recipes-kernel/linux/fetch-rt.inc
