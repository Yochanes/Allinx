package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class FlowableSwitchMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapCompletableObserver<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: g */
        public static final SwitchMapInnerObserver f48438g = new SwitchMapInnerObserver(null);

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f48439a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f48440b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f48441c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public volatile boolean f48442d;

        /* JADX INFO: renamed from: f */
        public Subscription f48443f;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final SwitchMapCompletableObserver f48444a;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver switchMapCompletableObserver) {
                this.f48444a = switchMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo17580c(Disposable disposable) {
                DisposableHelper.m17619f(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.f48444a;
                AtomicReference atomicReference = switchMapCompletableObserver.f48441c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (switchMapCompletableObserver.f48442d) {
                    AtomicThrowable atomicThrowable = switchMapCompletableObserver.f48440b;
                    atomicThrowable.getClass();
                    Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                    if (thM17888b == null) {
                        switchMapCompletableObserver.f48439a.onComplete();
                    } else {
                        switchMapCompletableObserver.f48439a.onError(thM17888b);
                    }
                }
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th) {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.f48444a;
                AtomicReference atomicReference = switchMapCompletableObserver.f48441c;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        AtomicThrowable atomicThrowable = switchMapCompletableObserver.f48440b;
                        atomicThrowable.getClass();
                        if (ExceptionHelper.m17887a(atomicThrowable, th)) {
                            switchMapCompletableObserver.dispose();
                            atomicThrowable.getClass();
                            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                            if (thM17888b != ExceptionHelper.f49276a) {
                                switchMapCompletableObserver.f48439a.onError(thM17888b);
                                return;
                            }
                            return;
                        }
                    } else if (atomicReference.get() != this) {
                        break;
                    }
                }
                RxJavaPlugins.m17911b(th);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver) {
            this.f48439a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48441c.get() == f48438g;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48443f.cancel();
            AtomicReference atomicReference = this.f48441c;
            SwitchMapInnerObserver switchMapInnerObserver = f48438g;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 == null || switchMapInnerObserver2 == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.m17615a(switchMapInnerObserver2);
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f48443f, subscription)) {
                this.f48443f = subscription;
                this.f48439a.mo17580c(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f48442d = true;
            if (this.f48441c.get() == null) {
                AtomicThrowable atomicThrowable = this.f48440b;
                atomicThrowable.getClass();
                Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
                if (thM17888b == null) {
                    this.f48439a.onComplete();
                } else {
                    this.f48439a.onError(thM17888b);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f48440b;
            atomicThrowable.getClass();
            if (!ExceptionHelper.m17887a(atomicThrowable, th)) {
                RxJavaPlugins.m17911b(th);
                return;
            }
            AtomicReference atomicReference = this.f48441c;
            SwitchMapInnerObserver switchMapInnerObserver = f48438g;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 != null && switchMapInnerObserver2 != switchMapInnerObserver) {
                DisposableHelper.m17615a(switchMapInnerObserver2);
            }
            Throwable thM17888b = ExceptionHelper.m17888b(atomicThrowable);
            if (thM17888b != ExceptionHelper.f49276a) {
                this.f48439a.onError(thM17888b);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48443f.cancel();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.Completable
    /* JADX INFO: renamed from: b */
    public final void mo17579b(CompletableObserver completableObserver) {
        new SwitchMapCompletableObserver(completableObserver);
        throw null;
    }
}
