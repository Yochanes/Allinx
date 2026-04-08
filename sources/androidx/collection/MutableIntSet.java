package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/MutableIntSet;", "Landroidx/collection/IntSet;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableIntSet extends IntSet {

    /* JADX INFO: renamed from: e */
    public int f3740e;

    public MutableIntSet(int i) {
        this.f3687a = ScatterMapKt.f3844a;
        this.f3688b = IntSetKt.f3691a;
        if (i >= 0) {
            m2031d(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r8 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        r3 = m2030c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        if (r37.f3740e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (((r37.f3687a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        r31 = true;
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r3 = r37.f3689c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r3 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        r9 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        if (java.lang.Long.compare((((long) r37.f3690d) * 32) ^ Long.MIN_VALUE, (((long) r3) * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c4, code lost:
    
        r3 = r37.f3687a;
        r4 = r37.f3689c;
        r6 = r37.f3688b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d0, code lost:
    
        if (r14 >= r7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        r29 = r8;
        r17 = r9;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> r17));
        r14 = r14 + 1;
        r9 = r17;
        r8 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ef, code lost:
    
        r27 = 128;
        r7 = kotlin.collections.ArraysKt.m18338E(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0110, code lost:
    
        if (r7 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0112, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011f, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0121, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0126, code lost:
    
        if (r12 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0129, code lost:
    
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r12 = r12 ^ (r12 << 16);
        r13 = r12 >>> 7;
        r14 = m2030c(r13);
        r13 = r13 & r4;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
    
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014a, code lost:
    
        r30 = r6;
        r3[r8] = ((~(255 << r9)) & r3[r8]) | (((long) (r12 & 127)) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0168, code lost:
    
        r6 = r30;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
    
        r30 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017f, code lost:
    
        if (((r33 >> r7) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0181, code lost:
    
        r3[r6] = (r33 & (~(255 << r7))) | (((long) (r12 & 127)) << r7);
        r3[r8] = (r3[r8] & (~(255 << r9))) | (128 << r9);
        r30[r14] = r30[r32];
        r30[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a5, code lost:
    
        r3[r6] = (((long) (r12 & 127)) << r7) | (r33 & (~(255 << r7)));
        r6 = r30[r14];
        r30[r14] = r30[r32];
        r30[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01bf, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01cd, code lost:
    
        r31 = r15;
        r37.f3740e = androidx.collection.ScatterMapKt.m2111a(r37.f3689c) - r37.f3690d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01de, code lost:
    
        r31 = true;
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e6, code lost:
    
        r3 = androidx.collection.ScatterMapKt.m2113c(r37.f3689c);
        r4 = r37.f3687a;
        r6 = r37.f3688b;
        r7 = r37.f3689c;
        m2031d(r3);
        r3 = r37.f3687a;
        r8 = r37.f3688b;
        r9 = r37.f3689c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01fd, code lost:
    
        if (r12 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x020c, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020e, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = m2030c(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0249, code lost:
    
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024d, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0254, code lost:
    
        r3 = m2030c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0258, code lost:
    
        r14 = r3;
        r37.f3690d++;
        r3 = r37.f3740e;
        r4 = r37.f3687a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0271, code lost:
    
        if (((r6 >> r8) & 255) != r27) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0273, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0276, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0278, code lost:
    
        r37.f3740e = r3 - r9;
        r3 = r37.f3689c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2029b(int i) {
        int i2;
        boolean z2;
        int iNumberOfTrailingZeros;
        int i3 = this.f3690d;
        int i4 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f3689c;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.f3687a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            boolean z3 = true;
            int i13 = i10;
            long j = (((-i12) >> 63) & (jArr[i11 + 1] << (64 - i12))) | (jArr[i11] >>> i12);
            long j2 = i7;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i9) & i8;
                int i14 = i4;
                if (this.f3688b[iNumberOfTrailingZeros] == i) {
                    z2 = true;
                    break loop0;
                }
                j4 &= j4 - 1;
                i4 = i14;
            }
            i10 = i13 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i2;
        }
        this.f3688b[iNumberOfTrailingZeros] = i;
        if (this.f3690d != i3) {
            return z2;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final int m2030c(int i) {
        int i2 = this.f3689c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3687a;
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

    /* JADX INFO: renamed from: d */
    public final void m2031d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3689c = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3687a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3740e = ScatterMapKt.m2111a(this.f3689c) - this.f3690d;
        this.f3688b = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2032e(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.f3689c;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.f3687a;
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
                if (this.f3688b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z2 = iNumberOfTrailingZeros >= 0;
        if (z2) {
            m2033f(iNumberOfTrailingZeros);
        }
        return z2;
    }

    /* JADX INFO: renamed from: f */
    public final void m2033f(int i) {
        this.f3690d--;
        long[] jArr = this.f3687a;
        int i2 = this.f3689c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public /* synthetic */ MutableIntSet() {
        this(6);
    }
}
