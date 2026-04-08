package autodispose2;

import autodispose2.observers.AutoDisposingCompletableObserver;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.DisposableCompletableObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposingCompletableObserverImpl implements AutoDisposingCompletableObserver {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f33202a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f33203b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public final CompletableObserver f33204c;

    /* JADX INFO: renamed from: autodispose2.AutoDisposingCompletableObserverImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C23461 extends DisposableCompletableObserver {
        public C23461() {
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            AutoDisposingCompletableObserverImpl autoDisposingCompletableObserverImpl = AutoDisposingCompletableObserverImpl.this;
            autoDisposingCompletableObserverImpl.f33203b.lazySet(AutoDisposableHelper.f33195a);
            AutoDisposableHelper.m12352a(autoDisposingCompletableObserverImpl.f33202a);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
            AutoDisposingCompletableObserverImpl autoDisposingCompletableObserverImpl = AutoDisposingCompletableObserverImpl.this;
            autoDisposingCompletableObserverImpl.f33203b.lazySet(AutoDisposableHelper.f33195a);
            autoDisposingCompletableObserverImpl.onError(th);
        }
    }

    public AutoDisposingCompletableObserverImpl(CompletableObserver completableObserver) {
        this.f33204c = completableObserver;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    /* JADX INFO: renamed from: c */
    public final void mo12363c(Disposable disposable) {
        if (AutoDisposeEndConsumerHelper.m12358a(this.f33203b, new C23461(), AutoDisposingCompletableObserverImpl.class)) {
            this.f33204c.mo12363c(this);
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f33202a.get() == AutoDisposableHelper.f33195a;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        AutoDisposableHelper.m12352a(this.f33203b);
        AutoDisposableHelper.m12352a(this.f33202a);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        if (mo12353d()) {
            return;
        }
        this.f33202a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33203b);
        this.f33204c.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        if (mo12353d()) {
            return;
        }
        this.f33202a.lazySet(AutoDisposableHelper.f33195a);
        AutoDisposableHelper.m12352a(this.f33203b);
        this.f33204c.onError(th);
    }
}
