package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AudioEncoderConfig extends AudioEncoderConfig {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends AudioEncoderConfig.Builder {
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderConfig
    /* JADX INFO: renamed from: a */
    public final int mo1888a() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioEncoderConfig)) {
            return false;
        }
        ((AutoValue_AudioEncoderConfig) ((AudioEncoderConfig) obj)).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append((String) null);
        sb.append(", profile=");
        sb.append(0);
        sb.append(", inputTimebase=null, bitrate=");
        sb.append(0);
        sb.append(", sampleRate=");
        sb.append(0);
        sb.append(", channelCount=");
        return AbstractC0000a.m11h(0, "}", sb);
    }
}
