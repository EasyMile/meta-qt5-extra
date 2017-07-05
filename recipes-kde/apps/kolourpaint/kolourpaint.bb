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
SRC_URI[md5sum] = "8887de21e2a0a1ec5ddeeee4e9321611"
SRC_URI[sha256sum] = "7a446bf52a98b3c79a933781cf06811c82f6ff11377122fe26a364f6f1ac6f26"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${OE_QMAKE_PATH_PLUGINS} \
"
