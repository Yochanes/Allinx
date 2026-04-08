package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.observers.BasicFuseableObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Experimental
public final class ObservableDoAfterNext<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoAfterObserver<T> extends BasicFuseableObserver<T, T> {
        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            throw null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f47567b.poll();
            if (objPoll == null) {
                return objPoll;
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
