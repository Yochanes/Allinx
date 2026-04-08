package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.arch.core.executor.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0154a implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1505a;

    public /* synthetic */ ExecutorC0154a(int i) {
        this.f1505a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1505a) {
            case 0:
                ArchTaskExecutor.m803a().f1500a.f1502b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
