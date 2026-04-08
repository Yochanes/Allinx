package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observables.GroupedObservable;
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
        public static final Object f48709f = new Object();

        /* JADX INFO: renamed from: a */
        public final Observer f48710a;

        /* JADX INFO: renamed from: c */
        public Disposable f48712c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f48713d = new AtomicBoolean();

        /* JADX INFO: renamed from: b */
        public final ConcurrentHashMap f48711b = new ConcurrentHashMap();

        public GroupByObserver(Observer observer) {
            this.f48710a = observer;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48712c, disposable)) {
                this.f48712c = disposable;
                this.f48710a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48713d.get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f48713d.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f48712c.dispose();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            ArrayList arrayList = new ArrayList(this.f48711b.values());
            this.f48711b.clear();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.f48710a.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.f48711b.values());
            this.f48711b.clear();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                ((GroupedUnicast) it.next()).getClass();
                throw null;
            }
            this.f48710a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48712c.dispose();
                onError(th);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class GroupedUnicast<K, T> extends GroupedObservable<K, T> {
        @Override // io.reactivex.Observable
        /* JADX INFO: renamed from: b */
        public final void mo17592b(Observer observer) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class State<T, K> extends AtomicInteger implements Disposable, ObservableSource<T> {

        /* JADX INFO: renamed from: a */
        public volatile boolean f48714a;

        /* JADX INFO: renamed from: b */
        public Throwable f48715b;

        @Override // io.reactivex.ObservableSource
        /* JADX INFO: renamed from: a */
        public final void mo17591a(Observer observer) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public final void m17795b() {
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            throw null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new GroupByObserver(observer);
        throw null;
    }
}
