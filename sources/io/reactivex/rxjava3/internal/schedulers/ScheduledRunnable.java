package io.reactivex.rxjava3.internal.schedulers;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {

    /* JADX INFO: renamed from: b */
    public static final Object f51137b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f51138c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f51139d = new Object();

    /* JADX INFO: renamed from: f */
    public static final Object f51140f = new Object();

    /* JADX INFO: renamed from: a */
    public final Runnable f51141a;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f51141a = runnable;
        lazySet(0, disposableContainer);
    }

    /* JADX INFO: renamed from: a */
    public final void m18204a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f51140f) {
                return;
            }
            if (obj == f51138c) {
                future.cancel(false);
                return;
            } else if (obj == f51139d) {
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

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        Object obj = get(0);
        return obj == f51137b || obj == f51140f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f51140f;
            if (obj6 == obj || obj6 == (obj4 = f51138c) || obj6 == (obj5 = f51139d)) {
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
            if (obj2 == obj || obj2 == (obj3 = f51137b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).mo17944c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f51139d;
        Object obj4 = f51138c;
        Object obj5 = f51137b;
        Object obj6 = f51140f;
        lazySet(2, Thread.currentThread());
        try {
            this.f51141a.run();
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((DisposableContainer) obj7).mo17944c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    break;
                }
            } while (!compareAndSet(1, obj2, obj6));
            lazySet(2, null);
        } catch (Throwable th) {
            try {
                RxJavaPlugins.m18275b(th);
                throw th;
            } catch (Throwable th2) {
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((DisposableContainer) obj8).mo17944c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                lazySet(2, null);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String strM8733k;
        Object obj = get(1);
        if (obj == f51140f) {
            strM8733k = "Finished";
        } else if (obj == f51138c) {
            strM8733k = "Disposed(Sync)";
        } else if (obj == f51139d) {
            strM8733k = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            strM8733k = obj2 == null ? "Waiting" : AbstractC1610a.m8733k(obj2, "Running on ");
        }
        return AbstractC0000a.m3D("ScheduledRunnable[", strM8733k, "]");
    }
}
