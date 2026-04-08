package androidx.compose.animation;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Constraints;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/IntSize;", "constraints", "invoke-2pbfIzA", "(JJ)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AnimateBoundsModifierKt$animateBounds$1 extends Lambda implements Function2<IntSize, Constraints, Constraints> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((IntSize) obj).f20568a;
        return new Constraints(((Constraints) obj2).f20553a);
    }
}
