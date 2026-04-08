package androidx.camera.core.processing;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.core.util.Consumer;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.camera.core.processing.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0317a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3131c;

    public /* synthetic */ RunnableC0317a(int i, Object obj, Object obj2) {
        this.f3129a = i;
        this.f3130b = obj;
        this.f3131c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3129a) {
            case 0:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.f3130b;
                Executor executor = defaultSurfaceProcessor.f3064c;
                SurfaceOutput surfaceOutput = (SurfaceOutput) this.f3131c;
                Surface surfaceMo1304l0 = surfaceOutput.mo1304l0(executor, new C0319c(defaultSurfaceProcessor, surfaceOutput));
                OpenGlRenderer openGlRenderer = defaultSurfaceProcessor.f3062a;
                openGlRenderer.m1700d(true);
                openGlRenderer.m1699c();
                HashMap map = openGlRenderer.f3082b;
                if (!map.containsKey(surfaceMo1304l0)) {
                    map.put(surfaceMo1304l0, OpenGlRenderer.f3080t);
                }
                defaultSurfaceProcessor.f3069j.put(surfaceOutput, surfaceMo1304l0);
                break;
            case 1:
                ((DefaultSurfaceProcessor) this.f3130b).f3072p.add((AutoValue_DefaultSurfaceProcessor_PendingSnapshot) this.f3131c);
                break;
            case 2:
                SurfaceOutputImpl surfaceOutputImpl = (SurfaceOutputImpl) this.f3130b;
                surfaceOutputImpl.getClass();
                ((Consumer) ((AtomicReference) this.f3131c).get()).accept(SurfaceOutput.Event.m1306c(surfaceOutputImpl));
                break;
            default:
                DefaultSurfaceProcessor defaultSurfaceProcessor2 = (DefaultSurfaceProcessor) this.f3130b;
                defaultSurfaceProcessor2.f3070n++;
                OpenGlRenderer openGlRenderer2 = defaultSurfaceProcessor2.f3062a;
                openGlRenderer2.m1700d(true);
                openGlRenderer2.m1699c();
                SurfaceTexture surfaceTexture = new SurfaceTexture(openGlRenderer2.f3089i);
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f3131c;
                Size size = surfaceRequest.f2364b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                surfaceRequest.m1307a(surface, defaultSurfaceProcessor2.f3064c, new C0321e(defaultSurfaceProcessor2, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(defaultSurfaceProcessor2, defaultSurfaceProcessor2.f3065d);
                break;
        }
    }
}
