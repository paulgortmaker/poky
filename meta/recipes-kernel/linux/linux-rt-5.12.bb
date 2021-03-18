SUMMARY = "Linux preempt-rt v5.12.y kernel source"
DESCRIPTION = "Fetch source of the preempt-rt linux kernel up to the end of the v5.12.y series"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

RT = "5.12"

# Note: v5.12 RT will move to linux-stable-rt repo sometime
RT_REPO = "linux-rt-devel"

require recipes-kernel/linux/fetch-rt.inc
