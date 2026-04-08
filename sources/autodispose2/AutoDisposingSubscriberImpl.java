package autodispose2;

import androidx.compose.animation.AbstractC0455a;
import autodispose2.observers.AutoDisposingSubscriber;
import io.reactivex.rxjava3.observers.DisposableCompletableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposingSubscriberImpl<T> extends AtomicInteger implements AutoDisposingSubscriber<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f33220a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f33221b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicThrowable f33222c = new AtomicThrowable();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f33223d = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicLong f33224f = new AtomicLong();

    /* JADX INFO: renamed from: g */
    public final Subscriber f33225g;

    /* JADX INFO: renamed from: autodispose2.AutoDisposingSubscriberImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C23501 extends DisposableCompletableObserver {
        public C23501() {
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            Subscription subscription;
            AutoDisposingSubscriberImpl autoDisposingSubscriberImpl = AutoDisposingSubscriberImpl.this;
            autoDisposingSubscriberImpl.f33221b.lazySet(AutoDisposableHelper.f33195a);
            AtomicReference atomicReference = autoDisposingSubscriberImpl.f33220a;
            Subscription subscription2 = (Subscription) atomicReference.get();
            AutoSubscriptionHelper autoSubscriptionHelper = AutoSubscriptionHelper.f33227a;
            if (subscription2 == autoSubscriptionHelper || (subscription = (Subscription) atomicReference.getAndSet(autoSubscriptionHelper)) == autoSubscriptionHelper || subscription == null) {
                return;
            }
            subscription.cancel();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            AutoDisposingSubscriberImpl autoDisposingSubscriberImpl = AutoDisposingSubscriberImpl.this;
            autoDisposingSubscriberImpl.f33221b.lazySet(AutoDisposableHelper.f33195a);
            autoDisposingSubscriberImpl.onError(th);
        }
    }

    public AutoDisposingSubscriberImpl(Subscriber subscriber) {
        this.f33225g = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        Subscription subscription;
        AutoDisposableHelper.m12352a(this.f33221b);
        AtomicReference atomicReference = this.f33220a;
        Subscription subscription2 = (Subscription) atomicReference.get();
        AutoSubscriptionHelper autoSubscriptionHelper = AutoSubscriptionHelper.f33227a;
        if (subscription2 == autoSubscriptionHelper || (subscription = (Subscription) atomicReference.getAndSet(autoSubscriptionHelper)) == autoSubscriptionHelper || subscription == null) {
            return;
        }
        subscription.cancel();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f33220a.get() == AutoSubscriptionHelper.f33227a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (AutoDisposeEndConsumerHelper.m12358a(this.f33221b, new C23501(), AutoDisposingSubscriberImpl.class)) {
            this.f33225g.mo12367j(this);
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (mo12353d()) {
            return;
        }
        this.f33220a.lazySet(AutoSubscriptionHelper.f33227a);
        AutoDisposableHelper.m12352a(this.f33221b);
        if (getAndIncrement() == 0) {
            Throwable thM12351b = this.f33222c.m12351b();
            Subscriber subscriber = this.f33225g;
            if (thM12351b != null) {
                subscriber.onError(thM12351b);
            } else {
                subscriber.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (mo12353d()) {
            return;
        }
        this.f33220a.lazySet(AutoSubscriptionHelper.f33227a);
        AutoDisposableHelper.m12352a(this.f33221b);
        AtomicThrowable atomicThrowable = this.f33222c;
        if (!atomicThrowable.m12350a(th)) {
            RxJavaPlugins.m18275b(th);
        } else if (getAndIncrement() == 0) {
            this.f33225g.onError(atomicThrowable.m12351b());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (!mo12353d() && get() == 0 && compareAndSet(0, 1)) {
            Subscriber subscriber = this.f33225g;
            subscriber.onNext(obj);
            if (decrementAndGet() != 0) {
                Throwable thM12351b = this.f33222c.m12351b();
                if (thM12351b != null) {
                    subscriber.onError(thM12351b);
                } else {
                    subscriber.onComplete();
                }
                this.f33220a.lazySet(AutoSubscriptionHelper.f33227a);
                AutoDisposableHelper.m12352a(this.f33221b);
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        long j2;
        long j3;
        AtomicReference atomicReference = this.f33223d;
        AtomicLong atomicLong = this.f33224f;
        Subscription subscription = (Subscription) atomicReference.get();
        if (subscription != null) {
            subscription.request(j);
            return;
        }
        if (j <= 0) {
            RxJavaPlugins.m18275b(new IllegalArgumentException(AbstractC0455a.m2238m(j, "n > 0 required but it was ")));
            return;
        }
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                break;
            } else {
                j3 = j2 + j;
            }
        } while (!atomicLong.compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
        Subscription subscription2 = (Subscription) atomicReference.get();
        if (subscription2 != null) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                subscription2.request(andSet);
            }
        }
    }
}
