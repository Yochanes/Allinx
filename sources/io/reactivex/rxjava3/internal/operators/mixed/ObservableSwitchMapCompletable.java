package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableSwitchMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapCompletableObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: g */
        public static final SwitchMapInnerObserver f50366g = new SwitchMapInnerObserver(null);

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f50367a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50368b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50369c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public volatile boolean f50370d;

        /* JADX INFO: renamed from: f */
        public Disposable f50371f;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final SwitchMapCompletableObserver f50372a;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver switchMapCompletableObserver) {
                this.f50372a = switchMapCompletableObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.f50372a;
                AtomicReference atomicReference = switchMapCompletableObserver.f50369c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (switchMapCompletableObserver.f50370d) {
                    switchMapCompletableObserver.f50368b.m18233c(switchMapCompletableObserver.f50367a);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.f50372a;
                AtomicReference atomicReference = switchMapCompletableObserver.f50369c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.m18275b(th);
                        return;
                    }
                }
                AtomicThrowable atomicThrowable = switchMapCompletableObserver.f50368b;
                if (atomicThrowable.m18231a(th)) {
                    switchMapCompletableObserver.f50371f.dispose();
                    switchMapCompletableObserver.m18125a();
                    atomicThrowable.m18233c(switchMapCompletableObserver.f50367a);
                }
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver) {
            this.f50367a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m18125a() {
            AtomicReference atomicReference = this.f50369c;
            SwitchMapInnerObserver switchMapInnerObserver = f50366g;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 == null || switchMapInnerObserver2 == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.m17952a(switchMapInnerObserver2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50371f, disposable)) {
                this.f50371f = disposable;
                this.f50367a.mo12363c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50369c.get() == f50366g;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50371f.dispose();
            m18125a();
            this.f50368b.m18232b();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50370d = true;
            if (this.f50369c.get() == null) {
                this.f50368b.m18233c(this.f50367a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f50368b;
            if (atomicThrowable.m18231a(th)) {
                m18125a();
                atomicThrowable.m18233c(this.f50367a);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50371f.dispose();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new SwitchMapCompletableObserver(completableObserver);
        throw null;
    }
}
