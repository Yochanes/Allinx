package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationLite {

    /* JADX INFO: renamed from: a */
    public static final NotificationLite f51228a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ NotificationLite[] f51229b;

    /* JADX INFO: compiled from: Proguard */
    public static final class DisposableNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Disposable f51230a;

        public DisposableNotification(Disposable disposable) {
            this.f51230a = disposable;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.f51230a + "]";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ErrorNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Throwable f51231a;

        public ErrorNotification(Throwable th) {
            this.f51231a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return Objects.equals(this.f51231a, ((ErrorNotification) obj).f51231a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f51231a.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f51231a + "]";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscriptionNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Subscription f51232a;

        public SubscriptionNotification(Subscription subscription) {
            this.f51232a = subscription;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.f51232a + "]";
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        f51228a = notificationLite;
        f51229b = new NotificationLite[]{notificationLite};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18258a(Observer observer, Object obj) {
        if (obj == f51228a) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f51231a);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18259b(Object obj, Subscriber subscriber) {
        if (obj == f51228a) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            subscriber.onError(((ErrorNotification) obj).f51231a);
            return true;
        }
        subscriber.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18260c(Observer observer, Object obj) {
        if (obj == f51228a) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f51231a);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.mo12365c(((DisposableNotification) obj).f51230a);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static Object m18261d(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    /* JADX INFO: renamed from: e */
    public static Object m18262e(Throwable th) {
        return new ErrorNotification(th);
    }

    /* JADX INFO: renamed from: f */
    public static Throwable m18263f(Object obj) {
        return ((ErrorNotification) obj).f51231a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18264h(Object obj) {
        return obj == f51228a;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18265i(Object obj) {
        return obj instanceof ErrorNotification;
    }

    /* JADX INFO: renamed from: j */
    public static Object m18266j(Subscription subscription) {
        return new SubscriptionNotification(subscription);
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) f51229b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
