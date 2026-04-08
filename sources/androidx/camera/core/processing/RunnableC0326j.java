package androidx.camera.core.processing;

import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: renamed from: androidx.camera.core.processing.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0326j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DeferrableSurface f3156b;

    public /* synthetic */ RunnableC0326j(DeferrableSurface deferrableSurface, int i) {
        this.f3155a = i;
        this.f3156b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3155a) {
            case 0:
                this.f3156b.m1477a();
                break;
            default:
                this.f3156b.m1478b();
                break;
        }
    }
}
