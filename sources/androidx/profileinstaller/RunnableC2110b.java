package androidx.profileinstaller;

import android.content.Context;
import androidx.arch.core.executor.ExecutorC0154a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2110b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f31519b;

    public /* synthetic */ RunnableC2110b(Context context, int i) {
        this.f31518a = i;
        this.f31519b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31518a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC2110b(this.f31519b, 1));
                break;
            default:
                ProfileInstaller.m11502b(this.f31519b, new ExecutorC0154a(1), ProfileInstaller.f31495a, false);
                break;
        }
    }
}
