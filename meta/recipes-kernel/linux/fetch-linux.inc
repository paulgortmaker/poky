# Boilerplate to fetch up to a single tag of mainline

require recipes-kernel/linux/fetch-only.inc

GITCLONEARGS = "--bare --single-branch --branch v${KTAG}"
DL_NAME = ".torvalds.linux-${KTAG}"
SRC_URI = "${KORG_URLBASE}/torvalds/linux;tag=v${KTAG};nobranch=1;static=1;dlname=${DL_NAME}"
