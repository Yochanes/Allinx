package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "invoke-F1C5BW0", "()J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1 extends Lambda implements Function0<Offset> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnimationState f9800a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(AnimationState animationState) {
        super(0);
        this.f9800a = animationState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Offset(((Offset) this.f9800a.getF20325a()).f17524a);
    }
}
