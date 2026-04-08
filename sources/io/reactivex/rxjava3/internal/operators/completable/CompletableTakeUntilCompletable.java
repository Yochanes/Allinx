package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableTakeUntilCompletable extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class TakeUntilMainObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49543a;

        /* JADX INFO: renamed from: b */
        public final OtherObserver f49544b = new OtherObserver(this);

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f49545c = new AtomicBoolean();

        /* JADX INFO: compiled from: Proguard */
        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final TakeUntilMainObserver f49546a;

            public OtherObserver(TakeUntilMainObserver takeUntilMainObserver) {
                this.f49546a = takeUntilMainObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = this.f49546a;
                if (takeUntilMainObserver.f49545c.compareAndSet(false, true)) {
                    DisposableHelper.m17952a(takeUntilMainObserver);
                    takeUntilMainObserver.f49543a.onComplete();
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = this.f49546a;
                if (!takeUntilMainObserver.f49545c.compareAndSet(false, true)) {
                    RxJavaPlugins.m18275b(th);
                } else {
                    DisposableHelper.m17952a(takeUntilMainObserver);
                    takeUntilMainObserver.f49543a.onError(th);
                }
            }
        }

        public TakeUntilMainObserver(CompletableObserver completableObserver) {
            this.f49543a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49545c.get();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f49545c.compareAndSet(false, true)) {
                DisposableHelper.m17952a(this);
                DisposableHelper.m17952a(this.f49544b);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f49545c.compareAndSet(false, true)) {
                DisposableHelper.m17952a(this.f49544b);
                this.f49543a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            if (!this.f49545c.compareAndSet(false, true)) {
                RxJavaPlugins.m18275b(th);
            } else {
                DisposableHelper.m17952a(this.f49544b);
                this.f49543a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        completableObserver.mo12363c(new TakeUntilMainObserver(completableObserver));
        throw null;
    }
}
