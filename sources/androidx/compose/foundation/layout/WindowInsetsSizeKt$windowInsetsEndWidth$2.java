package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/WindowInsets;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "invoke", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class WindowInsetsSizeKt$windowInsetsEndWidth$2 extends Lambda implements Function3<WindowInsets, LayoutDirection, Density, Integer> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WindowInsets windowInsets = (WindowInsets) obj;
        LayoutDirection layoutDirection = (LayoutDirection) obj2;
        Density density = (Density) obj3;
        return Integer.valueOf(layoutDirection == LayoutDirection.f20570b ? windowInsets.mo2713d(density, layoutDirection) : windowInsets.mo2711b(density, layoutDirection));
    }
}
