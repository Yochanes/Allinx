package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDoAfterNext<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DoAfterObserver<T> extends BasicFuseableObserver<T, T> {
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.f49466a.onNext(obj);
            if (this.f49470f != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                m17972a(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49468c.poll();
            if (objPoll == null) {
                return objPoll;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new DoAfterObserver(observer));
    }
}
