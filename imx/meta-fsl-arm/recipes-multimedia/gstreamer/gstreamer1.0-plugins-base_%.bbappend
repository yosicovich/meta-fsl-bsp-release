FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://do-not-change-eos-event-to-gap-event2.patch \
                   file://do-not-change-eos-event-to-gap-event3.patch \
                   file://fix-id3demux-utf16-to-utf8-issue.patch \
                   file://handle-audio-video-decoder-error.patch \
                   file://videobuffer_updata_alignment_update.patch \
                   file://0002-video-frame-Add-GST_VIDEO_FRAME_MAP_FLAG_NO_REF.patch \
                   file://0003-videofilter-Use-new-GST_VIDEO_FRAME_MAP_FLAG_NO_REF.patch \
                   file://0001-video-frame-Don-t-ref-buffers-twice-when-mapping.patch \
"

