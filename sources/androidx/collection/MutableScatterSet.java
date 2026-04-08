package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableScatterSet<E> extends ScatterSet<E> {

    /* JADX INFO: renamed from: e */
    public int f3778e;

    public MutableScatterSet(int i) {
        this.f3846a = ScatterMapKt.f3844a;
        this.f3847b = ContainerHelpersKt.f3907c;
        if (i >= 0) {
            m2087j(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2082e(Object obj) {
        int i = this.f3849d;
        this.f3847b[m2085h(obj)] = obj;
        return this.f3849d != i;
    }

    /* JADX INFO: renamed from: f */
    public final Set m2083f() {
        return new MutableSetWrapper(this);
    }

    /* JADX INFO: renamed from: g */
    public final void m2084g() {
        this.f3849d = 0;
        long[] jArr = this.f3846a;
        if (jArr != ScatterMapKt.f3844a) {
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f3846a;
            int i = this.f3848c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.m18388w(this.f3847b, null, 0, this.f3848c);
        this.f3778e = ScatterMapKt.m2111a(this.f3848c) - this.f3849d;
    }

    /* JADX INFO: renamed from: h */
    public final int m2085h(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f3848c;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.f3846a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (Intrinsics.m18594b(this.f3847b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iM2086i = m2086i(i5);
                long j8 = 255;
                if (this.f3778e != 0 || ((this.f3846a[iM2086i >> 3] >> ((iM2086i & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.f3848c;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compare((((long) this.f3849d) * 32) ^ Long.MIN_VALUE, (((long) i15) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f3846a;
                            int i17 = this.f3848c;
                            Object[] objArr2 = this.f3847b;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            j3 = 128;
                            while (i19 < i18) {
                                long j9 = j8;
                                long j10 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i16 = i16;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i20 = i16;
                            int iM18338E = ArraysKt.m18338E(jArr4);
                            int i21 = iM18338E - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM18338E] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i22];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i26 = i25 >>> 7;
                                    int iM2086i2 = m2086i(i26);
                                    int i27 = i26 & i17;
                                    if (((iM2086i2 - i27) & i17) / i20 == ((i22 - i27) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i23] = (((long) (i25 & 127)) << i24) | ((~(j << i24)) & jArr4[i23]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i28 = iM2086i2 >> 3;
                                        long j15 = jArr4[i28];
                                        int i29 = (iM2086i2 & 7) << 3;
                                        if (((j15 >> i29) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i28] = ((~(j << i29)) & j15) | (((long) (i25 & 127)) << i29);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[iM2086i2] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i28] = (((long) (i25 & 127)) << i29) | ((~(j << i29)) & j15);
                                            Object obj3 = objArr[iM2086i2];
                                            objArr[iM2086i2] = objArr[i22];
                                            objArr[i22] = obj3;
                                            i22--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j14;
                                        i20 = i2;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            this.f3778e = ScatterMapKt.m2111a(this.f3848c) - this.f3849d;
                        }
                        iM2086i = m2086i(i5);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iM2113c = ScatterMapKt.m2113c(this.f3848c);
                    long[] jArr5 = this.f3846a;
                    Object[] objArr3 = this.f3847b;
                    int i30 = this.f3848c;
                    m2087j(iM2113c);
                    long[] jArr6 = this.f3846a;
                    Object[] objArr4 = this.f3847b;
                    int i31 = this.f3848c;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM2086i3 = m2086i(i33 >>> 7);
                            long j16 = i33 & 127;
                            int i34 = iM2086i3 >> 3;
                            int i35 = (iM2086i3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i34] & (~(255 << i35))) | (j16 << i35);
                            jArr[i34] = j17;
                            jArr[(((iM2086i3 - 7) & i31) + (i31 & 7)) >> 3] = j17;
                            objArr4[iM2086i3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iM2086i = m2086i(i5);
                }
                this.f3849d++;
                int i36 = this.f3778e;
                long[] jArr7 = this.f3846a;
                int i37 = iM2086i >> 3;
                long j18 = jArr7[i37];
                int i38 = (iM2086i & 7) << 3;
                this.f3778e = i36 - (((j18 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.f3848c;
                long j19 = (j18 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j19;
                jArr7[(((iM2086i - 7) & i39) + (i39 & 7)) >> 3] = j19;
                return iM2086i;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m2086i(int i) {
        int i2 = this.f3848c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3846a;
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

    /* JADX INFO: renamed from: j */
    public final void m2087j(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3848c = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3846a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3778e = ScatterMapKt.m2111a(this.f3848c) - this.f3849d;
        this.f3847b = iMax == 0 ? ContainerHelpersKt.f3907c : new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2088k(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f3848c;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.f3846a;
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
                if (Intrinsics.m18594b(this.f3847b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            m2092o(iNumberOfTrailingZeros);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2089l(ScatterSet elements) {
        Intrinsics.m18599g(elements, "elements");
        Object[] objArr = elements.f3847b;
        long[] jArr = elements.f3846a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        m2090m(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2090m(Object obj) {
        this.f3847b[m2085h(obj)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2091n(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f3848c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f3846a;
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
                if (Intrinsics.m18594b(this.f3847b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z2 = iNumberOfTrailingZeros >= 0;
        if (z2) {
            m2092o(iNumberOfTrailingZeros);
        }
        return z2;
    }

    /* JADX INFO: renamed from: o */
    public final void m2092o(int i) {
        this.f3849d--;
        long[] jArr = this.f3846a;
        int i2 = this.f3848c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.f3847b[i] = null;
    }

    public /* synthetic */ MutableScatterSet() {
        this(6);
    }
}
