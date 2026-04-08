package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeEqualSingle<T> extends Single<Boolean> {

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f48317a;

        /* JADX INFO: renamed from: b */
        public final EqualObserver f48318b;

        /* JADX INFO: renamed from: c */
        public final EqualObserver f48319c;

        public EqualCoordinator(SingleObserver singleObserver) {
            super(2);
            this.f48317a = singleObserver;
            this.f48318b = new EqualObserver(this);
            this.f48319c = new EqualObserver(this);
        }

        /* JADX INFO: renamed from: a */
        public final void m17762a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f48318b.f48321b;
                Object obj2 = this.f48319c.f48321b;
                SingleObserver singleObserver = this.f48317a;
                if (obj == null || obj2 == null) {
                    singleObserver.onSuccess(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17612a(th);
                    singleObserver.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return DisposableHelper.m17616b(this.f48318b.get());
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            EqualObserver equalObserver = this.f48318b;
            equalObserver.getClass();
            DisposableHelper.m17615a(equalObserver);
            EqualObserver equalObserver2 = this.f48319c;
            equalObserver2.getClass();
            DisposableHelper.m17615a(equalObserver2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EqualObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: a */
        public final EqualCoordinator f48320a;

        /* JADX INFO: renamed from: b */
        public Object f48321b;

        public EqualObserver(EqualCoordinator equalCoordinator) {
            this.f48320a = equalCoordinator;
        }

        @Override // io.reactivex.MaybeObserver
        /* JADX INFO: renamed from: c */
        public final void mo17586c(Disposable disposable) {
            DisposableHelper.m17619f(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f48320a.m17762a();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th) {
            EqualCoordinator equalCoordinator = this.f48320a;
            if (equalCoordinator.getAndSet(0) <= 0) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            EqualObserver<T> equalObserver = equalCoordinator.f48318b;
            if (this == equalObserver) {
                EqualObserver equalObserver2 = equalCoordinator.f48319c;
                equalObserver2.getClass();
                DisposableHelper.m17615a(equalObserver2);
            } else {
                equalObserver.getClass();
                DisposableHelper.m17615a(equalObserver);
            }
            equalCoordinator.f48317a.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            this.f48321b = obj;
            this.f48320a.m17762a();
        }
    }

    @Override // io.reactivex.Single
    /* JADX INFO: renamed from: b */
    public final void mo17601b(SingleObserver singleObserver) {
        singleObserver.mo17602c(new EqualCoordinator(singleObserver));
        throw null;
    }
}
