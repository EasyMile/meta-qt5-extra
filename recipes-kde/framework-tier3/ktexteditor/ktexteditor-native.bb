require ${BPN}.inc

inherit native

DEPENDS += "qtxmlpatterns-native"

SRC_URI += "file://0001-build-only-native-katehighlightingindexer.patch"

do_install_append() {
	install -d ${D}/${bindir}
	install -m 0755 ${B}/src/syntax/data/katehighlightingindexer ${D}/${bindir}
}