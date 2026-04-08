package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/MutableLongSet;", "Landroidx/collection/LongSet;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableLongSet extends LongSet {

    /* JADX INFO: renamed from: e */
    public int f3754e;

    public MutableLongSet(int i) {
        this.f3717a = ScatterMapKt.f3844a;
        this.f3718b = LongSetKt.f3721a;
        if (i >= 0) {
            m2045c(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m2044b(int i) {
        int i2 = this.f3719c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3717a;
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

    /* JADX INFO: renamed from: c */
    public final void m2045c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3719c = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3717a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3754e = ScatterMapKt.m2111a(this.f3719c) - this.f3720d;
        this.f3718b = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        r1 = m2044b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r38.f3754e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        if (((r38.f3717a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r27 = r10;
        r33 = 0;
        r35 = 1;
        r29 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        r1 = r38.f3719c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r1 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        r9 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (java.lang.Long.compare((((long) r38.f3720d) * 32) ^ Long.MIN_VALUE, (((long) r1) * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r1 = r38.f3717a;
        r2 = r38.f3719c;
        r4 = r38.f3718b;
        r5 = (r2 + 7) >> 3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (r6 >= r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        r7 = r1[r6] & (-9187201950435737472L);
        r11 = r9;
        r1[r6] = (-72340172838076674L) & ((~r7) + (r7 >>> r11));
        r6 = r6 + 1;
        r9 = r11;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        r27 = r10;
        r29 = 128;
        r11 = r9;
        r5 = kotlin.collections.ArraysKt.m18338E(r1);
        r6 = r5 - 1;
        r9 = 72057594037927935L;
        r1[r6] = (r1[r6] & 72057594037927935L) | (-72057594037927936L);
        r1[r5] = r1[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0106, code lost:
    
        if (r5 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0108, code lost:
    
        r6 = r5 >> 3;
        r14 = (r5 & 7) << 3;
        r7 = (r1[r6] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0115, code lost:
    
        if (r7 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0117, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if (r7 == 254) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011f, code lost:
    
        r7 = java.lang.Long.hashCode(r4[r5]) * r19;
        r7 = r7 ^ (r7 << 16);
        r8 = r7 >>> 7;
        r15 = m2044b(r8);
        r8 = r8 & r2;
        r31 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013e, code lost:
    
        if ((((r15 - r8) & r2) / 8) != (((r5 - r8) & r2) / 8)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0140, code lost:
    
        r33 = r12;
        r1[r6] = (((long) (r7 & 127)) << r14) | (r1[r6] & (~(255 << r14)));
        r1[r1.length - r13] = (r1[r33] & r31) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r11 = r11;
        r9 = r31;
        r12 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0164, code lost:
    
        r18 = r11;
        r33 = r12;
        r8 = r15 >> 3;
        r9 = r1[r8];
        r11 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0176, code lost:
    
        if (((r9 >> r11) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0178, code lost:
    
        r35 = r13;
        r1[r8] = (r9 & (~(255 << r11))) | (((long) (r7 & 127)) << r11);
        r1[r6] = (r1[r6] & (~(255 << r14))) | (128 << r14);
        r4[r15] = r4[r5];
        r4[r5] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019d, code lost:
    
        r35 = r13;
        r1[r8] = (((long) (r7 & 127)) << r11) | (r9 & (~(255 << r11)));
        r6 = r4[r15];
        r4[r15] = r4[r5];
        r4[r5] = r6;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b4, code lost:
    
        r1[r1.length - 1] = (r1[r33] & r31) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r11 = r18;
        r9 = r31;
        r12 = r33;
        r13 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01cb, code lost:
    
        r33 = r12;
        r35 = r13;
        r38.f3754e = androidx.collection.ScatterMapKt.m2111a(r38.f3719c) - r38.f3720d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01e0, code lost:
    
        r27 = r10;
        r33 = 0;
        r35 = 1;
        r29 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ec, code lost:
    
        r1 = androidx.collection.ScatterMapKt.m2113c(r38.f3719c);
        r2 = r38.f3717a;
        r4 = r38.f3718b;
        r5 = r38.f3719c;
        m2045c(r1);
        r1 = r38.f3717a;
        r6 = r38.f3718b;
        r7 = r38.f3719c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0203, code lost:
    
        if (r8 >= r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0212, code lost:
    
        if (((r2[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0214, code lost:
    
        r9 = r4[r8];
        r11 = java.lang.Long.hashCode(r9) * r19;
        r11 = r11 ^ (r11 << 16);
        r12 = m2044b(r11 >>> 7);
        r13 = r11 & 127;
        r11 = r12 >> 3;
        r15 = (r12 & 7) << 3;
        r23 = r1;
        r22 = r2;
        r1 = (r1[r11] & (~(255 << r15))) | (r13 << r15);
        r23[r11] = r1;
        r23[(((r12 - 7) & r7) + (r7 & 7)) >> 3] = r1;
        r6[r12] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024a, code lost:
    
        r23 = r1;
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024e, code lost:
    
        r8 = r8 + 1;
        r2 = r22;
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0255, code lost:
    
        r1 = m2044b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0259, code lost:
    
        r16 = r1;
        r38.f3720d++;
        r1 = r38.f3754e;
        r2 = r38.f3717a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0273, code lost:
    
        if (((r4 >> r6) & 255) != r29) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0275, code lost:
    
        r33 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0277, code lost:
    
        r38.f3754e = r1 - r33;
        r1 = r38.f3719c;
        r4 = (r4 & (~(255 << r6))) | (r27 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2046d(long j) {
        int i;
        int iNumberOfTrailingZeros;
        int i2 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f3719c;
        int i7 = i4 & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f3717a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            int i11 = 1;
            long j2 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j3 = i5;
            int i12 = i8;
            int i13 = 0;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j5) >> 3)) & i6;
                int i14 = i2;
                if (this.f3718b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j5 &= j5 - 1;
                i2 = i14;
            }
            i8 = i12 + 8;
            i7 = (i7 + i8) & i6;
            i2 = i;
        }
        this.f3718b[iNumberOfTrailingZeros] = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2047e(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.f3719c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.f3717a;
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
                if (this.f3718b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                } else {
                    j4 &= j4 - 1;
                }
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        if (iNumberOfTrailingZeros >= 0) {
            this.f3720d--;
            long[] jArr2 = this.f3717a;
            int i8 = this.f3719c;
            int i9 = iNumberOfTrailingZeros >> 3;
            int i10 = (iNumberOfTrailingZeros & 7) << 3;
            long j5 = (jArr2[i9] & (~(255 << i10))) | (254 << i10);
            jArr2[i9] = j5;
            jArr2[(((iNumberOfTrailingZeros - 7) & i8) + (i8 & 7)) >> 3] = j5;
        }
    }
}
