package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class ReportQueue {
    private static final int MAX_DELAY_MS = 3600000;
    private static final int MS_PER_MINUTE = 60000;
    private static final int MS_PER_SECOND = 1000;
    private static final int STARTUP_DURATION_MS = 2000;
    private final double base;
    private long lastUpdatedMs;
    private final OnDemandCounter onDemandCounter;
    private final BlockingQueue<Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final Transport<CrashlyticsReport> transport;

    /* JADX INFO: compiled from: Proguard */
    public final class ReportRunnable implements Runnable {
        private final CrashlyticsReportWithSessionId reportWithSessionId;
        private final TaskCompletionSource<CrashlyticsReportWithSessionId> tcs;

        public /* synthetic */ ReportRunnable(ReportQueue reportQueue, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource, C47011 c47011) {
            this(crashlyticsReportWithSessionId, taskCompletionSource);
        }

        @Override // java.lang.Runnable
        public void run() {
            ReportQueue.access$100(ReportQueue.this, this.reportWithSessionId, this.tcs);
            ReportQueue.access$200(ReportQueue.this).resetDroppedOnDemandExceptions();
            double dAccess$300 = ReportQueue.access$300(ReportQueue.this);
            Logger.getLogger().m15161d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dAccess$300 / 1000.0d)) + " s for report: " + this.reportWithSessionId.getSessionId());
            ReportQueue.access$400(dAccess$300);
        }

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.reportWithSessionId = crashlyticsReportWithSessionId;
            this.tcs = taskCompletionSource;
        }
    }

    public ReportQueue(Transport<CrashlyticsReport> transport, Settings settings, OnDemandCounter onDemandCounter) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, ((long) settings.onDemandBackoffStepDurationSeconds) * 1000, transport, onDemandCounter);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15202a(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean z2, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        reportQueue.lambda$sendReport$1(taskCompletionSource, z2, crashlyticsReportWithSessionId, exc);
    }

    public static /* synthetic */ void access$100(ReportQueue reportQueue, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
        reportQueue.sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
    }

    public static /* synthetic */ OnDemandCounter access$200(ReportQueue reportQueue) {
        return reportQueue.onDemandCounter;
    }

    public static /* synthetic */ double access$300(ReportQueue reportQueue) {
        return reportQueue.calcDelay();
    }

    public static /* synthetic */ void access$400(double d) {
        sleep(d);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15203b(ReportQueue reportQueue, CountDownLatch countDownLatch) {
        reportQueue.lambda$flushScheduledReportsIfAble$0(countDownLatch);
    }

    private double calcDelay() {
        return Math.min(3600000.0d, Math.pow(this.base, calcStep()) * (60000.0d / this.ratePerMinute));
    }

    private int calcStep() {
        if (this.lastUpdatedMs == 0) {
            this.lastUpdatedMs = now();
        }
        int iNow = (int) ((now() - this.lastUpdatedMs) / this.stepDurationMs);
        int iMin = isQueueFull() ? Math.min(100, this.step + iNow) : Math.max(0, this.step - iNow);
        if (this.step != iMin) {
            this.step = iMin;
            this.lastUpdatedMs = now();
        }
        return iMin;
    }

    private boolean isQueueAvailable() {
        return this.queue.size() < this.queueCapacity;
    }

    private boolean isQueueFull() {
        return this.queue.size() == this.queueCapacity;
    }

    private /* synthetic */ void lambda$flushScheduledReportsIfAble$0(CountDownLatch countDownLatch) {
        try {
            ForcedSender.sendBlocking(this.transport, Priority.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    private /* synthetic */ void lambda$sendReport$1(TaskCompletionSource taskCompletionSource, boolean z2, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z2) {
            flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    private long now() {
        return System.currentTimeMillis();
    }

    private void sendReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        Logger.getLogger().m15161d("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.getSessionId());
        this.transport.schedule(Event.ofUrgent(crashlyticsReportWithSessionId.getReport()), new C4703b(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.startTimeMs < 2000, crashlyticsReportWithSessionId));
    }

    private static void sleep(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    public TaskCompletionSource<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z2) {
        synchronized (this.queue) {
            try {
                TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource = new TaskCompletionSource<>();
                if (!z2) {
                    sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.onDemandCounter.incrementRecordedOnDemandExceptions();
                if (!isQueueAvailable()) {
                    calcStep();
                    Logger.getLogger().m15161d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.getSessionId());
                    this.onDemandCounter.incrementDroppedOnDemandExceptions();
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                Logger.getLogger().m15161d("Enqueueing report: " + crashlyticsReportWithSessionId.getSessionId());
                Logger.getLogger().m15161d("Queue size: " + this.queue.size());
                this.singleThreadExecutor.execute(new ReportRunnable(this, crashlyticsReportWithSessionId, taskCompletionSource, null));
                Logger.getLogger().m15161d("Closing task for report: " + crashlyticsReportWithSessionId.getSessionId());
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void flushScheduledReportsIfAble() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new RunnableC4702a(this, countDownLatch)).start();
        Utils.awaitUninterruptibly(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public ReportQueue(double d, double d2, long j, Transport<CrashlyticsReport> transport, OnDemandCounter onDemandCounter) {
        this.ratePerMinute = d;
        this.base = d2;
        this.stepDurationMs = j;
        this.transport = transport;
        this.onDemandCounter = onDemandCounter;
        this.startTimeMs = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.queueCapacity = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.queue = arrayBlockingQueue;
        this.singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0L;
    }
}
