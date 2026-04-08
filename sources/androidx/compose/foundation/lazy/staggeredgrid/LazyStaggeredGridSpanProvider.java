package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyStaggeredGridSpanProvider {

    /* JADX INFO: renamed from: a */
    public final MutableIntervalList f7622a;

    public LazyStaggeredGridSpanProvider(MutableIntervalList mutableIntervalList) {
        this.f7622a = mutableIntervalList;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3135a(int i) {
        if (i >= 0) {
            MutableIntervalList mutableIntervalList = this.f7622a;
            if (i < mutableIntervalList.f7432b) {
            }
        }
        return false;
    }
}
