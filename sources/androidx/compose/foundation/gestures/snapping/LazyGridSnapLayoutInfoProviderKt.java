package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyGridSnapLayoutInfoProviderKt {
    /* JADX INFO: renamed from: a */
    public static final int m2683a(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return (int) (orientation == Orientation.f5829a ? lazyGridItemInfo.mo2982e() & 4294967295L : lazyGridItemInfo.mo2982e() >> 32);
    }
}
