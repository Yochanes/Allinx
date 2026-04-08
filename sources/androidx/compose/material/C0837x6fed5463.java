package androidx.compose.material;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

/* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Constraints;", "it", "invoke-ZezNO4M", "(J)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C0837x6fed5463 extends Lambda implements Function1<Constraints, Constraints> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Constraints(ConstraintsKt.m6636j(0, -MathKt.m18640b(0.0f), 1, Constraints.m6610a(((Constraints) obj).f20553a, 0, 0, 0, 0, 10)));
    }
}
