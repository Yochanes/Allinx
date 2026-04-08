package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableFromIterable<T> extends Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class FromIterableDisposable<T> extends BasicQueueDisposable<T> {

        /* JADX INFO: renamed from: a */
        public final Observer f48701a;

        /* JADX INFO: renamed from: b */
        public final Iterator f48702b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f48703c;

        /* JADX INFO: renamed from: d */
        public boolean f48704d;

        /* JADX INFO: renamed from: f */
        public boolean f48705f;

        /* JADX INFO: renamed from: g */
        public boolean f48706g;

        public FromIterableDisposable(Observer observer, Iterator it) {
            this.f48701a = observer;
            this.f48702b = it;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f48705f = true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48703c;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48703c = true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* JADX INFO: renamed from: e */
        public final int mo17626e(int i) {
            this.f48704d = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f48705f;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (this.f48705f) {
                return null;
            }
            boolean z2 = this.f48706g;
            Iterator it = this.f48702b;
            if (!z2) {
                this.f48706g = true;
            } else if (!it.hasNext()) {
                this.f48705f = true;
                return null;
            }
            Object next = it.next();
            ObjectHelper.m17628b(next, "The iterator returned a null value");
            return next;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            EmptyDisposable.m17624f(th, observer);
        }
    }
}
