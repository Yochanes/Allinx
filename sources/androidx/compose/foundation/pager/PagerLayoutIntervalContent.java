package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/pager/PagerLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/pager/PagerIntervalContent;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {

    /* JADX INFO: renamed from: a */
    public final Function4 f7755a;

    /* JADX INFO: renamed from: b */
    public final Function1 f7756b;

    /* JADX INFO: renamed from: c */
    public final MutableIntervalList f7757c;

    public PagerLayoutIntervalContent(Function4 function4, Function1 function1, int i) {
        this.f7755a = function4;
        this.f7756b = function1;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.m3086a(i, new PagerIntervalContent(function1, function4));
        this.f7757c = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    /* JADX INFO: renamed from: i, reason: from getter */
    public final MutableIntervalList getF7757c() {
        return this.f7757c;
    }
}
