package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleCreate<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class Emitter<T> extends AtomicReference<Disposable> implements SingleEmitter<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f51006a;

        public Emitter(SingleObserver singleObserver) {
            this.f51006a = singleObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.m17952a(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return Emitter.class.getSimpleName() + "{" + super.toString() + "}";
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        Disposable andSet;
        Emitter emitter = new Emitter(singleObserver);
        singleObserver.mo12366c(emitter);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            Disposable disposable = emitter.get();
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            if (disposable == disposableHelper || (andSet = emitter.getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            try {
                emitter.f51006a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
