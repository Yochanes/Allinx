package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/WindowInsets;", "it", "Landroidx/compose/ui/unit/Density;", "invoke", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/Density;)Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class WindowInsetsSizeKt$windowInsetsTopHeight$2 extends Lambda implements Function2<WindowInsets, Density, Integer> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((WindowInsets) obj).mo2710a((Density) obj2));
    }
}
