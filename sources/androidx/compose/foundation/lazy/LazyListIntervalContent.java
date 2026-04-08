package androidx.compose.foundation.lazy;

import androidx.collection.MutableIntList;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/LazyListInterval;", "Landroidx/compose/foundation/lazy/LazyListScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@ExperimentalFoundationApi
@SourceDebugExtension
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {

    /* JADX INFO: renamed from: a */
    public final MutableIntervalList f6766a = new MutableIntervalList();

    /* JADX INFO: renamed from: b */
    public MutableIntList f6767b;

    public LazyListIntervalContent(Function1 function1) {
        function1.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    /* JADX INFO: renamed from: c */
    public final void mo2915c(int i, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl) {
        this.f6766a.m3086a(i, new LazyListInterval(function1, function12, composableLambdaImpl));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    /* JADX INFO: renamed from: d */
    public final void mo2916d(ComposableLambdaImpl composableLambdaImpl) {
        MutableIntList mutableIntList = this.f6767b;
        if (mutableIntList == null) {
            mutableIntList = new MutableIntList();
            this.f6767b = mutableIntList;
        }
        MutableIntervalList mutableIntervalList = this.f6766a;
        mutableIntList.m2019c(mutableIntervalList.f7432b);
        mo2917f(null, new ComposableLambdaImpl(1491981087, new LazyListIntervalContent$stickyHeader$1(mutableIntervalList.f7432b, composableLambdaImpl), true));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    /* JADX INFO: renamed from: f */
    public final void mo2917f(Object obj, Function3 function3) {
        this.f6766a.m3086a(1, new LazyListInterval(obj != null ? new LazyListIntervalContent$item$1(obj) : null, new LazyListIntervalContent$item$2(1), new ComposableLambdaImpl(-1010194746, new LazyListIntervalContent$item$3(function3), true)));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MutableIntervalList getF6766a() {
        return this.f6766a;
    }
}
