package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromCompletionStage<T> extends Observable<T> {

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
    public static final class CompletionStageHandler<T> extends DeferredScalarDisposable<T> implements BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: c */
        public final BiConsumerAtomicReference f49446c;

        public CompletionStageHandler(Observer observer, BiConsumerAtomicReference biConsumerAtomicReference) {
            super(observer);
            this.f49446c = biConsumerAtomicReference;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th) {
            Throwable th2 = th;
            Observer observer = this.f49479a;
            if (th2 != null) {
                observer.onError(th2);
            } else if (obj != null) {
                m17973a(obj);
            } else {
                observer.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f49446c.set(null);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        BiConsumerAtomicReference biConsumerAtomicReference = new BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(observer, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        observer.mo12365c(completionStageHandler);
        throw null;
    }
}
