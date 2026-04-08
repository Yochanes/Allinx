package androidx.camera.core.processing;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot extends DefaultSurfaceProcessor.PendingSnapshot {

    /* JADX INFO: renamed from: a */
    public final int f3039a;

    /* JADX INFO: renamed from: b */
    public final int f3040b;

    /* JADX INFO: renamed from: c */
    public final CallbackToFutureAdapter.Completer f3041c;

    public AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int i, int i2, CallbackToFutureAdapter.Completer completer) {
        this.f3039a = i;
        this.f3040b = i2;
        this.f3041c = completer;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    /* JADX INFO: renamed from: a */
    public final CallbackToFutureAdapter.Completer mo1665a() {
        return this.f3041c;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    /* JADX INFO: renamed from: b */
    public final int mo1666b() {
        return this.f3039a;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    /* JADX INFO: renamed from: c */
    public final int mo1667c() {
        return this.f3040b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DefaultSurfaceProcessor.PendingSnapshot)) {
            return false;
        }
        DefaultSurfaceProcessor.PendingSnapshot pendingSnapshot = (DefaultSurfaceProcessor.PendingSnapshot) obj;
        return this.f3039a == pendingSnapshot.mo1666b() && this.f3040b == pendingSnapshot.mo1667c() && this.f3041c.equals(pendingSnapshot.mo1665a());
    }

    public final int hashCode() {
        return ((((this.f3039a ^ 1000003) * 1000003) ^ this.f3040b) * 1000003) ^ this.f3041c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f3039a + ", rotationDegrees=" + this.f3040b + ", completer=" + this.f3041c + "}";
    }
}
