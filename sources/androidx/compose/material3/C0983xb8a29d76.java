package androidx.compose.material3;

import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/material3/DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class C0983xb8a29d76 implements SnapLayoutInfoProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 f12770a;

    public C0983xb8a29d76(LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 lazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1) {
        this.f12770a = lazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;
    }

    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    /* JADX INFO: renamed from: a */
    public final float mo2569a(float f, float f2) {
        return 0.0f;
    }

    @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
    /* JADX INFO: renamed from: b */
    public final float mo2570b(float f) {
        return this.f12770a.mo2570b(f);
    }
}
