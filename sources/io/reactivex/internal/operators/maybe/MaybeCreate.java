package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeCreate<T> extends Maybe<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class Emitter<T> extends AtomicReference<Disposable> implements MaybeEmitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f48294a;

        public Emitter(MaybeObserver maybeObserver) {
            this.f48294a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17615a(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return Emitter.class.getSimpleName() + "{" + super.toString() + "}";
        }
    }

    @Override // io.reactivex.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo17585b(MaybeObserver maybeObserver) {
        Disposable andSet;
        Emitter emitter = new Emitter(maybeObserver);
        maybeObserver.mo17586c(emitter);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            Disposable disposable = emitter.get();
            DisposableHelper disposableHelper = DisposableHelper.f47552a;
            if (disposable == disposableHelper || (andSet = emitter.getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            try {
                emitter.f48294a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
