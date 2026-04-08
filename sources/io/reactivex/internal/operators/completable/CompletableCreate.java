package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableCreate extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class Emitter extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f47607a;

        public Emitter(CompletableObserver completableObserver) {
            this.f47607a = completableObserver;
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

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        Disposable andSet;
        Emitter emitter = new Emitter(completableObserver);
        completableObserver.mo17580c(emitter);
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
                emitter.f47607a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
