package androidx.compose.p013ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PointerInputEvent {

    /* JADX INFO: renamed from: a */
    public final ArrayList f18316a;

    /* JADX INFO: renamed from: b */
    public final MotionEvent f18317b;

    public PointerInputEvent(ArrayList arrayList, MotionEvent motionEvent) {
        this.f18316a = arrayList;
        this.f18317b = motionEvent;
    }
}
