package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {
        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.f47568c) {
                return;
            }
            if (this.f47569d != 0) {
                throw null;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17631a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            if (this.f47567b.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
