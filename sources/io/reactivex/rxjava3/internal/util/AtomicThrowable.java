package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    /* JADX INFO: renamed from: a */
    public final boolean m18231a(Throwable th) {
        if (ExceptionHelper.m18246a(this, th)) {
            return true;
        }
        RxJavaPlugins.m18275b(th);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m18232b() {
        Throwable thM18249d = ExceptionHelper.m18249d(this);
        if (thM18249d == null || thM18249d == ExceptionHelper.f51225a) {
            return;
        }
        RxJavaPlugins.m18275b(thM18249d);
    }

    /* JADX INFO: renamed from: c */
    public final void m18233c(CompletableObserver completableObserver) {
        Throwable thM18249d = ExceptionHelper.m18249d(this);
        if (thM18249d == null) {
            completableObserver.onComplete();
        } else if (thM18249d != ExceptionHelper.f51225a) {
            completableObserver.onError(thM18249d);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18234d(Observer observer) {
        Throwable thM18249d = ExceptionHelper.m18249d(this);
        if (thM18249d == null) {
            observer.onComplete();
        } else if (thM18249d != ExceptionHelper.f51225a) {
            observer.onError(thM18249d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18235e(SingleObserver singleObserver) {
        Throwable thM18249d = ExceptionHelper.m18249d(this);
        if (thM18249d == null || thM18249d == ExceptionHelper.f51225a) {
            return;
        }
        singleObserver.onError(thM18249d);
    }

    /* JADX INFO: renamed from: f */
    public final void m18236f(Subscriber subscriber) {
        Throwable thM18249d = ExceptionHelper.m18249d(this);
        if (thM18249d == null) {
            subscriber.onComplete();
        } else if (thM18249d != ExceptionHelper.f51225a) {
            subscriber.onError(thM18249d);
        }
    }
}
