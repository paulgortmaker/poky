SUMMARY = "Linux stable kernel v5.12.y source"
DESCRIPTION = "Fetch source of the stable linux kernel up to the end of the v5.12.y series"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

# The stable branch "linux-5.12.y" wont exist until late April or early May.
# For now this will just create a linux-stable "empty" 5.12.x placeholder.
#STABLE = "linux-5.12.y"
STABLE = "master"
DL_NAME = ".stable.linux-5.12.y"

# mainline latest is the default stable reference if none is specified.
# KREF = "master"

require recipes-kernel/linux/fetch-stable.inc
