package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeEqualSingle<T> extends Single<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f50211a;

        /* JADX INFO: renamed from: b */
        public final EqualObserver f50212b;

        /* JADX INFO: renamed from: c */
        public final EqualObserver f50213c;

        public EqualCoordinator(SingleObserver singleObserver) {
            super(2);
            this.f50211a = singleObserver;
            this.f50212b = new EqualObserver(this);
            this.f50213c = new EqualObserver(this);
        }

        /* JADX INFO: renamed from: a */
        public final void m18109a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f50212b.f50215b;
                Object obj2 = this.f50213c.f50215b;
                SingleObserver singleObserver = this.f50211a;
                if (obj == null || obj2 == null) {
                    singleObserver.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    singleObserver.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return DisposableHelper.m17953b(this.f50212b.get());
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            EqualObserver equalObserver = this.f50212b;
            equalObserver.getClass();
            DisposableHelper.m17952a(equalObserver);
            EqualObserver equalObserver2 = this.f50213c;
            equalObserver2.getClass();
            DisposableHelper.m17952a(equalObserver2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: a */
        public final EqualCoordinator f50214a;

        /* JADX INFO: renamed from: b */
        public Object f50215b;

        public EqualObserver(EqualCoordinator equalCoordinator) {
            this.f50214a = equalCoordinator;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo12364c(Disposable disposable) {
            DisposableHelper.m17955e(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onComplete() {
            this.f50214a.m18109a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onError(Throwable th) {
            EqualCoordinator equalCoordinator = this.f50214a;
            if (equalCoordinator.getAndSet(0) <= 0) {
                RxJavaPlugins.m18275b(th);
                return;
            }
            EqualObserver<T> equalObserver = equalCoordinator.f50212b;
            if (this == equalObserver) {
                EqualObserver equalObserver2 = equalCoordinator.f50213c;
                equalObserver2.getClass();
                DisposableHelper.m17952a(equalObserver2);
            } else {
                equalObserver.getClass();
                DisposableHelper.m17952a(equalObserver);
            }
            equalCoordinator.f50211a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f50215b = obj;
            this.f50214a.m18109a();
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        singleObserver.mo12366c(new EqualCoordinator(singleObserver));
        throw null;
    }
}
