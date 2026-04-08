package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeSubject<T> extends Maybe<T> implements MaybeObserver<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f51321a;

        public MaybeDisposable(MaybeObserver maybeObserver, MaybeSubject maybeSubject) {
            this.f51321a = maybeObserver;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get() == null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        maybeObserver.mo12364c(new MaybeDisposable(maybeObserver, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    /* JADX INFO: renamed from: c */
    public final void mo12364c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
        ExceptionHelper.m18248c(obj, "onSuccess called with a null value.");
        throw null;
    }
}
