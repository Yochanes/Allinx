package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.spherical.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1944a implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SceneRenderer f28095a;

    public /* synthetic */ C1944a(SceneRenderer sceneRenderer) {
        this.f28095a = sceneRenderer;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f28095a.f28054a.set(true);
    }
}
