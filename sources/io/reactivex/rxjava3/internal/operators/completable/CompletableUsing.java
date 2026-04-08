package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableUsing<R> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class UsingObserver<R> extends AtomicReference<Object> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f49548a;

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f49548a, disposable)) {
                this.f49548a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49548a.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.f49380a;
            this.f49548a.dispose();
            this.f49548a = disposableHelper;
            if (getAndSet(this) == this) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f49548a = DisposableHelper.f49380a;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f49548a = DisposableHelper.f49380a;
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            EmptyDisposable.m17958b(th, completableObserver);
        }
    }
}
