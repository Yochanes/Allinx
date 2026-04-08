package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material/BackdropScaffoldState;", "", "Companion", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BackdropScaffoldState {

    /* JADX INFO: renamed from: a */
    public final Function1 f10219a;

    /* JADX INFO: renamed from: b */
    public final AnchoredDraggableState f10220b;

    /* JADX INFO: renamed from: c */
    public Density f10221c;

    /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BackdropValue;", "invoke", "(Landroidx/compose/material/BackdropValue;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C08421 extends Lambda implements Function1<BackdropValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/BackdropScaffoldState$Companion;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        this.f10219a = function1;
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(backdropValue, new BackdropScaffoldState$anchoredDraggableState$1(this), new BackdropScaffoldState$anchoredDraggableState$2(this), animationSpec, function1);
        this.f10220b = anchoredDraggableState;
        Orientation orientation = Orientation.f5829a;
        float f = BackdropScaffoldKt.f10164a;
        new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1(anchoredDraggableState);
    }

    /* JADX INFO: renamed from: a */
    public static final Density m3698a(BackdropScaffoldState backdropScaffoldState) {
        Density density = backdropScaffoldState.f10221c;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BackdropScaffoldState (" + backdropScaffoldState + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?").toString());
    }
}
