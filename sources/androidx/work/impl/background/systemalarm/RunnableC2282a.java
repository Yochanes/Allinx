package androidx.work.impl.background.systemalarm;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2282a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DelayMetCommandHandler f32875b;

    public /* synthetic */ RunnableC2282a(DelayMetCommandHandler delayMetCommandHandler, int i) {
        this.f32874a = i;
        this.f32875b = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32874a) {
            case 0:
                DelayMetCommandHandler.m12166b(this.f32875b);
                break;
            default:
                DelayMetCommandHandler.m12167c(this.f32875b);
                break;
        }
    }
}
