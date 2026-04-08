package androidx.media3.extractor.avi;

import androidx.media3.common.util.Log;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AviStreamHeaderChunk implements AviChunk {

    /* JADX INFO: renamed from: a */
    public final int f28347a;

    /* JADX INFO: renamed from: b */
    public final int f28348b;

    /* JADX INFO: renamed from: c */
    public final int f28349c;

    /* JADX INFO: renamed from: d */
    public final int f28350d;

    /* JADX INFO: renamed from: e */
    public final int f28351e;

    /* JADX INFO: renamed from: f */
    public final int f28352f;

    public AviStreamHeaderChunk(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f28347a = i;
        this.f28348b = i2;
        this.f28349c = i3;
        this.f28350d = i4;
        this.f28351e = i5;
        this.f28352f = i6;
    }

    /* JADX INFO: renamed from: a */
    public final int m10831a() {
        int i = this.f28347a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        Log.m9511g("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1752331379;
    }
}
