package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class Arrangement$Absolute$spacedBy$1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Alignment.Companion.f17164n.mo4858a(0, ((Number) obj).intValue(), (LayoutDirection) obj2));
    }
}
