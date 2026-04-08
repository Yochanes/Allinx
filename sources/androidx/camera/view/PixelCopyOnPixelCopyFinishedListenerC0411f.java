package androidx.camera.view;

import android.view.PixelCopy;
import androidx.camera.core.Logger;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: androidx.camera.view.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PixelCopyOnPixelCopyFinishedListenerC0411f implements PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Semaphore f3589a;

    public /* synthetic */ PixelCopyOnPixelCopyFinishedListenerC0411f(Semaphore semaphore) {
        this.f3589a = semaphore;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i == 0) {
            Logger.m1280a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            Logger.m1282c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
        }
        this.f3589a.release();
    }
}
