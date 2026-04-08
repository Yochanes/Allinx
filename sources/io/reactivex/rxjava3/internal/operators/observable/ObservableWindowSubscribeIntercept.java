package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class ObservableWindowSubscribeIntercept<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final UnicastSubject f50939a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f50940b = new AtomicBoolean();

    public ObservableWindowSubscribeIntercept(UnicastSubject unicastSubject) {
        this.f50939a = unicastSubject;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50939a.mo17931a(observer);
        this.f50940b.set(true);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m18192i() {
        AtomicBoolean atomicBoolean = this.f50940b;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }
}
