package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceRequest_Result extends SurfaceRequest.Result {

    /* JADX INFO: renamed from: a */
    public final int f2191a;

    /* JADX INFO: renamed from: b */
    public final Surface f2192b;

    public AutoValue_SurfaceRequest_Result(int i, Surface surface) {
        this.f2191a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f2192b = surface;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    /* JADX INFO: renamed from: a */
    public final int mo1204a() {
        return this.f2191a;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    /* JADX INFO: renamed from: b */
    public final Surface mo1205b() {
        return this.f2192b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.Result)) {
            return false;
        }
        SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
        return this.f2191a == result.mo1204a() && this.f2192b.equals(result.mo1205b());
    }

    public final int hashCode() {
        return this.f2192b.hashCode() ^ ((this.f2191a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f2191a + ", surface=" + this.f2192b + "}";
    }
}
