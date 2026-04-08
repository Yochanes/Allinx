package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "<anonymous parameter 0>", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyListScope$stickyHeader$1 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.mo4220M(lazyItemScope) ? 4 : 2;
        }
        if (composer.mo4212E(iIntValue & 1, (iIntValue & 131) != 130)) {
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
