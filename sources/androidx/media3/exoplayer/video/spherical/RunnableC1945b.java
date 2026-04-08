package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.spherical.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1945b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SphericalGLSurfaceView f28096a;

    public /* synthetic */ RunnableC1945b(SphericalGLSurfaceView sphericalGLSurfaceView) {
        this.f28096a = sphericalGLSurfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.f28096a;
        Surface surface = sphericalGLSurfaceView.f28074j;
        if (surface != null) {
            Iterator it = sphericalGLSurfaceView.f28067a.iterator();
            while (it.hasNext()) {
                ((SphericalGLSurfaceView.VideoSurfaceListener) it.next()).mo9842B();
            }
        }
        SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f28073i;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        sphericalGLSurfaceView.f28073i = null;
        sphericalGLSurfaceView.f28074j = null;
    }
}
