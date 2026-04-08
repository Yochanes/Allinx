package androidx.collection;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/collection/ScatterSet;", "E", "", "Landroidx/collection/MutableScatterSet;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ScatterSet<E> {

    /* JADX INFO: renamed from: a */
    public long[] f3846a;

    /* JADX INFO: renamed from: b */
    public Object[] f3847b;

    /* JADX INFO: renamed from: c */
    public int f3848c;

    /* JADX INFO: renamed from: d */
    public int f3849d;

    /* JADX INFO: renamed from: androidx.collection.ScatterSet$toString$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "E", "element", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C04301 extends Lambda implements Function1<Object, CharSequence> {
        public C04301() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj == ScatterSet.this ? "(this)" : String.valueOf(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Set m2116a() {
        return new SetWrapper(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2117b(Object obj) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2118c() {
        return this.f3849d == 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2119d() {
        return this.f3849d != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScatterSet)) {
            return false;
        }
        ScatterSet scatterSet = (ScatterSet) obj;
        if (scatterSet.f3849d != this.f3849d) {
            return false;
        }
        Object[] objArr = this.f3847b;
        long[] jArr = this.f3846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !scatterSet.m2117b(objArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.f3848c * 31) + this.f3849d;
        Object[] objArr = this.f3847b;
        long[] jArr = this.f3846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (!Intrinsics.m18594b(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return iHashCode;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[PHI: r8
      0x0065: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0028, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        C04301 c04301 = new C04301();
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f3847b;
        long[] jArr = this.f3846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) c04301.invoke(obj));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) "]");
        } else {
            sb.append((CharSequence) "]");
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
