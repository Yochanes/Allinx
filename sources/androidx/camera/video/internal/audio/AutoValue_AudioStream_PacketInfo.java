package androidx.camera.video.internal.audio;

import androidx.camera.video.internal.audio.AudioStream;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AudioStream_PacketInfo extends AudioStream.PacketInfo {
    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    /* JADX INFO: renamed from: a */
    public final int mo1855a() {
        return 0;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.PacketInfo
    /* JADX INFO: renamed from: b */
    public final long mo1856b() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStream.PacketInfo)) {
            return false;
        }
        AudioStream.PacketInfo packetInfo = (AudioStream.PacketInfo) obj;
        return packetInfo.mo1855a() == 0 && 0 == packetInfo.mo1856b();
    }

    public final int hashCode() {
        return ((int) (0 ^ (0 >>> 32))) ^ ((1000003 ^ 0) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(0);
        sb.append(", timestampNs=");
        return AbstractC0000a.m12i(0L, "}", sb);
    }
}
