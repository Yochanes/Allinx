package androidx.camera.camera2.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.ZoomState;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ZoomStateImpl implements ZoomState {

    /* JADX INFO: renamed from: a */
    public float f1920a;

    /* JADX INFO: renamed from: b */
    public final float f1921b;

    /* JADX INFO: renamed from: c */
    public final float f1922c;

    /* JADX INFO: renamed from: d */
    public float f1923d;

    public ZoomStateImpl(float f, float f2) {
        this.f1921b = f;
        this.f1922c = f2;
    }

    @Override // androidx.camera.core.ZoomState
    /* JADX INFO: renamed from: a */
    public final float mo1072a() {
        return this.f1921b;
    }

    @Override // androidx.camera.core.ZoomState
    /* JADX INFO: renamed from: b */
    public final float mo1073b() {
        return this.f1922c;
    }

    @Override // androidx.camera.core.ZoomState
    /* JADX INFO: renamed from: c */
    public final float mo1074c() {
        return this.f1920a;
    }

    @Override // androidx.camera.core.ZoomState
    /* JADX INFO: renamed from: d */
    public final float mo1075d() {
        return this.f1923d;
    }

    /* JADX INFO: renamed from: e */
    public final void m1076e(float f) {
        float f2 = this.f1921b;
        float f3 = this.f1922c;
        if (f > f2 || f < f3) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f3 + " , " + f2 + "]");
        }
        this.f1920a = f;
        float f4 = 0.0f;
        if (f2 != f3) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.f1923d = f4;
    }
}
