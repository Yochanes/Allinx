package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TsUtil {
    /* JADX INFO: renamed from: a */
    public static long m11083a(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.m9546G(i);
        if (parsableByteArray.m9548a() < 5) {
            return -9223372036854775807L;
        }
        int iM9554g = parsableByteArray.m9554g();
        if ((8388608 & iM9554g) != 0 || ((2096896 & iM9554g) >> 8) != i2 || (iM9554g & 32) == 0 || parsableByteArray.m9568u() < 7 || parsableByteArray.m9548a() < 7 || (parsableByteArray.m9568u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        parsableByteArray.m9552e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }
}
