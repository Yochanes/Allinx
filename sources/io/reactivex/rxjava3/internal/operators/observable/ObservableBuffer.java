package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: renamed from: b */
    public final int f50429b;

    /* JADX INFO: renamed from: c */
    public final int f50430c;

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferExactObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50431a;

        /* JADX INFO: renamed from: b */
        public final int f50432b;

        /* JADX INFO: renamed from: c */
        public Collection f50433c;

        /* JADX INFO: renamed from: d */
        public int f50434d;

        /* JADX INFO: renamed from: f */
        public Disposable f50435f;

        public BufferExactObserver(Observer observer, int i) {
            this.f50431a = observer;
            this.f50432b = i;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m18131a() {
            try {
                this.f50433c = new ArrayList();
                return true;
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50433c = null;
                Disposable disposable = this.f50435f;
                Observer observer = this.f50431a;
                if (disposable == null) {
                    EmptyDisposable.m17960f(th, observer);
                    return false;
                }
                disposable.dispose();
                observer.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50435f, disposable)) {
                this.f50435f = disposable;
                this.f50431a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50435f.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50435f.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Collection collection = this.f50433c;
            if (collection != null) {
                this.f50433c = null;
                boolean zIsEmpty = collection.isEmpty();
                Observer observer = this.f50431a;
                if (!zIsEmpty) {
                    observer.onNext(collection);
                }
                observer.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50433c = null;
            this.f50431a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            Collection collection = this.f50433c;
            if (collection != null) {
                collection.add(obj);
                int i = this.f50434d + 1;
                this.f50434d = i;
                if (i >= this.f50432b) {
                    this.f50431a.onNext(collection);
                    this.f50434d = 0;
                    m18131a();
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50436a;

        /* JADX INFO: renamed from: b */
        public final int f50437b;

        /* JADX INFO: renamed from: c */
        public final int f50438c;

        /* JADX INFO: renamed from: d */
        public final ArrayListSupplier f50439d;

        /* JADX INFO: renamed from: f */
        public Disposable f50440f;

        /* JADX INFO: renamed from: g */
        public final ArrayDeque f50441g;

        /* JADX INFO: renamed from: i */
        public long f50442i;

        public BufferSkipObserver(Observer observer, int i, int i2) {
            ArrayListSupplier arrayListSupplier = ArrayListSupplier.f51219a;
            this.f50436a = observer;
            this.f50437b = i;
            this.f50438c = i2;
            this.f50439d = arrayListSupplier;
            this.f50441g = new ArrayDeque();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50440f, disposable)) {
                this.f50440f = disposable;
                this.f50436a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50440f.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50440f.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            while (true) {
                ArrayDeque arrayDeque = this.f50441g;
                boolean zIsEmpty = arrayDeque.isEmpty();
                Observer observer = this.f50436a;
                if (zIsEmpty) {
                    observer.onComplete();
                    return;
                }
                observer.onNext(arrayDeque.poll());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.f50441g.clear();
            this.f50436a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            long j = this.f50442i;
            this.f50442i = 1 + j;
            long j2 = j % ((long) this.f50438c);
            ArrayDeque arrayDeque = this.f50441g;
            Observer observer = this.f50436a;
            if (j2 == 0) {
                try {
                    this.f50439d.getClass();
                    ArrayList arrayList = new ArrayList();
                    Throwable th = ExceptionHelper.f51225a;
                    arrayDeque.offer(arrayList);
                } catch (Throwable th2) {
                    Exceptions.m17950a(th2);
                    arrayDeque.clear();
                    this.f50440f.dispose();
                    observer.onError(th2);
                    return;
                }
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(obj);
                if (this.f50437b <= collection.size()) {
                    it.remove();
                    observer.onNext(collection);
                }
            }
        }
    }

    public ObservableBuffer(Observable observable, int i, int i2) {
        super(observable);
        this.f50429b = i;
        this.f50430c = i2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        ObservableSource observableSource = this.f50392a;
        int i = this.f50430c;
        int i2 = this.f50429b;
        if (i != i2) {
            observableSource.mo17931a(new BufferSkipObserver(observer, i2, i));
            return;
        }
        BufferExactObserver bufferExactObserver = new BufferExactObserver(observer, i2);
        if (bufferExactObserver.m18131a()) {
            observableSource.mo17931a(bufferExactObserver);
        }
    }
}
