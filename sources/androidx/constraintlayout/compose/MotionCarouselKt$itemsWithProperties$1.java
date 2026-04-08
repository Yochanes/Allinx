package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.compose.MotionLayoutScope;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006H\u000b¢\u0006\u0004\b\t\u0010\n"}, m18302d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "properties", "Landroidx/compose/runtime/State;", "Landroidx/constraintlayout/compose/MotionLayoutScope$MotionProperties;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "invoke", "(ILandroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 176)
public final class MotionCarouselKt$itemsWithProperties$1 extends Lambda implements Function4<Integer, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties>, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        androidx.compose.runtime.State state = (androidx.compose.runtime.State) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (composer.mo4232j(iIntValue) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= composer.mo4220M(state) ? 32 : 16;
        }
        if ((i & 147) != 146 || !composer.mo4242t()) {
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
