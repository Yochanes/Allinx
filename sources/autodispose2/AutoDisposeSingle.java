package autodispose2;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposeSingle<T> extends Single<T> implements SingleSubscribeProxy<T> {
    @Override // io.reactivex.rxjava3.core.Single
    /* JADX INFO: renamed from: d */
    public final void mo12362d(SingleObserver singleObserver) {
        new AutoDisposingSingleObserverImpl(singleObserver);
        throw null;
    }
}
