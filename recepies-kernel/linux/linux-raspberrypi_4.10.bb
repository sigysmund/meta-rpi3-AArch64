FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.10.0"

SRCREV = "9a05b87fb5c3caca8a4572d9d30b1f3ff69aa607"
SRC_URI = "git://github.com/Electron752/linux.git;branch=rpi-4.10.y+vchiq64-compat"

KERNEL_DEFCONFIG_raspberrypi2 = "bcmrpi3_defconfig"

require recipes-kernel/linux/linux-raspberrypi.inc
