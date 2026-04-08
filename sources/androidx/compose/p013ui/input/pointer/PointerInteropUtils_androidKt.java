package androidx.compose.p013ui.input.pointer;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PointerInteropUtils_androidKt {
    /* JADX INFO: renamed from: a */
    public static final void m5572a(PointerEvent pointerEvent, long j, Function1 function1, boolean z2) {
        MotionEvent motionEventM5550a = pointerEvent.m5550a();
        if (motionEventM5550a == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventM5550a.getAction();
        if (z2) {
            motionEventM5550a.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventM5550a.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        function1.invoke(motionEventM5550a);
        motionEventM5550a.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventM5550a.setAction(action);
    }
}
