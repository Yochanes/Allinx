package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingObservableMostRecent<T> implements Iterable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MostRecentObserver<T> extends DefaultObserver<T> {

        /* JADX INFO: renamed from: b */
        public volatile Object f50401b;

        /* JADX INFO: compiled from: Proguard */
        public final class MostRecentIterator implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public Object f50402a;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                try {
                    if (this.f50402a == null) {
                        throw null;
                    }
                    if (NotificationLite.m18264h(this.f50402a)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.m18265i(this.f50402a)) {
                        throw ExceptionHelper.m18251f(NotificationLite.m18263f(this.f50402a));
                    }
                    return this.f50402a;
                } finally {
                    this.f50402a = null;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f50401b = NotificationLite.f51228a;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50401b = NotificationLite.m18262e(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f50401b = obj;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }
}
