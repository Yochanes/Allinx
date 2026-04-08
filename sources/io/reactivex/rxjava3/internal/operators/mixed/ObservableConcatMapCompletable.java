package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableConcatMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapCompletableObserver<T> extends ConcatMapXMainObserver<T> {

        /* JADX INFO: renamed from: g */
        public final CompletableObserver f50352g;

        /* JADX INFO: renamed from: i */
        public final ConcatMapInnerObserver f50353i = new ConcatMapInnerObserver(this);

        /* JADX INFO: renamed from: j */
        public volatile boolean f50354j;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final ConcatMapCompletableObserver f50355a;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver concatMapCompletableObserver) {
                this.f50355a = concatMapCompletableObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17954c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.f50355a;
                concatMapCompletableObserver.f50354j = false;
                concatMapCompletableObserver.mo18113e();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.f50355a;
                if (concatMapCompletableObserver.f50286a.m18231a(th)) {
                    concatMapCompletableObserver.f50288c.dispose();
                    concatMapCompletableObserver.f50354j = false;
                    concatMapCompletableObserver.mo18113e();
                }
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver) {
            this.f50352g = completableObserver;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: b */
        public final void mo18112b() {
            ConcatMapInnerObserver concatMapInnerObserver = this.f50353i;
            concatMapInnerObserver.getClass();
            DisposableHelper.m17952a(concatMapInnerObserver);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: e */
        public final void mo18113e() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.f50286a;
            SimpleQueue simpleQueue = this.f50287b;
            while (!this.f50290f) {
                atomicThrowable.get();
                if (!this.f50354j) {
                    boolean z2 = this.f50289d;
                    try {
                        if (simpleQueue.poll() != null) {
                            throw null;
                        }
                        if (z2) {
                            this.f50290f = true;
                            atomicThrowable.m18233c(this.f50352g);
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m17950a(th);
                        this.f50290f = true;
                        simpleQueue.clear();
                        this.f50288c.dispose();
                        atomicThrowable.m18231a(th);
                        atomicThrowable.m18233c(this.f50352g);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            simpleQueue.clear();
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        /* JADX INFO: renamed from: f */
        public final void mo18114f() {
            this.f50352g.mo12363c(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new ConcatMapCompletableObserver(completableObserver);
        throw null;
    }
}
