package androidx.camera.core.processing;

/* JADX INFO: renamed from: androidx.camera.core.processing.k */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0327k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SurfaceEdge f3157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3158b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3159c;

    public /* synthetic */ RunnableC0327k(SurfaceEdge surfaceEdge, int i, int i2) {
        this.f3157a = surfaceEdge;
        this.f3158b = i;
        this.f3159c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        SurfaceEdge surfaceEdge = this.f3157a;
        int i = surfaceEdge.f3103i;
        int i2 = this.f3158b;
        boolean z3 = true;
        if (i != i2) {
            surfaceEdge.f3103i = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = surfaceEdge.f3102h;
        int i4 = this.f3159c;
        if (i3 != i4) {
            surfaceEdge.f3102h = i4;
        } else {
            z3 = z2;
        }
        if (z3) {
            surfaceEdge.m1721f();
        }
    }
}
