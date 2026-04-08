package autodispose2;

import autodispose2.observers.AutoDisposingMaybeObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposingMaybeObserverImpl<T> implements AutoDisposingMaybeObserver<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f33206a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f33207b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final MaybeObserver f33208c;

    /* JADX INFO: renamed from: autodispose2.AutoDisposingMaybeObserverImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C23471 extends DisposableCompletableObserver {
        public C23471() {
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            AutoDisposingMaybeObserverImpl autoDisposingMaybeObserverImpl = AutoDisposingMaybeObserverImpl.this;
            autoDisposingMaybeObserverImpl.f33207b.lazySet(AutoDisposableHelper.f33195a);
            AutoDisposableHelper.m12352a(autoDisposingMaybeObserverImpl.f33206a);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            AutoDisposingMaybeObserverImpl autoDisposingMaybeObserverImpl = AutoDisposingMaybeObserverImpl.this;
            autoDisposingMaybeObserverImpl.f33207b.lazySet(AutoDisposableHelper.f33195a);
            autoDisposingMaybeObserverImpl.onError(th);
        }
    }

    public AutoDisposingMaybeObserverImpl(MaybeObserver maybeObserver) {
        this.f33208c = maybeObserver;
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    /* JADX INFO: renamed from: c */
    public final void mo12364c(Disposable disposable) {
        if (AutoDisposeEndConsumerHelper.m12358a(this.f33207b, new C23471(), AutoDisposingMaybeObserverImpl.class)) {
            this.f33208c.mo12364c(this);
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f33206a.get() == AutoDisposableHelper.f33195a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        AutoDisposableHelper.m12352a(this.f33207b);
        AutoDisposableHelper.m12352a(this.f33206a);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        if (mo12353d()) {
            return;
        }
        this.f33206a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33207b);
        this.f33208c.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        if (mo12353d()) {
            return;
        }
        this.f33206a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33207b);
        this.f33208c.onError(th);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public final void onSuccess(Object obj) {
        if (mo12353d()) {
            return;
        }
        this.f33206a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33207b);
        this.f33208c.onSuccess(obj);
    }
}
