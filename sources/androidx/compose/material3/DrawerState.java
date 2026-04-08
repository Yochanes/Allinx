package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material3/DrawerState;", "", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DrawerState {

    /* JADX INFO: renamed from: a */
    public final AnchoredDraggableState f13292a;

    /* JADX INFO: renamed from: b */
    public final MutableState f13293b;

    /* JADX INFO: renamed from: androidx.compose.material3.DrawerState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/DrawerValue;", "invoke", "(Landroidx/compose/material3/DrawerValue;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C10091 extends Lambda implements Function1<DrawerValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public DrawerState(DrawerValue drawerValue) {
        NavigationDrawerKt$rememberDrawerState$1 navigationDrawerKt$rememberDrawerState$1 = NavigationDrawerKt$rememberDrawerState$1.f13887a;
        this.f13292a = new AnchoredDraggableState(drawerValue, DrawerState$anchoredDraggableState$1.f13294a, new DrawerState$anchoredDraggableState$2(this), NavigationDrawerKt.f13834c, navigationDrawerKt$rememberDrawerState$1);
        new DrawerState$offset$1(this);
        this.f13293b = SnapshotStateKt.m4525g(null);
    }

    /* JADX INFO: renamed from: a */
    public final Object m3945a(SuspendLambda suspendLambda) throws Throwable {
        DrawerValue drawerValue = DrawerValue.f13306a;
        TweenSpec tweenSpec = NavigationDrawerKt.f13834c;
        AnchoredDraggableState anchoredDraggableState = this.f13292a;
        Object objM4132b = anchoredDraggableState.m4132b(drawerValue, MutatePriority.f5091a, new DrawerState$animateTo$3(this, ((SnapshotMutableFloatStateImpl) anchoredDraggableState.f15414l).mo4376c(), tweenSpec, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        Unit unit = Unit.f51459a;
        if (objM4132b != coroutineSingletons) {
            objM4132b = unit;
        }
        return objM4132b == coroutineSingletons ? objM4132b : unit;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3946b() {
        return ((DrawerValue) ((SnapshotMutableStateImpl) this.f13292a.f15409g).getF20325a()) == DrawerValue.f13307b;
    }
}
