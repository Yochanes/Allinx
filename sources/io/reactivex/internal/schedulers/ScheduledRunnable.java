package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {

    /* JADX INFO: renamed from: b */
    public static final Object f49184b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f49185c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f49186d = new Object();

    /* JADX INFO: renamed from: f */
    public static final Object f49187f = new Object();

    /* JADX INFO: renamed from: a */
    public final Runnable f49188a;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f49188a = runnable;
        lazySet(0, disposableContainer);
    }

    /* JADX INFO: renamed from: a */
    public final void m17850a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f49187f) {
                return;
            }
            if (obj == f49185c) {
                future.cancel(false);
                return;
            } else if (obj == f49186d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        Object obj = get(0);
        return obj == f49184b || obj == f49187f;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f49187f;
            if (obj6 == obj || obj6 == (obj4 = f49185c) || obj6 == (obj5 = f49186d)) {
                break;
            }
            boolean z2 = get(2) != Thread.currentThread();
            if (z2) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z2);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f49184b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).mo17606c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean zCompareAndSet;
        Object obj2;
        Object obj3 = f49186d;
        Object obj4 = f49185c;
        Object obj5 = f49184b;
        Object obj6 = f49187f;
        lazySet(2, Thread.currentThread());
        try {
            this.f49188a.run();
        } finally {
            try {
            } catch (Throwable th) {
                do {
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
            ((DisposableContainer) obj7).mo17606c(this);
        }
        do {
            obj2 = get(1);
            if (obj2 == obj4 || obj2 == obj3) {
                return;
            }
        } while (!compareAndSet(1, obj2, obj6));
    }
}
