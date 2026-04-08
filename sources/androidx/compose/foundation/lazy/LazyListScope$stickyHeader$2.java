package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyListScope$stickyHeader$2 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ComposableLambdaImpl f6880a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListScope$stickyHeader$2(ComposableLambdaImpl composableLambdaImpl) {
        super(3);
        this.f6880a = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.mo4220M(lazyItemScope) ? 4 : 2;
        }
        if (composer.mo4212E(iIntValue & 1, (iIntValue & 19) != 18)) {
            this.f6880a.invoke(lazyItemScope, 0, composer, Integer.valueOf((iIntValue & 14) | 48));
        } else {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
