package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractBackpressureThrottlingSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

    /* JADX INFO: renamed from: a */
    public final FlowableSubscriber f49549a;

    /* JADX INFO: renamed from: b */
    public Subscription f49550b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f49551c;

    /* JADX INFO: renamed from: d */
    public Throwable f49552d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f49553f;

    /* JADX INFO: renamed from: g */
    public final AtomicLong f49554g = new AtomicLong();

    /* JADX INFO: renamed from: i */
    public final AtomicReference f49555i = new AtomicReference();

    public AbstractBackpressureThrottlingSubscriber(FlowableSubscriber flowableSubscriber) {
        this.f49549a = flowableSubscriber;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17986a(boolean z2, boolean z3, Subscriber subscriber, AtomicReference atomicReference) {
        if (this.f49553f) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        Throwable th = this.f49552d;
        if (th != null) {
            atomicReference.lazySet(null);
            subscriber.onError(th);
            return true;
        }
        if (!z3) {
            return false;
        }
        subscriber.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 != r1.get()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r9 = r13.f49551c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2.get() != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (m17986a(r9, r10, r0, r2) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        io.reactivex.rxjava3.internal.util.BackpressureHelper.m18241e(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4 = addAndGet(-r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17987b() {
        if (getAndIncrement() != 0) {
            return;
        }
        FlowableSubscriber flowableSubscriber = this.f49549a;
        AtomicLong atomicLong = this.f49554g;
        AtomicReference atomicReference = this.f49555i;
        int iAddAndGet = 1;
        do {
            long j = 0;
            while (true) {
                boolean z2 = false;
                if (j == atomicLong.get()) {
                    break;
                }
                boolean z3 = this.f49551c;
                Object andSet = atomicReference.getAndSet(null);
                boolean z4 = andSet == null;
                if (m17986a(z3, z4, flowableSubscriber, atomicReference)) {
                    return;
                }
                if (z4) {
                    break;
                }
                flowableSubscriber.onNext(andSet);
                j++;
            }
        } while (iAddAndGet != 0);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f49553f) {
            return;
        }
        this.f49553f = true;
        this.f49550b.cancel();
        if (getAndIncrement() == 0) {
            this.f49555i.lazySet(null);
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (SubscriptionHelper.m18227h(this.f49550b, subscription)) {
            this.f49550b = subscription;
            this.f49549a.mo12367j(this);
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f49551c = true;
        m17987b();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f49552d = th;
        this.f49551c = true;
        m17987b();
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (SubscriptionHelper.m18226f(j)) {
            BackpressureHelper.m18237a(this.f49554g, j);
            m17987b();
        }
    }
}
