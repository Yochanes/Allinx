package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMergeWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48752a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f48753b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f48754c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f48755d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public volatile boolean f48756f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f48757g;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final MergeWithObserver f48758a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.f48758a = mergeWithObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.f48758a;
                mergeWithObserver.f48757g = true;
                if (mergeWithObserver.f48756f) {
                    HalfSerializer.m17890a(mergeWithObserver.f48752a, mergeWithObserver, mergeWithObserver.f48755d);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.f48758a;
                DisposableHelper.m17615a(mergeWithObserver.f48753b);
                HalfSerializer.m17892c(mergeWithObserver.f48752a, th, mergeWithObserver, mergeWithObserver.f48755d);
            }
        }

        public MergeWithObserver(Observer observer) {
            this.f48752a = observer;
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            DisposableHelper.m17619f(this.f48753b, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b((Disposable) this.f48753b.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this.f48753b);
            DisposableHelper.m17615a(this.f48754c);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48756f = true;
            if (this.f48757g) {
                HalfSerializer.m17890a(this.f48752a, this, this.f48755d);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17615a(this.f48753b);
            HalfSerializer.m17892c(this.f48752a, th, this, this.f48755d);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            HalfSerializer.m17894e(this.f48752a, obj, this, this.f48755d);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new MergeWithObserver(observer));
        throw null;
    }
}
