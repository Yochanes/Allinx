package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableMergeIterable extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class MergeCompletableObserver extends AtomicBoolean implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompositeDisposable f49532a;

        /* JADX INFO: renamed from: b */
        public final CompletableObserver f49533b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f49534c;

        public MergeCompletableObserver(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicInteger atomicInteger) {
            this.f49533b = completableObserver;
            this.f49532a = compositeDisposable;
            this.f49534c = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            this.f49532a.mo17943b(disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49532a.f49374b;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49532a.dispose();
            set(true);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f49534c.decrementAndGet() == 0) {
                this.f49533b.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f49532a.dispose();
            if (compareAndSet(false, true)) {
                this.f49533b.onError(th);
            } else {
                RxJavaPlugins.m18275b(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new MergeCompletableObserver(completableObserver, new CompositeDisposable(), new AtomicInteger(1)));
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            completableObserver.onError(th);
        }
    }
}
