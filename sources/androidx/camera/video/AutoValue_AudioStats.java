package androidx.camera.video;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AudioStats extends AudioStats {
    @Override // androidx.camera.video.AudioStats
    /* JADX INFO: renamed from: a */
    public final double mo1799a() {
        return 0.0d;
    }

    @Override // androidx.camera.video.AudioStats
    /* JADX INFO: renamed from: b */
    public final int mo1800b() {
        return 0;
    }

    @Override // androidx.camera.video.AudioStats
    /* JADX INFO: renamed from: c */
    public final Throwable mo1801c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStats)) {
            return false;
        }
        AudioStats audioStats = (AudioStats) obj;
        return audioStats.mo1800b() == 0 && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(audioStats.mo1799a()) && audioStats.mo1801c() == null;
    }

    public final int hashCode() {
        return ((((1000003 ^ 0) * 1000003) ^ ((int) (Double.doubleToLongBits(0.0d) ^ (Double.doubleToLongBits(0.0d) >>> 32)))) * 1000003) ^ 0;
    }

    public final String toString() {
        return "AudioStats{audioState=0, audioAmplitudeInternal=0.0, errorCause=" + ((Object) null) + "}";
    }
}
