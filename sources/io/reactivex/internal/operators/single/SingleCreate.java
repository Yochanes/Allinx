package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleCreate<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class Emitter<T> extends AtomicReference<Disposable> implements SingleEmitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49047a;

        public Emitter(SingleObserver singleObserver) {
            this.f49047a = singleObserver;
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

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        Disposable andSet;
        Emitter emitter = new Emitter(singleObserver);
        singleObserver.mo17602c(emitter);
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
                emitter.f49047a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
