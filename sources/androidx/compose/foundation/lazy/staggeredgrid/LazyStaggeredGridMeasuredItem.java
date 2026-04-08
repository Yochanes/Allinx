package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {

    /* JADX INFO: renamed from: a */
    public final int f7587a;

    /* JADX INFO: renamed from: b */
    public final Object f7588b;

    /* JADX INFO: renamed from: c */
    public final List f7589c;

    /* JADX INFO: renamed from: d */
    public final boolean f7590d;

    /* JADX INFO: renamed from: e */
    public final int f7591e;

    /* JADX INFO: renamed from: f */
    public final int f7592f;

    /* JADX INFO: renamed from: g */
    public final int f7593g;

    /* JADX INFO: renamed from: h */
    public final int f7594h;

    /* JADX INFO: renamed from: i */
    public final Object f7595i;

    /* JADX INFO: renamed from: j */
    public final LazyLayoutItemAnimator f7596j;

    /* JADX INFO: renamed from: k */
    public final long f7597k;

    /* JADX INFO: renamed from: l */
    public boolean f7598l = true;

    /* JADX INFO: renamed from: m */
    public final int f7599m;

    /* JADX INFO: renamed from: n */
    public final int f7600n;

    /* JADX INFO: renamed from: o */
    public int f7601o;

    /* JADX INFO: renamed from: p */
    public int f7602p;

    /* JADX INFO: renamed from: q */
    public int f7603q;

    /* JADX INFO: renamed from: r */
    public boolean f7604r;

    /* JADX INFO: renamed from: s */
    public final long f7605s;

    /* JADX INFO: renamed from: t */
    public long f7606t;

    public LazyStaggeredGridMeasuredItem(int i, Object obj, List list, boolean z2, int i2, int i3, int i4, int i5, int i6, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j) {
        int i7;
        long j2;
        long j3;
        this.f7587a = i;
        this.f7588b = obj;
        this.f7589c = list;
        this.f7590d = z2;
        this.f7591e = i3;
        this.f7592f = i4;
        this.f7593g = i5;
        this.f7594h = i6;
        this.f7595i = obj2;
        this.f7596j = lazyLayoutItemAnimator;
        this.f7597k = j;
        int i8 = 1;
        int i9 = 0;
        if (list.isEmpty()) {
            i7 = 0;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            i7 = z2 ? placeable.f18568b : placeable.f18567a;
            int iM18405F = CollectionsKt.m18405F(list);
            if (1 <= iM18405F) {
                int i10 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i10);
                    int i11 = this.f7590d ? placeable2.f18568b : placeable2.f18567a;
                    i7 = i11 > i7 ? i11 : i7;
                    if (i10 == iM18405F) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.f7599m = i7;
        int i12 = i7 + i2;
        this.f7600n = i12 < 0 ? 0 : i12;
        List list2 = this.f7589c;
        if (!list2.isEmpty()) {
            Placeable placeable3 = (Placeable) list2.get(0);
            int i13 = this.f7590d ? placeable3.f18567a : placeable3.f18568b;
            int iM18405F2 = CollectionsKt.m18405F(list2);
            if (1 <= iM18405F2) {
                while (true) {
                    Placeable placeable4 = (Placeable) list2.get(i8);
                    int i14 = this.f7590d ? placeable4.f18567a : placeable4.f18568b;
                    i13 = i14 > i13 ? i14 : i13;
                    if (i8 == iM18405F2) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            i9 = i13;
        }
        this.f7601o = -1;
        if (this.f7590d) {
            j2 = ((long) i9) << 32;
            j3 = this.f7599m;
        } else {
            j2 = ((long) this.f7599m) << 32;
            j3 = i9;
        }
        this.f7605s = (j3 & 4294967295L) | j2;
        this.f7606t = 0L;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF7605s() {
        return this.f7605s;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: b */
    public final int mo2944b() {
        return this.f7589c.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getF7597k() {
        return this.f7597k;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF7591e() {
        return this.f7591e;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getF7606t() {
        return this.f7606t;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF7600n() {
        return this.f7600n;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF7604r() {
        return this.f7604r;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getF7587a() {
        return this.f7587a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final Object getF7588b() {
        return this.f7588b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF7592f() {
        return this.f7592f;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: i */
    public final Object mo2951i(int i) {
        return ((Placeable) this.f7589c.get(i)).mo5613s();
    }

    /* JADX INFO: renamed from: j */
    public final int m3130j(long j) {
        return (int) (this.f7590d ? j & 4294967295L : j >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getF7590d() {
        return this.f7590d;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: l */
    public final void mo2954l() {
        this.f7604r = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: m */
    public final long mo2955m(int i) {
        return this.f7606t;
    }

    /* JADX INFO: renamed from: n */
    public final int m3131n() {
        return (int) (!this.f7590d ? this.f7606t >> 32 : this.f7606t & 4294967295L);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: o */
    public final void mo2957o(int i, int i2, int i3, int i4) {
        if (this.f7590d) {
            i3 = i4;
        }
        m3132p(i, i2, i3);
    }

    /* JADX INFO: renamed from: p */
    public final void m3132p(int i, int i2, int i3) {
        long j;
        this.f7601o = i3;
        this.f7602p = -this.f7593g;
        this.f7603q = i3 + this.f7594h;
        if (this.f7590d) {
            j = (((long) i2) << 32) | (4294967295L & ((long) i));
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        this.f7606t = j;
    }
}
