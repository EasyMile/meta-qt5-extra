SUMMARY = "KolourPaint - Paint Program"
LICENSE = "GPLv2 & GFDL-1.2 & LGPLv2 & MIT"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7549f6da638b0246572ed9cf4275b860 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
    file://COPYING.LIB;md5=3214f080875748938ba060314b4f727d \
"

inherit kde-apps gtk-icon-cache

DEPENDS += "\
    kdelibs4support \
    kconfigwidgets \
    kcoreaddons \
    kdoctools \
    ki18n \
    kiconthemes \
    kio \
    kcmutils \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
    libkexiv2 \
" 

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "1b7904943019569dd35a4482bc37d612"
SRC_URI[sha256sum] = "75af69ce07e8ce2a8c0513b8e216a81b6b7047a9caff44826bfc19934d418ea1"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
