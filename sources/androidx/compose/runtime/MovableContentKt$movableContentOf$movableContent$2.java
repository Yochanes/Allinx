package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "P1", "P2", "it", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MovableContentKt$movableContentOf$movableContent$2 extends Lambda implements Function3<Pair<Object, Object>, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Pair pair = (Pair) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? composer.mo4220M(pair) : composer.mo4235m(pair) ? 4 : 2;
        }
        if (composer.mo4212E(iIntValue & 1, (iIntValue & 19) != 18)) {
            Object obj4 = pair.f51426a;
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
