package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0199j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper f2014a;

    public /* synthetic */ RunnableC0199j(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper) {
        this.f2014a = availabilityCallbackExecutorWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ApiCompat.Api29Impl.m1082a(this.f2014a.f1968b);
    }
}
