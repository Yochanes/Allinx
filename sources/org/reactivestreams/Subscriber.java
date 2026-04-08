package org.reactivestreams;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Subscriber<T> {
    /* JADX INFO: renamed from: j */
    void mo12367j(Subscription subscription);

    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);
}
