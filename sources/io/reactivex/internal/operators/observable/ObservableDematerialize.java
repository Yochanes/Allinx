package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDematerialize<T> extends AbstractObservableWithUpstream<Notification<T>, T> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DematerializeObserver<T> implements Observer<Notification<T>>, Disposable {

        /* JADX INFO: renamed from: a */
        public boolean f48639a;

        /* JADX INFO: renamed from: b */
        public Disposable f48640b;

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: c */
        public final void mo17593c(Disposable disposable) {
            if (DisposableHelper.m17620h(this.f48640b, disposable)) {
                this.f48640b = disposable;
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo17596d() {
            return this.f48640b.mo17596d();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f48640b.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f48639a) {
                return;
            }
            this.f48639a = true;
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            if (this.f48639a) {
                RxJavaPlugins.m17911b(th);
            } else {
                this.f48639a = true;
                throw null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            Notification notification = (Notification) obj;
            if (this.f48639a) {
                if (NotificationLite.m17903i(notification.f47534a)) {
                    RxJavaPlugins.m17911b(notification.m17588b());
                }
            } else if (NotificationLite.m17903i(notification.f47534a)) {
                this.f48640b.dispose();
                onError(notification.m17588b());
            } else {
                if (notification.f47534a != null) {
                    notification.m17589c();
                    throw null;
                }
                this.f48640b.dispose();
                onComplete();
            }
        }
    }

    @Override // io.reactivex.Observable
    /* JADX INFO: renamed from: b */
    public final void mo17592b(Observer observer) {
        throw null;
    }
}
