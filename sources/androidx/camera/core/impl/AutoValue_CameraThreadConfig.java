package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CameraThreadConfig extends CameraThreadConfig {

    /* JADX INFO: renamed from: a */
    public final Executor f2546a;

    /* JADX INFO: renamed from: b */
    public final Handler f2547b;

    public AutoValue_CameraThreadConfig(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f2546a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f2547b = handler;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    /* JADX INFO: renamed from: b */
    public final Executor mo1382b() {
        return this.f2546a;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    /* JADX INFO: renamed from: c */
    public final Handler mo1383c() {
        return this.f2547b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraThreadConfig)) {
            return false;
        }
        CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) obj;
        return this.f2546a.equals(cameraThreadConfig.mo1382b()) && this.f2547b.equals(cameraThreadConfig.mo1383c());
    }

    public final int hashCode() {
        return ((this.f2546a.hashCode() ^ 1000003) * 1000003) ^ this.f2547b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f2546a + ", schedulerHandler=" + this.f2547b + "}";
    }
}
