package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.jdk8.MaybeFlattenStreamAsObservable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleFlattenStreamAsObservable<T, R> extends Observable<R> {
    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        new MaybeFlattenStreamAsObservable.FlattenStreamMultiObserver(observer);
        throw null;
    }
}
