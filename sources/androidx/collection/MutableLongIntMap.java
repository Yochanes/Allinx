package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/MutableLongIntMap;", "Landroidx/collection/LongIntMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableLongIntMap extends LongIntMap {

    /* JADX INFO: renamed from: f */
    public int f3752f;

    public MutableLongIntMap(int i) {
        this.f3703a = ScatterMapKt.f3844a;
        this.f3704b = LongSetKt.f3721a;
        this.f3705c = IntSetKt.f3691a;
        if (i >= 0) {
            m2035d(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2034c(int i) {
        int i2 = this.f3706d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3703a;
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
    public final void m2035d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3706d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3703a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3752f = ScatterMapKt.m2111a(this.f3706d) - this.f3707e;
        this.f3704b = new long[iMax];
        this.f3705c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r1 = m2034c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r38.f3752f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (((r38.f3703a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        r31 = r10;
        r29 = 0;
        r18 = 1;
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r1 = r38.f3706d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r1 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r9 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        if (java.lang.Long.compare((((long) r38.f3707e) * 32) ^ Long.MIN_VALUE, (((long) r1) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        r1 = r38.f3703a;
        r2 = r38.f3706d;
        r4 = r38.f3704b;
        r5 = r38.f3705c;
        r6 = (r2 + 7) >> 3;
        r7 = 0;
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
    
        if (r7 >= r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        r8 = r9;
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> r8));
        r7 = r7 + 1;
        r9 = r8;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        r8 = r9;
        r31 = r10;
        r29 = r12;
        r11 = r13;
        r6 = kotlin.collections.ArraysKt.m18338E(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r29];
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0112, code lost:
    
        if (r6 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0123, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r9 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r15 = m2034c(r10);
        r10 = r10 & r2;
        r30 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = (((long) (r9 & 127)) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r30;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016f, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0180, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0182, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | (((long) (r9 & 127)) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ae, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = (((long) (r9 & 127)) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d3, code lost:
    
        r1[r1.length - 1] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r30;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01eb, code lost:
    
        r18 = r11;
        r38.f3752f = androidx.collection.ScatterMapKt.m2111a(r38.f3706d) - r38.f3707e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01fe, code lost:
    
        r31 = r10;
        r29 = 0;
        r18 = 1;
        r27 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x020a, code lost:
    
        r1 = androidx.collection.ScatterMapKt.m2113c(r38.f3706d);
        r2 = r38.f3703a;
        r4 = r38.f3704b;
        r5 = r38.f3705c;
        r6 = r38.f3706d;
        m2035d(r1);
        r1 = r38.f3703a;
        r7 = r38.f3704b;
        r8 = r38.f3705c;
        r9 = r38.f3706d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0225, code lost:
    
        if (r10 >= r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0234, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0236, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = m2034c(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0274, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0277, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027d, code lost:
    
        r1 = m2034c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0281, code lost:
    
        r38.f3707e++;
        r2 = r38.f3752f;
        r3 = r38.f3703a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0299, code lost:
    
        if (((r5 >> r7) & 255) != r27) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x029b, code lost:
    
        r29 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x029d, code lost:
    
        r38.f3752f = r2 - r29;
        r2 = r38.f3706d;
        r5 = (r5 & (~(255 << r7))) | (r31 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2036e(int i, long j) {
        int i2;
        int i3;
        int i4 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f3706d;
        int i9 = i6 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr = this.f3703a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j2 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j3 = i7;
            int i14 = i10;
            int i15 = 0;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j5) >> 3)) & i8;
                int i16 = i4;
                if (this.f3704b[iNumberOfTrailingZeros] == j) {
                    i3 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j5 &= j5 - 1;
                    i4 = i16;
                }
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i2;
        }
        if (i3 < 0) {
            i3 = ~i3;
        }
        this.f3704b[i3] = j;
        this.f3705c[i3] = i;
    }
}
