SUMMARY = "Provides integration of QML and KDE Frameworks"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative kconfig kconfig-native ki18n kiconthemes kio kwidgetsaddons \
            kwindowsystem kglobalaccel kguiaddons kpackage libepoxy gettext-native \
            kcoreaddons-native kauth-native kpackage-native"

SRC_URI += "file://0001-kpackagelauncherqml-Add-include-of-QDebug.patch"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f160282c3735eb1f0a97befdb89c86ec"
SRC_URI[sha256sum] = "2dde12110310cbb980381fd51c0926f2f5cf202760a0a871a01a2412080a5d52"

FILES_${PN} += "${OE_QMAKE_PATH_QML}/org/kde"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/org/kde/*/.debug \
    ${OE_QMAKE_PATH_QML}/org/kde/*/*/.debug \
"
