package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MostRecentSubscriber<T> extends DefaultSubscriber<T> {

        /* JADX INFO: renamed from: b */
        public volatile Object f49567b;

        /* JADX INFO: compiled from: Proguard */
        public final class Iterator implements java.util.Iterator<T> {

            /* JADX INFO: renamed from: a */
            public Object f49568a;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                try {
                    if (this.f49568a == null) {
                        throw null;
                    }
                    if (NotificationLite.m18264h(this.f49568a)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.m18265i(this.f49568a)) {
                        throw ExceptionHelper.m18251f(NotificationLite.m18263f(this.f49568a));
                    }
                    return this.f49568a;
                } finally {
                    this.f49568a = null;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f49567b = NotificationLite.f51228a;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            this.f49567b = NotificationLite.m18262e(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(Object obj) {
            this.f49567b = obj;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }
}
