package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.p032m5.conversation.p033ui.components.composer.C5380xb95d3bf;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {

    /* JADX INFO: renamed from: a */
    public final MutableIntervalList f7490a;

    /* JADX INFO: renamed from: b */
    public final LazyStaggeredGridSpanProvider f7491b;

    public LazyStaggeredGridIntervalContent(Function1 function1) {
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        this.f7490a = mutableIntervalList;
        this.f7491b = new LazyStaggeredGridSpanProvider(mutableIntervalList);
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    /* JADX INFO: renamed from: b */
    public final void mo3098b(int i, C5380xb95d3bf c5380xb95d3bf, ComposableLambdaImpl composableLambdaImpl) {
        this.f7490a.m3086a(i, new LazyStaggeredGridInterval(c5380xb95d3bf, composableLambdaImpl));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MutableIntervalList getF7490a() {
        return this.f7490a;
    }
}
