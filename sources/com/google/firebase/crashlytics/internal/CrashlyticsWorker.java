package com.google.firebase.crashlytics.internal;

import androidx.activity.compose.C0044a;
import androidx.annotation.VisibleForTesting;
import com.exchange.allin.net.p023ws.RunnableC2550a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsWorker {
    private final ExecutorService executor;
    private final Object tailLock = new Object();
    private Task<?> tail = Tasks.forResult(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m15155a(Task task) {
        return lambda$submit$0(task);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Task m15156b(Task task) {
        return lambda$submit$2(task);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Task m15157c(Callable callable, Task task) {
        return lambda$submitTask$4(callable, task);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m15158d(Runnable runnable, Task task) {
        return lambda$submit$3(runnable, task);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m15159e(Callable callable, Task task) {
        return lambda$submit$1(callable, task);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15160f() {
        lambda$await$5();
    }

    private static /* synthetic */ Task lambda$submit$0(Task task) {
        return Tasks.forResult(null);
    }

    private static /* synthetic */ Object lambda$submit$1(Callable callable, Task task) {
        return callable.call();
    }

    private static /* synthetic */ Task lambda$submit$2(Task task) {
        return Tasks.forResult(null);
    }

    private static /* synthetic */ Void lambda$submit$3(Runnable runnable, Task task) {
        runnable.run();
        return null;
    }

    private static /* synthetic */ Task lambda$submitTask$4(Callable callable, Task task) {
        return (Task) callable.call();
    }

    @VisibleForTesting
    public void await() throws InterruptedException {
        Tasks.await(submit(new RunnableC2550a(5)));
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public <T> Task<T> submit(Callable<T> callable) {
        zzw zzwVar;
        synchronized (this.tailLock) {
            try {
                if (this.tail.isCanceled()) {
                    this.tail = this.tail.continueWithTask(this.executor, new C4639a(1));
                }
                zzwVar = (Task<T>) this.tail.continueWith(this.executor, new C4640b(callable, 0));
                this.tail = zzwVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzwVar;
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (Task<T>) this.tail.continueWithTask(this.executor, new C4640b(callable, 1));
            this.tail = zzwVar;
        }
        return zzwVar;
    }

    public Task<Void> submit(Runnable runnable) {
        Task taskContinueWith;
        synchronized (this.tailLock) {
            try {
                if (this.tail.isCanceled()) {
                    this.tail = this.tail.continueWithTask(this.executor, new C4639a(0));
                }
                taskContinueWith = this.tail.continueWith(this.executor, new C0044a(runnable, 22));
                this.tail = taskContinueWith;
            } catch (Throwable th) {
                throw th;
            }
        }
        return taskContinueWith;
    }

    private static /* synthetic */ void lambda$await$5() {
    }
}
