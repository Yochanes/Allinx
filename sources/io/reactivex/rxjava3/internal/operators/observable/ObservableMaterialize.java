package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableMaterialize<T> extends AbstractObservableWithUpstream<T, Notification<T>> {

    /* JADX INFO: compiled from: Proguard */
    public static final class MaterializeObserver<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50687a;

        /* JADX INFO: renamed from: b */
        public Disposable f50688b;

        public MaterializeObserver(Observer observer) {
            this.f50687a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50688b, disposable)) {
                this.f50688b = disposable;
                this.f50687a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50688b.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50688b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Notification notification = Notification.f49361b;
            Observer observer = this.f50687a;
            observer.onNext(notification);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            Notification notificationM17925a = Notification.m17925a(th);
            Observer observer = this.f50687a;
            observer.onNext(notificationM17925a);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            Objects.requireNonNull(obj, "value is null");
            this.f50687a.onNext(new Notification(obj));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new MaterializeObserver(observer));
    }
}
