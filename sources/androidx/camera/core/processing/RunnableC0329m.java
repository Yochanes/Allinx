package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.IOException;

/* JADX INFO: renamed from: androidx.camera.core.processing.m */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0329m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3169b;

    public /* synthetic */ RunnableC0329m(Object obj, int i) {
        this.f3168a = i;
        this.f3169b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f3168a) {
            case 0:
                ((SurfaceEdge.SettableSurface) this.f3169b).m1478b();
                break;
            case 1:
                ((CallbackToFutureAdapter.Completer) this.f3169b).m6744d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            case 2:
                ((SurfaceOutput) this.f3169b).close();
                break;
            case 3:
                ((SurfaceRequest) this.f3169b).m1309c();
                break;
            case 4:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.f3169b;
                defaultSurfaceProcessor.f3071o = true;
                defaultSurfaceProcessor.m1688a();
                break;
            default:
                SurfaceProcessorNode.Out out = ((SurfaceProcessorNode) this.f3169b).f3127c;
                if (out != null) {
                    for (SurfaceEdge surfaceEdge : out.values()) {
                        surfaceEdge.getClass();
                        Threads.m1607a();
                        surfaceEdge.m1719d();
                        surfaceEdge.f3109o = true;
                    }
                }
                break;
        }
    }
}
