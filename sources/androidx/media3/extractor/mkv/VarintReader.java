package androidx.media3.extractor.mkv;

import androidx.media3.extractor.DefaultExtractorInput;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class VarintReader {

    /* JADX INFO: renamed from: d */
    public static final long[] f28677d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a */
    public final byte[] f28678a = new byte[8];

    /* JADX INFO: renamed from: b */
    public int f28679b;

    /* JADX INFO: renamed from: c */
    public int f28680c;

    /* JADX INFO: renamed from: a */
    public static long m10888a(byte[] bArr, int i, boolean z2) {
        long j = ((long) bArr[0]) & 255;
        if (z2) {
            j &= ~f28677d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* JADX INFO: renamed from: b */
    public static int m10889b(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((f28677d[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final long m10890c(DefaultExtractorInput defaultExtractorInput, boolean z2, boolean z3, int i) throws EOFException, InterruptedIOException {
        int i2 = this.f28679b;
        byte[] bArr = this.f28678a;
        if (i2 == 0) {
            if (!defaultExtractorInput.mo10780a(bArr, 0, 1, z2)) {
                return -1L;
            }
            int iM10889b = m10889b(bArr[0] & UnsignedBytes.MAX_VALUE);
            this.f28680c = iM10889b;
            if (iM10889b == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f28679b = 1;
        }
        int i3 = this.f28680c;
        if (i3 > i) {
            this.f28679b = 0;
            return -2L;
        }
        if (i3 != 1) {
            defaultExtractorInput.mo10780a(bArr, 1, i3 - 1, false);
        }
        this.f28679b = 0;
        return m10888a(bArr, this.f28680c, z3);
    }
}
