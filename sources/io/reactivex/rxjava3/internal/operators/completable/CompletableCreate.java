package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableCreate extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class Emitter extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49515a;

        public Emitter(CompletableObserver completableObserver) {
            this.f49515a = completableObserver;
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

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        Disposable andSet;
        Emitter emitter = new Emitter(completableObserver);
        completableObserver.mo12363c(emitter);
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
                emitter.f49515a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }
}
