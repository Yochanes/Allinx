package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReplaySubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: a */
    public static final Object[] f51328a = new Object[0];

    /* JADX INFO: compiled from: Proguard */
    public static final class Node<T> extends AtomicReference<Node<T>> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ReplayBuffer<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f51329a;

        /* JADX INFO: renamed from: b */
        public final ReplaySubject f51330b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f51331c;

        public ReplayDisposable(Observer observer, ReplaySubject replaySubject) {
            this.f51329a = observer;
            this.f51330b = replaySubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f51331c;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f51331c) {
                return;
            }
            this.f51331c = true;
            this.f51330b.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements ReplayBuffer<T> {
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new ReplayDisposable(observer, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        RxJavaPlugins.m18275b(th);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
    }
}
