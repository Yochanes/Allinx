package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "Companion", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ModalBottomSheetState {

    /* JADX INFO: renamed from: a */
    public final AnimationSpec f10752a;

    /* JADX INFO: renamed from: b */
    public final AnchoredDraggableState f10753b;

    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/ModalBottomSheetValue;", "invoke", "(Landroidx/compose/material/ModalBottomSheetValue;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C09001 extends Lambda implements Function1<ModalBottomSheetValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f10756a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, Density density, Function1 function1, AnimationSpec animationSpec) {
        this.f10752a = animationSpec;
        this.f10753b = new AnchoredDraggableState(modalBottomSheetValue, new ModalBottomSheetState$anchoredDraggableState$1(density), new ModalBottomSheetState$anchoredDraggableState$2(density), animationSpec, function1);
    }

    /* JADX INFO: renamed from: a */
    public static Object m3760a(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, SuspendLambda suspendLambda) {
        Object objM3681d = AnchoredDraggableKt.m3681d(modalBottomSheetState.f10753b, modalBottomSheetValue, ((SnapshotMutableFloatStateImpl) modalBottomSheetState.f10753b.f10071l).mo4376c(), suspendLambda);
        return objM3681d == CoroutineSingletons.f51584a ? objM3681d : Unit.f51459a;
    }
}
