package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class HalfSerializer {
    /* JADX INFO: renamed from: a */
    public static void m18252a(Observer observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.m18234d(observer);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18253b(Subscriber subscriber, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.m18236f(subscriber);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m18254c(Observer observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.m18231a(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.m18234d(observer);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18255d(Subscriber subscriber, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.m18231a(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.m18236f(subscriber);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m18256e(Observer observer, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.m18234d(observer);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18257f(Subscriber subscriber, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(obj);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            atomicThrowable.m18236f(subscriber);
        }
        return false;
    }
}
