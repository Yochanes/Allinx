package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {

    /* JADX INFO: renamed from: b */
    public final Function f50683b;

    /* JADX INFO: compiled from: Proguard */
    public static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {

        /* JADX INFO: renamed from: g */
        public final Function f50684g;

        public MapObserver(Observer observer, Function function) {
            super(observer);
            this.f50684g = function;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f49469d) {
                return;
            }
            int i = this.f49470f;
            Observer observer = this.f49466a;
            if (i != 0) {
                observer.onNext(null);
                return;
            }
            try {
                Object objApply = this.f50684g.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                observer.onNext(objApply);
            } catch (Throwable th) {
                m17972a(th);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f49468c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f50684g.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }
    }

    public ObservableMap(Observable observable, Function function) {
        super(observable);
        this.f50683b = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new MapObserver(observer, this.f50683b));
    }
}
