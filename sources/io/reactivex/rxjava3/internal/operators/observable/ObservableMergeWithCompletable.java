package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMergeWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeWithObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50689a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference f50690b = new AtomicReference();

        /* JADX INFO: renamed from: c */
        public final OtherObserver f50691c = new OtherObserver(this);

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f50692d = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public volatile boolean f50693f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f50694g;

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final MergeWithObserver f50695a;

            public OtherObserver(MergeWithObserver mergeWithObserver) {
                this.f50695a = mergeWithObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                MergeWithObserver mergeWithObserver = this.f50695a;
                mergeWithObserver.f50694g = true;
                if (mergeWithObserver.f50693f) {
                    HalfSerializer.m18252a(mergeWithObserver.f50689a, mergeWithObserver, mergeWithObserver.f50692d);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                MergeWithObserver mergeWithObserver = this.f50695a;
                DisposableHelper.m17952a(mergeWithObserver.f50690b);
                HalfSerializer.m18254c(mergeWithObserver.f50689a, th, mergeWithObserver, mergeWithObserver.f50692d);
            }
        }

        public MergeWithObserver(Observer observer) {
            this.f50689a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            DisposableHelper.m17955e(this.f50690b, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b((Disposable) this.f50690b.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this.f50690b);
            DisposableHelper.m17952a(this.f50691c);
            this.f50692d.m18232b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50693f = true;
            if (this.f50694g) {
                HalfSerializer.m18252a(this.f50689a, this, this.f50692d);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            DisposableHelper.m17952a(this.f50691c);
            HalfSerializer.m18254c(this.f50689a, th, this, this.f50692d);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            HalfSerializer.m18256e(this.f50689a, obj, this, this.f50692d);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(observer);
        observer.mo12365c(mergeWithObserver);
        this.f50392a.mo17931a(mergeWithObserver);
        throw null;
    }
}
