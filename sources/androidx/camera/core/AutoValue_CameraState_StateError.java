package androidx.camera.core;

import androidx.camera.core.CameraState;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CameraState_StateError extends CameraState.StateError {

    /* JADX INFO: renamed from: a */
    public final int f2178a;

    /* JADX INFO: renamed from: b */
    public final Throwable f2179b;

    public AutoValue_CameraState_StateError(int i, Throwable th) {
        this.f2178a = i;
        this.f2179b = th;
    }

    @Override // androidx.camera.core.CameraState.StateError
    /* JADX INFO: renamed from: c */
    public final Throwable mo1193c() {
        return this.f2179b;
    }

    @Override // androidx.camera.core.CameraState.StateError
    /* JADX INFO: renamed from: d */
    public final int mo1194d() {
        return this.f2178a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.StateError)) {
            return false;
        }
        CameraState.StateError stateError = (CameraState.StateError) obj;
        if (this.f2178a != stateError.mo1194d()) {
            return false;
        }
        Throwable th = this.f2179b;
        return th == null ? stateError.mo1193c() == null : th.equals(stateError.mo1193c());
    }

    public final int hashCode() {
        int i = (this.f2178a ^ 1000003) * 1000003;
        Throwable th = this.f2179b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f2178a + ", cause=" + this.f2179b + "}";
    }
}
