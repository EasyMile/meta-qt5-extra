SUMMARY = "All kde packages - just for build test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup distro_features_check

RDEPENDS_${PN} = " \
    kf5-world \
    plasma-world \
    kde-apps-world \
    \
    kpmcore \
    libdebconf-kde \
    libqapt \
    muon \
    partitionmanager \
    phonon \
    polkit-qt-1 \
    qca \
"



