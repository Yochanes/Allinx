package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.activity.compose.C0044a;
import androidx.camera.core.processing.RunnableC0320d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class Utils {
    private static final int BACKGROUND_TIMEOUT_MILLIS = 4000;
    private static final int MAIN_TIMEOUT_MILLIS = 2750;
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m15179a(TaskCompletionSource taskCompletionSource, Task task) {
        return lambda$callTask$2(taskCompletionSource, task);
    }

    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new C0044a(countDownLatch, 25));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(2750L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    @CanIgnoreReturnValue
    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean z2 = false;
        try {
            long nanos = timeUnit.toNanos(j);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m15180b(CountDownLatch countDownLatch, Task task) {
        return lambda$awaitEvenIfOnMainThread$4(countDownLatch, task);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m15181c(TaskCompletionSource taskCompletionSource, Task task) {
        return lambda$race$1(taskCompletionSource, task);
    }

    public static <T> Task<T> callTask(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new RunnableC0320d(callable, 8, executor, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m15182d(TaskCompletionSource taskCompletionSource, Task task) {
        return lambda$race$0(taskCompletionSource, task);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15183e(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        lambda$callTask$3(callable, executor, taskCompletionSource);
    }

    private static /* synthetic */ Object lambda$awaitEvenIfOnMainThread$4(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
        return null;
    }

    private static /* synthetic */ Object lambda$callTask$2(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    private static /* synthetic */ void lambda$callTask$3(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new C4662d(1, taskCompletionSource));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private static /* synthetic */ Void lambda$race$0(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    private static /* synthetic */ Void lambda$race$1(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4662d c4662d = new C4662d(0, taskCompletionSource);
        task.continueWith(c4662d);
        task2.continueWith(c4662d);
        return taskCompletionSource.getTask();
    }

    public static <T> Task<T> race(Executor executor, Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4662d c4662d = new C4662d(2, taskCompletionSource);
        task.continueWith(executor, c4662d);
        task2.continueWith(executor, c4662d);
        return taskCompletionSource.getTask();
    }
}
