package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DefaultDraggableState implements DraggableState {

    /* JADX INFO: renamed from: a */
    public final Lambda f5463a;

    /* JADX INFO: renamed from: b */
    public final DefaultDraggableState$dragScope$1 f5464b = new DefaultDraggableState$dragScope$1(this);

    /* JADX INFO: renamed from: c */
    public final MutatorMutex f5465c = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableState(Function1 function1) {
        this.f5463a = (Lambda) function1;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    /* JADX INFO: renamed from: a */
    public final Object mo2596a(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objM20563d = CoroutineScopeKt.m20563d(new DefaultDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        return objM20563d == CoroutineSingletons.f51584a ? objM20563d : Unit.f51459a;
    }
}
