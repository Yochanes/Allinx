package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {

    /* JADX INFO: renamed from: c */
    public static final Function2 f6976c = null;

    /* JADX INFO: renamed from: a */
    public final LazyGridSpanLayoutProvider f6977a = new LazyGridSpanLayoutProvider(this);

    /* JADX INFO: renamed from: b */
    public final MutableIntervalList f6978b = new MutableIntervalList();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public LazyGridIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    /* JADX INFO: renamed from: g */
    public final void mo2980g(int i, ComposableLambdaImpl composableLambdaImpl) {
        this.f6978b.m3086a(i, new LazyGridInterval(composableLambdaImpl, LazyGridIntervalContent$Companion$DefaultSpan$1.f6979a));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MutableIntervalList getF7490a() {
        return this.f6978b;
    }
}
