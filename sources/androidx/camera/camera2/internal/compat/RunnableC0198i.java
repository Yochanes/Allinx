package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.CameraManagerCompat;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.compat.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0198i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper f2012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2013c;

    public /* synthetic */ RunnableC0198i(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper, String str, int i) {
        this.f2011a = i;
        this.f2012b = availabilityCallbackExecutorWrapper;
        this.f2013c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2011a) {
            case 0:
                this.f2012b.f1968b.onCameraAvailable(this.f2013c);
                break;
            default:
                this.f2012b.f1968b.onCameraUnavailable(this.f2013c);
                break;
        }
    }
}
