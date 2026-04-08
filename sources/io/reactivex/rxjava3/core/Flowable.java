package io.reactivex.rxjava3.core;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscribers.StrictSubscriber;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Flowable<T> implements Publisher<T> {

    /* JADX INFO: renamed from: a */
    public static final int f49359a = Math.max(1, Integer.getInteger("rx3.buffer-size", UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).intValue());

    /* JADX INFO: renamed from: io.reactivex.rxjava3.core.Flowable$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59691 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f49360a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f49360a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49360a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49360a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49360a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17923a(FlowableSubscriber flowableSubscriber) {
        Objects.requireNonNull(flowableSubscriber, "subscriber is null");
        try {
            mo12359b(flowableSubscriber);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17950a(th);
            RxJavaPlugins.m18275b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo12359b(Subscriber subscriber);

    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        if (subscriber instanceof FlowableSubscriber) {
            m17923a((FlowableSubscriber) subscriber);
        } else {
            Objects.requireNonNull(subscriber, "subscriber is null");
            m17923a(new StrictSubscriber(subscriber));
        }
    }
}
