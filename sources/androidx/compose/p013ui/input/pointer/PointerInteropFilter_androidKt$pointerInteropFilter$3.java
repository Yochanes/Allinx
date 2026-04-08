package androidx.compose.p013ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p013ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends Lambda implements Function1<MotionEvent, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AndroidViewHolder f18352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f18352a = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent = (MotionEvent) obj;
        int actionMasked = motionEvent.getActionMasked();
        AndroidViewHolder androidViewHolder = this.f18352a;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                break;
            default:
                zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
