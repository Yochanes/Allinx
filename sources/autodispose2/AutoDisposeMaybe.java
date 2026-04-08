package autodispose2;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposeMaybe<T> extends Maybe<T> implements MaybeSubscribeProxy<T> {
    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: b */
    public final void mo12360b(MaybeObserver maybeObserver) {
        new AutoDisposingMaybeObserverImpl(maybeObserver);
        throw null;
    }
}
