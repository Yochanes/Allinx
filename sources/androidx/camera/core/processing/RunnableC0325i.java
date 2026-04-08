package androidx.camera.core.processing;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;

/* JADX INFO: renamed from: androidx.camera.core.processing.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0325i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SurfaceEdge f3154b;

    public /* synthetic */ RunnableC0325i(SurfaceEdge surfaceEdge, int i) {
        this.f3153a = i;
        this.f3154b = surfaceEdge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3153a) {
            case 0:
                SurfaceEdge surfaceEdge = this.f3154b;
                surfaceEdge.getClass();
                CameraXExecutors.m1618d().execute(new RunnableC0325i(surfaceEdge, 2));
                break;
            case 1:
                this.f3154b.m1719d();
                break;
            default:
                SurfaceEdge surfaceEdge2 = this.f3154b;
                if (!surfaceEdge2.f3109o) {
                    surfaceEdge2.m1720e();
                }
                break;
        }
    }
}
