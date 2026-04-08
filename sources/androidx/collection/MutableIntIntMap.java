package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/MutableIntIntMap;", "Landroidx/collection/IntIntMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableIntIntMap extends IntIntMap {

    /* JADX INFO: renamed from: f */
    public int f3738f;

    public MutableIntIntMap(int i) {
        this.f3672a = ScatterMapKt.f3844a;
        int[] iArr = IntSetKt.f3691a;
        this.f3673b = iArr;
        this.f3674c = iArr;
        if (i >= 0) {
            m2017e(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2015c() {
        this.f3676e = 0;
        long[] jArr = this.f3672a;
        if (jArr != ScatterMapKt.f3844a) {
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f3672a;
            int i = this.f3675d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.f3738f = ScatterMapKt.m2111a(this.f3675d) - this.f3676e;
    }

    /* JADX INFO: renamed from: d */
    public final int m2016d(int i) {
        int i2 = this.f3675d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3672a;
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
    public final void m2017e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3675d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3672a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3738f = ScatterMapKt.m2111a(this.f3675d) - this.f3676e;
        this.f3673b = new int[iMax];
        this.f3674c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        r2 = m2016d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r37.f3738f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (((r37.f3672a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r29 = r9;
        r18 = 1;
        r32 = 0;
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        r2 = r37.f3675d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r8 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (java.lang.Long.compare((((long) r37.f3676e) * 32) ^ Long.MIN_VALUE, (((long) r2) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        r2 = r37.f3672a;
        r3 = r37.f3675d;
        r5 = r37.f3673b;
        r6 = r37.f3674c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
    
        if (r7 >= r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        r10 = r8;
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> r10));
        r7 = r7 + 1;
        r8 = r10;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ef, code lost:
    
        r12 = r8;
        r29 = r9;
        r27 = 128;
        r7 = kotlin.collections.ArraysKt.m18338E(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010e, code lost:
    
        if (r7 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0110, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011d, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
    
        if (r9 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r13 = m2016d(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
    
        r32 = r15;
        r2[r8] = (((long) (r9 & 127)) << r11) | (r2[r8] & (~(255 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016d, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017f, code lost:
    
        if (((r14 >> r12) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0181, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(255 << r12)) & r14) | (((long) (r9 & 127)) << r12);
        r2[r8] = (r2[r8] & (~(255 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ab, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = (((long) (r9 & 127)) << r12) | ((~(255 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01cc, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e5, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f3738f = androidx.collection.ScatterMapKt.m2111a(r37.f3675d) - r37.f3676e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01fa, code lost:
    
        r29 = r9;
        r18 = 1;
        r32 = 0;
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0206, code lost:
    
        r2 = androidx.collection.ScatterMapKt.m2113c(r37.f3675d);
        r3 = r37.f3672a;
        r5 = r37.f3673b;
        r6 = r37.f3674c;
        r7 = r37.f3675d;
        m2017e(r2);
        r2 = r37.f3672a;
        r8 = r37.f3673b;
        r9 = r37.f3674c;
        r10 = r37.f3675d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0221, code lost:
    
        if (r11 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0230, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0232, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = m2016d(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026e, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x026f, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0275, code lost:
    
        r2 = m2016d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0279, code lost:
    
        r37.f3676e++;
        r1 = r37.f3738f;
        r3 = r37.f3672a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0291, code lost:
    
        if (((r5 >> r7) & 255) != r27) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0293, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0295, code lost:
    
        r37.f3738f = r1 - r32;
        r1 = r37.f3675d;
        r5 = (r5 & (~(255 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2018f(int i, int i2) {
        int i3;
        int iNumberOfTrailingZeros;
        int i4 = i;
        int i5 = -862048943;
        int iHashCode = Integer.hashCode(i4) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f3675d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.f3672a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            int i15 = i11;
            int i16 = 0;
            long j = (((-i13) >> 63) & (jArr[i12 + 1] << (64 - i13))) | (jArr[i12] >>> i13);
            long j2 = i8;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
                int i17 = i5;
                if (this.f3673b[iNumberOfTrailingZeros] == i4) {
                    break loop0;
                }
                j4 &= j4 - 1;
                i5 = i17;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i4 = i;
            i5 = i3;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f3673b[iNumberOfTrailingZeros] = i;
        this.f3674c[iNumberOfTrailingZeros] = i2;
    }

    public /* synthetic */ MutableIntIntMap() {
        this(6);
    }
}
