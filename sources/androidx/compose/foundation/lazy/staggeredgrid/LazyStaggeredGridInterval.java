package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.p032m5.conversation.p033ui.components.composer.C5380xb95d3bf;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyStaggeredGridInterval implements LazyLayoutIntervalContent.Interval {

    /* JADX INFO: renamed from: a */
    public final C5380xb95d3bf f7488a;

    /* JADX INFO: renamed from: b */
    public final ComposableLambdaImpl f7489b;

    public LazyStaggeredGridInterval(C5380xb95d3bf c5380xb95d3bf, ComposableLambdaImpl composableLambdaImpl) {
        this.f7488a = c5380xb95d3bf;
        this.f7489b = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    /* JADX INFO: renamed from: getKey */
    public final Function1 getF7722a() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    /* JADX INFO: renamed from: getType */
    public final Function1 getF6764b() {
        return this.f7488a;
    }
}
