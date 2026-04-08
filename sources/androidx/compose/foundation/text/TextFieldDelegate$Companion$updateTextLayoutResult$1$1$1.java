package androidx.compose.foundation.text;

import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "invoke-58bKbWc", "([F)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1 extends Lambda implements Function1<Matrix, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutCoordinates f8616a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1(LayoutCoordinates layoutCoordinates) {
        super(1);
        this.f8616a = layoutCoordinates;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((Matrix) obj).f17611a;
        LayoutCoordinates layoutCoordinates = this.f8616a;
        if (layoutCoordinates.mo5626m()) {
            LayoutCoordinatesKt.m5631c(layoutCoordinates).mo5622S(layoutCoordinates, fArr);
        }
        return Unit.f51459a;
    }
}
