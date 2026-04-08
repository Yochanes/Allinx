package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/text/modifiers/SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C0772x11577c8c implements MouseSelectionObserver {

    /* JADX INFO: renamed from: a */
    public long f9493a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f9494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SelectionRegistrar f9495c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f9496d;

    public C0772x11577c8c(Function0 function0, SelectionRegistrar selectionRegistrar, long j) {
        this.f9494b = function0;
        this.f9495c = selectionRegistrar;
        this.f9496d = j;
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* JADX INFO: renamed from: a */
    public final boolean mo3499a(long j, SelectionAdjustment selectionAdjustment) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$modifier$1) this.f9494b).invoke();
        if (layoutCoordinates == null || !layoutCoordinates.mo5626m()) {
            return false;
        }
        SelectionRegistrar selectionRegistrar = this.f9495c;
        selectionRegistrar.mo3639g(layoutCoordinates, j, selectionAdjustment, false);
        this.f9493a = j;
        return SelectionRegistrarKt.m3643a(selectionRegistrar, this.f9496d);
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* JADX INFO: renamed from: b */
    public final void mo3500b() {
        this.f9495c.mo3635c();
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* JADX INFO: renamed from: c */
    public final boolean mo3501c(long j, SelectionAdjustment selectionAdjustment) {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ((SelectionController$modifier$1) this.f9494b).invoke();
        if (layoutCoordinates == null) {
            return true;
        }
        if (!layoutCoordinates.mo5626m()) {
            return false;
        }
        SelectionRegistrar selectionRegistrar = this.f9495c;
        if (!SelectionRegistrarKt.m3643a(selectionRegistrar, this.f9496d)) {
            return false;
        }
        if (!selectionRegistrar.mo3641i(layoutCoordinates, j, this.f9493a, selectionAdjustment, false)) {
            return true;
        }
        this.f9493a = j;
        return true;
    }
}
