package androidx.camera.core.processing;

import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.core.util.Consumer;
import java.io.IOException;

/* JADX INFO: renamed from: androidx.camera.core.processing.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0319c implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DefaultSurfaceProcessor f3135a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SurfaceOutput f3136b;

    public /* synthetic */ C0319c(DefaultSurfaceProcessor defaultSurfaceProcessor, SurfaceOutput surfaceOutput) {
        this.f3135a = defaultSurfaceProcessor;
        this.f3136b = surfaceOutput;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) throws IOException {
        DefaultSurfaceProcessor defaultSurfaceProcessor = this.f3135a;
        defaultSurfaceProcessor.getClass();
        SurfaceOutput surfaceOutput = this.f3136b;
        surfaceOutput.close();
        Surface surface = (Surface) defaultSurfaceProcessor.f3069j.remove(surfaceOutput);
        if (surface != null) {
            OpenGlRenderer openGlRenderer = defaultSurfaceProcessor.f3062a;
            openGlRenderer.m1700d(true);
            openGlRenderer.m1699c();
            openGlRenderer.m1710q(surface, true);
        }
    }
}
