package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"androidx/compose/foundation/pager/PagerScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PagerScrollScopeKt$LazyLayoutScrollScope$1 implements LazyLayoutScrollScope, ScrollScope {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ScrollScope f7825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PagerState f7826b;

    public PagerScrollScopeKt$LazyLayoutScrollScope$1(ScrollScope scrollScope, PagerState pagerState) {
        this.f7826b = pagerState;
        this.f7825a = scrollScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    /* JADX INFO: renamed from: a */
    public final int mo2963a() {
        return ((PageInfo) CollectionsKt.m18411L(this.f7826b.m3166l().mo3150e())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    /* JADX INFO: renamed from: b */
    public final void mo2964b(int i, int i2) {
        this.f7826b.m3172u(i2 / r0.m3168o(), true, i);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    /* JADX INFO: renamed from: c */
    public final int mo2965c() {
        return this.f7826b.f7841f;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    /* JADX INFO: renamed from: d */
    public final int mo2966d(int i) {
        PagerState pagerState = this.f7826b;
        return (int) (RangesKt.m18657d(PagerScrollPositionKt.m3156a(pagerState) + ((long) MathKt.m18640b(((pagerState.m3168o() * (i - pagerState.m3164j())) - (pagerState.m3165k() * pagerState.m3168o())) + 0)), pagerState.f7843h, pagerState.f7842g) - PagerScrollPositionKt.m3156a(pagerState));
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    /* JADX INFO: renamed from: e */
    public final float mo2579e(float f) {
        return this.f7825a.mo2579e(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    /* JADX INFO: renamed from: f */
    public final int mo2967f() {
        return this.f7826b.f7840e;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
    public final int getItemCount() {
        return this.f7826b.mo3139m();
    }
}
