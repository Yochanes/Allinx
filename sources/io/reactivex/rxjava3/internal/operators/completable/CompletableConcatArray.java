package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableConcatArray extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49512a;

        /* JADX INFO: renamed from: b */
        public int f49513b;

        /* JADX INFO: renamed from: c */
        public final SequentialDisposable f49514c = new SequentialDisposable();

        public ConcatInnerObserver(CompletableObserver completableObserver) {
            this.f49512a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m17984a() {
            SequentialDisposable sequentialDisposable = this.f49514c;
            if (sequentialDisposable.mo12353d() || getAndIncrement() != 0 || sequentialDisposable.mo12353d()) {
                return;
            }
            this.f49513b++;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        /* JADX INFO: renamed from: c */
        public final void mo12363c(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f49514c;
            sequentialDisposable.getClass();
            DisposableHelper.m17954c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            m17984a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            this.f49512a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver);
        completableObserver.mo12363c(concatInnerObserver.f49514c);
        concatInnerObserver.m17984a();
    }
}
