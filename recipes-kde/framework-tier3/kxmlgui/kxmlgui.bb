SUMMARY = "User configurable main windows"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

require ../../kf5-version.inc

inherit kde cmake-lib

DEPENDS += "kitemviews kconfig kglobalaccel kconfigwidgets ki18n kiconthemes ktextwidgets kwidgetsaddons kwindowsystem attica"

SRCREV = "41a2bcc80650843aee553a9b47e1ed86fb898268"
# REVISIT remove ugly hack for wayland-only environments
SRC_URI += "file://0001-workaround-session-less-qtbase-required-for-pure-way.patch"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5XmlGui, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5XmlGui, -S${includedir}, -S${STAGING_INCDIR}"

# evt. put ksendbugmail to separate package later
FILES_${PN}-dbg += "${libdir}/kxmlgui/kf5/.debug/"