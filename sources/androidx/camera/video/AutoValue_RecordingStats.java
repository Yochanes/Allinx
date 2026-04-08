package androidx.camera.video;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_RecordingStats extends RecordingStats {
    @Override // androidx.camera.video.RecordingStats
    /* JADX INFO: renamed from: a */
    public final AudioStats mo1811a() {
        return null;
    }

    @Override // androidx.camera.video.RecordingStats
    /* JADX INFO: renamed from: b */
    public final long mo1812b() {
        return 0L;
    }

    @Override // androidx.camera.video.RecordingStats
    /* JADX INFO: renamed from: c */
    public final long mo1813c() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordingStats)) {
            return false;
        }
        RecordingStats recordingStats = (RecordingStats) obj;
        if (0 != recordingStats.mo1813c() || 0 != recordingStats.mo1812b()) {
            return false;
        }
        recordingStats.mo1811a();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=0, numBytesRecorded=0, audioStats=" + ((Object) null) + "}";
    }
}
