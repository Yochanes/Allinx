package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.google.common.primitives.Longs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/SieveCache;", "", "K", "V", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SieveCache<K, V> {

    /* JADX INFO: renamed from: a */
    public final Function2 f3863a;

    /* JADX INFO: renamed from: b */
    public final Function1 f3864b;

    /* JADX INFO: renamed from: c */
    public final Function4 f3865c;

    /* JADX INFO: renamed from: d */
    public long[] f3866d;

    /* JADX INFO: renamed from: e */
    public Object[] f3867e;

    /* JADX INFO: renamed from: f */
    public Object[] f3868f;

    /* JADX INFO: renamed from: g */
    public long[] f3869g;

    /* JADX INFO: renamed from: h */
    public int f3870h;

    /* JADX INFO: renamed from: i */
    public int f3871i;

    /* JADX INFO: renamed from: j */
    public int f3872j;

    /* JADX INFO: renamed from: k */
    public final int f3873k;

    /* JADX INFO: renamed from: l */
    public int f3874l;

    /* JADX INFO: renamed from: m */
    public int f3875m;

    /* JADX INFO: renamed from: n */
    public int f3876n;

    /* JADX INFO: renamed from: o */
    public int f3877o;

    /* JADX INFO: renamed from: androidx.collection.SieveCache$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C04321 extends Lambda implements Function2<Object, Object, Integer> {

        /* JADX INFO: renamed from: a */
        public static final C04321 f3878a = new C04321(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Intrinsics.m18599g(obj, "<anonymous parameter 0>");
            Intrinsics.m18599g(obj2, "<anonymous parameter 1>");
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.SieveCache$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "K", "", "V", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C04332 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final C04332 f3879a = new C04332(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object it) {
            Intrinsics.m18599g(it, "it");
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.SieveCache$3 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00042\b\u0010\u0007\u001a\u0004\u0018\u0001H\u00042\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, m18302d2 = {"<anonymous>", "", "K", "", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C04343 extends Lambda implements Function4<Object, Object, Object, Boolean, Unit> {

        /* JADX INFO: renamed from: a */
        public static final C04343 f3880a = new C04343(4);

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            ((Boolean) obj4).booleanValue();
            Intrinsics.m18599g(obj, "<anonymous parameter 0>");
            Intrinsics.m18599g(obj2, "<anonymous parameter 1>");
            return Unit.f51459a;
        }
    }

    public SieveCache() {
        C04321 c04321 = C04321.f3878a;
        C04332 c04332 = C04332.f3879a;
        C04343 c04343 = C04343.f3880a;
        this.f3863a = c04321;
        this.f3864b = c04332;
        this.f3865c = c04343;
        this.f3866d = ScatterMapKt.f3844a;
        Object[] objArr = ContainerHelpersKt.f3907c;
        this.f3867e = objArr;
        this.f3868f = objArr;
        this.f3869g = SieveCacheKt.f3881a;
        this.f3875m = Integer.MAX_VALUE;
        this.f3876n = Integer.MAX_VALUE;
        this.f3877o = Integer.MAX_VALUE;
        this.f3873k = 16;
        m2121b(ScatterMapKt.m2115e(16));
    }

    /* JADX INFO: renamed from: a */
    public final int m2120a(int i) {
        int i2 = this.f3870h;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.f3866d;
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

    /* JADX INFO: renamed from: b */
    public final void m2121b(int i) {
        long[] jArr;
        long[] jArr2;
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.m2114d(i)) : 0;
        this.f3870h = iMax;
        if (iMax == 0) {
            jArr = ScatterMapKt.f3844a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
            int i2 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        this.f3866d = jArr;
        this.f3871i = ScatterMapKt.m2111a(this.f3870h) - this.f3872j;
        Object[] objArr = ContainerHelpersKt.f3907c;
        this.f3867e = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f3868f = objArr;
        if (iMax == 0) {
            jArr2 = SieveCacheKt.f3881a;
        } else {
            jArr2 = new long[iMax];
            ArraysKt.m18390y(jArr2, 4611686018427387903L);
        }
        this.f3869g = jArr2;
    }

    /* JADX INFO: renamed from: c */
    public final void m2122c(int i) {
        char c2;
        long j;
        while (this.f3874l > i && this.f3872j != 0) {
            long[] jArr = this.f3869g;
            int i2 = this.f3877o;
            if (i2 == Integer.MAX_VALUE) {
                i2 = this.f3876n;
            }
            while (i2 != Integer.MAX_VALUE) {
                long j2 = jArr[i2];
                if (((int) ((j2 >> 62) & 1)) == 0) {
                    break;
                }
                int i3 = (int) ((j2 >> 31) & 2147483647L);
                jArr[i2] = 4611686018427387903L & j2;
                i2 = i3 != Integer.MAX_VALUE ? i3 : this.f3876n;
            }
            int i4 = (int) ((jArr[i2] >> 31) & 2147483647L);
            if (i4 == Integer.MAX_VALUE) {
                i4 = Integer.MAX_VALUE;
            }
            this.f3877o = i4;
            if (i2 == Integer.MAX_VALUE) {
                return;
            }
            Object obj = this.f3867e[i2];
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            this.f3872j--;
            long[] jArr2 = this.f3866d;
            int i5 = this.f3870h;
            int i6 = i2 >> 3;
            int i7 = (i2 & 7) << 3;
            long j3 = ((~(255 << i7)) & jArr2[i6]) | (254 << i7);
            jArr2[i6] = j3;
            jArr2[(((i2 - 7) & i5) + (i5 & 7)) >> 3] = j3;
            this.f3867e[i2] = null;
            Object[] objArr = this.f3868f;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            long[] jArr3 = this.f3869g;
            long j4 = jArr3[i2];
            int i8 = (int) ((j4 >> 31) & 2147483647L);
            int i9 = (int) (j4 & 2147483647L);
            if (i8 != Integer.MAX_VALUE) {
                c2 = 31;
                j = 2147483647L;
                jArr3[i8] = (((long) i9) & 2147483647L) | (jArr3[i8] & (-2147483648L));
            } else {
                c2 = 31;
                j = 2147483647L;
                this.f3875m = i9;
            }
            if (i9 != Integer.MAX_VALUE) {
                jArr3[i9] = (jArr3[i9] & (-4611686016279904257L)) | ((((long) i8) & j) << c2);
            } else {
                this.f3876n = i8;
            }
            if (this.f3877o == i2) {
                this.f3877o = i8;
            }
            jArr3[i2] = 4611686018427387903L;
            if (obj2 != null) {
                this.f3874l -= ((Number) this.f3863a.invoke(obj, obj2)).intValue();
                this.f3865c.invoke(obj, obj2, null, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03f0, code lost:
    
        r7 = (int) (r37[r7] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03f5, code lost:
    
        r7 = (r31 | ((long) r7)) << 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03fa, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03fc, code lost:
    
        r5 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0400, code lost:
    
        r5 = (int) (r37[r5] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0405, code lost:
    
        r1[r9] = ((long) r5) | r7;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x040c, code lost:
    
        r1 = r0.f3875m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0411, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0413, code lost:
    
        r0.f3875m = (int) (r37[r1] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x041a, code lost:
    
        r1 = r0.f3876n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x041c, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x041e, code lost:
    
        r0.f3876n = (int) (r37[r1] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0425, code lost:
    
        r1 = r0.f3877o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0427, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0429, code lost:
    
        r0.f3877o = (int) (r37[r1] & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0432, code lost:
    
        r60 = r7;
        r51 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0437, code lost:
    
        r27 = -4611686018427387904L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x043a, code lost:
    
        r1 = androidx.collection.ScatterMapKt.m2113c(r0.f3870h);
        r3 = r0.f3866d;
        r5 = r0.f3867e;
        r6 = r0.f3868f;
        r7 = r0.f3869g;
        r8 = r0.f3870h;
        r9 = new int[r8];
        r0.m2121b(r1);
        r1 = r0.f3866d;
        r10 = r0.f3867e;
        r15 = r0.f3868f;
        r1 = r0.f3869g;
        r1 = r0.f3870h;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0460, code lost:
    
        if (r1 >= r8) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0470, code lost:
    
        if (((r3[r1 >> 3] >> ((r1 & 7) << 3)) & 255) >= 128) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0472, code lost:
    
        r33 = r5[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0474, code lost:
    
        if (r33 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0476, code lost:
    
        r34 = r33.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x047b, code lost:
    
        r34 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x047d, code lost:
    
        r34 = r34 * (-862048943);
        r34 = r34 ^ (r34 << 16);
        r35 = r1;
        r1 = r0.m2120a(r34 >>> 7);
        r1 = r34 & 127;
        r34 = r5;
        r37 = r6;
        r5 = r1;
        r1 = r1 >> 3;
        r38 = (r1 & 7) << 3;
        r5 = (r1[r1] & (~(255 << r38))) | (r5 << r38);
        r1[r1] = r5;
        r1[(((r1 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r10[r1] = r33;
        r15[r1] = r37[r35];
        r1[r1] = r7[r35];
        r9[r35] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04c2, code lost:
    
        r35 = r1;
        r34 = r5;
        r37 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04c8, code lost:
    
        r1 = r35 + 1;
        r5 = r34;
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04cf, code lost:
    
        r1 = r0.f3869g;
        r3 = r1.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04d3, code lost:
    
        if (r5 >= r3) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04d5, code lost:
    
        r6 = r1[r5];
        r8 = r5;
        r5 = (int) ((r6 >> 31) & 2147483647L);
        r6 = (int) (r6 & 2147483647L);
        r31 = r6 & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04e7, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04e9, code lost:
    
        r5 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04ec, code lost:
    
        r5 = r9[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04f1, code lost:
    
        r7 = (r31 | ((long) r5)) << 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04f9, code lost:
    
        if (r6 != Integer.MAX_VALUE) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04fb, code lost:
    
        r6 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04fd, code lost:
    
        r6 = r9[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0501, code lost:
    
        r1[r8] = ((long) r6) | r7;
        r5 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0508, code lost:
    
        r1 = r0.f3875m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x050d, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x050f, code lost:
    
        r0.f3875m = r9[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0513, code lost:
    
        r1 = r0.f3876n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0515, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0517, code lost:
    
        r0.f3876n = r9[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x051b, code lost:
    
        r1 = r0.f3877o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x051d, code lost:
    
        if (r1 == Integer.MAX_VALUE) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x051f, code lost:
    
        r0.f3877o = r9[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0523, code lost:
    
        r1 = r0.m2120a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0527, code lost:
    
        r0.f3872j++;
        r2 = r0.f3871i;
        r3 = r0.f3866d;
        r5 = r1 >> 3;
        r6 = r3[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x053f, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0541, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0544, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0545, code lost:
    
        r0.f3871i = r2 - r9;
        r2 = r0.f3870h;
        r6 = (r6 & (~(255 << r8))) | (r9 << r8);
        r3[r5] = r6;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r1 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        r1 = r5;
        r0 = r28;
        r28 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (((r2 & ((~r2) << 6)) & r23) == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        r36 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ab, code lost:
    
        if (((r5 & ((~r5) << 6)) & r23) == 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ad, code lost:
    
        r1 = r0.m2120a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b3, code lost:
    
        if (r0.f3871i != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c6, code lost:
    
        if (((r0.f3866d[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c8, code lost:
    
        r60 = r7;
        r51 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ce, code lost:
    
        r1 = r0.f3870h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d2, code lost:
    
        if (r1 <= 8) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d4, code lost:
    
        r27 = -4611686018427387904L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ee, code lost:
    
        if (java.lang.Long.compare((((long) r0.f3872j) * 32) ^ Long.MIN_VALUE, (((long) r1) * 25) ^ Long.MIN_VALUE) > 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f0, code lost:
    
        r1 = r0.f3866d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f2, code lost:
    
        if (r1 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f4, code lost:
    
        r60 = r7;
        r51 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fa, code lost:
    
        r3 = r0.f3870h;
        r5 = r0.f3867e;
        r6 = r0.f3868f;
        r9 = r0.f3869g;
        r10 = new long[r3];
        java.util.Arrays.fill(r10, 0, r3, 9223372034707292159L);
        r9 = (r3 + 7) >> 3;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0219, code lost:
    
        if (r5 >= r9) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x021b, code lost:
    
        r39 = r5;
        r5 = r1[r5] & r23;
        r1[r39] = (-72340172838076674L) & ((~r5) + (r5 >>> r20));
        r5 = r39 + 1;
        r10 = r10;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0238, code lost:
    
        r37 = r10;
        r5 = r1.length;
        r6 = r5 - 1;
        r5 = r5 - 2;
        r1[r5] = (r1[r5] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0255, code lost:
    
        if (r5 == r3) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0257, code lost:
    
        r6 = r5 >> 3;
        r51 = (r5 & 7) << 3;
        r38 = (r1[r6] >> r51) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0265, code lost:
    
        if (r38 != 128) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0267, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x026c, code lost:
    
        if (r38 == 254) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x026f, code lost:
    
        r38 = r5[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0271, code lost:
    
        if (r38 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0273, code lost:
    
        r38 = r38.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0278, code lost:
    
        r38 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x027a, code lost:
    
        r38 = r38 * (-862048943);
        r38 = r38 ^ (r38 << 16);
        r9 = r38 >>> 7;
        r10 = r0.m2120a(r9);
        r9 = r9 & r3;
        r54 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029e, code lost:
    
        if ((((r10 - r9) & r3) / 8) != (((r5 - r9) & r54) / 8)) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a0, code lost:
    
        r1[r6] = (r1[r6] & (~(255 << r51))) | (((long) (r38 & 127)) << r51);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b6, code lost:
    
        if (r37[r5] != 9223372034707292159L) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b8, code lost:
    
        r9 = r5;
        r37[r5] = (r9 << 32) | r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02bf, code lost:
    
        r1[r1.length - 1] = r1[0];
        r5 = r5 + 1;
        r3 = r54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02cd, code lost:
    
        r3 = r10 >> 3;
        r55 = r1[r3];
        r9 = (r10 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e0, code lost:
    
        if (((r55 >> r9) & 255) != 128) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e2, code lost:
    
        r60 = r7;
        r1[r3] = (r55 & (~(255 << r9))) | (((long) (r38 & 127)) << r9);
        r1[r6] = (r1[r6] & (~(255 << r51))) | (128 << r51);
        r5[r10] = r5[r5];
        r5[r5] = null;
        r6[r10] = r6[r5];
        r6[r5] = null;
        r9[r10] = r9[r5];
        r9[r5] = 4611686018427387903L;
        r3 = (int) ((r37[r5] >> 32) & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0323, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0325, code lost:
    
        r37[r3] = (r37[r3] & (-4294967296L)) | ((long) r10);
        r37[r5] = (r37[r5] & 4294967295L) | (-4294967296L);
        r51 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0339, code lost:
    
        r51 = r8;
        r37[r5] = (((long) Integer.MAX_VALUE) << 32) | ((long) r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0345, code lost:
    
        r37[r10] = (((long) r5) << 32) | ((long) Integer.MAX_VALUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0353, code lost:
    
        r60 = r7;
        r51 = r8;
        r1[r3] = (r55 & (~(255 << r9))) | (((long) (r38 & 127)) << r9);
        r3 = r5[r10];
        r5[r10] = r5[r5];
        r5[r5] = r3;
        r3 = r6[r10];
        r6[r10] = r6[r5];
        r6[r5] = r3;
        r6 = r9[r10];
        r9[r10] = r9[r5];
        r9[r5] = r6;
        r3 = (int) ((r37[r5] >> 32) & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x038a, code lost:
    
        if (r3 == Integer.MAX_VALUE) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x038c, code lost:
    
        r8 = r10;
        r37[r3] = (r37[r3] & (-4294967296L)) | r8;
        r37[r5] = (r37[r5] & 4294967295L) | (r8 << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x039e, code lost:
    
        r6 = r10;
        r37[r5] = r6 | (r6 << 32);
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03a5, code lost:
    
        r37[r10] = (((long) r3) << 32) | ((long) r5);
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03ae, code lost:
    
        r1[r1.length - 1] = r1[0];
        r5 = r5 + 1;
        r8 = r51;
        r3 = r54;
        r7 = r60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03c1, code lost:
    
        r60 = r7;
        r51 = r8;
        r0.f3871i = androidx.collection.ScatterMapKt.m2111a(r0.f3870h) - r0.f3872j;
        r1 = r0.f3869g;
        r3 = r1.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03d9, code lost:
    
        if (r9 >= r3) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03db, code lost:
    
        r5 = r1[r9];
        r7 = (int) ((r5 >> 31) & 2147483647L);
        r5 = (int) (r5 & 2147483647L);
        r31 = r5 & (-4611686018427387904L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03ec, code lost:
    
        if (r7 != Integer.MAX_VALUE) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03ee, code lost:
    
        r7 = Integer.MAX_VALUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        SieveCache sieveCache;
        Object[] objArr;
        Object[] objArr2;
        long[] jArr;
        boolean z2;
        int i;
        SieveCache sieveCache2;
        int i2;
        Object[] objArr3;
        Object[] objArr4;
        long[] jArr2;
        int i3;
        int i4;
        long j;
        char c2;
        long j2;
        Object[] objArr5;
        int i5;
        int iNumberOfTrailingZeros;
        int i6;
        Object obj2;
        if (obj != this) {
            if (!(obj instanceof SieveCache)) {
                return false;
            }
            SieveCache sieveCache3 = (SieveCache) obj;
            if (sieveCache3.f3874l != this.f3874l || sieveCache3.f3872j != this.f3872j) {
                return false;
            }
            Object[] objArr6 = this.f3867e;
            Object[] objArr7 = this.f3868f;
            long[] jArr3 = this.f3866d;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j3 = jArr3[i7];
                    char c3 = 7;
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        z2 = true;
                        int i8 = 8;
                        int i9 = 8 - ((~(i7 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j3 & 255) < 128) {
                                int i11 = (i7 << 3) + i10;
                                c2 = c3;
                                Object obj3 = objArr6[i11];
                                j2 = j4;
                                Intrinsics.m18597e(obj3, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                                Object obj4 = objArr7[i11];
                                Intrinsics.m18597e(obj4, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                                int iHashCode = obj3.hashCode() * (-862048943);
                                int i12 = iHashCode ^ (iHashCode << 16);
                                int i13 = i12 & 127;
                                int i14 = sieveCache3.f3870h;
                                int i15 = (i12 >>> 7) & i14;
                                int i16 = 0;
                                while (true) {
                                    long[] jArr4 = sieveCache3.f3866d;
                                    int i17 = i15 >> 3;
                                    int i18 = (i15 & 7) << 3;
                                    int i19 = i14;
                                    objArr3 = objArr6;
                                    long j5 = (jArr4[i17] >>> i18) | ((jArr4[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
                                    SieveCache sieveCache4 = sieveCache3;
                                    long j6 = (((long) i13) * 72340172838076673L) ^ j5;
                                    long j7 = (j6 - 72340172838076673L) & (~j6) & j2;
                                    while (true) {
                                        if (j7 == 0) {
                                            break;
                                        }
                                        iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j7) >> 3)) & i19;
                                        long j8 = j7;
                                        sieveCache2 = sieveCache4;
                                        if (Intrinsics.m18594b(sieveCache2.f3867e[iNumberOfTrailingZeros], obj3)) {
                                            objArr5 = objArr7;
                                            break;
                                        }
                                        sieveCache4 = sieveCache2;
                                        j7 = j8 & (j8 - 1);
                                    }
                                    i16 += 8;
                                    i15 = (i15 + i16) & i19;
                                    sieveCache3 = sieveCache2;
                                    i13 = i5;
                                    objArr6 = objArr3;
                                    i14 = i19;
                                    objArr7 = objArr5;
                                }
                                if (iNumberOfTrailingZeros >= 0) {
                                    long[] jArr5 = sieveCache2.f3869g;
                                    jArr5[iNumberOfTrailingZeros] = (jArr5[iNumberOfTrailingZeros] & 4611686018427387903L) | Longs.MAX_POWER_OF_TWO;
                                    obj2 = sieveCache2.f3868f[iNumberOfTrailingZeros];
                                    objArr4 = objArr5;
                                    jArr2 = jArr3;
                                    i3 = length;
                                    i4 = i7;
                                    j = j3;
                                } else {
                                    Object objInvoke = sieveCache2.f3864b.invoke(obj3);
                                    if (objInvoke == null) {
                                        objArr4 = objArr5;
                                        jArr2 = jArr3;
                                        i3 = length;
                                        i4 = i7;
                                        j = j3;
                                        obj2 = null;
                                    } else {
                                        int iHashCode2 = obj3.hashCode() * (-862048943);
                                        int i20 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i21 = i20 >>> 7;
                                        int i22 = i20 & 127;
                                        int i23 = sieveCache2.f3870h;
                                        int i24 = i21 & i23;
                                        int i25 = 0;
                                        while (true) {
                                            long[] jArr6 = sieveCache2.f3866d;
                                            int i26 = i24 >> 3;
                                            objArr4 = objArr5;
                                            int i27 = (i24 & 7) << 3;
                                            jArr2 = jArr3;
                                            long j9 = (jArr6[i26] >>> i27) | ((jArr6[i26 + 1] << (64 - i27)) & ((-i27) >> 63));
                                            j = j3;
                                            long j10 = i22;
                                            long j11 = j9 ^ (j10 * 72340172838076673L);
                                            long j12 = (j11 - 72340172838076673L) & (~j11) & j2;
                                            while (true) {
                                                if (j12 == 0) {
                                                    break;
                                                }
                                                int iNumberOfTrailingZeros2 = (i24 + (Long.numberOfTrailingZeros(j12) >> 3)) & i23;
                                                if (Intrinsics.m18594b(sieveCache2.f3867e[iNumberOfTrailingZeros2], obj3)) {
                                                    i3 = length;
                                                    i4 = i7;
                                                    i6 = iNumberOfTrailingZeros2;
                                                    break;
                                                }
                                                j12 &= j12 - 1;
                                            }
                                            i25 += 8;
                                            i24 = (i24 + i25) & i23;
                                            jArr3 = jArr2;
                                            objArr5 = objArr4;
                                            j3 = j;
                                        }
                                        if (i6 < 0) {
                                            i6 = ~i6;
                                        }
                                        Object[] objArr8 = sieveCache2.f3868f;
                                        Object obj5 = objArr8[i6];
                                        objArr8[i6] = objInvoke;
                                        sieveCache2.f3867e[i6] = obj3;
                                        int i28 = sieveCache2.f3874l;
                                        Function2 function2 = sieveCache2.f3863a;
                                        int iIntValue = ((Number) function2.invoke(obj3, objInvoke)).intValue() + i28;
                                        sieveCache2.f3874l = iIntValue;
                                        int i29 = sieveCache2.f3873k;
                                        if (obj5 != null) {
                                            sieveCache2.f3874l = iIntValue - ((Number) function2.invoke(obj3, obj5)).intValue();
                                            sieveCache2.f3865c.invoke(obj3, obj5, objInvoke, Boolean.FALSE);
                                            sieveCache2.m2122c(i29);
                                        } else {
                                            sieveCache2.m2122c(i29);
                                            long[] jArr7 = sieveCache2.f3869g;
                                            int i30 = sieveCache2.f3875m;
                                            jArr7[i6] = (((long) i30) & 2147483647L) | 4611686016279904256L;
                                            if (i30 != Integer.MAX_VALUE) {
                                                jArr7[i30] = (jArr7[i30] & (-4611686016279904257L)) | ((((long) i6) & 2147483647L) << 31);
                                            }
                                            sieveCache2.f3875m = i6;
                                            if (sieveCache2.f3876n == Integer.MAX_VALUE) {
                                                sieveCache2.f3876n = i6;
                                            }
                                        }
                                        obj2 = objInvoke;
                                    }
                                }
                                if (!obj4.equals(obj2)) {
                                    return false;
                                }
                                i2 = 8;
                            } else {
                                sieveCache2 = sieveCache3;
                                i2 = i8;
                                objArr3 = objArr6;
                                objArr4 = objArr7;
                                jArr2 = jArr3;
                                i3 = length;
                                i4 = i7;
                                j = j3;
                                c2 = c3;
                                j2 = j4;
                            }
                            j3 = j >> i2;
                            i10++;
                            i8 = i2;
                            c3 = c2;
                            j4 = j2;
                            objArr6 = objArr3;
                            jArr3 = jArr2;
                            objArr7 = objArr4;
                            i7 = i4;
                            length = i3;
                            sieveCache3 = sieveCache2;
                        }
                        sieveCache = sieveCache3;
                        objArr = objArr6;
                        objArr2 = objArr7;
                        jArr = jArr3;
                        int i31 = length;
                        int i32 = i7;
                        if (i9 != i8) {
                            return true;
                        }
                        i = i32;
                        length = i31;
                    } else {
                        sieveCache = sieveCache3;
                        objArr = objArr6;
                        objArr2 = objArr7;
                        jArr = jArr3;
                        z2 = true;
                        i = i7;
                    }
                    if (i == length) {
                        return z2;
                    }
                    i7 = i + 1;
                    sieveCache3 = sieveCache;
                    objArr6 = objArr;
                    jArr3 = jArr;
                    objArr7 = objArr2;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f3867e;
        Object[] objArr2 = this.f3868f;
        long[] jArr = this.f3866d;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Intrinsics.m18597e(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i4];
                        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SieveCache[maxSize=");
        sb.append(this.f3873k);
        sb.append(", size=");
        sb.append(this.f3874l);
        sb.append(", capacity=");
        sb.append(this.f3870h);
        sb.append(", count=");
        return AbstractC0000a.m17n(sb, this.f3872j, ']');
    }
}
