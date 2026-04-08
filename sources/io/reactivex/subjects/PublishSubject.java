package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PublishSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: c */
    public static final PublishDisposable[] f51370c = new PublishDisposable[0];

    /* JADX INFO: renamed from: d */
    public static final PublishDisposable[] f51371d = new PublishDisposable[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f51372a = new AtomicReference(f51371d);

    /* JADX INFO: renamed from: b */
    public Throwable f51373b;

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f51374a;

        /* JADX INFO: renamed from: b */
        public final PublishSubject f51375b;

        public PublishDisposable(Observer observer, PublishSubject publishSubject) {
            this.f51374a = observer;
            this.f51375b = publishSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f51375b.m18289f(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.mo17593c(publishDisposable);
        while (true) {
            AtomicReference atomicReference = this.f51372a;
            PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == f51370c) {
                Throwable th = this.f51373b;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            int length = publishDisposableArr.length;
            PublishDisposable[] publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
            while (!atomicReference.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                if (atomicReference.get() != publishDisposableArr) {
                    break;
                }
            }
            if (publishDisposable.get()) {
                m18289f(publishDisposable);
                return;
            }
            return;
        }
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        if (this.f51372a.get() == f51370c) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m18289f(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.f51372a;
            PublishDisposable[] publishDisposableArr2 = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr2 == f51370c || publishDisposableArr2 == (publishDisposableArr = f51371d)) {
                return;
            }
            int length = publishDisposableArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr2[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishDisposableArr = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr2, 0, publishDisposableArr, 0, i);
                System.arraycopy(publishDisposableArr2, i + 1, publishDisposableArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(publishDisposableArr2, publishDisposableArr)) {
                if (atomicReference.get() != publishDisposableArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        AtomicReference atomicReference = this.f51372a;
        Object obj = atomicReference.get();
        Object obj2 = f51370c;
        if (obj == obj2) {
            return;
        }
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (!publishDisposable.get()) {
                publishDisposable.f51374a.onComplete();
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f51372a;
        Object obj = atomicReference.get();
        Object obj2 = f51370c;
        if (obj == obj2) {
            RxJavaPlugins.m17911b(th);
            return;
        }
        this.f51373b = th;
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (publishDisposable.get()) {
                RxJavaPlugins.m17911b(th);
            } else {
                publishDisposable.f51374a.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f51372a.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.f51374a.onNext(obj);
            }
        }
    }
}
