package io.reactivex.subjects;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeSubject<T> extends Maybe<T> implements MaybeObserver<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f51369a;

        public MaybeDisposable(MaybeObserver maybeObserver, MaybeSubject maybeSubject) {
            this.f51369a = maybeObserver;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get() == null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        maybeObserver.mo17586c(new MaybeDisposable(maybeObserver, this));
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    /* JADX INFO: renamed from: c */
    public final void mo17586c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
        ObjectHelper.m17628b(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
