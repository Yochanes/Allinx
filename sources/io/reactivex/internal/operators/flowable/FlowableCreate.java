package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableCreate<T> extends Flowable<T> {

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59561 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47728a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f47728a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47728a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47728a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47728a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* JADX INFO: renamed from: a */
        public final void mo17660a() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        /* JADX INFO: renamed from: a */
        public final void mo17660a() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MissingEmitter<T> extends BaseEmitter<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SerializedEmitter<T> extends AtomicInteger implements FlowableEmitter<T> {
        @Override // java.util.concurrent.atomic.AtomicInteger
        public final String toString() {
            throw null;
        }
    }

    @Override // io.reactivex.Flowable
    /* JADX INFO: renamed from: c */
    public final void mo17583c(Subscriber subscriber) {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class BaseEmitter<T> extends AtomicLong implements FlowableEmitter<T>, Subscription {
        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.m17873h(j)) {
                BackpressureHelper.m17878a(this, j);
                mo17660a();
            }
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return getClass().getSimpleName() + "{" + super.toString() + "}";
        }

        /* JADX INFO: renamed from: a */
        public void mo17660a() {
        }
    }
}
