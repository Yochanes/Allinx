package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AndroidMainExecutor implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f59288a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f59288a.post(runnable);
    }
}
