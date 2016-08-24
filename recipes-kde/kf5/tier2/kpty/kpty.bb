SUMMARY = "Pty abstraction"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib

DEPENDS += "kcoreaddons ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "904db48ad9e21de2df42738775261b23"
SRC_URI[sha256sum] = "4bca7c6ceb870f028a37077ee50ed53b63403575baae36dd80c81a96b34cf23d"

CMAKE_ALIGN_SYSROOT[1] = "KF5Pty, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Pty, -S${includedir}, -S${STAGING_INCDIR}"

