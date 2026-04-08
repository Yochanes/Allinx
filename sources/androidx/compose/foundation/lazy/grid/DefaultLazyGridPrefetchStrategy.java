package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/DefaultLazyGridPrefetchStrategy;", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {

    /* JADX INFO: renamed from: a */
    public int f6942a = -1;

    /* JADX INFO: renamed from: b */
    public final MutableVector f6943b = new MutableVector(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);

    /* JADX INFO: renamed from: c */
    public boolean f6944c;
}
