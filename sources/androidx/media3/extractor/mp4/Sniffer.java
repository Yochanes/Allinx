package androidx.media3.extractor.mp4;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import com.google.common.primitives.ImmutableIntArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Sniffer {

    /* JADX INFO: renamed from: a */
    public static final int[] f28867a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static boolean m10932a(int i, boolean z2) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z2) {
            return true;
        }
        int[] iArr = f28867a;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SniffFailure m10933b(ExtractorInput extractorInput, boolean z2, boolean z3) {
        SniffFailure sniffFailure;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        long length = extractorInput.getLength();
        long j2 = -1;
        long j3 = 4096;
        if (length != -1 && length <= 4096) {
            j3 = length;
        }
        int i5 = (int) j3;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (i7 < i5) {
            parsableByteArray.m9543D(8);
            boolean z5 = true;
            if (!extractorInput.mo10781c(parsableByteArray.f25644a, i6, 8, true)) {
                break;
            }
            long jM9570w = parsableByteArray.m9570w();
            int iM9554g = parsableByteArray.m9554g();
            if (jM9570w == 1) {
                j = j2;
                extractorInput.mo10786j(parsableByteArray.f25644a, 8, 8);
                i3 = 16;
                parsableByteArray.m9545F(16);
                jM9570w = parsableByteArray.m9562o();
                i2 = i7;
            } else {
                j = j2;
                if (jM9570w == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j) {
                        i2 = i7;
                        jM9570w = (length2 - extractorInput.mo10782d()) + ((long) 8);
                    } else {
                        i2 = i7;
                    }
                    i3 = 8;
                }
            }
            long j4 = jM9570w;
            long j5 = i3;
            if (j4 < j5) {
                return new AtomSizeTooSmallSniffFailure();
            }
            int i8 = i2 + i3;
            sniffFailure = null;
            if (iM9554g == 1836019574) {
                i5 += (int) j4;
                if (length != -1 && i5 > length) {
                    i5 = (int) length;
                }
                i7 = i8;
                j2 = j;
                i6 = 0;
            } else {
                if (iM9554g == 1836019558 || iM9554g == 1836475768) {
                    i = 1;
                    break;
                }
                if (iM9554g == 1835295092) {
                    z4 = true;
                }
                long j6 = length;
                if ((((long) i8) + j4) - j5 >= i5) {
                    i = 0;
                    break;
                }
                int i9 = (int) (j4 - j5);
                i7 = i8 + i9;
                if (iM9554g != 1718909296) {
                    i4 = 0;
                    if (i9 != 0) {
                        extractorInput.mo10783e(i9);
                    }
                } else {
                    if (i9 < 8) {
                        return new AtomSizeTooSmallSniffFailure();
                    }
                    parsableByteArray.m9543D(i9);
                    i4 = 0;
                    extractorInput.mo10786j(parsableByteArray.f25644a, 0, i9);
                    if (m10932a(parsableByteArray.m9554g(), z3)) {
                        z4 = true;
                    }
                    parsableByteArray.m9547H(4);
                    int iM9548a = parsableByteArray.m9548a() / 4;
                    if (!z4 && iM9548a > 0) {
                        iArr = new int[iM9548a];
                        int i10 = 0;
                        while (true) {
                            if (i10 >= iM9548a) {
                                z5 = z4;
                                break;
                            }
                            int iM9554g2 = parsableByteArray.m9554g();
                            iArr[i10] = iM9554g2;
                            if (m10932a(iM9554g2, z3)) {
                                break;
                            }
                            i10++;
                        }
                    } else {
                        z5 = z4;
                        iArr = null;
                    }
                    if (!z5) {
                        UnsupportedBrandsSniffFailure unsupportedBrandsSniffFailure = new UnsupportedBrandsSniffFailure();
                        if (iArr != null) {
                            ImmutableIntArray.copyOf(iArr);
                            return unsupportedBrandsSniffFailure;
                        }
                        ImmutableIntArray.m15046of();
                        return unsupportedBrandsSniffFailure;
                    }
                    z4 = z5;
                }
                i6 = i4;
                j2 = j;
                length = j6;
            }
        }
        sniffFailure = null;
        i = i6;
        return !z4 ? NoDeclaredBrandSniffFailure.f28855a : z2 != i ? i != 0 ? IncorrectFragmentationSniffFailure.f28815a : IncorrectFragmentationSniffFailure.f28816b : sniffFailure;
    }
}
