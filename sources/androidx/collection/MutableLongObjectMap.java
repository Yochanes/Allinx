package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableLongObjectMap;", "V", "Landroidx/collection/LongObjectMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {

    /* JADX INFO: renamed from: f */
    public int f3753f;

    public MutableLongObjectMap(int i) {
        this.f3711a = ScatterMapKt.f3844a;
        this.f3712b = LongSetKt.f3721a;
        this.f3713c = ContainerHelpersKt.f3907c;
        if (i >= 0) {
            m2041f(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2038c() {
        this.f3715e = 0;
        long[] jArr = this.f3711a;
        if (jArr != ScatterMapKt.f3844a) {
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f3711a;
            int i = this.f3714d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.m18388w(this.f3713c, null, 0, this.f3714d);
        this.f3753f = ScatterMapKt.m2111a(this.f3714d) - this.f3715e;
    }

    /* JADX INFO: renamed from: d */
    public final int m2039d(long j) {
        int i;
        int i2;
        long j2;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        Object[] objArr;
        int i3 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f3714d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr4 = this.f3711a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j3 = ((jArr4[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr4[i10] >>> i11);
            long j4 = i6;
            int i13 = i9;
            int i14 = 0;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j6 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j6) >> 3)) & i7;
                int i15 = i3;
                if (this.f3712b[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
                j6 &= j6 - 1;
                i3 = i15;
            }
            int i16 = i3;
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int iM2040e = m2040e(i5);
                if (this.f3753f != 0 || ((this.f3711a[iM2040e >> 3] >> ((iM2040e & 7) << 3)) & 255) == 254) {
                    i = 0;
                    i2 = 1;
                    j2 = 128;
                } else {
                    int i17 = this.f3714d;
                    if (i17 <= 8 || Long.compare((((long) this.f3715e) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) > 0) {
                        i = 0;
                        i2 = 1;
                        j2 = 128;
                        int iM2113c = ScatterMapKt.m2113c(this.f3714d);
                        long[] jArr5 = this.f3711a;
                        long[] jArr6 = this.f3712b;
                        Object[] objArr2 = this.f3713c;
                        int i18 = this.f3714d;
                        m2041f(iM2113c);
                        long[] jArr7 = this.f3711a;
                        long[] jArr8 = this.f3712b;
                        Object[] objArr3 = this.f3713c;
                        int i19 = this.f3714d;
                        int i20 = 0;
                        while (i20 < i18) {
                            if (((jArr5[i20 >> 3] >> ((i20 & 7) << 3)) & 255) < 128) {
                                long j7 = jArr6[i20];
                                int iHashCode2 = Long.hashCode(j7) * i16;
                                int i21 = iHashCode2 ^ (iHashCode2 << 16);
                                jArr = jArr7;
                                int iM2040e2 = m2040e(i21 >>> 7);
                                jArr2 = jArr5;
                                long j8 = i21 & 127;
                                int i22 = iM2040e2 >> 3;
                                int i23 = (iM2040e2 & 7) << 3;
                                long j9 = (jArr[i22] & (~(255 << i23))) | (j8 << i23);
                                jArr[i22] = j9;
                                jArr[(((iM2040e2 - 7) & i19) + (i19 & 7)) >> 3] = j9;
                                jArr8[iM2040e2] = j7;
                                objArr3[iM2040e2] = objArr2[i20];
                            } else {
                                jArr = jArr7;
                                jArr2 = jArr5;
                            }
                            i20++;
                            jArr7 = jArr;
                            jArr5 = jArr2;
                        }
                    } else {
                        long[] jArr9 = this.f3711a;
                        int i24 = this.f3714d;
                        long[] jArr10 = this.f3712b;
                        Object[] objArr4 = this.f3713c;
                        int i25 = (i24 + 7) >> 3;
                        int i26 = 0;
                        while (i26 < i25) {
                            long j10 = jArr9[i26] & (-9187201950435737472L);
                            jArr9[i26] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                            i26++;
                            i12 = i12;
                            i14 = i14;
                        }
                        i = i14;
                        i2 = i12;
                        j2 = 128;
                        int iM18338E = ArraysKt.m18338E(jArr9);
                        int i27 = iM18338E - 1;
                        long j11 = 72057594037927935L;
                        jArr9[i27] = (jArr9[i27] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iM18338E] = jArr9[i];
                        int i28 = i;
                        while (i28 != i24) {
                            int i29 = i28 >> 3;
                            int i30 = (i28 & 7) << 3;
                            long j12 = (jArr9[i29] >> i30) & 255;
                            if (j12 != 128 && j12 == 254) {
                                int iHashCode3 = Long.hashCode(jArr10[i28]) * i16;
                                int i31 = iHashCode3 ^ (iHashCode3 << 16);
                                int i32 = i31 >>> 7;
                                int iM2040e3 = m2040e(i32);
                                int i33 = i32 & i24;
                                long j13 = j11;
                                if (((iM2040e3 - i33) & i24) / 8 == ((i28 - i33) & i24) / 8) {
                                    jArr3 = jArr10;
                                    objArr = objArr4;
                                    jArr9[i29] = ((~(255 << i30)) & jArr9[i29]) | (((long) (i31 & 127)) << i30);
                                    jArr9[jArr9.length - 1] = (jArr9[i] & j13) | Long.MIN_VALUE;
                                } else {
                                    jArr3 = jArr10;
                                    objArr = objArr4;
                                    int i34 = iM2040e3 >> 3;
                                    long j14 = jArr9[i34];
                                    int i35 = (iM2040e3 & 7) << 3;
                                    if (((j14 >> i35) & 255) == 128) {
                                        jArr9[i34] = ((~(255 << i35)) & j14) | (((long) (i31 & 127)) << i35);
                                        jArr9[i29] = (jArr9[i29] & (~(255 << i30))) | (128 << i30);
                                        jArr3[iM2040e3] = jArr3[i28];
                                        jArr3[i28] = 0;
                                        objArr[iM2040e3] = objArr[i28];
                                        objArr[i28] = null;
                                    } else {
                                        jArr9[i34] = (((long) (i31 & 127)) << i35) | ((~(255 << i35)) & j14);
                                        long j15 = jArr3[iM2040e3];
                                        jArr3[iM2040e3] = jArr3[i28];
                                        jArr3[i28] = j15;
                                        Object obj = objArr[iM2040e3];
                                        objArr[iM2040e3] = objArr[i28];
                                        objArr[i28] = obj;
                                        i28--;
                                    }
                                    jArr9[jArr9.length - 1] = (jArr9[i] & j13) | Long.MIN_VALUE;
                                }
                                i28++;
                                objArr4 = objArr;
                                jArr10 = jArr3;
                                j11 = j13;
                            } else {
                                i28++;
                            }
                        }
                        this.f3753f = ScatterMapKt.m2111a(this.f3714d) - this.f3715e;
                    }
                    iM2040e = m2040e(i5);
                }
                this.f3715e++;
                int i36 = this.f3753f;
                long[] jArr11 = this.f3711a;
                int i37 = iM2040e >> 3;
                long j16 = jArr11[i37];
                int i38 = (iM2040e & 7) << 3;
                if (((j16 >> i38) & 255) != j2) {
                    i2 = i;
                }
                this.f3753f = i36 - i2;
                int i39 = this.f3714d;
                long j17 = (j16 & (~(255 << i38))) | (j4 << i38);
                jArr11[i37] = j17;
                jArr11[(((iM2040e - 7) & i39) + (i39 & 7)) >> 3] = j17;
                return iM2040e;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i16;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2040e(int i) {
        int i2 = this.f3714d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3711a;
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

    /* JADX INFO: renamed from: f */
    public final void m2041f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3714d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3711a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3753f = ScatterMapKt.m2111a(this.f3714d) - this.f3715e;
        this.f3712b = new long[iMax];
        this.f3713c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2042g(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f3714d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f3711a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.f3712b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f3715e--;
        long[] jArr2 = this.f3711a;
        int i8 = this.f3714d;
        int i9 = iNumberOfTrailingZeros >> 3;
        int i10 = (iNumberOfTrailingZeros & 7) << 3;
        long j5 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
        jArr2[i9] = j5;
        jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j5;
        Object[] objArr = this.f3713c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m2043h(long j, Object obj) {
        int iM2039d = m2039d(j);
        this.f3712b[iM2039d] = j;
        this.f3713c[iM2039d] = obj;
    }

    public /* synthetic */ MutableLongObjectMap() {
        this(6);
    }
}
