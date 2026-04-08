package androidx.compose.material;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/Density;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/Density;)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SwitchKt$SwitchImpl$3$1 extends Lambda implements Function1<Density, IntOffset> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f11429a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$3$1(Function0 function0) {
        super(1);
        this.f11429a = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new IntOffset(IntOffsetKt.m6655a(MathKt.m18640b(((Number) this.f11429a.invoke()).floatValue()), 0));
    }
}
