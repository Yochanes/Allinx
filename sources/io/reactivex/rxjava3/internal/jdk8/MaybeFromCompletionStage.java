package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.jdk8.FlowableFromCompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeFromCompletionStage<T> extends Maybe<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletionStageHandler<T> implements Disposable, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f49435a;

        /* JADX INFO: renamed from: b */
        public final FlowableFromCompletionStage.BiConsumerAtomicReference f49436b;

        public CompletionStageHandler(MaybeObserver maybeObserver, FlowableFromCompletionStage.BiConsumerAtomicReference biConsumerAtomicReference) {
            this.f49435a = maybeObserver;
            this.f49436b = biConsumerAtomicReference;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            MaybeObserver maybeObserver = this.f49435a;
            if (th2 != null) {
                maybeObserver.onError(th2);
            } else if (obj != null) {
                maybeObserver.onSuccess(obj);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49436b.get() == null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49436b.set(null);
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        FlowableFromCompletionStage.BiConsumerAtomicReference biConsumerAtomicReference = new FlowableFromCompletionStage.BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(maybeObserver, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        maybeObserver.mo12364c(completionStageHandler);
        throw null;
    }
}
