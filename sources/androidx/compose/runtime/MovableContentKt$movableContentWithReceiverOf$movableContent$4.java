package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u000b¢\u0006\u0004\b\t\u0010\n"}, m18302d2 = {"<anonymous>", "", "R", "P1", "P2", "P3", "<name for destructuring parameter 0>", "", "", "invoke", "([Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MovableContentKt$movableContentWithReceiverOf$movableContent$4 extends Lambda implements Function3<Object[], Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object[] objArr = (Object[]) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (!composer.mo4212E(iIntValue & 1, (iIntValue & 3) != 2)) {
            composer.mo4246x();
            return Unit.f51459a;
        }
        Object obj4 = objArr[0];
        Object obj5 = objArr[1];
        Object obj6 = objArr[2];
        Object obj7 = objArr[3];
        throw null;
    }
}
