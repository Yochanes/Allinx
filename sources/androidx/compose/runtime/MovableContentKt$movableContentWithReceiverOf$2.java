package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "R", "P", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MovableContentKt$movableContentWithReceiverOf$2 extends Lambda implements Function4<Object, Object, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? composer.mo4220M(obj) : composer.mo4235m(obj) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? composer.mo4220M(obj2) : composer.mo4235m(obj2) ? 32 : 16;
        }
        if (composer.mo4212E(i & 1, (i & 147) != 146)) {
            composer.mo4248z(new Pair(obj, obj2));
        } else {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
