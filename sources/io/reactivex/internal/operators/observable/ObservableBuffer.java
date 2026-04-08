package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferExactObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f48552a;

        /* JADX INFO: renamed from: b */
        public Collection f48553b;

        /* JADX INFO: renamed from: c */
        public int f48554c;

        /* JADX INFO: renamed from: d */
        public Disposable f48555d;

        public BufferExactObserver(Observer observer) {
            this.f48552a = observer;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m17779a() {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m17612a(th);
                this.f48553b = null;
                Disposable disposable = this.f48555d;
                Observer observer = this.f48552a;
                if (disposable == null) {
                    EmptyDisposable.m17624f(th, observer);
                    return false;
                }
                disposable.dispose();
                observer.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48555d, disposable)) {
                this.f48555d = disposable;
                this.f48552a.mo17593c(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48555d.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48555d.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Collection collection = this.f48553b;
            if (collection != null) {
                this.f48553b = null;
                boolean zIsEmpty = collection.isEmpty();
                Observer observer = this.f48552a;
                if (!zIsEmpty) {
                    observer.onNext(collection);
                }
                observer.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.f48553b = null;
            this.f48552a.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Collection collection = this.f48553b;
            if (collection != null) {
                collection.add(obj);
                int i = this.f48554c + 1;
                this.f48554c = i;
                if (i >= 0) {
                    this.f48552a.onNext(collection);
                    this.f48554c = 0;
                    m17779a();
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public Disposable f48556a;

        /* JADX INFO: renamed from: b */
        public long f48557b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48556a, disposable)) {
                this.f48556a = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48556a.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48556a.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
        
            throw null;
         */
        @Override // io.reactivex.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNext(Object obj) {
            long j = this.f48557b;
            this.f48557b = 1 + j;
            long j2 = j % ((long) 0);
            if (j2 != 0) {
                throw null;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        new BufferExactObserver(observer).m17779a();
    }
}
