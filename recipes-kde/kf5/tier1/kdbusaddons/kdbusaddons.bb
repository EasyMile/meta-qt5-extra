SUMMARY = "Addons to QtDBus"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

PV = "${KF5_VERSION}"
SRCREV = "e939e5136711df31ace7ff627f3a0e58c60f3588"
S = "${WORKDIR}/git"

CMAKE_HIDE_ERROR[1] = "KF5DBusAddons, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5DBusAddons, -S${includedir}, -S${STAGING_INCDIR}"
