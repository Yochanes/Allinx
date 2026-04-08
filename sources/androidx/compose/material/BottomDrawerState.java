package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material/BottomDrawerState;", "", "Companion", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BottomDrawerState {

    /* JADX INFO: renamed from: a */
    public final AnchoredDraggableState f10236a;

    /* JADX INFO: renamed from: androidx.compose.material.BottomDrawerState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomDrawerValue;", "invoke", "(Landroidx/compose/material/BottomDrawerValue;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C08451 extends Lambda implements Function1<BottomDrawerValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public BottomDrawerState(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1, AnimationSpec animationSpec) {
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(bottomDrawerValue, new BottomDrawerState$anchoredDraggableState$1(density), new BottomDrawerState$anchoredDraggableState$2(density), animationSpec, function1);
        this.f10236a = anchoredDraggableState;
        float f = DrawerKt.f10492a;
        new C0869xfccf8785(anchoredDraggableState);
    }
}
