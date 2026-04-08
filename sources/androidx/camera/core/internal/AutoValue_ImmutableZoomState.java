package androidx.camera.core.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ImmutableZoomState extends ImmutableZoomState {

    /* JADX INFO: renamed from: a */
    public final float f2957a;

    /* JADX INFO: renamed from: b */
    public final float f2958b;

    /* JADX INFO: renamed from: c */
    public final float f2959c;

    /* JADX INFO: renamed from: d */
    public final float f2960d;

    public AutoValue_ImmutableZoomState(float f, float f2, float f3, float f4) {
        this.f2957a = f;
        this.f2958b = f2;
        this.f2959c = f3;
        this.f2960d = f4;
    }

    @Override // androidx.camera.core.ZoomState
    /* JADX INFO: renamed from: a */
    public final float mo1072a() {
        return this.f2958b;
    }

    @Override // androidx.camera.core.ZoomState
    /* JADX INFO: renamed from: b */
    public final float mo1073b() {
        return this.f2959c;
    }

    @Override // androidx.camera.core.ZoomState
    /* JADX INFO: renamed from: c */
    public final float mo1074c() {
        return this.f2957a;
    }

    @Override // androidx.camera.core.ZoomState
    /* JADX INFO: renamed from: d */
    public final float mo1075d() {
        return this.f2960d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableZoomState) {
            ImmutableZoomState immutableZoomState = (ImmutableZoomState) obj;
            if (Float.floatToIntBits(this.f2957a) == Float.floatToIntBits(((AutoValue_ImmutableZoomState) immutableZoomState).f2957a)) {
                AutoValue_ImmutableZoomState autoValue_ImmutableZoomState = (AutoValue_ImmutableZoomState) immutableZoomState;
                if (Float.floatToIntBits(this.f2958b) == Float.floatToIntBits(autoValue_ImmutableZoomState.f2958b) && Float.floatToIntBits(this.f2959c) == Float.floatToIntBits(autoValue_ImmutableZoomState.f2959c) && Float.floatToIntBits(this.f2960d) == Float.floatToIntBits(autoValue_ImmutableZoomState.f2960d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f2957a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f2958b)) * 1000003) ^ Float.floatToIntBits(this.f2959c)) * 1000003) ^ Float.floatToIntBits(this.f2960d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f2957a + ", maxZoomRatio=" + this.f2958b + ", minZoomRatio=" + this.f2959c + ", linearZoom=" + this.f2960d + "}";
    }
}
