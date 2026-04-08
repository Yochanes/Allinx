package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDoOnEach<T> extends AbstractObservableWithUpstream<T, T> {

    /* JADX INFO: renamed from: b */
    public final Consumer f50553b;

    /* JADX INFO: renamed from: c */
    public final Consumer f50554c;

    /* JADX INFO: renamed from: d */
    public final Action f50555d;

    /* JADX INFO: renamed from: f */
    public final Action f50556f;

    /* JADX INFO: compiled from: Proguard */
    public static final class DoOnEachObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50557a;

        /* JADX INFO: renamed from: b */
        public final Consumer f50558b;

        /* JADX INFO: renamed from: c */
        public final Consumer f50559c;

        /* JADX INFO: renamed from: d */
        public final Action f50560d;

        /* JADX INFO: renamed from: f */
        public final Action f50561f;

        /* JADX INFO: renamed from: g */
        public Disposable f50562g;

        /* JADX INFO: renamed from: i */
        public boolean f50563i;

        public DoOnEachObserver(Observer observer, Consumer consumer) {
            Consumer consumer2 = Functions.f49390d;
            Action action = Functions.f49389c;
            this.f50557a = observer;
            this.f50558b = consumer;
            this.f50559c = consumer2;
            this.f50560d = action;
            this.f50561f = action;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50562g, disposable)) {
                this.f50562g = disposable;
                this.f50557a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50562g.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50562g.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50563i) {
                return;
            }
            this.f50563i = true;
            this.f50557a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50563i) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50563i = true;
                this.f50557a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f50563i) {
                return;
            }
            try {
                this.f50558b.accept(obj);
                this.f50557a.onNext(obj);
            } catch (Throwable th) {
                Exceptions.m17950a(th);
                this.f50562g.dispose();
                onError(th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableDoOnEach(Observable observable, Consumer consumer) {
        super(observable);
        Consumer consumer2 = Functions.f49390d;
        Action action = Functions.f49389c;
        this.f50553b = consumer;
        this.f50554c = consumer2;
        this.f50555d = action;
        this.f50556f = action;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new DoOnEachObserver(observer, this.f50553b));
    }
}
