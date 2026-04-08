package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "Companion", "SpannedItem", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyStaggeredGridLaneInfo {

    /* JADX INFO: renamed from: a */
    public int f7515a;

    /* JADX INFO: renamed from: b */
    public int[] f7516b = new int[16];

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f7517c = new ArrayDeque();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$Companion;", "", "", "FullSpan", "I", "MaxCapacity", "Unset", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class SpannedItem {

        /* JADX INFO: renamed from: a */
        public final int f7518a;

        /* JADX INFO: renamed from: b */
        public int[] f7519b;

        public SpannedItem(int i, int[] iArr) {
            this.f7518a = i;
            this.f7519b = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3104a(int i, int i2) {
        int iM3109f = m3109f(i);
        return iM3109f == i2 || iM3109f == -1 || iM3109f == -2;
    }

    /* JADX INFO: renamed from: b */
    public final void m3105b(int i, int i2) {
        if (i > 131072) {
            InlineClassHelperKt.m2705a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = this.f7516b;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            ArraysKt.m18384s(i2, 0, this.f7516b, iArr2, 12);
            this.f7516b = iArr2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3106c(int i) {
        ArrayDeque arrayDeque;
        int i2 = this.f7515a;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(i - (this.f7516b.length / 2), 0);
            this.f7515a = iMax;
            int i4 = iMax - i2;
            if (i4 >= 0) {
                int[] iArr = this.f7516b;
                if (i4 < iArr.length) {
                    ArraysKt.m18379n(0, i4, iArr, iArr, iArr.length);
                }
                int[] iArr2 = this.f7516b;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), this.f7516b.length, 0);
            } else {
                int i5 = -i4;
                int[] iArr3 = this.f7516b;
                if (iArr3.length + i5 < 131072) {
                    m3105b(iArr3.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr3.length) {
                        ArraysKt.m18379n(i5, 0, iArr3, iArr3, iArr3.length - i5);
                    }
                    int[] iArr4 = this.f7516b;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i5), 0);
                }
            }
        } else {
            m3105b(i3 + 1, 0);
        }
        while (true) {
            arrayDeque = this.f7517c;
            if (arrayDeque.isEmpty() || ((SpannedItem) arrayDeque.first()).f7518a >= this.f7515a) {
                break;
            } else {
                arrayDeque.removeFirst();
            }
        }
        while (!arrayDeque.isEmpty() && ((SpannedItem) arrayDeque.last()).f7518a > this.f7515a + this.f7516b.length) {
            arrayDeque.removeLast();
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m3107d(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!m3104a(i, i2));
        return i;
    }

    /* JADX INFO: renamed from: e */
    public final int[] m3108e(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ArrayDeque arrayDeque = this.f7517c;
        SpannedItem spannedItem = (SpannedItem) CollectionsKt.m18406G(CollectionsKt.m18446o(arrayDeque, arrayDeque.getF16774j(), new C0636x6e01acca(numValueOf)), arrayDeque);
        if (spannedItem != null) {
            return spannedItem.f7519b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final int m3109f(int i) {
        int i2 = this.f7515a;
        if (i < i2) {
            return -1;
        }
        if (i >= this.f7516b.length + i2) {
            return -1;
        }
        return r1[i - i2] - 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m3110g() {
        ArraysKt.m18389x(this.f7516b, 0, 0, 6);
        this.f7517c.clear();
    }

    /* JADX INFO: renamed from: h */
    public final void m3111h(int i, int i2) {
        if (!(i >= 0)) {
            InlineClassHelperKt.m2705a("Negative lanes are not supported");
        }
        m3106c(i);
        this.f7516b[i - this.f7515a] = i2 + 1;
    }
}
