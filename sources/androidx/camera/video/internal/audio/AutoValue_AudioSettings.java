package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioSettings;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AudioSettings extends AudioSettings {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends AudioSettings.Builder {
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    /* JADX INFO: renamed from: a */
    public final int mo1850a() {
        return 0;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    /* JADX INFO: renamed from: b */
    public final int mo1851b() {
        return 0;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    /* JADX INFO: renamed from: c */
    public final int mo1852c() {
        return 0;
    }

    @Override // androidx.camera.video.internal.audio.AudioSettings
    /* JADX INFO: renamed from: d */
    public final int mo1853d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSettings)) {
            return false;
        }
        AudioSettings audioSettings = (AudioSettings) obj;
        return audioSettings.mo1851b() == 0 && audioSettings.mo1853d() == 0 && audioSettings.mo1852c() == 0 && audioSettings.mo1850a() == 0;
    }

    public final int hashCode() {
        return ((((((1000003 ^ 0) * 1000003) ^ 0) * 1000003) ^ 0) * 1000003) ^ 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(0);
        sb.append(", sampleRate=");
        sb.append(0);
        sb.append(", channelCount=");
        sb.append(0);
        sb.append(", audioFormat=");
        return AbstractC0000a.m11h(0, "}", sb);
    }
}
