package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BehaviorSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: a */
    public static final Object[] f51365a = new Object[0];

    /* JADX INFO: compiled from: Proguard */
    public static final class BehaviorDisposable<T> implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

        /* JADX INFO: renamed from: a */
        public final Observer f51366a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f51367b;

        public BehaviorDisposable(Observer observer, BehaviorSubject behaviorSubject) {
            this.f51366a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f51367b;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f51367b) {
                return;
            }
            this.f51367b = true;
            throw null;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            return this.f51367b || NotificationLite.m17896a(obj, this.f51366a);
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        observer.mo17593c(new BehaviorDisposable(observer, this));
        throw null;
    }

    @Override // io.reactivex.Observer
    /* JADX INFO: renamed from: c */
    public final void mo17593c(Disposable disposable) {
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        Throwable th = ExceptionHelper.f49276a;
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        ObjectHelper.m17628b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        ObjectHelper.m17628b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }
}
