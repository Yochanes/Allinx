package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.AudioMimeInfo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AudioMimeInfo extends AudioMimeInfo {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends AudioMimeInfo.Builder {
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    /* JADX INFO: renamed from: a */
    public final String mo1881a() {
        return null;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    /* JADX INFO: renamed from: b */
    public final int mo1882b() {
        return 0;
    }

    @Override // androidx.camera.video.internal.config.AudioMimeInfo
    /* JADX INFO: renamed from: c */
    public final EncoderProfilesProxy.AudioProfileProxy mo1880c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioMimeInfo)) {
            return false;
        }
        ((AudioMimeInfo) obj).mo1881a();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + ((String) null) + ", profile=0, compatibleAudioProfile=" + ((Object) null) + "}";
    }
}
