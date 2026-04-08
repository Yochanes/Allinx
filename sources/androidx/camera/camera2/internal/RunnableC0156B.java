package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.B */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0156B implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CaptureConfig f1544b;

    public /* synthetic */ RunnableC0156B(CaptureConfig captureConfig, int i) {
        this.f1543a = i;
        this.f1544b = captureConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1543a) {
            case 0:
                Iterator it = this.f1544b.f2672e.iterator();
                while (it.hasNext()) {
                    ((CameraCaptureCallback) it.next()).mo895b(new CameraCaptureResult.EmptyCameraCaptureResult());
                }
                break;
            case 1:
                Iterator it2 = this.f1544b.f2672e.iterator();
                while (it2.hasNext()) {
                    ((CameraCaptureCallback) it2.next()).mo896c(new CameraCaptureFailure());
                }
                break;
            case 2:
                Iterator it3 = this.f1544b.f2672e.iterator();
                while (it3.hasNext()) {
                    ((CameraCaptureCallback) it3.next()).mo895b(new CameraCaptureResult.EmptyCameraCaptureResult());
                }
                break;
            default:
                Iterator it4 = this.f1544b.f2672e.iterator();
                while (it4.hasNext()) {
                    ((CameraCaptureCallback) it4.next()).mo896c(new CameraCaptureFailure());
                }
                break;
        }
    }
}
