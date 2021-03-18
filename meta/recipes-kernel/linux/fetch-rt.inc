# Boilerplate to fetch a single branch of preempt-rt
# There are two different repos, and two branching name patterns.

require recipes-kernel/linux/fetch-only.inc

python __anonymous () {
    rt = d.getVar("RT")
    rt_repo = d.getVar("RT_REPO")
    if rt_repo.endswith("devel"):
        d.setVar("RT_BRANCH", "linux-%s.y-rt" % rt)
    else:
        d.setVar("RT_BRANCH", "v%s-rt" % rt)
    clonehost = d.getVar("KORG_SERVER")
    d.setVar("KORG_REF", "%s.stable.linux-%s.y" % (clonehost, rt))
    d.setVar("KORG_REFDEP", "stable-%s:do_fetch" % rt)
}

do_fetch[depends] += "${KORG_REFDEP}"

RT_REV ?= "${RT_BRANCH}"
RT_REPO ?= "linux-stable-rt"
GITCLONEARGS = "--bare --single-branch --branch ${RT_BRANCH}"
GITFETCHREFS ?= "refs/heads/${RT_BRANCH}:refs/heads/${RT_BRANCH}"
DL_NAME = ".preempt-rt.linux-${RT}.y"
SRC_URI = "${KORG_URLBASE}/rt/${RT_REPO};rev=${RT_REV};nobranch=1;dlname=${DL_NAME};altref=${KORG_REF}"
