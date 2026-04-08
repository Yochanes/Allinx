package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorUtils {
    private static final long DEFAULT_TERMINATION_TIMEOUT = 2;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ThreadFactoryC46571 implements ThreadFactory {
        final /* synthetic */ AtomicLong val$count;
        final /* synthetic */ String val$threadNameTemplate;

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends BackgroundPriorityRunnable {
            final /* synthetic */ Runnable val$runnable;

            public AnonymousClass1(Runnable runnable) {
                this.val$runnable = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public void onRun() {
                this.val$runnable.run();
            }
        }

        public ThreadFactoryC46571(String str, AtomicLong atomicLong) {
            this.val$threadNameTemplate = str;
            this.val$count = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new AnonymousClass1(runnable));
            threadNewThread.setName(this.val$threadNameTemplate + this.val$count.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C46582 extends BackgroundPriorityRunnable {
        final /* synthetic */ ExecutorService val$service;
        final /* synthetic */ String val$serviceName;
        final /* synthetic */ long val$terminationTimeout;
        final /* synthetic */ TimeUnit val$timeUnit;

        public C46582(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.val$serviceName = str;
            this.val$service = executorService;
            this.val$terminationTimeout = j;
            this.val$timeUnit = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
        public void onRun() {
            try {
                Logger.getLogger().m15161d("Executing shutdown hook for " + this.val$serviceName);
                this.val$service.shutdown();
                if (this.val$service.awaitTermination(this.val$terminationTimeout, this.val$timeUnit)) {
                    return;
                }
                Logger.getLogger().m15161d(this.val$serviceName + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.val$service.shutdownNow();
            } catch (InterruptedException unused) {
                Logger logger = Logger.getLogger();
                Locale locale = Locale.US;
                logger.m15161d("Interrupted while waiting for " + this.val$serviceName + " to shut down. Requesting immediate shutdown.");
                this.val$service.shutdownNow();
            }
        }
    }

    private ExecutorUtils() {
    }

    private static void addDelayedShutdownHook(String str, ExecutorService executorService) {
        addDelayedShutdownHook(str, executorService, DEFAULT_TERMINATION_TIMEOUT, TimeUnit.SECONDS);
    }

    public static Executor buildSequentialExecutor(Executor executor) {
        return FirebaseExecutors.newSequentialExecutor(executor);
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService executorServiceNewSingleThreadExecutor = newSingleThreadExecutor(getNamedThreadFactory(str), new ThreadPoolExecutor.DiscardPolicy());
        addDelayedShutdownHook(str, executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        addDelayedShutdownHook(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static ThreadFactory getNamedThreadFactory(String str) {
        return new ThreadFactoryC46571(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void addDelayedShutdownHook(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new C46582(str, executorService, j, timeUnit), AbstractC0000a.m13j("Crashlytics Shutdown Hook for ", str)));
    }
}
