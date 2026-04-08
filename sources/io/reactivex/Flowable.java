package io.reactivex;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Flowable<T> implements Publisher<T> {

    /* JADX INFO: renamed from: a */
    public static final int f47532a = Math.max(1, Integer.getInteger("rx2.buffer-size", UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).intValue());

    /* JADX INFO: renamed from: a */
    public static Flowable m17581a(Publisher publisher) {
        if (publisher instanceof Flowable) {
            return (Flowable) publisher;
        }
        ObjectHelper.m17628b(publisher, "publisher is null");
        return new FlowableFromPublisher(publisher);
    }

    /* JADX INFO: renamed from: b */
    public final void m17582b(FlowableSubscriber flowableSubscriber) {
        ObjectHelper.m17628b(flowableSubscriber, "s is null");
        try {
            mo17583c(flowableSubscriber);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo17583c(Subscriber subscriber);

    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        if (subscriber instanceof FlowableSubscriber) {
            m17582b((FlowableSubscriber) subscriber);
        } else {
            ObjectHelper.m17628b(subscriber, "s is null");
            m17582b(new StrictSubscriber(subscriber));
        }
    }
}
