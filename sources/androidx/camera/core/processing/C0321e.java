package androidx.camera.core.processing;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.core.util.Consumer;

/* JADX INFO: renamed from: androidx.camera.core.processing.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0321e implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DefaultSurfaceProcessor f3141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SurfaceTexture f3142b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Surface f3143c;

    public /* synthetic */ C0321e(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceTexture surfaceTexture, Surface surface) {
        this.f3141a = defaultSurfaceProcessor;
        this.f3142b = surfaceTexture;
        this.f3143c = surface;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        DefaultSurfaceProcessor defaultSurfaceProcessor = this.f3141a;
        defaultSurfaceProcessor.getClass();
        SurfaceTexture surfaceTexture = this.f3142b;
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        this.f3143c.release();
        defaultSurfaceProcessor.f3070n--;
        defaultSurfaceProcessor.m1688a();
    }
}
