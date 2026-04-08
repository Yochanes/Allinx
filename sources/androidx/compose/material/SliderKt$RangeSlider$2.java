package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SliderKt$RangeSlider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    /* JADX INFO: renamed from: a */
    public static final float m3779a(ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        return SliderKt.m3778e(((Number) closedFloatingPointRange.mo7700e()).floatValue(), ((Number) closedFloatingPointRange.mo7701f()).floatValue(), f, floatRef.f51656a, floatRef2.f51656a);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.mo4220M(boxWithConstraintsScope) ? 4 : 2;
        }
        if (!composer.mo4212E(iIntValue & 1, (iIntValue & 19) != 18)) {
            composer.mo4246x();
            return Unit.f51459a;
        }
        composer.mo4247y(CompositionLocalsKt.f19363n);
        LayoutDirection layoutDirection = LayoutDirection.f20569a;
        boxWithConstraintsScope.mo2747c();
        Density density = (Density) composer.mo4247y(CompositionLocalsKt.f19357h);
        float f = SliderKt.f11021a;
        density.mo2551X0(f);
        density.mo2551X0(f);
        composer.mo4229g();
        throw null;
    }
}
