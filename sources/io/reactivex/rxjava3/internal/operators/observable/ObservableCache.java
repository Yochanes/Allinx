package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableCache<T> extends AbstractObservableWithUpstream<T, T> implements Observer<T> {

    /* JADX INFO: renamed from: b */
    public Node f50460b;

    /* JADX INFO: renamed from: c */
    public int f50461c;

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50462a;

        /* JADX INFO: renamed from: b */
        public final ObservableCache f50463b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f50464c;

        public CacheDisposable(Observer observer, ObservableCache observableCache) {
            this.f50462a = observer;
            this.f50463b = observableCache;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50464c;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50464c) {
                return;
            }
            this.f50464c = true;
            this.f50463b.getClass();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Node<T> {

        /* JADX INFO: renamed from: a */
        public final Object[] f50465a;

        public Node(int i) {
            this.f50465a = new Object[i];
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        observer.mo12365c(new CacheDisposable(observer, this));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        int i = this.f50461c;
        if (i == 0) {
            Node node = new Node(i);
            node.f50465a[0] = obj;
            this.f50461c = 1;
            this.f50460b = node;
        } else {
            this.f50460b.f50465a[i] = obj;
            this.f50461c = i + 1;
        }
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
    }
}
