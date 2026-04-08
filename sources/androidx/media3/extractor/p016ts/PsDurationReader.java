package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class PsDurationReader {

    /* JADX INFO: renamed from: c */
    public boolean f29678c;

    /* JADX INFO: renamed from: d */
    public boolean f29679d;

    /* JADX INFO: renamed from: e */
    public boolean f29680e;

    /* JADX INFO: renamed from: a */
    public final TimestampAdjuster f29676a = new TimestampAdjuster(0);

    /* JADX INFO: renamed from: f */
    public long f29681f = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f29682g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f29683h = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f29677b = new ParsableByteArray();

    /* JADX INFO: renamed from: b */
    public static int m11075b(int i, byte[] bArr) {
        return (bArr[i + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    /* JADX INFO: renamed from: c */
    public static long m11076c(ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.f25645b;
        if (parsableByteArray.m9548a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.m9552e(bArr, 0, 9);
        parsableByteArray.m9546G(i);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b2;
                    long j2 = b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m11077a(DefaultExtractorInput defaultExtractorInput) {
        byte[] bArr = Util.f25667c;
        ParsableByteArray parsableByteArray = this.f29677b;
        parsableByteArray.getClass();
        parsableByteArray.m9544E(bArr.length, bArr);
        this.f29678c = true;
        defaultExtractorInput.f28184f = 0;
    }
}
