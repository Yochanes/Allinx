package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0152e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TooltipCompatHandler f1497b;

    public /* synthetic */ RunnableC0152e(TooltipCompatHandler tooltipCompatHandler, int i) {
        this.f1496a = i;
        this.f1497b = tooltipCompatHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1496a) {
            case 0:
                this.f1497b.m737c(false);
                break;
            default:
                this.f1497b.m736a();
                break;
        }
    }
}
