package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDebounce<T, U> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DebounceObserver<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SerializedObserver f48623a;

        /* JADX INFO: renamed from: b */
        public Disposable f48624b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48625c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public volatile long f48626d;

        /* JADX INFO: renamed from: f */
        public boolean f48627f;

        /* JADX INFO: compiled from: Proguard */
        public static final class DebounceInnerObserver<T, U> extends DisposableObserver<U> {

            /* JADX INFO: renamed from: b */
            public boolean f48628b;

            /* JADX INFO: renamed from: a */
            public final void m17786a() {
                throw null;
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                if (this.f48628b) {
                    return;
                }
                this.f48628b = true;
                m17786a();
            }

            @Override // io.reactivex.Observer
            public final void onError(Throwable th) {
                if (this.f48628b) {
                    RxJavaPlugins.m17911b(th);
                } else {
                    this.f48628b = true;
                    throw null;
                }
            }

            @Override // io.reactivex.Observer
            public final void onNext(Object obj) {
                if (this.f48628b) {
                    return;
                }
                this.f48628b = true;
                dispose();
                m17786a();
            }
        }

        public DebounceObserver(SerializedObserver serializedObserver) {
            this.f48623a = serializedObserver;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48624b, disposable)) {
                this.f48624b = disposable;
                this.f48623a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48624b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48624b.dispose();
            DisposableHelper.m17615a(this.f48625c);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48627f) {
                return;
            }
            this.f48627f = true;
            AtomicReference atomicReference = this.f48625c;
            Disposable disposable = (Disposable) atomicReference.get();
            if (disposable != DisposableHelper.f47552a) {
                ((DebounceInnerObserver) disposable).m17786a();
                DisposableHelper.m17615a(atomicReference);
                this.f48623a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17615a(this.f48625c);
            this.f48623a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f48627f) {
                return;
            }
            this.f48626d++;
            Disposable disposable = (Disposable) this.f48625c.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                dispose();
                this.f48623a.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new DebounceObserver(new SerializedObserver(observer));
        throw null;
    }
}
