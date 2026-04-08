package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.SurfaceRequest;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceRequest_TransformationInfo extends SurfaceRequest.TransformationInfo {

    /* JADX INFO: renamed from: a */
    public final Rect f2193a;

    /* JADX INFO: renamed from: b */
    public final int f2194b;

    /* JADX INFO: renamed from: c */
    public final int f2195c;

    /* JADX INFO: renamed from: d */
    public final boolean f2196d;

    /* JADX INFO: renamed from: e */
    public final Matrix f2197e;

    /* JADX INFO: renamed from: f */
    public final boolean f2198f;

    public AutoValue_SurfaceRequest_TransformationInfo(Rect rect, int i, int i2, boolean z2, Matrix matrix, boolean z3) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f2193a = rect;
        this.f2194b = i;
        this.f2195c = i2;
        this.f2196d = z2;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f2197e = matrix;
        this.f2198f = z3;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    /* JADX INFO: renamed from: a */
    public final Rect mo1206a() {
        return this.f2193a;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    /* JADX INFO: renamed from: b */
    public final boolean mo1207b() {
        return this.f2198f;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    /* JADX INFO: renamed from: c */
    public final int mo1208c() {
        return this.f2194b;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    /* JADX INFO: renamed from: d */
    public final Matrix mo1209d() {
        return this.f2197e;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    /* JADX INFO: renamed from: e */
    public final int mo1210e() {
        return this.f2195c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.TransformationInfo)) {
            return false;
        }
        SurfaceRequest.TransformationInfo transformationInfo = (SurfaceRequest.TransformationInfo) obj;
        return this.f2193a.equals(transformationInfo.mo1206a()) && this.f2194b == transformationInfo.mo1208c() && this.f2195c == transformationInfo.mo1210e() && this.f2196d == transformationInfo.mo1211f() && this.f2197e.equals(transformationInfo.mo1209d()) && this.f2198f == transformationInfo.mo1207b();
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    /* JADX INFO: renamed from: f */
    public final boolean mo1211f() {
        return this.f2196d;
    }

    public final int hashCode() {
        return ((((((((((this.f2193a.hashCode() ^ 1000003) * 1000003) ^ this.f2194b) * 1000003) ^ this.f2195c) * 1000003) ^ (this.f2196d ? 1231 : 1237)) * 1000003) ^ this.f2197e.hashCode()) * 1000003) ^ (this.f2198f ? 1231 : 1237);
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.f2193a + ", getRotationDegrees=" + this.f2194b + ", getTargetRotation=" + this.f2195c + ", hasCameraTransform=" + this.f2196d + ", getSensorToBufferTransform=" + this.f2197e + ", getMirroring=" + this.f2198f + "}";
    }
}
