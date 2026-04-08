package androidx.compose.material;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material/DrawerState;", "", "Companion", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DrawerState {

    /* JADX INFO: renamed from: a */
    public final AnchoredDraggableState f10585a;

    /* JADX INFO: renamed from: b */
    public Density f10586b;

    /* JADX INFO: renamed from: androidx.compose.material.DrawerState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DrawerValue;", "invoke", "(Landroidx/compose/material/DrawerValue;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C08761 extends Lambda implements Function1<DrawerValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public DrawerState(DrawerValue drawerValue) {
        DrawerKt$rememberDrawerState$1 drawerKt$rememberDrawerState$1 = DrawerKt$rememberDrawerState$1.f10583a;
        this.f10585a = new AnchoredDraggableState(drawerValue, new DrawerState$anchoredDraggableState$1(this), new DrawerState$anchoredDraggableState$2(this), DrawerKt.f10495d, drawerKt$rememberDrawerState$1);
    }

    /* JADX INFO: renamed from: a */
    public static final Density m3746a(DrawerState drawerState) {
        Density density = drawerState.f10586b;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + drawerState + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
