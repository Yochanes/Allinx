package androidx.media3.extractor.avi;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import java.math.RoundingMode;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ChunkReader {

    /* JADX INFO: renamed from: a */
    public final AviStreamHeaderChunk f28353a;

    /* JADX INFO: renamed from: b */
    public final TrackOutput f28354b;

    /* JADX INFO: renamed from: c */
    public final int f28355c;

    /* JADX INFO: renamed from: d */
    public final int f28356d;

    /* JADX INFO: renamed from: e */
    public final long f28357e;

    /* JADX INFO: renamed from: f */
    public int f28358f;

    /* JADX INFO: renamed from: g */
    public int f28359g;

    /* JADX INFO: renamed from: h */
    public int f28360h;

    /* JADX INFO: renamed from: i */
    public int f28361i;

    /* JADX INFO: renamed from: j */
    public int f28362j;

    /* JADX INFO: renamed from: k */
    public int f28363k;

    /* JADX INFO: renamed from: l */
    public long f28364l;

    /* JADX INFO: renamed from: m */
    public long[] f28365m;

    /* JADX INFO: renamed from: n */
    public int[] f28366n;

    public ChunkReader(int i, AviStreamHeaderChunk aviStreamHeaderChunk, TrackOutput trackOutput) {
        this.f28353a = aviStreamHeaderChunk;
        int iM10831a = aviStreamHeaderChunk.m10831a();
        boolean z2 = true;
        if (iM10831a != 1 && iM10831a != 2) {
            z2 = false;
        }
        Assertions.m9460a(z2);
        int i2 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f28355c = (iM10831a == 2 ? 1667497984 : 1651965952) | i2;
        int i3 = aviStreamHeaderChunk.f28350d;
        long j = ((long) aviStreamHeaderChunk.f28348b) * 1000000;
        long j2 = aviStreamHeaderChunk.f28349c;
        int i4 = Util.f25665a;
        this.f28357e = Util.m9604N(i3, j, j2, RoundingMode.DOWN);
        this.f28354b = trackOutput;
        this.f28356d = iM10831a == 2 ? i2 | 1650720768 : -1;
        this.f28364l = -1L;
        this.f28365m = new long[512];
        this.f28366n = new int[512];
        this.f28358f = i3;
    }

    /* JADX INFO: renamed from: a */
    public final SeekPoint m10832a(int i) {
        return new SeekPoint(((this.f28357e * ((long) 1)) / ((long) this.f28358f)) * ((long) this.f28366n[i]), this.f28365m[i]);
    }

    /* JADX INFO: renamed from: b */
    public final SeekMap.SeekPoints m10833b(long j) {
        if (this.f28363k == 0) {
            SeekPoint seekPoint = new SeekPoint(0L, this.f28364l);
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = (int) (j / ((this.f28357e * ((long) 1)) / ((long) this.f28358f)));
        int iM9612c = Util.m9612c(this.f28366n, i, true, true);
        if (this.f28366n[iM9612c] == i) {
            SeekPoint seekPointM10832a = m10832a(iM9612c);
            return new SeekMap.SeekPoints(seekPointM10832a, seekPointM10832a);
        }
        SeekPoint seekPointM10832a2 = m10832a(iM9612c);
        int i2 = iM9612c + 1;
        return i2 < this.f28365m.length ? new SeekMap.SeekPoints(seekPointM10832a2, m10832a(i2)) : new SeekMap.SeekPoints(seekPointM10832a2, seekPointM10832a2);
    }
}
