package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/pager/PagerIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PagerIntervalContent implements LazyLayoutIntervalContent.Interval {

    /* JADX INFO: renamed from: a */
    public final Function1 f7722a;

    /* JADX INFO: renamed from: b */
    public final Function4 f7723b;

    public PagerIntervalContent(Function1 function1, Function4 function4) {
        this.f7722a = function1;
        this.f7723b = function4;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final Function1 getF7722a() {
        return this.f7722a;
    }
}
