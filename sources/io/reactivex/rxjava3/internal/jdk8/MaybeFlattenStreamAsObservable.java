package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.stream.Stream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFlattenStreamAsObservable<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlattenStreamMultiObserver<T, R> extends BasicIntQueueDisposable<R> implements MaybeObserver<T>, SingleObserver<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f49428a;

        /* JADX INFO: renamed from: b */
        public Disposable f49429b;

        /* JADX INFO: renamed from: c */
        public volatile Iterator f49430c;

        /* JADX INFO: renamed from: d */
        public Stream f49431d;

        /* JADX INFO: renamed from: f */
        public boolean f49432f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f49433g;

        /* JADX INFO: renamed from: i */
        public boolean f49434i;

        public FlattenStreamMultiObserver(Observer observer) {
            this.f49428a = observer;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f49429b, disposable)) {
                this.f49429b = disposable;
                this.f49428a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49430c = null;
            Stream stream = this.f49431d;
            this.f49431d = null;
            if (stream != null) {
                try {
                    stream.close();
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    RxJavaPlugins.m18275b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49433g;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49433g = true;
            this.f49429b.dispose();
            if (this.f49434i || getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.f49428a;
            Iterator it = this.f49430c;
            int iAddAndGet = 1;
            while (true) {
                if (this.f49433g) {
                    clear();
                } else if (this.f49434i) {
                    observer.onNext(null);
                    observer.onComplete();
                } else {
                    try {
                        Object next = it.next();
                        if (!this.f49433g) {
                            observer.onNext(next);
                            if (!this.f49433g) {
                                try {
                                    boolean zHasNext = it.hasNext();
                                    if (!this.f49433g && !zHasNext) {
                                        observer.onComplete();
                                        this.f49433g = true;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.m17950a(th);
                                    observer.onError(th);
                                    this.f49433g = true;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.m17950a(th2);
                        observer.onError(th2);
                        this.f49433g = true;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f49434i = true;
            return 2;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            Iterator it = this.f49430c;
            if (it == null) {
                return true;
            }
            if (!this.f49432f || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f49428a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            this.f49428a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f49428a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f49430c;
            if (it == null) {
                return null;
            }
            if (!this.f49432f) {
                this.f49432f = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            return it.next();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        new FlattenStreamMultiObserver(observer);
        throw null;
    }
}
