package androidx.compose.p013ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PointerEvent {

    /* JADX INFO: renamed from: a */
    public final Object f18282a;

    /* JADX INFO: renamed from: b */
    public final InternalPointerEvent f18283b;

    /* JADX INFO: renamed from: c */
    public final int f18284c;

    /* JADX INFO: renamed from: d */
    public final int f18285d;

    /* JADX INFO: renamed from: e */
    public int f18286e;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PointerEvent(List list, InternalPointerEvent internalPointerEvent) {
        this.f18282a = list;
        this.f18283b = internalPointerEvent;
        MotionEvent motionEventM5550a = m5550a();
        int i = 0;
        this.f18284c = motionEventM5550a != null ? motionEventM5550a.getButtonState() : 0;
        MotionEvent motionEventM5550a2 = m5550a();
        this.f18285d = motionEventM5550a2 != null ? motionEventM5550a2.getMetaState() : 0;
        MotionEvent motionEventM5550a3 = m5550a();
        if (motionEventM5550a3 != null) {
            int actionMasked = motionEventM5550a3.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            }
        } else {
            int size = list.size();
            while (i < size) {
                PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
                if (PointerEventKt.m5553c(pointerInputChange)) {
                    i = 2;
                } else if (PointerEventKt.m5551a(pointerInputChange)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.f18286e = i;
    }

    /* JADX INFO: renamed from: a */
    public final MotionEvent m5550a() {
        InternalPointerEvent internalPointerEvent = this.f18283b;
        if (internalPointerEvent != null) {
            return internalPointerEvent.f18264b.f18317b;
        }
        return null;
    }
}
