package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoMimeInfo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_VideoMimeInfo extends VideoMimeInfo {

    /* JADX INFO: renamed from: a */
    public final String f3422a;

    /* JADX INFO: renamed from: b */
    public final int f3423b;

    /* JADX INFO: renamed from: c */
    public final EncoderProfilesProxy.VideoProfileProxy f3424c;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends VideoMimeInfo.Builder {

        /* JADX INFO: renamed from: a */
        public String f3425a;

        /* JADX INFO: renamed from: b */
        public Integer f3426b;

        /* JADX INFO: renamed from: c */
        public EncoderProfilesProxy.VideoProfileProxy f3427c;
    }

    public AutoValue_VideoMimeInfo(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f3422a = str;
        this.f3423b = i;
        this.f3424c = videoProfileProxy;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    /* JADX INFO: renamed from: a */
    public final String mo1881a() {
        return this.f3422a;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    /* JADX INFO: renamed from: b */
    public final int mo1882b() {
        return this.f3423b;
    }

    @Override // androidx.camera.video.internal.config.VideoMimeInfo
    /* JADX INFO: renamed from: c */
    public final EncoderProfilesProxy.VideoProfileProxy mo1883c() {
        return this.f3424c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoMimeInfo)) {
            return false;
        }
        VideoMimeInfo videoMimeInfo = (VideoMimeInfo) obj;
        if (!this.f3422a.equals(videoMimeInfo.mo1881a()) || this.f3423b != videoMimeInfo.mo1882b()) {
            return false;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f3424c;
        return videoProfileProxy == null ? videoMimeInfo.mo1883c() == null : videoProfileProxy.equals(videoMimeInfo.mo1883c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f3422a.hashCode() ^ 1000003) * 1000003) ^ this.f3423b) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f3424c;
        return iHashCode ^ (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f3422a + ", profile=" + this.f3423b + ", compatibleVideoProfile=" + this.f3424c + "}";
    }
}
