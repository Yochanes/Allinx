package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class CrashlyticsBackgroundWorker {
    private final Executor executor;
    private Task<Void> tail = Tasks.forResult(null);
    private final Object tailLock = new Object();
    private final ThreadLocal<Boolean> isExecutorThread = new ThreadLocal<>();

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC46411 implements Runnable {
        public RunnableC46411() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CrashlyticsBackgroundWorker.access$000(CrashlyticsBackgroundWorker.this).set(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker$2 */
    /* JADX INFO: compiled from: Proguard */
    public class CallableC46422 implements Callable<Void> {
        final /* synthetic */ Runnable val$runnable;

        public CallableC46422(Runnable runnable) {
            this.val$runnable = runnable;
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() {
            return call2();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
        public Void call2() {
            this.val$runnable.run();
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C46433<T> implements Continuation<Void, T> {
        final /* synthetic */ Callable val$callable;

        public C46433(Callable callable) {
            this.val$callable = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(@NonNull Task<Void> task) {
            return (T) this.val$callable.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C46444<T> implements Continuation<T, Void> {
        public C46444() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* JADX INFO: renamed from: then, reason: avoid collision after fix types in other method */
        public Void then2(@NonNull Task<T> task) {
            return null;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public /* bridge */ /* synthetic */ Void then(@NonNull Task task) {
            return then2(task);
        }
    }

    public CrashlyticsBackgroundWorker(Executor executor) {
        this.executor = executor;
        executor.execute(new RunnableC46411());
    }

    public static /* synthetic */ ThreadLocal access$000(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        return crashlyticsBackgroundWorker.isExecutorThread;
    }

    private <T> Task<Void> ignoreResult(Task<T> task) {
        return task.continueWith(this.executor, new C46444());
    }

    private boolean isRunningOnThread() {
        return Boolean.TRUE.equals(this.isExecutorThread.get());
    }

    private <T> Continuation<Void, T> newContinuation(Callable<T> callable) {
        return new C46433(callable);
    }

    public void checkRunningOnThread() {
        if (!isRunningOnThread()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor getExecutor() {
        return this.executor;
    }

    public Task<Void> submit(Runnable runnable) {
        return submit(new CallableC46422(runnable));
    }

    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        Task<T> taskContinueWithTask;
        synchronized (this.tailLock) {
            taskContinueWithTask = this.tail.continueWithTask(this.executor, newContinuation(callable));
            this.tail = ignoreResult(taskContinueWithTask);
        }
        return taskContinueWithTask;
    }

    public <T> Task<T> submit(Callable<T> callable) {
        Task<T> taskContinueWith;
        synchronized (this.tailLock) {
            taskContinueWith = this.tail.continueWith(this.executor, newContinuation(callable));
            this.tail = ignoreResult(taskContinueWith);
        }
        return taskContinueWith;
    }
}
