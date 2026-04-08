package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.DisposableObserver;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDebounce<T, U> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceObserver<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f50528a;

        /* JADX INFO: renamed from: b */
        public Disposable f50529b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50530c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public volatile long f50531d;

        /* JADX INFO: renamed from: f */
        public boolean f50532f;

        /* JADX INFO: compiled from: Proguard */
        public static final class DebounceInnerObserver<T, U> extends DisposableObserver<U> {

            /* JADX INFO: renamed from: b */
            public boolean f50533b;

            /* JADX INFO: renamed from: a */
            public final void m18138a() {
                throw null;
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onComplete() {
                if (this.f50533b) {
                    return;
                }
                this.f50533b = true;
                m18138a();
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onError(Throwable th) {
                if (this.f50533b) {
                    RxJavaPlugins.m18275b(th);
                } else {
                    this.f50533b = true;
                    throw null;
                }
            }

            @Override // io.reactivex.rxjava3.core.Observer
            public final void onNext(Object obj) {
                if (this.f50533b) {
                    return;
                }
                this.f50533b = true;
                dispose();
                m18138a();
            }
        }

        public DebounceObserver(SerializedObserver serializedObserver) {
            this.f50528a = serializedObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50529b, disposable)) {
                this.f50529b = disposable;
                this.f50528a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50529b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50529b.dispose();
            DisposableHelper.m17952a(this.f50530c);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50532f) {
                return;
            }
            this.f50532f = true;
            AtomicReference atomicReference = this.f50530c;
            Disposable disposable = (Disposable) atomicReference.get();
            if (disposable != DisposableHelper.f49380a) {
                DebounceInnerObserver debounceInnerObserver = (DebounceInnerObserver) disposable;
                if (debounceInnerObserver != null) {
                    debounceInnerObserver.m18138a();
                }
                DisposableHelper.m17952a(atomicReference);
                this.f50528a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f50530c);
            this.f50528a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50532f) {
                return;
            }
            this.f50531d++;
            Disposable disposable = (Disposable) this.f50530c.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                dispose();
                this.f50528a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new DebounceObserver(new SerializedObserver(observer)));
    }
}
