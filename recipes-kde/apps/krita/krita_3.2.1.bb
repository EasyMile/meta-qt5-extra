SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPLv3 & BSD"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qtmultimedia \
    curl \
    poppler \
    boost \
    libraw \
    libeigen \
    exiv2 \
    fftw \
    \
    karchive \
    kconfig \
    kwidgetsaddons \
    kcompletion \
    kcoreaddons \
    kguiaddons \
    ki18n \
    kitemmodels \
    kitemviews \
    kwindowsystem \
    kio \
    kcrash \
"

SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.gz \
    file://0001-fix-build-with-GLES2.patch \
"
SRC_URI[md5sum] = "00896775772991182e927248eb3ef198"
SRC_URI[sha256sum] = "ef06cee677d75861edca0e1f825bca42ff59b7200aeb827e16f8d1fb5ef14e39"

# krita has lots of include_directories(SYSTEM ${FOO_DIR})
# have no better way to make gcc6 happy
do_configure_append() {
     sed -i 's:-isystem:-I:g' `find ${B} -name *.make`
}

# HACK - but overidable by BSP
LDFLAGSGL = "-lGLESv2"
LDFLAGS += "${LDFLAGSGL}"

FILES_${PN} += " \
    ${datadir}/color \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kritaplugins \
    ${libdir}/kritaplugins \
"
