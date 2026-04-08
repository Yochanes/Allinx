package androidx.compose.foundation.lazy.grid;

import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface LazyGridItemProvider extends LazyLayoutItemProvider {
    /* JADX INFO: renamed from: a */
    LazyLayoutKeyIndexMap mo2985a();

    /* JADX INFO: renamed from: b */
    MutableIntList mo2986b();

    /* JADX INFO: renamed from: i */
    LazyGridSpanLayoutProvider mo2987i();
}
