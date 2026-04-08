package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class HalfSerializer {
    /* JADX INFO: renamed from: a */
    public static void m17890a(Observer observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.getClass();
            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
            if (thM17888b != null) {
                observer.onError(thM17888b);
            } else {
                observer.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17891b(Subscriber subscriber, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.getClass();
            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
            if (thM17888b != null) {
                subscriber.onError(thM17888b);
            } else {
                subscriber.onComplete();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m17892c(Observer observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        atomicThrowable.getClass();
        if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
            RxJavaPlugins.m17911b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            observer.onError(ExceptionHelper.m17888b(atomicThrowable));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m17893d(Subscriber subscriber, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        atomicThrowable.getClass();
        if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
            RxJavaPlugins.m17911b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            subscriber.onError(ExceptionHelper.m17888b(atomicThrowable));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m17894e(Observer observer, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                if (thM17888b != null) {
                    observer.onError(thM17888b);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m17895f(Subscriber subscriber, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                if (thM17888b != null) {
                    subscriber.onError(thM17888b);
                } else {
                    subscriber.onComplete();
                }
            }
        }
    }
}
