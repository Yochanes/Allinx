package androidx.appcompat.app;

import androidx.appcompat.app.AppCompatDelegate;

/* JADX INFO: renamed from: androidx.appcompat.app.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0082b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCompatDelegate.SerialExecutor f574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f575b;

    public /* synthetic */ RunnableC0082b(AppCompatDelegate.SerialExecutor serialExecutor, Runnable runnable) {
        this.f574a = serialExecutor;
        this.f575b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f575b;
        AppCompatDelegate.SerialExecutor serialExecutor = this.f574a;
        serialExecutor.getClass();
        try {
            runnable.run();
        } finally {
            serialExecutor.m290a();
        }
    }
}
