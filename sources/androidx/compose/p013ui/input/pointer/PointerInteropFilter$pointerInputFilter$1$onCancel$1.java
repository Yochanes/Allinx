package androidx.compose.p013ui.input.pointer;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends Lambda implements Function1<MotionEvent, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PointerInteropFilter f18349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.f18349a = pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MotionEvent motionEvent = (MotionEvent) obj;
        Function1 function1 = this.f18349a.f18335a;
        if (function1 != null) {
            ((PointerInteropFilter_androidKt$pointerInteropFilter$3) function1).invoke(motionEvent);
            return Unit.f51459a;
        }
        Intrinsics.m18606n("onTouchEvent");
        throw null;
    }
}
