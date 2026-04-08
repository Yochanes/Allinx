package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorCompat {

    /* JADX INFO: compiled from: Proguard */
    public static class HandlerExecutor implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f23257a;

        public HandlerExecutor(Handler handler) {
            this.f23257a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            Handler handler = this.f23257a;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m7646a(Handler handler) {
        return new HandlerExecutor(handler);
    }
}
