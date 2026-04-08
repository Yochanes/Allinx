package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/material/ThresholdConfig;", "from", "Landroidx/compose/material/DismissValue;", "to", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends Lambda implements Function2<DismissValue, DismissValue, ThresholdConfig> {
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        DismissDirection dismissDirection;
        DismissValue dismissValue = (DismissValue) obj;
        DismissValue dismissValue2 = (DismissValue) obj2;
        float f = SwipeToDismissKt.f11328a;
        if (dismissValue != dismissValue2 || dismissValue != DismissValue.f10462a) {
            if (dismissValue == dismissValue2 && dismissValue == DismissValue.f10463b) {
                dismissDirection = DismissDirection.f10458a;
            } else if (dismissValue == dismissValue2 && dismissValue == DismissValue.f10464c) {
                dismissDirection = DismissDirection.f10459b;
            } else {
                DismissValue dismissValue3 = DismissValue.f10462a;
                dismissDirection = (dismissValue == dismissValue3 && dismissValue2 == DismissValue.f10463b) ? DismissDirection.f10458a : (dismissValue == dismissValue3 && dismissValue2 == DismissValue.f10464c) ? DismissDirection.f10459b : (dismissValue == DismissValue.f10463b && dismissValue2 == dismissValue3) ? DismissDirection.f10458a : (dismissValue == DismissValue.f10464c && dismissValue2 == dismissValue3) ? DismissDirection.f10459b : null;
            }
        }
        Intrinsics.m18596d(dismissDirection);
        throw null;
    }
}
