package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observables.GroupedObservable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableGroupBy<T, K, V> extends AbstractObservableWithUpstream<T, GroupedObservable<K, V>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: f */
        public static final Object f50637f = new Object();

        /* JADX INFO: renamed from: a */
        public final Observer f50638a;

        /* JADX INFO: renamed from: c */
        public Disposable f50640c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f50641d = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final ConcurrentHashMap f50639b = new ConcurrentHashMap();

        public GroupByObserver(Observer observer) {
            this.f50638a = observer;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50640c, disposable)) {
                this.f50640c = disposable;
                this.f50638a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50641d.get();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f50641d.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f50640c.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            ConcurrentHashMap concurrentHashMap = this.f50639b;
            ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.f50638a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.f50639b.values());
            this.f50639b.clear();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.f50638a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50640c.dispose();
                onError(th);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class GroupedUnicast<K, T> extends GroupedObservable<K, T> {
        @Override // io.reactivex.rxjava3.core.Observable
        /* JADX INFO: renamed from: h */
        public final void mo12361h(Observer observer) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class State<T, K> extends AtomicInteger implements Disposable, ObservableSource<T> {

        /* JADX INFO: renamed from: a */
        public volatile boolean f50642a;

        /* JADX INFO: renamed from: b */
        public Throwable f50643b;

        @Override // io.reactivex.rxjava3.core.ObservableSource
        /* JADX INFO: renamed from: a */
        public final void mo17931a(Observer observer) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public final void m18149b() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new GroupByObserver(observer));
    }
}
