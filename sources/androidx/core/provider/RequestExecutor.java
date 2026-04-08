package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.provider.FontRequestWorker;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class RequestExecutor {

    /* JADX INFO: compiled from: Proguard */
    public static class DefaultThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public String f23303a;

        /* JADX INFO: renamed from: b */
        public int f23304b;

        /* JADX INFO: compiled from: Proguard */
        public static class ProcessPriorityThread extends Thread {

            /* JADX INFO: renamed from: a */
            public final int f23305a;

            public ProcessPriorityThread(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f23305a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(this.f23305a);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.f23303a, this.f23304b);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class HandlerExecutor implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f23306a;

        public HandlerExecutor(Handler handler) {
            handler.getClass();
            this.f23306a = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            Handler handler = this.f23306a;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ReplyRunnable<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        public Callable f23307a;

        /* JADX INFO: renamed from: b */
        public Consumer f23308b;

        /* JADX INFO: renamed from: c */
        public Handler f23309c;

        /* JADX INFO: renamed from: androidx.core.provider.RequestExecutor$ReplyRunnable$1 */
        /* JADX INFO: compiled from: Proguard */
        class RunnableC14451 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Consumer f23310a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f23311b;

            public RunnableC14451(Consumer consumer, Object obj) {
                this.f23310a = consumer;
                this.f23311b = obj;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f23310a.accept(this.f23311b);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objCall;
            try {
                objCall = ((FontRequestWorker.CallableC14433) this.f23307a).call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f23309c.post(new RunnableC14451(this.f23308b, objCall));
        }
    }
}
