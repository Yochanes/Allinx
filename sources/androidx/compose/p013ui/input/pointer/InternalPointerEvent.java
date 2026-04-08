package androidx.compose.p013ui.input.pointer;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class InternalPointerEvent {

    /* JADX INFO: renamed from: a */
    public final LongSparseArray f18263a;

    /* JADX INFO: renamed from: b */
    public final PointerInputEvent f18264b;

    /* JADX INFO: renamed from: c */
    public boolean f18265c;

    public InternalPointerEvent(LongSparseArray longSparseArray, PointerInputEvent pointerInputEvent) {
        this.f18263a = longSparseArray;
        this.f18264b = pointerInputEvent;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5541a(long j) {
        Object obj;
        ArrayList arrayList = this.f18264b.f18316a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (PointerId.m5560a(((PointerInputEventData) obj).f18318a, j)) {
                break;
            }
            i++;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (pointerInputEventData != null) {
            return pointerInputEventData.f18325h;
        }
        return false;
    }
}
