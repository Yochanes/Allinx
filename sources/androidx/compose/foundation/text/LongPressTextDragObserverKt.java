package androidx.compose.foundation.text;

import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LongPressTextDragObserverKt {
    /* JADX INFO: renamed from: a */
    public static final Object m3239a(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation) {
        Object objM20563d = CoroutineScopeKt.m20563d(new C0684x3c48fd5d(pointerInputScope, textDragObserver, null), continuation);
        return objM20563d == CoroutineSingletons.f51584a ? objM20563d : Unit.f51459a;
    }
}
