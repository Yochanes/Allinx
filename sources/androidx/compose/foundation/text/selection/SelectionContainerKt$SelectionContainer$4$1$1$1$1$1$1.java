package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SelectionContainerKt$SelectionContainer$4$1$1$1$1$1$1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextDragObserver f9696a;

    public SelectionContainerKt$SelectionContainer$4$1$1$1$1$1$1(TextDragObserver textDragObserver) {
        this.f9696a = textDragObserver;
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objM3239a = LongPressTextDragObserverKt.m3239a(pointerInputScope, this.f9696a, continuation);
        return objM3239a == CoroutineSingletons.f51584a ? objM3239a : Unit.f51459a;
    }
}
