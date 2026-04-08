package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class ClickableNode extends AbstractClickableNode {
    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: b2 */
    public final Object mo2402b2(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objM2661e = TapGestureDetectorKt.m2661e(pointerInputScope, new ClickableNode$clickPointerInput$2(this, null), new ClickableNode$clickPointerInput$3(this), continuation);
        return objM2661e == CoroutineSingletons.f51584a ? objM2661e : Unit.f51459a;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: f2 */
    public final boolean mo2406f2(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* JADX INFO: renamed from: g2 */
    public final void mo2407g2(KeyEvent keyEvent) {
        this.f4758A.invoke();
    }
}
