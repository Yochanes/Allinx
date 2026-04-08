package androidx.compose.p013ui.input.rotary;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RotaryScrollEvent {

    /* JADX INFO: renamed from: a */
    public final float f18416a;

    /* JADX INFO: renamed from: b */
    public final float f18417b;

    /* JADX INFO: renamed from: c */
    public final long f18418c;

    /* JADX INFO: renamed from: d */
    public final int f18419d;

    public RotaryScrollEvent(float f, float f2, int i, long j) {
        this.f18416a = f;
        this.f18417b = f2;
        this.f18418c = j;
        this.f18419d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RotaryScrollEvent)) {
            return false;
        }
        RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
        return rotaryScrollEvent.f18416a == this.f18416a && rotaryScrollEvent.f18417b == this.f18417b && rotaryScrollEvent.f18418c == this.f18418c && rotaryScrollEvent.f18419d == this.f18419d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18419d) + AbstractC0455a.m2231f(this.f18418c, AbstractC0455a.m2226a(Float.hashCode(this.f18416a) * 31, this.f18417b, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.f18416a);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.f18417b);
        sb.append(",uptimeMillis=");
        sb.append(this.f18418c);
        sb.append(",deviceId=");
        return AbstractC0000a.m17n(sb, this.f18419d, ')');
    }
}
