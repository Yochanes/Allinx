package io.reactivex.rxjava3.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class HandlerScheduler extends Scheduler {

    /* JADX INFO: renamed from: c */
    public final Handler f49350c;

    /* JADX INFO: compiled from: Proguard */
    public static final class HandlerWorker extends Scheduler.Worker {

        /* JADX INFO: renamed from: a */
        public final Handler f49351a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49352b;

        public HandlerWorker(Handler handler) {
            this.f49351a = handler;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        /* JADX INFO: renamed from: c */
        public final Disposable mo17922c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            boolean z2 = this.f49352b;
            EmptyDisposable emptyDisposable = EmptyDisposable.f49382a;
            if (z2) {
                return emptyDisposable;
            }
            Handler handler = this.f49351a;
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
            Message messageObtain = Message.obtain(handler, scheduledRunnable);
            messageObtain.obj = this;
            messageObtain.setAsynchronous(true);
            this.f49351a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.f49352b) {
                return scheduledRunnable;
            }
            this.f49351a.removeCallbacks(scheduledRunnable);
            return emptyDisposable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49352b;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49352b = true;
            this.f49351a.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ScheduledRunnable implements Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final Handler f49353a;

        /* JADX INFO: renamed from: b */
        public final Runnable f49354b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f49355c;

        public ScheduledRunnable(Handler handler, Runnable runnable) {
            this.f49353a = handler;
            this.f49354b = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49355c;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49353a.removeCallbacks(this);
            this.f49355c = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f49354b.run();
            } catch (Throwable th) {
                RxJavaPlugins.m18275b(th);
            }
        }
    }

    public HandlerScheduler(Handler handler) {
        this.f49350c = handler;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: b */
    public final Scheduler.Worker mo17920b() {
        return new HandlerWorker(this.f49350c);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    /* JADX INFO: renamed from: e */
    public final Disposable mo17921e(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f49350c;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
        Message messageObtain = Message.obtain(handler, scheduledRunnable);
        messageObtain.setAsynchronous(true);
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return scheduledRunnable;
    }
}
