package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReplaySubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: a */
    public static final Object[] f51376a = new Object[0];

    /* JADX INFO: compiled from: Proguard */
    public static final class Node<T> extends AtomicReference<Node<T>> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ReplayBuffer<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ReplayDisposable<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f51377a;

        /* JADX INFO: renamed from: b */
        public final ReplaySubject f51378b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f51379c;

        public ReplayDisposable(Observer observer, ReplaySubject replaySubject) {
            this.f51377a = observer;
            this.f51378b = replaySubject;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f51379c;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f51379c) {
                return;
            }
            this.f51379c = true;
            this.f51378b.getClass();
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

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        ReplayDisposable replayDisposable = new ReplayDisposable(observer, this);
        observer.mo17593c(replayDisposable);
        if (!replayDisposable.f51379c) {
            throw null;
        }
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        RxJavaPlugins.m17911b(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
    }
}
