package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.jdk8.FlowableFromCompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompletableFromCompletionStage<T> extends Completable {

    /* JADX INFO: compiled from: Proguard */
    public static final class CompletionStageHandler<T> implements Disposable, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f49396a;

        /* JADX INFO: renamed from: b */
        public final FlowableFromCompletionStage.BiConsumerAtomicReference f49397b;

        public CompletionStageHandler(CompletableObserver completableObserver, FlowableFromCompletionStage.BiConsumerAtomicReference biConsumerAtomicReference) {
            this.f49396a = completableObserver;
            this.f49397b = biConsumerAtomicReference;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            CompletableObserver completableObserver = this.f49396a;
            if (th2 != null) {
                completableObserver.onError(th2);
            } else {
                completableObserver.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49397b.get() == null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49397b.set(null);
        }
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        FlowableFromCompletionStage.BiConsumerAtomicReference biConsumerAtomicReference = new FlowableFromCompletionStage.BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(completableObserver, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        completableObserver.mo12363c(completionStageHandler);
        throw null;
    }
}
