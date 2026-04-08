package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AnchoredDraggableKt$anchoredDraggableFlingBehavior$1 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Density f5320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$anchoredDraggableFlingBehavior$1(Density density) {
        super(0);
        this.f5320a = density;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(this.f5320a.mo2551X0(125));
    }
}
