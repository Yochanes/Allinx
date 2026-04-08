package autodispose2;

import autodispose2.observers.AutoDisposingObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.observers.DisposableCompletableObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposingObserverImpl<T> extends AtomicInteger implements AutoDisposingObserver<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f33210a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f33211b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final AtomicThrowable f33212c = new AtomicThrowable();

    /* JADX INFO: renamed from: d */
    public final CompletableDefer f33213d;

    /* JADX INFO: renamed from: f */
    public final Observer f33214f;

    /* JADX INFO: renamed from: autodispose2.AutoDisposingObserverImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C23481 extends DisposableCompletableObserver {
        public C23481() {
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            AutoDisposingObserverImpl autoDisposingObserverImpl = AutoDisposingObserverImpl.this;
            autoDisposingObserverImpl.f33211b.lazySet(AutoDisposableHelper.f33195a);
            AutoDisposableHelper.m12352a(autoDisposingObserverImpl.f33210a);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            AutoDisposingObserverImpl autoDisposingObserverImpl = AutoDisposingObserverImpl.this;
            autoDisposingObserverImpl.f33211b.lazySet(AutoDisposableHelper.f33195a);
            autoDisposingObserverImpl.onError(th);
        }
    }

    public AutoDisposingObserverImpl(CompletableDefer completableDefer, Observer observer) {
        this.f33213d = completableDefer;
        this.f33214f = observer;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    /* JADX INFO: renamed from: c */
    public final void mo12365c(Disposable disposable) {
        C23481 c23481 = new C23481();
        if (AutoDisposeEndConsumerHelper.m12358a(this.f33211b, c23481, AutoDisposingObserverImpl.class)) {
            this.f33214f.mo12365c(this);
            this.f33213d.mo12368a(c23481);
            AutoDisposeEndConsumerHelper.m12358a(this.f33210a, disposable, AutoDisposingObserverImpl.class);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f33210a.get() == AutoDisposableHelper.f33195a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        AutoDisposableHelper.m12352a(this.f33211b);
        AutoDisposableHelper.m12352a(this.f33210a);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (mo12353d()) {
            return;
        }
        this.f33210a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33211b);
        if (getAndIncrement() == 0) {
            Throwable thM12351b = this.f33212c.m12351b();
            Observer observer = this.f33214f;
            if (thM12351b != null) {
                observer.onError(thM12351b);
            } else {
                observer.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (mo12353d()) {
            return;
        }
        this.f33210a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33211b);
        AtomicThrowable atomicThrowable = this.f33212c;
        if (!atomicThrowable.m12350a(th)) {
            RxJavaPlugins.m18275b(th);
        } else if (getAndIncrement() == 0) {
            this.f33214f.onError(atomicThrowable.m12351b());
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (!mo12353d() && get() == 0 && compareAndSet(0, 1)) {
            Observer observer = this.f33214f;
            observer.onNext(obj);
            if (decrementAndGet() != 0) {
                Throwable thM12351b = this.f33212c.m12351b();
                if (thM12351b != null) {
                    observer.onError(thM12351b);
                } else {
                    observer.onComplete();
                }
                this.f33210a.lazySet(AutoDisposableHelper.f33195a);
                AutoDisposableHelper.m12352a(this.f33211b);
            }
        }
    }
}
