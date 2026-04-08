package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Subject<T> extends Observable<T> implements Observer<T> {
    /* JADX INFO: renamed from: i */
    public final void m18285i() {
        boolean z2 = this instanceof SerializedSubject;
    }
}
