package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {

    /* JADX INFO: renamed from: f */
    public int f3777f;

    public MutableScatterMap(int i) {
        this.f3839a = ScatterMapKt.f3844a;
        Object[] objArr = ContainerHelpersKt.f3907c;
        this.f3840b = objArr;
        this.f3841c = objArr;
        if (i >= 0) {
            m2078j(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2075g() {
        this.f3843e = 0;
        long[] jArr = this.f3839a;
        if (jArr != ScatterMapKt.f3844a) {
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f3839a;
            int i = this.f3842d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.m18388w(this.f3841c, null, 0, this.f3842d);
        ArraysKt.m18388w(this.f3840b, null, 0, this.f3842d);
        this.f3777f = ScatterMapKt.m2111a(this.f3842d) - this.f3843e;
    }

    /* JADX INFO: renamed from: h */
    public final int m2076h(int i) {
        int i2 = this.f3842d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3839a;
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

    /* JADX INFO: renamed from: i */
    public final int m2077i(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f3842d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f3839a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (Intrinsics.m18594b(this.f3840b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM2076h = m2076h(i4);
                long j8 = 255;
                if (this.f3777f != 0 || ((this.f3839a[iM2076h >> 3] >> ((iM2076h & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.f3842d;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compare((((long) this.f3843e) * 32) ^ Long.MIN_VALUE, (((long) i14) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f3839a;
                            int i16 = this.f3842d;
                            Object[] objArr2 = this.f3840b;
                            Object[] objArr3 = this.f3841c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int iM18338E = ArraysKt.m18338E(jArr4);
                            int i20 = iM18338E - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM18338E] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iM2076h2 = m2076h(i25);
                                    int i26 = i25 & i16;
                                    if (((iM2076h2 - i26) & i16) / i19 == ((i21 - i26) & i16) / i19) {
                                        jArr4[i22] = (((long) (i24 & 127)) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i27 = i19;
                                        int i28 = iM2076h2 >> 3;
                                        long j12 = jArr4[i28];
                                        int i29 = (iM2076h2 & 7) << 3;
                                        if (((j12 >> i29) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j12) | (((long) (i24 & 127)) << i29);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iM2076h2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[iM2076h2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j12);
                                            Object obj3 = objArr[iM2076h2];
                                            objArr[iM2076h2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[iM2076h2];
                                            objArr3[iM2076h2] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i27;
                                        i16 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f3777f = ScatterMapKt.m2111a(this.f3842d) - this.f3843e;
                        }
                        iM2076h = m2076h(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM2113c = ScatterMapKt.m2113c(this.f3842d);
                    long[] jArr5 = this.f3839a;
                    Object[] objArr4 = this.f3840b;
                    Object[] objArr5 = this.f3841c;
                    int i30 = this.f3842d;
                    m2078j(iM2113c);
                    long[] jArr6 = this.f3839a;
                    Object[] objArr6 = this.f3840b;
                    Object[] objArr7 = this.f3841c;
                    int i31 = this.f3842d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i32];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2076h3 = m2076h(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i33 & 127;
                            int i34 = iM2076h3 >> 3;
                            int i35 = (iM2076h3 & 7) << 3;
                            long j14 = (jArr[i34] & (~(255 << i35))) | (j13 << i35);
                            jArr[i34] = j14;
                            jArr[(((iM2076h3 - 7) & i31) + (i31 & 7)) >> 3] = j14;
                            objArr6[iM2076h3] = obj5;
                            objArr7[iM2076h3] = objArr5[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM2076h = m2076h(i4);
                }
                this.f3843e++;
                int i36 = this.f3777f;
                long[] jArr7 = this.f3839a;
                int i37 = iM2076h >> 3;
                long j15 = jArr7[i37];
                int i38 = (iM2076h & 7) << 3;
                this.f3777f = i36 - (((j15 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.f3842d;
                long j16 = (j15 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j16;
                jArr7[(((iM2076h - 7) & i39) + (i39 & 7)) >> 3] = j16;
                return ~iM2076h;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2078j(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3842d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            int i2 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        this.f3839a = jArr;
        this.f3777f = ScatterMapKt.m2111a(this.f3842d) - this.f3843e;
        Object[] objArr = ContainerHelpersKt.f3907c;
        this.f3840b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f3841c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2079k(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f3842d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f3839a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.m18594b(this.f3840b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m2080l(iNumberOfTrailingZeros);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final Object m2080l(int i) {
        this.f3843e--;
        long[] jArr = this.f3839a;
        int i2 = this.f3842d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f3840b[i] = null;
        Object[] objArr = this.f3841c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m2081m(Object obj, Object obj2) {
        int iM2077i = m2077i(obj);
        if (iM2077i < 0) {
            iM2077i = ~iM2077i;
        }
        this.f3840b[iM2077i] = obj;
        this.f3841c[iM2077i] = obj2;
    }

    public /* synthetic */ MutableScatterMap() {
        this(6);
    }
}
