package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.jdk8.FlowableFromCompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFromCompletionStage<T> extends Single<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletionStageHandler<T> implements Disposable, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f49463a;

        /* JADX INFO: renamed from: b */
        public final FlowableFromCompletionStage.BiConsumerAtomicReference f49464b;

        public CompletionStageHandler(SingleObserver singleObserver, FlowableFromCompletionStage.BiConsumerAtomicReference biConsumerAtomicReference) {
            this.f49463a = singleObserver;
            this.f49464b = biConsumerAtomicReference;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            SingleObserver singleObserver = this.f49463a;
            if (th2 != null) {
                singleObserver.onError(th2);
            } else if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49464b.get() == null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49464b.set(null);
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        FlowableFromCompletionStage.BiConsumerAtomicReference biConsumerAtomicReference = new FlowableFromCompletionStage.BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(singleObserver, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        singleObserver.mo12366c(completionStageHandler);
        throw null;
    }
}
