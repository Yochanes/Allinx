package io.reactivex.rxjava3.internal.subscriptions;

import androidx.compose.animation.AbstractC0455a;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SubscriptionArbiter extends AtomicInteger implements Subscription {

    /* JADX INFO: renamed from: a */
    public Subscription f51206a;

    /* JADX INFO: renamed from: b */
    public long f51207b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f51208c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicLong f51209d = new AtomicLong();

    /* JADX INFO: renamed from: f */
    public final AtomicLong f51210f = new AtomicLong();

    /* JADX INFO: renamed from: g */
    public final boolean f51211g;

    /* JADX INFO: renamed from: i */
    public volatile boolean f51212i;

    /* JADX INFO: renamed from: j */
    public boolean f51213j;

    public SubscriptionArbiter(boolean z2) {
        this.f51211g = z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m18218c() {
        int iAddAndGet = 1;
        long jM18239c = 0;
        Subscription subscription = null;
        do {
            Subscription subscription2 = (Subscription) this.f51208c.get();
            if (subscription2 != null) {
                subscription2 = (Subscription) this.f51208c.getAndSet(null);
            }
            long andSet = this.f51209d.get();
            if (andSet != 0) {
                andSet = this.f51209d.getAndSet(0L);
            }
            long andSet2 = this.f51210f.get();
            if (andSet2 != 0) {
                andSet2 = this.f51210f.getAndSet(0L);
            }
            Subscription subscription3 = this.f51206a;
            if (this.f51212i) {
                if (subscription3 != null) {
                    subscription3.cancel();
                    this.f51206a = null;
                }
                if (subscription2 != null) {
                    subscription2.cancel();
                }
            } else {
                long jM18239c2 = this.f51207b;
                if (jM18239c2 != Long.MAX_VALUE) {
                    jM18239c2 = BackpressureHelper.m18239c(jM18239c2, andSet);
                    if (jM18239c2 != Long.MAX_VALUE) {
                        jM18239c2 -= andSet2;
                        if (jM18239c2 < 0) {
                            RxJavaPlugins.m18275b(new ProtocolViolationException(AbstractC0455a.m2238m(jM18239c2, "More produced than requested: ")));
                            jM18239c2 = 0;
                        }
                    }
                    this.f51207b = jM18239c2;
                }
                if (subscription2 != null) {
                    if (subscription3 != null && this.f51211g) {
                        subscription3.cancel();
                    }
                    this.f51206a = subscription2;
                    if (jM18239c2 != 0) {
                        jM18239c = BackpressureHelper.m18239c(jM18239c, jM18239c2);
                        subscription = subscription2;
                    }
                } else if (subscription3 != null && andSet != 0) {
                    jM18239c = BackpressureHelper.m18239c(jM18239c, andSet);
                    subscription = subscription3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jM18239c != 0) {
            subscription.request(jM18239c);
        }
    }

    public void cancel() {
        if (this.f51212i) {
            return;
        }
        this.f51212i = true;
        if (getAndIncrement() != 0) {
            return;
        }
        m18218c();
    }

    /* JADX INFO: renamed from: d */
    public final void m18219d(long j) {
        if (this.f51213j) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.m18237a(this.f51210f, j);
            if (getAndIncrement() != 0) {
                return;
            }
            m18218c();
            return;
        }
        long j2 = this.f51207b;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                RxJavaPlugins.m18275b(new ProtocolViolationException(AbstractC0455a.m2238m(j3, "More produced than requested: ")));
                j3 = 0;
            }
            this.f51207b = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m18218c();
    }

    /* JADX INFO: renamed from: e */
    public final void m18220e(Subscription subscription) {
        if (this.f51212i) {
            subscription.cancel();
            return;
        }
        Objects.requireNonNull(subscription, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription subscription2 = (Subscription) this.f51208c.getAndSet(subscription);
            if (subscription2 != null && this.f51211g) {
                subscription2.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            m18218c();
            return;
        }
        Subscription subscription3 = this.f51206a;
        if (subscription3 != null && this.f51211g) {
            subscription3.cancel();
        }
        this.f51206a = subscription;
        long j = this.f51207b;
        if (decrementAndGet() != 0) {
            m18218c();
        }
        if (j != 0) {
            subscription.request(j);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo12367j(Subscription subscription) {
        m18220e(subscription);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (!SubscriptionHelper.m18226f(j) || this.f51213j) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.m18237a(this.f51209d, j);
            if (getAndIncrement() != 0) {
                return;
            }
            m18218c();
            return;
        }
        long j2 = this.f51207b;
        if (j2 != Long.MAX_VALUE) {
            long jM18239c = BackpressureHelper.m18239c(j2, j);
            this.f51207b = jM18239c;
            if (jM18239c == Long.MAX_VALUE) {
                this.f51213j = true;
            }
        }
        Subscription subscription = this.f51206a;
        if (decrementAndGet() != 0) {
            m18218c();
        }
        if (subscription != null) {
            subscription.request(j);
        }
    }
}
