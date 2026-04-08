package androidx.work.impl.utils;

import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SerialExecutorImpl implements SerialExecutor {

    /* JADX INFO: renamed from: b */
    public final ExecutorService f33078b;

    /* JADX INFO: renamed from: c */
    public Runnable f33079c;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f33077a = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final Object f33080d = new Object();

    /* JADX INFO: compiled from: Proguard */
    public static class Task implements Runnable {

        /* JADX INFO: renamed from: a */
        public final SerialExecutorImpl f33081a;

        /* JADX INFO: renamed from: b */
        public final Runnable f33082b;

        public Task(SerialExecutorImpl serialExecutorImpl, Runnable runnable) {
            this.f33081a = serialExecutorImpl;
            this.f33082b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f33082b.run();
                synchronized (this.f33081a.f33080d) {
                    this.f33081a.m12284a();
                }
            } catch (Throwable th) {
                synchronized (this.f33081a.f33080d) {
                    this.f33081a.m12284a();
                    throw th;
                }
            }
        }
    }

    public SerialExecutorImpl(ExecutorService executorService) {
        this.f33078b = executorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m12284a() {
        Runnable runnable = (Runnable) this.f33077a.poll();
        this.f33079c = runnable;
        if (runnable != null) {
            this.f33078b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f33080d) {
            try {
                this.f33077a.add(new Task(this, runnable));
                if (this.f33079c == null) {
                    m12284a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
