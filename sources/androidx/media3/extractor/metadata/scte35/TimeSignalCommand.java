package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TimeSignalCommand extends SpliceCommand {

    /* JADX INFO: renamed from: a */
    public final long f28547a;

    /* JADX INFO: renamed from: b */
    public final long f28548b;

    public TimeSignalCommand(long j, long j2) {
        this.f28547a = j;
        this.f28548b = j2;
    }

    /* JADX INFO: renamed from: d */
    public static long m10872d(long j, ParsableByteArray parsableByteArray) {
        long jM9568u = parsableByteArray.m9568u();
        if ((128 & jM9568u) != 0) {
            return 8589934591L & ((((jM9568u & 1) << 32) | parsableByteArray.m9570w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f28547a);
        sb.append(", playbackPositionUs= ");
        return AbstractC0000a.m12i(this.f28548b, " }", sb);
    }
}
