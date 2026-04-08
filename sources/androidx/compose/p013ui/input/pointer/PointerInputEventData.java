package androidx.compose.p013ui.input.pointer;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class PointerInputEventData {

    /* JADX INFO: renamed from: a */
    public final long f18318a;

    /* JADX INFO: renamed from: b */
    public final long f18319b;

    /* JADX INFO: renamed from: c */
    public final long f18320c;

    /* JADX INFO: renamed from: d */
    public final long f18321d;

    /* JADX INFO: renamed from: e */
    public final boolean f18322e;

    /* JADX INFO: renamed from: f */
    public final float f18323f;

    /* JADX INFO: renamed from: g */
    public final int f18324g;

    /* JADX INFO: renamed from: h */
    public final boolean f18325h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f18326i;

    /* JADX INFO: renamed from: j */
    public final long f18327j;

    /* JADX INFO: renamed from: k */
    public final long f18328k;

    public PointerInputEventData(long j, long j2, long j3, long j4, boolean z2, float f, int i, boolean z3, ArrayList arrayList, long j5, long j6) {
        this.f18318a = j;
        this.f18319b = j2;
        this.f18320c = j3;
        this.f18321d = j4;
        this.f18322e = z2;
        this.f18323f = f;
        this.f18324g = i;
        this.f18325h = z3;
        this.f18326i = arrayList;
        this.f18327j = j5;
        this.f18328k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m5560a(this.f18318a, pointerInputEventData.f18318a) && this.f18319b == pointerInputEventData.f18319b && Offset.m5053c(this.f18320c, pointerInputEventData.f18320c) && Offset.m5053c(this.f18321d, pointerInputEventData.f18321d) && this.f18322e == pointerInputEventData.f18322e && Float.compare(this.f18323f, pointerInputEventData.f18323f) == 0 && this.f18324g == pointerInputEventData.f18324g && this.f18325h == pointerInputEventData.f18325h && this.f18326i.equals(pointerInputEventData.f18326i) && Offset.m5053c(this.f18327j, pointerInputEventData.f18327j) && Offset.m5053c(this.f18328k, pointerInputEventData.f18328k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f18328k) + AbstractC0455a.m2231f(this.f18327j, (this.f18326i.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.f18324g, AbstractC0455a.m2226a(AbstractC0455a.m2230e(AbstractC0455a.m2231f(this.f18321d, AbstractC0455a.m2231f(this.f18320c, AbstractC0455a.m2231f(this.f18319b, Long.hashCode(this.f18318a) * 31, 31), 31), 31), 31, this.f18322e), this.f18323f, 31), 31), 31, this.f18325h)) * 31, 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m5561b(this.f18318a)) + ", uptime=" + this.f18319b + ", positionOnScreen=" + ((Object) Offset.m5060j(this.f18320c)) + ", position=" + ((Object) Offset.m5060j(this.f18321d)) + ", down=" + this.f18322e + ", pressure=" + this.f18323f + ", type=" + ((Object) PointerType.m5573a(this.f18324g)) + ", activeHover=" + this.f18325h + ", historical=" + this.f18326i + ", scrollDelta=" + ((Object) Offset.m5060j(this.f18327j)) + ", originalEventPosition=" + ((Object) Offset.m5060j(this.f18328k)) + ')';
    }
}
