package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/LongIntMap;", "", "Landroidx/collection/MutableLongIntMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class LongIntMap {

    /* JADX INFO: renamed from: a */
    public long[] f3703a;

    /* JADX INFO: renamed from: b */
    public long[] f3704b;

    /* JADX INFO: renamed from: c */
    public int[] f3705c;

    /* JADX INFO: renamed from: d */
    public int f3706d;

    /* JADX INFO: renamed from: e */
    public int f3707e;

    /* JADX INFO: renamed from: a */
    public final int m1994a(long j) {
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f3706d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f3703a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f3704b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1995b(long j) {
        int iM1994a = m1994a(j);
        if (iM1994a >= 0) {
            return this.f3705c[iM1994a];
        }
        RuntimeHelpersKt.m2145c("Cannot find value for key " + j);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        long[] jArr;
        boolean z3;
        long[] jArr2;
        boolean z4 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongIntMap)) {
            return false;
        }
        LongIntMap longIntMap = (LongIntMap) obj;
        if (longIntMap.f3707e != this.f3707e) {
            return false;
        }
        long[] jArr3 = this.f3704b;
        int[] iArr = this.f3705c;
        long[] jArr4 = this.f3703a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr4[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        z3 = z4;
                        jArr2 = jArr3;
                        long j2 = jArr2[i4];
                        int i5 = iArr[i4];
                        int iM1994a = longIntMap.m1994a(j2);
                        if (iM1994a < 0 || i5 != longIntMap.f3705c[iM1994a]) {
                            break loop0;
                        }
                    } else {
                        z3 = z4;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i3++;
                    z4 = z3;
                    jArr3 = jArr2;
                }
                z2 = z4;
                jArr = jArr3;
                if (i2 != 8) {
                    return z2;
                }
            } else {
                z2 = z4;
                jArr = jArr3;
            }
            if (i == length) {
                return z2;
            }
            i++;
            z4 = z2;
            jArr3 = jArr;
        }
    }

    public final int hashCode() {
        long[] jArr = this.f3704b;
        int[] iArr = this.f3705c;
        long[] jArr2 = this.f3703a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        long j2 = jArr[i4];
                        iHashCode += Integer.hashCode(iArr[i4]) ^ Long.hashCode(j2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        if (this.f3707e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f3704b;
        int[] iArr = this.f3705c;
        long[] jArr2 = this.f3703a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            int i8 = iArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(i8);
                            i4++;
                            if (i4 < this.f3707e) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i9 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
