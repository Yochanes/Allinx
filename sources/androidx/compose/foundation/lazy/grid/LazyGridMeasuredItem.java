package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {

    /* JADX INFO: renamed from: a */
    public final int f7058a;

    /* JADX INFO: renamed from: b */
    public final Object f7059b;

    /* JADX INFO: renamed from: c */
    public final boolean f7060c;

    /* JADX INFO: renamed from: d */
    public final int f7061d;

    /* JADX INFO: renamed from: e */
    public final boolean f7062e;

    /* JADX INFO: renamed from: f */
    public final LayoutDirection f7063f;

    /* JADX INFO: renamed from: g */
    public final int f7064g;

    /* JADX INFO: renamed from: h */
    public final int f7065h;

    /* JADX INFO: renamed from: i */
    public final List f7066i;

    /* JADX INFO: renamed from: j */
    public final long f7067j;

    /* JADX INFO: renamed from: k */
    public final Object f7068k;

    /* JADX INFO: renamed from: l */
    public final LazyLayoutItemAnimator f7069l;

    /* JADX INFO: renamed from: m */
    public final long f7070m;

    /* JADX INFO: renamed from: n */
    public final int f7071n;

    /* JADX INFO: renamed from: o */
    public final int f7072o;

    /* JADX INFO: renamed from: p */
    public final int f7073p;

    /* JADX INFO: renamed from: q */
    public final int f7074q;

    /* JADX INFO: renamed from: r */
    public int f7075r = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s */
    public int f7076s;

    /* JADX INFO: renamed from: t */
    public int f7077t;

    /* JADX INFO: renamed from: u */
    public final long f7078u;

    /* JADX INFO: renamed from: v */
    public long f7079v;

    /* JADX INFO: renamed from: w */
    public int f7080w;

    /* JADX INFO: renamed from: x */
    public int f7081x;

    /* JADX INFO: renamed from: y */
    public boolean f7082y;

    public LazyGridMeasuredItem(int i, Object obj, boolean z2, int i2, int i3, boolean z3, LayoutDirection layoutDirection, int i4, int i5, List list, long j, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.f7058a = i;
        this.f7059b = obj;
        this.f7060c = z2;
        this.f7061d = i2;
        this.f7062e = z3;
        this.f7063f = layoutDirection;
        this.f7064g = i4;
        this.f7065h = i5;
        this.f7066i = list;
        this.f7067j = j;
        this.f7068k = obj2;
        this.f7069l = lazyLayoutItemAnimator;
        this.f7070m = j2;
        this.f7071n = i6;
        this.f7072o = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Placeable placeable = (Placeable) list.get(i8);
            iMax = Math.max(iMax, this.f7060c ? placeable.f18568b : placeable.f18567a);
        }
        this.f7073p = iMax;
        int i9 = i3 + iMax;
        this.f7074q = i9 >= 0 ? i9 : 0;
        this.f7078u = this.f7060c ? (((long) iMax) & 4294967295L) | (((long) this.f7061d) << 32) : (((long) this.f7061d) & 4294967295L) | (((long) iMax) << 32);
        this.f7079v = 0L;
        this.f7080w = -1;
        this.f7081x = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF7078u() {
        return this.f7078u;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: b */
    public final int mo2944b() {
        return this.f7066i.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getF7070m() {
        return this.f7070m;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF7071n() {
        return this.f7071n;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getF7079v() {
        return this.f7079v;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF7074q() {
        return this.f7074q;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF7082y() {
        return this.f7082y;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getIndex, reason: from getter */
    public final int getF7058a() {
        return this.f7058a;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final Object getF7059b() {
        return this.f7059b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF7072o() {
        return this.f7072o;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: i */
    public final Object mo2951i(int i) {
        return ((Placeable) this.f7066i.get(i)).mo5613s();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF7080w() {
        return this.f7080w;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getF7060c() {
        return this.f7060c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: l */
    public final void mo2954l() {
        this.f7082y = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: m */
    public final long mo2955m(int i) {
        return this.f7079v;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getF7081x() {
        return this.f7081x;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: o */
    public final void mo2957o(int i, int i2, int i3, int i4) {
        m3004r(i, i2, i3, i4, -1, -1);
    }

    /* JADX INFO: renamed from: p */
    public final int m3002p(long j) {
        return (int) (this.f7060c ? j & 4294967295L : j >> 32);
    }

    /* JADX INFO: renamed from: q */
    public final void m3003q(Placeable.PlacementScope placementScope, boolean z2) {
        GraphicsLayer graphicsLayer;
        if (this.f7075r == Integer.MIN_VALUE) {
            InlineClassHelperKt.m2705a("position() should be called first");
        }
        List list = this.f7066i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Placeable placeable = (Placeable) list.get(i);
            int i2 = this.f7076s;
            boolean z3 = this.f7060c;
            int i3 = i2 - (z3 ? placeable.f18568b : placeable.f18567a);
            int i4 = this.f7077t;
            long j = this.f7079v;
            LazyLayoutItemAnimation lazyLayoutItemAnimationM3046a = this.f7069l.m3046a(i, this.f7059b);
            if (lazyLayoutItemAnimationM3046a != null) {
                if (z2) {
                    lazyLayoutItemAnimationM3046a.f7230q = j;
                } else {
                    long jM6653d = IntOffset.m6653d(!IntOffset.m6651b(lazyLayoutItemAnimationM3046a.f7230q, LazyLayoutItemAnimation.f7212r) ? lazyLayoutItemAnimationM3046a.f7230q : j, ((IntOffset) ((SnapshotMutableStateImpl) lazyLayoutItemAnimationM3046a.f7229p).getF20325a()).f20562a);
                    if ((m3002p(j) <= i3 && m3002p(jM6653d) <= i3) || (m3002p(j) >= i4 && m3002p(jM6653d) >= i4)) {
                        lazyLayoutItemAnimationM3046a.m3037b();
                    }
                    j = jM6653d;
                }
                graphicsLayer = lazyLayoutItemAnimationM3046a.f7226m;
            } else {
                graphicsLayer = null;
            }
            if (this.f7062e) {
                j = (((long) (z3 ? (int) (j >> 32) : (this.f7075r - ((int) (j >> 32))) - (z3 ? placeable.f18568b : placeable.f18567a))) << 32) | (((long) (z3 ? (this.f7075r - ((int) (j & 4294967295L))) - (z3 ? placeable.f18568b : placeable.f18567a) : (int) (j & 4294967295L))) & 4294967295L);
            }
            long jM6653d2 = IntOffset.m6653d(j, this.f7067j);
            if (!z2 && lazyLayoutItemAnimationM3046a != null) {
                lazyLayoutItemAnimationM3046a.f7225l = jM6653d2;
            }
            if (z3) {
                if (graphicsLayer != null) {
                    placementScope.getClass();
                    Placeable.PlacementScope.m5674a(placementScope, placeable);
                    placeable.mo5672w0(IntOffset.m6653d(jM6653d2, placeable.f18571f), 0.0f, graphicsLayer);
                } else {
                    Placeable.PlacementScope.m5682n(placementScope, placeable, jM6653d2);
                }
            } else if (graphicsLayer != null) {
                Placeable.PlacementScope.m5680k(placementScope, placeable, jM6653d2, graphicsLayer);
            } else {
                Placeable.PlacementScope.m5679j(placementScope, placeable, jM6653d2);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3004r(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z2 = this.f7060c;
        int i7 = z2 ? i4 : i3;
        this.f7075r = i7;
        if (!z2) {
            i3 = i4;
        }
        if (z2) {
            if (this.f7063f == LayoutDirection.f20570b) {
                i2 = (i3 - i2) - this.f7061d;
            }
        }
        if (z2) {
            j = ((long) i2) << 32;
            j2 = i;
        } else {
            j = ((long) i) << 32;
            j2 = i2;
        }
        this.f7079v = (j2 & 4294967295L) | j;
        this.f7080w = i5;
        this.f7081x = i6;
        this.f7076s = -this.f7064g;
        this.f7077t = i7 + this.f7065h;
    }
}
