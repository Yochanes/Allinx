package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFromCompletionStage<T> extends Flowable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BiConsumerAtomicReference<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            BiConsumer<T, Throwable> biConsumer = get();
            if (biConsumer != null) {
                biConsumer.accept(obj, th2);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletionStageHandler<T> extends DeferredScalarSubscription<T> implements BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: c */
        public final BiConsumerAtomicReference f49414c;

        public CompletionStageHandler(FlowableSubscriber flowableSubscriber, BiConsumerAtomicReference biConsumerAtomicReference) {
            super(flowableSubscriber);
            this.f49414c = biConsumerAtomicReference;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            Subscriber subscriber = this.f51202a;
            if (th2 != null) {
                subscriber.onError(th2);
            } else if (obj != null) {
                m18214d(obj);
            } else {
                subscriber.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f49414c.set(null);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: b */
    public final void mo12359b(Subscriber subscriber) {
        BiConsumerAtomicReference biConsumerAtomicReference = new BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler((FlowableSubscriber) subscriber, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        subscriber.mo12367j(completionStageHandler);
        throw null;
    }
}
