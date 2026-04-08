package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableObjectIntMap;", "K", "Landroidx/collection/ObjectIntMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableObjectIntMap<K> extends ObjectIntMap<K> {

    /* JADX INFO: renamed from: f */
    public int f3756f;

    public MutableObjectIntMap(int i) {
        this.f3812a = ScatterMapKt.f3844a;
        this.f3813b = ContainerHelpersKt.f3907c;
        this.f3814c = IntSetKt.f3691a;
        if (i >= 0) {
            m2055f(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2052c() {
        this.f3816e = 0;
        long[] jArr = this.f3812a;
        if (jArr != ScatterMapKt.f3844a) {
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f3812a;
            int i = this.f3815d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.m18388w(this.f3813b, null, 0, this.f3815d);
        this.f3756f = ScatterMapKt.m2111a(this.f3815d) - this.f3816e;
    }

    /* JADX INFO: renamed from: d */
    public final int m2053d(int i) {
        int i2 = this.f3815d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3812a;
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

    /* JADX INFO: renamed from: e */
    public final int m2054e(Object obj) {
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
        int i6 = this.f3815d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.f3812a;
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
                if (Intrinsics.m18594b(this.f3813b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM2053d = m2053d(i4);
                long j8 = 255;
                if (this.f3756f != 0 || ((this.f3812a[iM2053d >> 3] >> ((iM2053d & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.f3815d;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compare((((long) this.f3816e) * 32) ^ Long.MIN_VALUE, (((long) i14) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f3812a;
                            int i16 = this.f3815d;
                            Object[] objArr2 = this.f3813b;
                            int[] iArr = this.f3814c;
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
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM18338E] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 >>> 7;
                                    int iM2053d2 = m2053d(i25);
                                    int i26 = i25 & i16;
                                    long j13 = j11;
                                    if (((iM2053d2 - i26) & i16) / 8 == ((i21 - i26) & i16) / i19) {
                                        jArr4[i22] = (((long) (i24 & 127)) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                        i19 = i19;
                                    } else {
                                        int i27 = i19;
                                        int i28 = iM2053d2 >> 3;
                                        long j14 = jArr4[i28];
                                        int i29 = (iM2053d2 & 7) << 3;
                                        if (((j14 >> i29) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j14) | (((long) (i24 & 127)) << i29);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[iM2053d2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[iM2053d2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i28] = (((long) (i24 & 127)) << i29) | ((~(j << i29)) & j14);
                                            Object obj3 = objArr[iM2053d2];
                                            objArr[iM2053d2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i30 = iArr[iM2053d2];
                                            iArr[iM2053d2] = iArr[i21];
                                            iArr[i21] = i30;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        j11 = j13;
                                        i19 = i27;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f3756f = ScatterMapKt.m2111a(this.f3815d) - this.f3816e;
                        }
                        iM2053d = m2053d(i4);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM2113c = ScatterMapKt.m2113c(this.f3815d);
                    long[] jArr5 = this.f3812a;
                    Object[] objArr3 = this.f3813b;
                    int[] iArr2 = this.f3814c;
                    int i31 = this.f3815d;
                    m2055f(iM2113c);
                    long[] jArr6 = this.f3812a;
                    Object[] objArr4 = this.f3813b;
                    int[] iArr3 = this.f3814c;
                    int i32 = this.f3815d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i33];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i34 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2053d3 = m2053d(i34 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i34 & 127;
                            int i35 = iM2053d3 >> 3;
                            int i36 = (iM2053d3 & 7) << 3;
                            long j16 = (jArr[i35] & (~(255 << i36))) | (j15 << i36);
                            jArr[i35] = j16;
                            jArr[(((iM2053d3 - 7) & i32) + (i32 & 7)) >> 3] = j16;
                            objArr4[iM2053d3] = obj4;
                            iArr3[iM2053d3] = iArr2[i33];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i33++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM2053d = m2053d(i4);
                }
                this.f3816e++;
                int i37 = this.f3756f;
                long[] jArr7 = this.f3812a;
                int i38 = iM2053d >> 3;
                long j17 = jArr7[i38];
                int i39 = (iM2053d & 7) << 3;
                this.f3756f = i37 - (((j17 >> i39) & j) == j3 ? 1 : 0);
                int i40 = this.f3815d;
                long j18 = (j17 & (~(j << i39))) | (j2 << i39);
                jArr7[i38] = j18;
                jArr7[(((iM2053d - 7) & i40) + (i40 & 7)) >> 3] = j18;
                return ~iM2053d;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2055f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3815d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3812a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3756f = ScatterMapKt.m2111a(this.f3815d) - this.f3816e;
        this.f3813b = new Object[iMax];
        this.f3814c = new int[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final void m2056g(int i) {
        this.f3816e--;
        long[] jArr = this.f3812a;
        int i2 = this.f3815d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f3813b[i] = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m2057h(Object obj, int i) {
        int iM2054e = m2054e(obj);
        if (iM2054e < 0) {
            iM2054e = ~iM2054e;
        }
        this.f3813b[iM2054e] = obj;
        this.f3814c[iM2054e] = i;
    }

    public /* synthetic */ MutableObjectIntMap() {
        this(6);
    }
}
