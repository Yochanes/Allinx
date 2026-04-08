package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MostRecentSubscriber<T> extends DefaultSubscriber<T> {

        /* JADX INFO: renamed from: b */
        public volatile Object f47640b;

        /* JADX INFO: compiled from: Proguard */
        public final class Iterator implements java.util.Iterator<T> {

            /* JADX INFO: renamed from: a */
            public Object f47641a;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                try {
                    if (this.f47641a == null) {
                        throw null;
                    }
                    if (NotificationLite.m17902h(this.f47641a)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.m17903i(this.f47641a)) {
                        throw ExceptionHelper.m17889c(NotificationLite.m17901f(this.f47641a));
                    }
                    return this.f47641a;
                } finally {
                    this.f47641a = null;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f47640b = NotificationLite.f49279a;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f47640b = NotificationLite.m17900e(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f47640b = obj;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }
}
