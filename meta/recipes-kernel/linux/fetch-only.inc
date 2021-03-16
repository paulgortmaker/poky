# There's nothing to do here, except fetch

do_unpack[noexec] = "1"
do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install[noexec] = "1"

inherit nopackages allarch meta

deltask do_deploy_source_date_epoch
deltask do_prepare_recipe_sysroot
deltask do_populate_sysroot
deltask do_populate_lic
deltask do_rm_work

EXCLUDE_FROM_WORLD = "1"
KORG_SERVER ?= "git.kernel.org"
KORG_PATH ?= "/pub/scm/linux/kernel/git"
KORG_URLBASE ?= "git://${KORG_SERVER}${KORG_PATH}"
