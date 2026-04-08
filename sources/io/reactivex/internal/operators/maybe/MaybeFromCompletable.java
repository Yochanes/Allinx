package io.reactivex.internal.operators.maybe;

import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamCompletableSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> implements HasUpstreamCompletableSource {

    /* JADX INFO: compiled from: Proguard */
    public static final class FromCompletableObserver<T> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48343a;

        @Override // io.reactivex.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo17580c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48343a, disposable)) {
                this.f48343a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48343a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48343a.dispose();
            this.f48343a = DisposableHelper.f47552a;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48343a = DisposableHelper.f47552a;
            throw null;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th) {
            this.f48343a = DisposableHelper.f47552a;
            throw null;
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        throw null;
    }
}
