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
public final class FlowableConcatMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatMapCompletableObserver<T> extends ConcatMapXMainSubscriber<T> implements Disposable {

        /* JADX INFO: renamed from: i */
        public final CompletableObserver f50297i;

        /* JADX INFO: renamed from: j */
        public final ConcatMapInnerObserver f50298j = new ConcatMapInnerObserver(this);

        /* JADX INFO: renamed from: n */
        public volatile boolean f50299n;

        /* JADX INFO: renamed from: o */
        public int f50300o;

        /* JADX INFO: compiled from: Proguard */
        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final ConcatMapCompletableObserver f50301a;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver concatMapCompletableObserver) {
                this.f50301a = concatMapCompletableObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17954c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.f50301a;
                concatMapCompletableObserver.f50299n = false;
                concatMapCompletableObserver.mo18117c();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.f50301a;
                if (concatMapCompletableObserver.f50291a.m18231a(th)) {
                    concatMapCompletableObserver.f50299n = false;
                    concatMapCompletableObserver.mo18117c();
                }
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver) {
            this.f50297i = completableObserver;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo18116b() {
            ConcatMapInnerObserver concatMapInnerObserver = this.f50298j;
            concatMapInnerObserver.getClass();
            DisposableHelper.m17952a(concatMapInnerObserver);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: c */
        public final void mo18117c() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.f50292b;
            AtomicThrowable atomicThrowable = this.f50291a;
            boolean z2 = this.f50296g;
            while (!this.f50295f) {
                atomicThrowable.get();
                if (!this.f50299n) {
                    boolean z3 = this.f50294d;
                    try {
                        boolean z4 = simpleQueue.poll() == null;
                        if (z3 && z4) {
                            atomicThrowable.m18233c(this.f50297i);
                            return;
                        }
                        if (!z4) {
                            if (!z2) {
                                int i = this.f50300o + 1;
                                if (i == 0) {
                                    this.f50300o = 0;
                                    this.f50293c.request(0);
                                } else {
                                    this.f50300o = i;
                                }
                            }
                            try {
                                throw null;
                            } catch (Throwable th) {
                                Exceptions.m17950a(th);
                                simpleQueue.clear();
                                this.f50293c.cancel();
                                atomicThrowable.m18231a(th);
                                atomicThrowable.m18233c(this.f50297i);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.m17950a(th2);
                        this.f50293c.cancel();
                        atomicThrowable.m18231a(th2);
                        atomicThrowable.m18233c(this.f50297i);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            simpleQueue.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50295f;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: e */
        public final void mo18118e() {
            this.f50297i.mo12363c(this);
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new ConcatMapCompletableObserver(completableObserver);
        throw null;
    }
}
