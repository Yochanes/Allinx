package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableIntObjectMap;", "V", "Landroidx/collection/IntObjectMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableIntObjectMap<V> extends IntObjectMap<V> {

    /* JADX INFO: renamed from: f */
    public int f3739f;

    public MutableIntObjectMap(int i) {
        this.f3681a = ScatterMapKt.f3844a;
        this.f3682b = IntSetKt.f3691a;
        this.f3683c = ContainerHelpersKt.f3907c;
        if (i >= 0) {
            m2026f(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2023c() {
        this.f3685e = 0;
        long[] jArr = this.f3681a;
        if (jArr != ScatterMapKt.f3844a) {
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f3681a;
            int i = this.f3684d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.m18388w(this.f3683c, null, 0, this.f3684d);
        this.f3739f = ScatterMapKt.m2111a(this.f3684d) - this.f3685e;
    }

    /* JADX INFO: renamed from: d */
    public final int m2024d(int i) {
        int i2;
        long j;
        long[] jArr;
        long[] jArr2;
        long j2;
        int[] iArr;
        Object[] objArr;
        int i3 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f3684d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.f3681a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j3 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j4 = i6;
            int i13 = i9;
            int i14 = 0;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = -9187201950435737472L;
            long j7 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i15 = i3;
                int i16 = i14;
                if (this.f3682b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i15;
                i14 = i16;
            }
            int i17 = i3;
            int i18 = i14;
            char c2 = '\b';
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int iM2025e = m2025e(i5);
                if (this.f3739f != 0 || ((this.f3681a[iM2025e >> 3] >> ((iM2025e & 7) << 3)) & 255) == 254) {
                    i2 = 1;
                    j = 128;
                } else {
                    int i19 = this.f3684d;
                    if (i19 <= 8 || Long.compare((((long) this.f3685e) * 32) ^ Long.MIN_VALUE, (((long) i19) * 25) ^ Long.MIN_VALUE) > 0) {
                        i2 = 1;
                        j = 128;
                        int iM2113c = ScatterMapKt.m2113c(this.f3684d);
                        long[] jArr4 = this.f3681a;
                        int[] iArr2 = this.f3682b;
                        Object[] objArr2 = this.f3683c;
                        int i20 = this.f3684d;
                        m2026f(iM2113c);
                        long[] jArr5 = this.f3681a;
                        int[] iArr3 = this.f3682b;
                        Object[] objArr3 = this.f3683c;
                        int i21 = this.f3684d;
                        int i22 = i18;
                        while (i22 < i20) {
                            if (((jArr4[i22 >> 3] >> ((i22 & 7) << 3)) & 255) < 128) {
                                int i23 = iArr2[i22];
                                int iHashCode2 = Integer.hashCode(i23) * i17;
                                int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                int iM2025e2 = m2025e(i24 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j8 = i24 & 127;
                                int i25 = iM2025e2 >> 3;
                                int i26 = (iM2025e2 & 7) << 3;
                                long j9 = (jArr[i25] & (~(255 << i26))) | (j8 << i26);
                                jArr[i25] = j9;
                                jArr[(((iM2025e2 - 7) & i21) + (i21 & 7)) >> 3] = j9;
                                iArr3[iM2025e2] = i23;
                                objArr3[iM2025e2] = objArr2[i22];
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i22++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr6 = this.f3681a;
                        int i27 = this.f3684d;
                        int[] iArr4 = this.f3682b;
                        Object[] objArr4 = this.f3683c;
                        int i28 = (i27 + 7) >> 3;
                        int i29 = i18;
                        while (i29 < i28) {
                            char c3 = c2;
                            long j10 = jArr6[i29] & j6;
                            jArr6[i29] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                            i29++;
                            i12 = i12;
                            c2 = c3;
                            j6 = -9187201950435737472L;
                        }
                        int i30 = i12;
                        j = 128;
                        int iM18338E = ArraysKt.m18338E(jArr6);
                        int i31 = iM18338E - 1;
                        long j11 = 72057594037927935L;
                        jArr6[i31] = (jArr6[i31] & 72057594037927935L) | (-72057594037927936L);
                        jArr6[iM18338E] = jArr6[i18];
                        int i32 = i18;
                        while (i32 != i27) {
                            int i33 = i32 >> 3;
                            int i34 = (i32 & 7) << 3;
                            long j12 = (jArr6[i33] >> i34) & 255;
                            if (j12 != 128 && j12 == 254) {
                                int iHashCode3 = Integer.hashCode(iArr4[i32]) * i17;
                                int i35 = iHashCode3 ^ (iHashCode3 << 16);
                                int i36 = i35 >>> 7;
                                int iM2025e3 = m2025e(i36);
                                int i37 = i36 & i27;
                                int i38 = i30;
                                if (((iM2025e3 - i37) & i27) / 8 == ((i32 - i37) & i27) / 8) {
                                    j2 = j11;
                                    jArr6[i33] = (((long) (i35 & 127)) << i34) | (jArr6[i33] & (~(255 << i34)));
                                    jArr6[jArr6.length - 1] = (jArr6[i18] & j2) | Long.MIN_VALUE;
                                    i32++;
                                    i30 = i38;
                                } else {
                                    j2 = j11;
                                    int i39 = iM2025e3 >> 3;
                                    long j13 = jArr6[i39];
                                    int i40 = (iM2025e3 & 7) << 3;
                                    if (((j13 >> i40) & 255) == 128) {
                                        iArr = iArr4;
                                        objArr = objArr4;
                                        jArr6[i39] = ((~(255 << i40)) & j13) | (((long) (i35 & 127)) << i40);
                                        jArr6[i33] = (jArr6[i33] & (~(255 << i34))) | (128 << i34);
                                        iArr[iM2025e3] = iArr[i32];
                                        iArr[i32] = i18;
                                        objArr[iM2025e3] = objArr[i32];
                                        objArr[i32] = null;
                                    } else {
                                        iArr = iArr4;
                                        objArr = objArr4;
                                        jArr6[i39] = ((~(255 << i40)) & j13) | (((long) (i35 & 127)) << i40);
                                        int i41 = iArr[iM2025e3];
                                        iArr[iM2025e3] = iArr[i32];
                                        iArr[i32] = i41;
                                        Object obj = objArr[iM2025e3];
                                        objArr[iM2025e3] = objArr[i32];
                                        objArr[i32] = obj;
                                        i32--;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[i18] & j2) | Long.MIN_VALUE;
                                    i32++;
                                    iArr4 = iArr;
                                    i30 = i38;
                                    objArr4 = objArr;
                                }
                                j11 = j2;
                            } else {
                                i32++;
                            }
                        }
                        i2 = i30;
                        this.f3739f = ScatterMapKt.m2111a(this.f3684d) - this.f3685e;
                    }
                    iM2025e = m2025e(i5);
                }
                this.f3685e++;
                int i42 = this.f3739f;
                long[] jArr7 = this.f3681a;
                int i43 = iM2025e >> 3;
                long j14 = jArr7[i43];
                int i44 = (iM2025e & 7) << 3;
                if (((j14 >> i44) & 255) == j) {
                    i18 = i2;
                }
                this.f3739f = i42 - i18;
                int i45 = this.f3684d;
                long j15 = (j14 & (~(255 << i44))) | (j4 << i44);
                jArr7[i43] = j15;
                jArr7[(((iM2025e - 7) & i45) + (i45 & 7)) >> 3] = j15;
                return iM2025e;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            i3 = i17;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2025e(int i) {
        int i2 = this.f3684d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3681a;
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
    public final void m2026f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3684d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3681a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3739f = ScatterMapKt.m2111a(this.f3684d) - this.f3685e;
        this.f3682b = new int[iMax];
        this.f3683c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2027g(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f3684d;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f3681a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.f3682b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f3685e--;
        long[] jArr2 = this.f3681a;
        int i9 = this.f3684d;
        int i10 = iNumberOfTrailingZeros >> 3;
        int i11 = (iNumberOfTrailingZeros & 7) << 3;
        long j4 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
        jArr2[i10] = j4;
        jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j4;
        Object[] objArr = this.f3683c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m2028h(int i, Object obj) {
        int iM2024d = m2024d(i);
        this.f3682b[iM2024d] = i;
        this.f3683c[iM2024d] = obj;
    }

    public /* synthetic */ MutableIntObjectMap() {
        this(6);
    }
}
