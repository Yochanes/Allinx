package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMapOptional<T, R> extends Observable<R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MapOptionalObserver<T, R> extends BasicFuseableObserver<T, R> {
        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f49469d) {
                return;
            }
            if (this.f49470f != 0) {
                this.f49466a.onNext(null);
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
            if (this.f49468c.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        throw null;
    }
}
