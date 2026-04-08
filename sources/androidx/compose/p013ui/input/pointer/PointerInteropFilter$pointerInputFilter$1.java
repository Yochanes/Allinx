package androidx.compose.p013ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p013ui.input.pointer.PointerInteropFilter;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {

    /* JADX INFO: renamed from: b */
    public PointerInteropFilter.DispatchToViewState f18344b = PointerInteropFilter.DispatchToViewState.f18339a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ PointerInteropFilter f18345c;

    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f18345c = pointerInteropFilter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final void m5568a(PointerEvent pointerEvent) {
        ?? r0 = pointerEvent.f18282a;
        Collection collection = (Collection) r0;
        int size = collection.size();
        int i = 0;
        while (true) {
            PointerInteropFilter pointerInteropFilter = this.f18345c;
            if (i >= size) {
                LayoutCoordinates layoutCoordinates = this.f18334a;
                if (layoutCoordinates == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                PointerInteropUtils_androidKt.m5572a(pointerEvent, layoutCoordinates.mo5627m0(0L), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, pointerInteropFilter), false);
                if (this.f18344b == PointerInteropFilter.DispatchToViewState.f18340b) {
                    int size2 = collection.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((PointerInputChange) r0.get(i2)).m5562a();
                    }
                    InternalPointerEvent internalPointerEvent = pointerEvent.f18283b;
                    if (internalPointerEvent == null) {
                        return;
                    }
                    internalPointerEvent.f18265c = !pointerInteropFilter.f18337c;
                    return;
                }
                return;
            }
            if (((PointerInputChange) r0.get(i)).m5563b()) {
                if (this.f18344b == PointerInteropFilter.DispatchToViewState.f18340b) {
                    LayoutCoordinates layoutCoordinates2 = this.f18334a;
                    if (layoutCoordinates2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    PointerInteropUtils_androidKt.m5572a(pointerEvent, layoutCoordinates2.mo5627m0(0L), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(pointerInteropFilter), true);
                }
                this.f18344b = PointerInteropFilter.DispatchToViewState.f18341c;
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5569b() {
        if (this.f18344b == PointerInteropFilter.DispatchToViewState.f18340b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            PointerInteropFilter pointerInteropFilter = this.f18345c;
            PointerInteropFilter$pointerInputFilter$1$onCancel$1 pointerInteropFilter$pointerInputFilter$1$onCancel$1 = new PointerInteropFilter$pointerInputFilter$1$onCancel$1(pointerInteropFilter);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            pointerInteropFilter$pointerInputFilter$1$onCancel$1.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.f18344b = PointerInteropFilter.DispatchToViewState.f18339a;
            pointerInteropFilter.f18337c = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public final void m5570c(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        boolean z2;
        ?? r0 = pointerEvent.f18282a;
        PointerInteropFilter pointerInteropFilter = this.f18345c;
        if (pointerInteropFilter.f18337c) {
            z2 = true;
            break;
        }
        int size = ((Collection) r0).size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = (PointerInputChange) r0.get(i);
            if (PointerEventKt.m5551a(pointerInputChange) || PointerEventKt.m5553c(pointerInputChange)) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (this.f18344b != PointerInteropFilter.DispatchToViewState.f18341c) {
            if (pointerEventPass == PointerEventPass.f18287a && z2) {
                m5568a(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.f18289c && !z2) {
                m5568a(pointerEvent);
            }
        }
        if (pointerEventPass == PointerEventPass.f18289c) {
            int size2 = ((Collection) r0).size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!PointerEventKt.m5553c((PointerInputChange) r0.get(i2))) {
                    return;
                }
            }
            this.f18344b = PointerInteropFilter.DispatchToViewState.f18339a;
            pointerInteropFilter.f18337c = false;
        }
    }
}
