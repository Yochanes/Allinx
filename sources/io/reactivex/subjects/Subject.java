package io.reactivex.subjects;

import io.reactivex.Observable;
import io.reactivex.Observer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Subject<T> extends Observable<T> implements Observer<T> {
    /* JADX INFO: renamed from: e */
    public final void m18291e() {
        boolean z2 = this instanceof SerializedSubject;
    }
}
