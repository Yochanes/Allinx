package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PublishSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: c */
    public static final PublishDisposable[] f51322c = new PublishDisposable[0];

    /* JADX INFO: renamed from: d */
    public static final PublishDisposable[] f51323d = new PublishDisposable[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f51324a = new AtomicReference(f51323d);

    /* JADX INFO: renamed from: b */
    public Throwable f51325b;

    /* JADX INFO: compiled from: Proguard */
    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f51326a;

        /* JADX INFO: renamed from: b */
        public final PublishSubject f51327b;

        public PublishDisposable(Observer observer, PublishSubject publishSubject) {
            this.f51326a = observer;
            this.f51327b = publishSubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return get();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.f51327b.m18283j(this);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        if (this.f51324a.get() == f51322c) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.mo12365c(publishDisposable);
        while (true) {
            AtomicReference atomicReference = this.f51324a;
            PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == f51322c) {
                Throwable th = this.f51325b;
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
                m18283j(publishDisposable);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m18283j(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.f51324a;
            PublishDisposable[] publishDisposableArr2 = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr2 == f51322c || publishDisposableArr2 == (publishDisposableArr = f51323d)) {
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

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        AtomicReference atomicReference = this.f51324a;
        Object obj = atomicReference.get();
        Object obj2 = f51322c;
        if (obj == obj2) {
            return;
        }
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (!publishDisposable.get()) {
                publishDisposable.f51326a.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.m18248c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.f51324a;
        Object obj = atomicReference.get();
        Object obj2 = f51322c;
        if (obj == obj2) {
            RxJavaPlugins.m18275b(th);
            return;
        }
        this.f51325b = th;
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (publishDisposable.get()) {
                RxJavaPlugins.m18275b(th);
            } else {
                publishDisposable.f51326a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m18248c(obj, "onNext called with a null value.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f51324a.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.f51326a.onNext(obj);
            }
        }
    }
}
