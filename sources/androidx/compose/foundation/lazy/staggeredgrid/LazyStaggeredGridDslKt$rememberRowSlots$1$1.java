package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class LazyStaggeredGridDslKt$rememberRowSlots$1$1 extends Lambda implements Function2<Density, Constraints, LazyStaggeredGridSlots> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        if (Constraints.m6616g(((Constraints) obj2).f20553a) == Integer.MAX_VALUE) {
            InlineClassHelperKt.m2705a("LazyHorizontalStaggeredGrid's height should be bound by parent.");
        }
        throw null;
    }
}
