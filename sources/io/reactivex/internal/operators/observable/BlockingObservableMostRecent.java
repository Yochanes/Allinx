package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObservableMostRecent<T> implements Iterable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MostRecentObserver<T> extends DefaultObserver<T> {

        /* JADX INFO: renamed from: b */
        public volatile Object f48534b;

        /* JADX INFO: compiled from: Proguard */
        public final class Iterator implements java.util.Iterator<T> {

            /* JADX INFO: renamed from: a */
            public Object f48535a;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                try {
                    if (this.f48535a == null) {
                        throw null;
                    }
                    if (NotificationLite.m17902h(this.f48535a)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.m17903i(this.f48535a)) {
                        throw ExceptionHelper.m17889c(NotificationLite.m17901f(this.f48535a));
                    }
                    return this.f48535a;
                } finally {
                    this.f48535a = null;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f48534b = NotificationLite.f49279a;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48534b = NotificationLite.m17900e(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            this.f48534b = obj;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }
}
