package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyGridIntervalContent$stickyHeader$2 extends Lambda implements Function3<LazyGridItemScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.mo4220M(lazyGridItemScope) ? 4 : 2;
        }
        if (composer.mo4212E(iIntValue & 1, (iIntValue & 19) != 18)) {
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
