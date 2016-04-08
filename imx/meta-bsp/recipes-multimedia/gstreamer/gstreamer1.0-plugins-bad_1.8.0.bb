include recipes-multimedia/gstreamer/gstreamer1.0-plugins-bad.inc

# Add extra patch directory
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/files:"
FILESEXTRAPATHS_prepend := "${BSPDIR}/sources/poky/meta/recipes-multimedia/gstreamer/${PN}:"

LIC_FILES_CHKSUM = "file://COPYING;md5=73a5855a8119deb017f5f13cf327095d \
                    file://COPYING.LIB;md5=21682e4e8fea52413fd26c60acb907e5 \
                    file://gst/tta/crc32.h;beginline=12;endline=29;md5=27db269c575d1e5317fffca2d33b3b50 \
                    file://gst/tta/filters.h;beginline=12;endline=29;md5=8a08270656f2f8ad7bb3655b83138e5a"

# Note: The mpg123 plugin was moved to gst-plugins-ugly prior to the 1.7.2
# release, so this line should be removed during the update to 1.8.x
# https://cgit.freedesktop.org/gstreamer/gst-plugins-bad/commit/?id=08d8aefcdaaf89ecb6dd53ec1e4f95cd42d01664

# unrecognised options
#PACKAGECONFIG[mpg123] = "--enable-mpg123,--disable-mpg123,mpg123"

# Note: The gsettings plug-in was dropped prior to the 1.7.2 release,
# so this line should be removed during the update to 1.8.x
# https://cgit.freedesktop.org/gstreamer/gst-plugins-bad/commit/?id=914291808ad10621d6a74031f3d46d45eef5a3a3

# unrecognised options
#EXTRA_OECONF += "--disable-gsettings"

SRC_URI = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-bad/gst-plugins-bad-${PV}.tar.xz \
"

SRC_URI_remove = "file://0001-PATCH-install-gstaggregator-and-gstvideoaggregator-h.patch "

SRC_URI[md5sum] = "1c2d797bb96a81e9ef570c7a0a37203e"
SRC_URI[sha256sum] = "116376dd1085082422e0b21b0ecd3d1cb345c469c58e32463167d4675f4ca90e"

S = "${WORKDIR}/gst-plugins-bad-${PV}"