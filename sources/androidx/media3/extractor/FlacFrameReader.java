package androidx.media3.extractor;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FlacFrameReader {

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleNumberHolder {

        /* JADX INFO: renamed from: a */
        public long f28210a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m10804a(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i, SampleNumberHolder sampleNumberHolder) {
        int i2 = parsableByteArray.f25645b;
        long jM9570w = parsableByteArray.m9570w();
        long j = jM9570w >>> 16;
        if (j == i) {
            boolean z2 = (j & 1) == 1;
            int i3 = (int) ((jM9570w >> 12) & 15);
            int i4 = (int) ((jM9570w >> 8) & 15);
            int i5 = (int) ((jM9570w >> 4) & 15);
            int i6 = (int) ((jM9570w >> 1) & 7);
            boolean z3 = (jM9570w & 1) == 1;
            if (i5 > 7 ? !(i5 > 10 || flacStreamMetadata.f28220g != 2) : i5 == flacStreamMetadata.f28220g - 1) {
                if ((i6 == 0 || i6 == flacStreamMetadata.f28222i) && !z3) {
                    try {
                        long jM9541B = parsableByteArray.m9541B();
                        if (!z2) {
                            jM9541B *= (long) flacStreamMetadata.f28215b;
                        }
                        sampleNumberHolder.f28210a = jM9541B;
                        int iM10805b = m10805b(i3, parsableByteArray);
                        if (iM10805b != -1 && iM10805b <= flacStreamMetadata.f28215b) {
                            if (i4 != 0) {
                                if (i4 > 11) {
                                    int i7 = flacStreamMetadata.f28218e;
                                    if (i4 == 12) {
                                        if (parsableByteArray.m9568u() * 1000 == i7) {
                                        }
                                    } else if (i4 <= 14) {
                                        int iM9540A = parsableByteArray.m9540A();
                                        if (i4 == 14) {
                                            iM9540A *= 10;
                                        }
                                        if (iM9540A == i7) {
                                        }
                                    }
                                } else if (i4 == flacStreamMetadata.f28219f) {
                                    int iM9568u = parsableByteArray.m9568u();
                                    int i8 = parsableByteArray.f25645b;
                                    byte[] bArr = parsableByteArray.f25644a;
                                    int i9 = i8 - 1;
                                    int i10 = Util.f25665a;
                                    int i11 = 0;
                                    for (int i12 = i2; i12 < i9; i12++) {
                                        i11 = Util.f25675k[i11 ^ (bArr[i12] & UnsignedBytes.MAX_VALUE)];
                                    }
                                    if (iM9568u == i11) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static int m10805b(int i, ParsableByteArray parsableByteArray) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return parsableByteArray.m9568u() + 1;
            case 7:
                return parsableByteArray.m9540A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
