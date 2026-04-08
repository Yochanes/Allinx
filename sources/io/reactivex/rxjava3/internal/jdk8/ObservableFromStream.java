package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromStream<T> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class StreamDisposable<T> implements QueueDisposable<T> {

        /* JADX INFO: renamed from: a */
        public Iterator f49447a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f49448b;

        /* JADX INFO: renamed from: c */
        public boolean f49449c;

        /* JADX INFO: renamed from: d */
        public boolean f49450d;

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f49447a = null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f49448b;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f49448b = true;
            if (this.f49450d) {
                return;
            }
            Iterator it = this.f49447a;
            while (!this.f49448b) {
                try {
                    Objects.requireNonNull(it.next(), "The Stream's Iterator.next returned a null value");
                    if (!this.f49448b) {
                        throw null;
                    }
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    throw null;
                }
            }
            this.f49447a = null;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17962e(int i) {
            this.f49450d = true;
            return 1;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            Iterator it = this.f49447a;
            if (it == null) {
                return true;
            }
            if (!this.f49449c || it.hasNext()) {
                return false;
            }
            this.f49447a = null;
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f49447a;
            if (it == null) {
                return null;
            }
            if (!this.f49449c) {
                this.f49449c = true;
            } else if (!it.hasNext()) {
                this.f49447a = null;
                return null;
            }
            Object next = this.f49447a.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        try {
            throw null;
        } finally {
            try {
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                RxJavaPlugins.m18275b(th);
            }
        }
    }
}
