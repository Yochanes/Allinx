package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.p013ui.graphics.layer.AbstractC1226a;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TapGestureDetector_androidKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m2668a(PointerEvent pointerEvent) {
        MotionEvent motionEventM5550a;
        return ((Build.VERSION.SDK_INT < 29 || (motionEventM5550a = pointerEvent.m5550a()) == null) ? 0 : AbstractC1226a.m5446b(motionEventM5550a)) == 2;
    }
}
