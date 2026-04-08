package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 176)
public final class LazyGridDslKt$items$5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyGridItemScope lazyGridItemScope = (LazyGridItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (composer.mo4220M(lazyGridItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= composer.mo4232j(iIntValue) ? 32 : 16;
        }
        if (composer.mo4212E(i & 1, (i & 147) != 146)) {
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
