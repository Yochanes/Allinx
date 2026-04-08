package autodispose2;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposeCompletable extends Completable implements CompletableSubscribeProxy {
    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: b */
    public final void mo12357b(CompletableObserver completableObserver) {
        new AutoDisposingCompletableObserverImpl(completableObserver);
        throw null;
    }
}
