package io.reactivex.internal.subscriptions;

import androidx.compose.animation.AbstractC0455a;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SubscriptionArbiter extends AtomicInteger implements Subscription {

    /* JADX INFO: renamed from: a */
    public Subscription f49259a;

    /* JADX INFO: renamed from: b */
    public long f49260b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f49261c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public final AtomicLong f49262d = new AtomicLong();

    /* JADX INFO: renamed from: f */
    public final AtomicLong f49263f = new AtomicLong();

    /* JADX INFO: renamed from: g */
    public volatile boolean f49264g;

    /* JADX INFO: renamed from: i */
    public boolean f49265i;

    /* JADX INFO: renamed from: c */
    public final void m17864c() {
        int iAddAndGet = 1;
        long jM17880c = 0;
        Subscription subscription = null;
        do {
            Subscription subscription2 = (Subscription) this.f49261c.get();
            if (subscription2 != null) {
                subscription2 = (Subscription) this.f49261c.getAndSet(null);
            }
            long andSet = this.f49262d.get();
            if (andSet != 0) {
                andSet = this.f49262d.getAndSet(0L);
            }
            long andSet2 = this.f49263f.get();
            if (andSet2 != 0) {
                andSet2 = this.f49263f.getAndSet(0L);
            }
            Subscription subscription3 = this.f49259a;
            if (this.f49264g) {
                if (subscription3 != null) {
                    subscription3.cancel();
                    this.f49259a = null;
                }
                if (subscription2 != null) {
                    subscription2.cancel();
                }
            } else {
                long jM17880c2 = this.f49260b;
                if (jM17880c2 != Long.MAX_VALUE) {
                    jM17880c2 = BackpressureHelper.m17880c(jM17880c2, andSet);
                    if (jM17880c2 != Long.MAX_VALUE) {
                        jM17880c2 -= andSet2;
                        if (jM17880c2 < 0) {
                            RxJavaPlugins.m17911b(new ProtocolViolationException(AbstractC0455a.m2238m(jM17880c2, "More produced than requested: ")));
                            jM17880c2 = 0;
                        }
                    }
                    this.f49260b = jM17880c2;
                }
                if (subscription2 != null) {
                    if (subscription3 != null) {
                        subscription3.cancel();
                    }
                    this.f49259a = subscription2;
                    if (jM17880c2 != 0) {
                        jM17880c = BackpressureHelper.m17880c(jM17880c, jM17880c2);
                        subscription = subscription2;
                    }
                } else if (subscription3 != null && andSet != 0) {
                    jM17880c = BackpressureHelper.m17880c(jM17880c, andSet);
                    subscription = subscription3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jM17880c != 0) {
            subscription.request(jM17880c);
        }
    }

    public void cancel() {
        if (this.f49264g) {
            return;
        }
        this.f49264g = true;
        if (getAndIncrement() != 0) {
            return;
        }
        m17864c();
    }

    /* JADX INFO: renamed from: d */
    public final void m17865d(long j) {
        if (this.f49265i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.m17878a(this.f49263f, j);
            if (getAndIncrement() != 0) {
                return;
            }
            m17864c();
            return;
        }
        long j2 = this.f49260b;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                RxJavaPlugins.m17911b(new ProtocolViolationException(AbstractC0455a.m2238m(j3, "More produced than requested: ")));
                j3 = 0;
            }
            this.f49260b = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m17864c();
    }

    /* JADX INFO: renamed from: e */
    public final void m17866e(Subscription subscription) {
        if (this.f49264g) {
            subscription.cancel();
            return;
        }
        ObjectHelper.m17628b(subscription, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription subscription2 = (Subscription) this.f49261c.getAndSet(subscription);
            if (subscription2 != null) {
                subscription2.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            m17864c();
            return;
        }
        Subscription subscription3 = this.f49259a;
        if (subscription3 != null) {
            subscription3.cancel();
        }
        this.f49259a = subscription;
        long j = this.f49260b;
        if (decrementAndGet() != 0) {
            m17864c();
        }
        if (j != 0) {
            subscription.request(j);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo12367j(Subscription subscription) {
        m17866e(subscription);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (!SubscriptionHelper.m17873h(j) || this.f49265i) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.m17878a(this.f49262d, j);
            if (getAndIncrement() != 0) {
                return;
            }
            m17864c();
            return;
        }
        long j2 = this.f49260b;
        if (j2 != Long.MAX_VALUE) {
            long jM17880c = BackpressureHelper.m17880c(j2, j);
            this.f49260b = jM17880c;
            if (jM17880c == Long.MAX_VALUE) {
                this.f49265i = true;
            }
        }
        Subscription subscription = this.f49259a;
        if (decrementAndGet() != 0) {
            m17864c();
        }
        if (subscription != null) {
            subscription.request(j);
        }
    }
}
