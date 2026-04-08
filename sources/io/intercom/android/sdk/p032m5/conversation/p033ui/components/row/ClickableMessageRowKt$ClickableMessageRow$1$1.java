package io.intercom.android.sdk.p032m5.conversation.p033ui.components.row;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ClickableMessageRowKt$ClickableMessageRow$1$1 implements PointerInputEventHandler {
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function0<Unit> $onLongClick;

    public ClickableMessageRowKt$ClickableMessageRow$1$1(Function0<Unit> function0, Function0<Unit> function02) {
        this.$onLongClick = function0;
        this.$onClick = function02;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m15965a(Function0 function0, Offset offset) {
        return invoke$lambda$1(function0, offset);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m15966b(Function0 function0, Offset offset) {
        return invoke$lambda$0(function0, offset);
    }

    private static final Unit invoke$lambda$0(Function0 onLongClick, Offset offset) {
        Intrinsics.m18599g(onLongClick, "$onLongClick");
        onLongClick.invoke();
        return Unit.f51459a;
    }

    private static final Unit invoke$lambda$1(Function0 onClick, Offset offset) {
        Intrinsics.m18599g(onClick, "$onClick");
        onClick.invoke();
        return Unit.f51459a;
    }

    @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objM2663g = TapGestureDetectorKt.m2663g(pointerInputScope, new C5431g(this.$onLongClick, 0), null, new C5431g(this.$onClick, 1), continuation, 5);
        return objM2663g == CoroutineSingletons.f51584a ? objM2663g : Unit.f51459a;
    }
}
