package androidx.constraintlayout.compose;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/constraintlayout/compose/MotionDragState;", "", "Companion", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class MotionDragState {

    /* JADX INFO: renamed from: a */
    public final boolean f20970a;

    /* JADX INFO: renamed from: b */
    public final long f20971b;

    /* JADX INFO: renamed from: c */
    public final long f20972c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/MotionDragState$Companion;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public MotionDragState(long j, long j2, boolean z2) {
        this.f20970a = z2;
        this.f20971b = j;
        this.f20972c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionDragState) {
            MotionDragState motionDragState = (MotionDragState) obj;
            return this.f20970a == motionDragState.f20970a && Offset.m5053c(this.f20971b, motionDragState.f20971b) && this.f20972c == motionDragState.f20972c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20972c) + AbstractC0455a.m2231f(this.f20971b, Boolean.hashCode(this.f20970a) * 31, 31);
    }

    public final String toString() {
        return "MotionDragState(isDragging=" + this.f20970a + ", dragAmount=" + ((Object) Offset.m5060j(this.f20971b)) + ", velocity=" + ((Object) Velocity.m6690g(this.f20972c)) + ')';
    }
}
