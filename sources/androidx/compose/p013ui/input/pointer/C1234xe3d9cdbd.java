package androidx.compose.p013ui.input.pointer;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class C1234xe3d9cdbd implements PointerInputEventHandler, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f18361a;

    public C1234xe3d9cdbd(Function2 function2) {
        this.f18361a = function2;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: b */
    public final Function mo3595b() {
        return this.f18361a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.m18594b(this.f18361a, ((FunctionAdapter) obj).mo3595b());
    }

    public final int hashCode() {
        return this.f18361a.hashCode();
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        return this.f18361a.invoke(pointerInputScope, continuation);
    }
}
