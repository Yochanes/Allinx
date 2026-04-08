package autodispose2;

import autodispose2.observers.AutoDisposingSingleObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposingSingleObserverImpl<T> implements AutoDisposingSingleObserver<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f33216a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f33217b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final SingleObserver f33218c;

    /* JADX INFO: renamed from: autodispose2.AutoDisposingSingleObserverImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C23491 extends DisposableCompletableObserver {
        public C23491() {
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            AutoDisposingSingleObserverImpl autoDisposingSingleObserverImpl = AutoDisposingSingleObserverImpl.this;
            autoDisposingSingleObserverImpl.f33217b.lazySet(AutoDisposableHelper.f33195a);
            AutoDisposableHelper.m12352a(autoDisposingSingleObserverImpl.f33216a);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            AutoDisposingSingleObserverImpl autoDisposingSingleObserverImpl = AutoDisposingSingleObserverImpl.this;
            autoDisposingSingleObserverImpl.f33217b.lazySet(AutoDisposableHelper.f33195a);
            autoDisposingSingleObserverImpl.onError(th);
        }
    }

    public AutoDisposingSingleObserverImpl(SingleObserver singleObserver) {
        this.f33218c = singleObserver;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    /* JADX INFO: renamed from: c */
    public final void mo12366c(Disposable disposable) {
        if (AutoDisposeEndConsumerHelper.m12358a(this.f33217b, new C23491(), AutoDisposingSingleObserverImpl.class)) {
            this.f33218c.mo12366c(this);
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f33216a.get() == AutoDisposableHelper.f33195a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        AutoDisposableHelper.m12352a(this.f33217b);
        AutoDisposableHelper.m12352a(this.f33216a);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        if (mo12353d()) {
            return;
        }
        this.f33216a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33217b);
        this.f33218c.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        if (mo12353d()) {
            return;
        }
        this.f33216a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33217b);
        this.f33218c.onSuccess(obj);
    }
}
