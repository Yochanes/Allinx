package com.google.common.util.concurrent;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import javax.annotation.CheckForNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
@ReflectionSupport(ReflectionSupport.Level.FULL)
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final Runnable DONE = new DoNothingRunnable(null);
    private static final Runnable PARKED = new DoNothingRunnable(null);

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        private final InterruptibleTask<?> task;

        public /* synthetic */ Blocker(InterruptibleTask interruptibleTask, C45541 c45541) {
            this(interruptibleTask);
        }

        public static /* synthetic */ void access$200(Blocker blocker, Thread thread) {
            blocker.setOwner(thread);
        }

        private void setOwner(Thread thread) {
            setExclusiveOwnerThread(thread);
        }

        @VisibleForTesting
        @CheckForNull
        public Thread getOwner() {
            return getExclusiveOwnerThread();
        }

        public String toString() {
            return this.task.toString();
        }

        private Blocker(InterruptibleTask<?> interruptibleTask) {
            this.task = interruptibleTask;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        public /* synthetic */ DoNothingRunnable(C45541 c45541) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    private void waitForInterrupt(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = runnable instanceof Blocker;
            if (!z3 && runnable != PARKED) {
                break;
            }
            if (z3) {
                blocker = (Blocker) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = PARKED;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z2 = Thread.interrupted() || z2;
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    public abstract void afterRanInterruptiblyFailure(Throwable th);

    public abstract void afterRanInterruptiblySuccess(@ParametricNullness T t);

    public final void interruptTask() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker(this, null);
            Blocker.access$200(blocker, Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(DONE) == PARKED) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean isDone();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objRunInterruptibly = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zIsDone = isDone();
            if (!zIsDone) {
                try {
                    objRunInterruptibly = runInterruptibly();
                } catch (Throwable th) {
                    try {
                        Platform.restoreInterruptIfIsInterruptedException(th);
                        if (!compareAndSet(threadCurrentThread, DONE)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        afterRanInterruptiblyFailure(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, DONE)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            afterRanInterruptiblySuccess(NullnessCasts.uncheckedCastNullableTToT(null));
                        }
                    }
                }
            }
        }
    }

    @ParametricNullness
    public abstract T runInterruptibly();

    public abstract String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == DONE) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbM21r = AbstractC0000a.m21r(str, ", ");
        sbM21r.append(toPendingString());
        return sbM21r.toString();
    }
}
