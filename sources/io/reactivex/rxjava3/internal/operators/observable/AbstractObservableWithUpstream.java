package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamObservableSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> implements HasUpstreamObservableSource<T> {

    /* JADX INFO: renamed from: a */
    public final ObservableSource f50392a;

    public AbstractObservableWithUpstream(ObservableSource observableSource) {
        this.f50392a = observableSource;
    }
}
