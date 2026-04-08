package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyListIntervalContent$item$3 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function3 f6769a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListIntervalContent$item$3(Function3 function3) {
        super(4);
        this.f6769a = function3;
    }

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
            this.f6769a.invoke(lazyItemScope, composer, Integer.valueOf(iIntValue & 14));
        } else {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
