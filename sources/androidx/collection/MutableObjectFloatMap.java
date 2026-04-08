package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableObjectFloatMap;", "K", "Landroidx/collection/ObjectFloatMap;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableObjectFloatMap<K> extends ObjectFloatMap<K> {

    /* JADX INFO: renamed from: f */
    public int f3755f;

    public MutableObjectFloatMap(int i) {
        this.f3806a = ScatterMapKt.f3844a;
        this.f3807b = ContainerHelpersKt.f3907c;
        this.f3808c = FloatSetKt.f3668a;
        if (i >= 0) {
            m2050d(ScatterMapKt.m2115e(i));
        } else {
            RuntimeHelpersKt.m2143a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2048b() {
        this.f3810e = 0;
        long[] jArr = this.f3806a;
        if (jArr != ScatterMapKt.f3844a) {
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f3806a;
            int i = this.f3809d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.m18388w(this.f3807b, null, 0, this.f3809d);
        this.f3755f = ScatterMapKt.m2111a(this.f3809d) - this.f3810e;
    }

    /* JADX INFO: renamed from: c */
    public final int m2049c(int i) {
        int i2 = this.f3809d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3806a;
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
    public final void m2050d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3809d = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        this.f3806a = jArr;
        int i2 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        this.f3755f = ScatterMapKt.m2111a(this.f3809d) - this.f3810e;
        this.f3807b = new Object[iMax];
        this.f3808c = new float[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r2 = m2049c(r5);
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        if (r36.f3755f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        if (((r36.f3806a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        r29 = 255;
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r2 = r36.f3809d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        if (r2 <= 8) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (java.lang.Long.compare((((long) r36.f3810e) * 32) ^ Long.MIN_VALUE, (((long) r2) * 25) ^ Long.MIN_VALUE) > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        r2 = r36.f3806a;
        r3 = r36.f3809d;
        r4 = r36.f3807b;
        r6 = r36.f3808c;
        r7 = (r3 + 7) >> 3;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00da, code lost:
    
        if (r8 >= r7) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        r29 = r9;
        r9 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r8 = r8 + 1;
        r9 = r29;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
    
        r29 = r9;
        r7 = kotlin.collections.ArraysKt.m18338E(r2);
        r8 = r7 - 1;
        r13 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0113, code lost:
    
        if (r7 == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0115, code lost:
    
        r8 = r7 >> 3;
        r19 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r19) & r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0123, code lost:
    
        if (r9 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0125, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:
    
        if (r9 == 254) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        r9 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012f, code lost:
    
        if (r9 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0131, code lost:
    
        r9 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0136, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
    
        r9 = r9 * r20;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r27 = m2049c(r10);
        r10 = r10 & r3;
        r31 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0150, code lost:
    
        if ((((r27 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0152, code lost:
    
        r28 = r3;
        r33 = r4;
        r2[r8] = ((~(r29 << r19)) & r2[r8]) | (((long) (r9 & 127)) << r19);
        r2[r2.length - 1] = (r2[0] & r31) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016f, code lost:
    
        r7 = r7 + 1;
        r3 = r28;
        r13 = r31;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0178, code lost:
    
        r28 = r3;
        r33 = r4;
        r3 = r27 >> 3;
        r13 = r2[r3];
        r4 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018a, code lost:
    
        if (((r13 >> r4) & r29) != 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018c, code lost:
    
        r2[r3] = ((~(r29 << r4)) & r13) | (((long) (r9 & 127)) << r4);
        r2[r8] = (r2[r8] & (~(r29 << r19))) | (128 << r19);
        r33[r27] = r33[r7];
        r33[r7] = null;
        r6[r27] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b6, code lost:
    
        r2[r3] = (((long) (r9 & 127)) << r4) | ((~(r29 << r4)) & r13);
        r3 = r33[r27];
        r33[r27] = r33[r7];
        r33[r7] = r3;
        r3 = r6[r27];
        r6[r27] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d8, code lost:
    
        r2[r2.length - 1] = (r2[0] & r31) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e4, code lost:
    
        r36.f3755f = androidx.collection.ScatterMapKt.m2111a(r36.f3809d) - r36.f3810e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f1, code lost:
    
        r29 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f4, code lost:
    
        r23 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f9, code lost:
    
        r2 = androidx.collection.ScatterMapKt.m2113c(r36.f3809d);
        r3 = r36.f3806a;
        r4 = r36.f3807b;
        r6 = r36.f3808c;
        r7 = r36.f3809d;
        m2050d(r2);
        r2 = r36.f3806a;
        r8 = r36.f3807b;
        r9 = r36.f3808c;
        r10 = r36.f3809d;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0213, code lost:
    
        if (r13 >= r7) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0223, code lost:
    
        if (((r3[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= r23) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0225, code lost:
    
        r14 = r4[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0227, code lost:
    
        if (r14 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0229, code lost:
    
        r17 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x022e, code lost:
    
        r17 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0230, code lost:
    
        r17 = r17 * r20;
        r17 = r17 ^ (r17 << 16);
        r15 = m2049c(r17 >>> 7);
        r1 = r17 & 127;
        r17 = r2;
        r19 = r15 >> 3;
        r22 = (r15 & 7) << 3;
        r1 = (r17[r19] & (~(255 << r22))) | (((long) r1) << r22);
        r17[r19] = r1;
        r17[(((r15 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r15] = r14;
        r9[r15] = r6[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0269, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x026b, code lost:
    
        r13 = r13 + 1;
        r2 = r17;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0273, code lost:
    
        r2 = m2049c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0277, code lost:
    
        r36.f3810e++;
        r1 = r36.f3755f;
        r3 = r36.f3806a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x028f, code lost:
    
        if (((r5 >> r7) & r29) != r23) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0292, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0294, code lost:
    
        r36.f3755f = r1 - r16;
        r1 = r36.f3809d;
        r5 = (r5 & (~(r29 << r7))) | (r11 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2051e(Object obj, float f) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = -862048943;
        int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f3809d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f3806a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            long j = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j2 = i6;
            int i13 = i6;
            int i14 = 0;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = -9187201950435737472L;
            long j5 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j5) >> 3)) & i7;
                int i15 = i3;
                if (Intrinsics.m18594b(this.f3807b[iNumberOfTrailingZeros], obj2)) {
                    i2 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j5 &= j5 - 1;
                    i3 = i15;
                }
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            obj2 = obj;
            i6 = i13;
            i3 = i;
        }
        if (i2 < 0) {
            i2 = ~i2;
        }
        this.f3807b[i2] = obj;
        this.f3808c[i2] = f;
    }

    public /* synthetic */ MutableObjectFloatMap() {
        this(6);
    }
}
