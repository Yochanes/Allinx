package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservableDematerialize<T, R> extends AbstractObservableWithUpstream<T, R> {

    /* JADX INFO: compiled from: Proguard */
    public static final class DematerializeObserver<T, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f50544a;

        /* JADX INFO: renamed from: b */
        public boolean f50545b;

        /* JADX INFO: renamed from: c */
        public Disposable f50546c;

        public DematerializeObserver(Observer observer) {
            this.f50544a = observer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        /* JADX INFO: renamed from: c */
        public final void mo12365c(Disposable disposable) {
            if (DisposableHelper.m17956f(this.f50546c, disposable)) {
                this.f50546c = disposable;
                this.f50544a.mo12365c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        /* JADX INFO: renamed from: d */
        public final boolean mo12353d() {
            return this.f50546c.mo12353d();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f50546c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f50545b) {
                return;
            }
            this.f50545b = true;
            this.f50544a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f50545b) {
                RxJavaPlugins.m18275b(th);
            } else {
                this.f50545b = true;
                this.f50544a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (!this.f50545b) {
                try {
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m17950a(th);
                    this.f50546c.dispose();
                    onError(th);
                    return;
                }
            }
            if (obj instanceof Notification) {
                Notification notification = (Notification) obj;
                if (NotificationLite.m18265i(notification.f49362a)) {
                    RxJavaPlugins.m18275b(notification.m17926b());
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    /* JADX INFO: renamed from: h */
    public final void mo12361h(Observer observer) {
        this.f50392a.mo17931a(new DematerializeObserver(observer));
    }
}
