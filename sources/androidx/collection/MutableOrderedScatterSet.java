package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableOrderedScatterSet;", "E", "Landroidx/collection/OrderedScatterSet;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {

    /* JADX INFO: renamed from: h */
    public int f3764h;

    public MutableOrderedScatterSet(int i) {
        this.f3823a = ScatterMapKt.f3844a;
        this.f3824b = ContainerHelpersKt.f3907c;
        this.f3825c = SieveCacheKt.f3881a;
        this.f3826d = Integer.MAX_VALUE;
        this.f3827e = Integer.MAX_VALUE;
        if (i >= 0) {
            m2071g(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2066b(Object obj) {
        int i = this.f3829g;
        int iM2069e = m2069e(obj);
        this.f3824b[iM2069e] = obj;
        long[] jArr = this.f3825c;
        int i2 = this.f3826d;
        jArr[iM2069e] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iM2069e) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.f3826d = iM2069e;
        if (this.f3827e == Integer.MAX_VALUE) {
            this.f3827e = iM2069e;
        }
        return this.f3829g != i;
    }

    /* JADX INFO: renamed from: c */
    public final Set m2067c() {
        return new MutableOrderedSetWrapper(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m2068d() {
        this.f3829g = 0;
        long[] jArr = this.f3823a;
        if (jArr != ScatterMapKt.f3844a) {
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f3823a;
            int i = this.f3828f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.m18388w(this.f3824b, null, 0, this.f3828f);
        ArraysKt.m18390y(this.f3825c, 4611686018427387903L);
        this.f3826d = Integer.MAX_VALUE;
        this.f3827e = Integer.MAX_VALUE;
        this.f3764h = ScatterMapKt.m2111a(this.f3828f) - this.f3829g;
    }

    /* JADX INFO: renamed from: e */
    public final int m2069e(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        char c2;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f3828f;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f3823a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j6 = i5;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                int i11 = i2;
                if (Intrinsics.m18594b(this.f3824b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i2 = i11;
            }
            int i12 = i2;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iM2070f = m2070f(i4);
                long j9 = 255;
                if (this.f3764h != 0 || ((this.f3823a[iM2070f >> 3] >> ((iM2070f & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i13 = this.f3828f;
                    if (i13 > 8) {
                        c2 = 31;
                        j3 = 128;
                        if (Long.compare((((long) this.f3829g) * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f3823a;
                            if (jArr4 == null) {
                                i = 0;
                                j = j6;
                                j2 = 255;
                            } else {
                                int i14 = this.f3828f;
                                Object[] objArr = this.f3824b;
                                long[] jArr5 = this.f3825c;
                                long[] jArr6 = new long[i14];
                                Arrays.fill(jArr6, 0, i14, 9223372034707292159L);
                                i = 0;
                                int i15 = (i14 + 7) >> 3;
                                int i16 = 0;
                                while (i16 < i15) {
                                    long j10 = j9;
                                    long j11 = jArr4[i16] & (-9187201950435737472L);
                                    int i17 = i16;
                                    jArr4[i17] = ((~j11) + (j11 >>> 7)) & (-72340172838076674L);
                                    i16 = i17 + 1;
                                    j9 = j10;
                                }
                                j2 = j9;
                                int length = jArr4.length;
                                int i18 = length - 1;
                                int i19 = length - 2;
                                jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i18] = jArr4[0];
                                int i20 = 0;
                                while (i20 != i14) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j12 = (jArr4[i21] >> i22) & j2;
                                    if (j12 != 128 && j12 == 254) {
                                        Object obj2 = objArr[i20];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i12;
                                        int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i24 = i23 >>> 7;
                                        int iM2070f2 = m2070f(i24);
                                        int i25 = i24 & i14;
                                        if (((iM2070f2 - i25) & i14) / 8 == ((i20 - i25) & i14) / 8) {
                                            int i26 = i14;
                                            Object[] objArr2 = objArr;
                                            jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (((long) (i23 & 127)) << i22);
                                            if (jArr6[i20] == 9223372034707292159L) {
                                                long j13 = i20;
                                                jArr6[i20] = j13 | (j13 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i26;
                                            objArr = objArr2;
                                        } else {
                                            int i27 = i14;
                                            Object[] objArr3 = objArr;
                                            int i28 = iM2070f2 >> 3;
                                            long j14 = jArr4[i28];
                                            int i29 = (iM2070f2 & 7) << 3;
                                            if (((j14 >> i29) & j2) == 128) {
                                                jArr4[i28] = (j14 & (~(j2 << i29))) | (((long) (i23 & 127)) << i29);
                                                jArr4[i21] = (jArr4[i21] & (~(j2 << i22))) | (128 << i22);
                                                objArr3[iM2070f2] = objArr3[i20];
                                                objArr3[i20] = null;
                                                jArr5[iM2070f2] = jArr5[i20];
                                                jArr5[i20] = 4611686018427387903L;
                                                int i30 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                int i31 = Integer.MAX_VALUE;
                                                if (i30 != Integer.MAX_VALUE) {
                                                    j4 = j6;
                                                    jArr6[i30] = ((long) iM2070f2) | (jArr6[i30] & (-4294967296L));
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (-4294967296L);
                                                    i31 = Integer.MAX_VALUE;
                                                } else {
                                                    j4 = j6;
                                                    jArr6[i20] = (((long) Integer.MAX_VALUE) << 32) | ((long) iM2070f2);
                                                }
                                                jArr6[iM2070f2] = (((long) i20) << 32) | ((long) i31);
                                            } else {
                                                j4 = j6;
                                                jArr4[i28] = (((long) (i23 & 127)) << i29) | (j14 & (~(j2 << i29)));
                                                Object obj3 = objArr3[iM2070f2];
                                                objArr3[iM2070f2] = objArr3[i20];
                                                objArr3[i20] = obj3;
                                                long j15 = jArr5[iM2070f2];
                                                jArr5[iM2070f2] = jArr5[i20];
                                                jArr5[i20] = j15;
                                                int i32 = (int) ((jArr6[i20] >> 32) & 4294967295L);
                                                if (i32 != Integer.MAX_VALUE) {
                                                    long j16 = iM2070f2;
                                                    jArr6[i32] = (jArr6[i32] & (-4294967296L)) | j16;
                                                    jArr6[i20] = (jArr6[i20] & 4294967295L) | (j16 << 32);
                                                } else {
                                                    long j17 = iM2070f2;
                                                    jArr6[i20] = j17 | (j17 << 32);
                                                    i32 = i20;
                                                }
                                                jArr6[iM2070f2] = (((long) i32) << 32) | ((long) i20);
                                                i20--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i20++;
                                            i14 = i27;
                                            objArr = objArr3;
                                            j6 = j4;
                                        }
                                    } else {
                                        i20++;
                                    }
                                }
                                j = j6;
                                this.f3764h = ScatterMapKt.m2111a(this.f3828f) - this.f3829g;
                                long[] jArr7 = this.f3825c;
                                int length2 = jArr7.length;
                                for (int i33 = 0; i33 < length2; i33++) {
                                    long j18 = jArr7[i33];
                                    int i34 = (int) ((j18 >> 31) & 2147483647L);
                                    int i35 = (int) (j18 & 2147483647L);
                                    jArr7[i33] = (((j18 & (-4611686018427387904L)) | ((long) (i34 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i34] & 4294967295L)))) << 31) | ((long) (i35 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i35] & 4294967295L)));
                                }
                                int i36 = this.f3826d;
                                if (i36 != Integer.MAX_VALUE) {
                                    this.f3826d = (int) (jArr6[i36] & 4294967295L);
                                }
                                int i37 = this.f3827e;
                                if (i37 != Integer.MAX_VALUE) {
                                    this.f3827e = (int) (jArr6[i37] & 4294967295L);
                                }
                            }
                        }
                        iM2070f = m2070f(i4);
                    } else {
                        c2 = 31;
                        j3 = 128;
                    }
                    i = 0;
                    j = j6;
                    j2 = 255;
                    int iM2113c = ScatterMapKt.m2113c(this.f3828f);
                    long[] jArr8 = this.f3823a;
                    Object[] objArr4 = this.f3824b;
                    long[] jArr9 = this.f3825c;
                    int i38 = this.f3828f;
                    int[] iArr = new int[i38];
                    m2071g(iM2113c);
                    long[] jArr10 = this.f3823a;
                    Object[] objArr5 = this.f3824b;
                    long[] jArr11 = this.f3825c;
                    int i39 = this.f3828f;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr8[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr4[i40];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2070f3 = m2070f(i41 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j19 = i41 & 127;
                            int i42 = iM2070f3 >> 3;
                            int i43 = (iM2070f3 & 7) << 3;
                            long j20 = (jArr[i42] & (~(255 << i43))) | (j19 << i43);
                            jArr[i42] = j20;
                            jArr[(((iM2070f3 - 7) & i39) + (i39 & 7)) >> 3] = j20;
                            objArr5[iM2070f3] = obj4;
                            jArr11[iM2070f3] = jArr9[i40];
                            iArr[i40] = iM2070f3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i40++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f3825c;
                    int length3 = jArr12.length;
                    for (int i44 = 0; i44 < length3; i44++) {
                        long j21 = jArr12[i44];
                        int i45 = (int) ((j21 >> c2) & 2147483647L);
                        int i46 = (int) (j21 & 2147483647L);
                        jArr12[i44] = (((j21 & (-4611686018427387904L)) | ((long) (i45 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i45]))) << c2) | ((long) (i46 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i46]));
                    }
                    int i47 = this.f3826d;
                    if (i47 != Integer.MAX_VALUE) {
                        this.f3826d = iArr[i47];
                    }
                    int i48 = this.f3827e;
                    if (i48 != Integer.MAX_VALUE) {
                        this.f3827e = iArr[i48];
                    }
                    iM2070f = m2070f(i4);
                }
                this.f3829g++;
                int i49 = this.f3764h;
                long[] jArr13 = this.f3823a;
                int i50 = iM2070f >> 3;
                long j22 = jArr13[i50];
                int i51 = (iM2070f & 7) << 3;
                if (((j22 >> i51) & j2) == j3) {
                    i = 1;
                }
                this.f3764h = i49 - i;
                int i52 = this.f3828f;
                long j23 = (j22 & (~(j2 << i51))) | (j << i51);
                jArr13[i50] = j23;
                jArr13[(((iM2070f - 7) & i52) + (i52 & 7)) >> 3] = j23;
                return iM2070f;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i2 = i12;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m2070f(int i) {
        int i2 = this.f3828f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3823a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2071g(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3828f = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3823a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3764h = ScatterMapKt.m2111a(this.f3828f) - this.f3829g;
        this.f3824b = iMax == 0 ? ContainerHelpersKt.f3907c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = SieveCacheKt.f3881a;
        } else {
            jArr2 = new long[iMax];
            ArraysKt.m18390y(jArr2, 4611686018427387903L);
        }
        this.f3825c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2072h(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f3828f;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f3823a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (Intrinsics.m18594b(this.f3824b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z2 = iNumberOfTrailingZeros >= 0;
        if (z2) {
            m2073i(iNumberOfTrailingZeros);
        }
        return z2;
    }

    /* JADX INFO: renamed from: i */
    public final void m2073i(int i) {
        this.f3829g--;
        long[] jArr = this.f3823a;
        int i2 = this.f3828f;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f3824b[i] = null;
        long[] jArr2 = this.f3825c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | (((long) i6) & 2147483647L);
        } else {
            this.f3826d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((((long) i5) & 2147483647L) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.f3827e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2074j(Collection elements) {
        Intrinsics.m18599g(elements, "elements");
        Object[] objArr = this.f3824b;
        int i = this.f3829g;
        long[] jArr = this.f3823a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.m18454s(elements, objArr[i5])) {
                                m2073i(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this.f3829g;
    }
}
