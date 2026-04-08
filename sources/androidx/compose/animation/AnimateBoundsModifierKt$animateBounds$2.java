package androidx.compose.animation;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Constraints;", "animatedSize", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 1>", "invoke-2pbfIzA", "(JJ)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AnimateBoundsModifierKt$animateBounds$2 extends Lambda implements Function2<IntSize, Constraints, Constraints> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((IntSize) obj).f20568a;
        long j2 = ((Constraints) obj2).f20553a;
        return new Constraints(Constraints.Companion.m6624c((int) (j >> 32), (int) (j & 4294967295L)));
    }
}
