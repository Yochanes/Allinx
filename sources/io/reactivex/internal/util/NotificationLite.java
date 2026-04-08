package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationLite {

    /* JADX INFO: renamed from: a */
    public static final NotificationLite f49279a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ NotificationLite[] f49280b;

    /* JADX INFO: compiled from: Proguard */
    public static final class DisposableNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Disposable f49281a;

        public DisposableNotification(Disposable disposable) {
            this.f49281a = disposable;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.f49281a + "]";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ErrorNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Throwable f49282a;

        public ErrorNotification(Throwable th) {
            this.f49282a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return ObjectHelper.m17627a(this.f49282a, ((ErrorNotification) obj).f49282a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f49282a.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f49282a + "]";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubscriptionNotification implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Subscription f49283a;

        public SubscriptionNotification(Subscription subscription) {
            this.f49283a = subscription;
        }

        public final String toString() {
            return "NotificationLite.Subscription[" + this.f49283a + "]";
        }
    }

    static {
        NotificationLite notificationLite = new NotificationLite("COMPLETE", 0);
        f49279a = notificationLite;
        f49280b = new NotificationLite[]{notificationLite};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m17896a(Object obj, Observer observer) {
        if (obj == f49279a) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f49282a);
            return true;
        }
        observer.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17897b(Object obj, Subscriber subscriber) {
        if (obj == f49279a) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            subscriber.onError(((ErrorNotification) obj).f49282a);
            return true;
        }
        subscriber.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17898c(Object obj, Observer observer) {
        if (obj == f49279a) {
            observer.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).f49282a);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            observer.mo17593c(((DisposableNotification) obj).f49281a);
            return false;
        }
        observer.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static Object m17899d(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    /* JADX INFO: renamed from: e */
    public static Object m17900e(Throwable th) {
        return new ErrorNotification(th);
    }

    /* JADX INFO: renamed from: f */
    public static Throwable m17901f(Object obj) {
        return ((ErrorNotification) obj).f49282a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m17902h(Object obj) {
        return obj == f49279a;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m17903i(Object obj) {
        return obj instanceof ErrorNotification;
    }

    /* JADX INFO: renamed from: j */
    public static Object m17904j(Subscription subscription) {
        return new SubscriptionNotification(subscription);
    }

    public static NotificationLite valueOf(String str) {
        return (NotificationLite) Enum.valueOf(NotificationLite.class, str);
    }

    public static NotificationLite[] values() {
        return (NotificationLite[]) f49280b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
