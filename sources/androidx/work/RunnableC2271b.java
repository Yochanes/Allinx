package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.work.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2271b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicBoolean f32654b;

    public /* synthetic */ RunnableC2271b(AtomicBoolean atomicBoolean, int i) {
        this.f32653a = i;
        this.f32654b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32653a) {
            case 0:
                this.f32654b.set(true);
                break;
            default:
                this.f32654b.set(true);
                break;
        }
    }
}
