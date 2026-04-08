package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.processors.FlowableProcessor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: a */
        public final FlowableSubscriber f47985a;

        /* JADX INFO: renamed from: b */
        public Subscription f47986b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f47987c;

        /* JADX INFO: renamed from: d */
        public Throwable f47988d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f47989f;

        /* JADX INFO: renamed from: g */
        public final AtomicLong f47990g = new AtomicLong();

        /* JADX INFO: renamed from: i */
        public final AtomicReference f47991i = new AtomicReference();

        public BackpressureLatestSubscriber(FlowableSubscriber flowableSubscriber) {
            this.f47985a = flowableSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m17708a(boolean z2, boolean z3, Subscriber subscriber, AtomicReference atomicReference) {
            if (this.f47989f) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z2) {
                return false;
            }
            Throwable th = this.f47988d;
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
        
            r9 = r13.f47987c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r2.get() != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (m17708a(r9, r10, r0, r2) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r7 == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.m17882e(r1, r7);
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
        public final void m17709b() {
            if (getAndIncrement() != 0) {
                return;
            }
            FlowableSubscriber flowableSubscriber = this.f47985a;
            AtomicLong atomicLong = this.f47990g;
            AtomicReference atomicReference = this.f47991i;
            int iAddAndGet = 1;
            do {
                long j = 0;
                while (true) {
                    boolean z2 = false;
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z3 = this.f47987c;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z4 = andSet == null;
                    if (m17708a(z3, z4, flowableSubscriber, atomicReference)) {
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
            if (this.f47989f) {
                return;
            }
            this.f47989f = true;
            this.f47986b.cancel();
            if (getAndIncrement() == 0) {
                this.f47991i.lazySet(null);
            }
        }

        @Override // org.reactivestreams.Subscriber
        /* JADX INFO: renamed from: j */
        public final void mo12367j(Subscription subscription) {
            if (SubscriptionHelper.m17874i(this.f47986b, subscription)) {
                this.f47986b = subscription;
                this.f47985a.mo12367j(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47987c = true;
            m17709b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47988d = th;
            this.f47987c = true;
            m17709b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47991i.lazySet(obj);
            m17709b();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this.f47990g, j);
                m17709b();
            }
        }
    }

    public FlowableOnBackpressureLatest(FlowableProcessor flowableProcessor) {
        super(flowableProcessor);
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        this.f47628b.m17582b(new BackpressureLatestSubscriber((FlowableSubscriber) subscriber));
    }
}
