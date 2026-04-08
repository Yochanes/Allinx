package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Longs;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Mp4TimestampData implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final long f25697a;

    /* JADX INFO: renamed from: b */
    public final long f25698b;

    /* JADX INFO: renamed from: c */
    public final long f25699c;

    public Mp4TimestampData(long j, long j2, long j3) {
        this.f25697a = j;
        this.f25698b = j2;
        this.f25699c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.f25697a == mp4TimestampData.f25697a && this.f25698b == mp4TimestampData.f25698b && this.f25699c == mp4TimestampData.f25699c;
    }

    public final int hashCode() {
        return Longs.hashCode(this.f25699c) + ((Longs.hashCode(this.f25698b) + ((Longs.hashCode(this.f25697a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f25697a + ", modification time=" + this.f25698b + ", timescale=" + this.f25699c;
    }
}
