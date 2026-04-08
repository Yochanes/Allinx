package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0149b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f1494b;

    public /* synthetic */ RunnableC0149b(Toolbar toolbar, int i) {
        this.f1493a = i;
        this.f1494b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1493a) {
            case 0:
                this.f1494b.collapseActionView();
                break;
            default:
                this.f1494b.invalidateMenu();
                break;
        }
    }
}
