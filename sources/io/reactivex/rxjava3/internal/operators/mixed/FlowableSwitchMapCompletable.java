package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class SwitchMapCompletableObserver<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: g */
        public static final SwitchMapInnerObserver f50318g = new SwitchMapInnerObserver(null);

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f50319a;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f50320b = new AtomicThrowable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f50321c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public volatile boolean f50322d;

        /* JADX INFO: renamed from: f */
        public Subscription f50323f;

        /* JADX INFO: compiled from: Proguard */
        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* JADX INFO: renamed from: a */
            public final SwitchMapCompletableObserver f50324a;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver switchMapCompletableObserver) {
                this.f50324a = switchMapCompletableObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            /* JADX INFO: renamed from: c */
            public final void mo12363c(Disposable disposable) {
                DisposableHelper.m17955e(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.f50324a;
                AtomicReference atomicReference = switchMapCompletableObserver.f50321c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        return;
                    }
                }
                if (switchMapCompletableObserver.f50322d) {
                    switchMapCompletableObserver.f50320b.m18233c(switchMapCompletableObserver.f50319a);
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                SwitchMapCompletableObserver switchMapCompletableObserver = this.f50324a;
                AtomicReference atomicReference = switchMapCompletableObserver.f50321c;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.m18275b(th);
                        return;
                    }
                }
                AtomicThrowable atomicThrowable = switchMapCompletableObserver.f50320b;
                if (atomicThrowable.m18231a(th)) {
                    switchMapCompletableObserver.f50323f.cancel();
                    switchMapCompletableObserver.m18120a();
                    atomicThrowable.m18233c(switchMapCompletableObserver.f50319a);
                }
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver) {
            this.f50319a = completableObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m18120a() {
            AtomicReference atomicReference = this.f50321c;
            SwitchMapInnerObserver switchMapInnerObserver = f50318g;
            SwitchMapInnerObserver switchMapInnerObserver2 = (SwitchMapInnerObserver) atomicReference.getAndSet(switchMapInnerObserver);
            if (switchMapInnerObserver2 == null || switchMapInnerObserver2 == switchMapInnerObserver) {
                return;
            }
            DisposableHelper.m17952a(switchMapInnerObserver2);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50321c.get() == f50318g;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50323f.cancel();
            m18120a();
            this.f50320b.m18232b();
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m18227h(this.f50323f, subscription)) {
                this.f50323f = subscription;
                this.f50319a.mo12363c(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f50322d = true;
            if (this.f50321c.get() == null) {
                this.f50320b.m18233c(this.f50319a);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f50320b;
            if (atomicThrowable.m18231a(th)) {
                m18120a();
                atomicThrowable.m18233c(this.f50319a);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50323f.cancel();
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
