package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material3/SheetState;", "", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SheetState {

    /* JADX INFO: renamed from: a */
    public final boolean f14404a;

    /* JADX INFO: renamed from: b */
    public final boolean f14405b;

    /* JADX INFO: renamed from: c */
    public final AnchoredDraggableState f14406c;

    /* JADX INFO: renamed from: androidx.compose.material3.SheetState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SheetValue;", "invoke", "(Landroidx/compose/material3/SheetValue;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    final class C10911 extends Lambda implements Function1<SheetValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public SheetState(boolean z2, Density density, SheetValue sheetValue, Function1 function1, boolean z3) {
        this.f14404a = z2;
        this.f14405b = z3;
        if (z2 && sheetValue == SheetValue.f14416c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z3 && sheetValue == SheetValue.f14414a) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f14406c = new AnchoredDraggableState(sheetValue, new SheetState$anchoredDraggableState$1(density), new SheetState$anchoredDraggableState$2(density), SheetDefaultsKt.f14396b, function1);
    }

    /* JADX INFO: renamed from: a */
    public static Object m4027a(SheetState sheetState, SheetValue sheetValue, SuspendLambda suspendLambda) {
        Object objM4128c = AnchoredDraggableKt.m4128c(sheetState.f14406c, sheetValue, ((SnapshotMutableFloatStateImpl) sheetState.f14406c.f15414l).mo4376c(), suspendLambda);
        return objM4128c == CoroutineSingletons.f51584a ? objM4128c : Unit.f51459a;
    }

    /* JADX INFO: renamed from: b */
    public final SheetValue m4028b() {
        return (SheetValue) ((SnapshotMutableStateImpl) this.f14406c.f15409g).getF20325a();
    }

    /* JADX INFO: renamed from: c */
    public final Object m4029c(SuspendLambda suspendLambda) {
        if (this.f14405b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objM4027a = m4027a(this, SheetValue.f14414a, suspendLambda);
        return objM4027a == CoroutineSingletons.f51584a ? objM4027a : Unit.f51459a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4030d() {
        return ((SnapshotMutableStateImpl) this.f14406c.f15409g).getF20325a() != SheetValue.f14414a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m4031e(SuspendLambda suspendLambda) {
        if (this.f14404a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objM4027a = m4027a(this, SheetValue.f14416c, suspendLambda);
        return objM4027a == CoroutineSingletons.f51584a ? objM4027a : Unit.f51459a;
    }
}
