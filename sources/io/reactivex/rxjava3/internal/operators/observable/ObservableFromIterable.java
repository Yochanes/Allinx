package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BasicQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromIterable<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Iterable f50628a;

    /* JADX INFO: compiled from: Proguard */
    public static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f50629a;

        /* JADX INFO: renamed from: b */
        public final Iterator f50630b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f50631c;

        /* JADX INFO: renamed from: d */
        public boolean f50632d;

        /* JADX INFO: renamed from: f */
        public boolean f50633f;

        /* JADX INFO: renamed from: g */
        public boolean f50634g;

        public FromIterableDisposable(Observer observer, Iterator it) {
            this.f50629a = observer;
            this.f50630b = it;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f50633f = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50631c;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50631c = true;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f50632d = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f50633f;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            if (this.f50633f) {
                return null;
            }
            boolean z2 = this.f50634g;
            Iterator it = this.f50630b;
            if (!z2) {
                this.f50634g = true;
            } else if (!it.hasNext()) {
                this.f50633f = true;
                return null;
            }
            Object next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }
    }

    public ObservableFromIterable(Iterable iterable) {
        this.f50628a = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        try {
            Iterator<T> it = this.f50628a.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.m17957a(observer);
                    return;
                }
                FromIterableDisposable fromIterableDisposable = new FromIterableDisposable(observer, it);
                observer.mo12365c(fromIterableDisposable);
                if (fromIterableDisposable.f50632d) {
                    return;
                }
                while (!fromIterableDisposable.f50631c) {
                    try {
                        Object next = fromIterableDisposable.f50630b.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        fromIterableDisposable.f50629a.onNext(next);
                        if (fromIterableDisposable.f50631c) {
                            return;
                        }
                        try {
                            if (!fromIterableDisposable.f50630b.hasNext()) {
                                if (fromIterableDisposable.f50631c) {
                                    return;
                                }
                                fromIterableDisposable.f50629a.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.m17950a(th);
                            fromIterableDisposable.f50629a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.m17950a(th2);
                        fromIterableDisposable.f50629a.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.m17950a(th3);
                EmptyDisposable.m17960f(th3, observer);
            }
        } catch (Throwable th4) {
            Exceptions.m17950a(th4);
            EmptyDisposable.m17960f(th4, observer);
        }
    }
}
