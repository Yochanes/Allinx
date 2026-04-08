package io.reactivex;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Notification<T> {

    /* JADX INFO: renamed from: b */
    public static final Notification f47533b = new Notification(null);

    /* JADX INFO: renamed from: a */
    public final Object f47534a;

    public Notification(Object obj) {
        this.f47534a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static Notification m17587a(Throwable th) {
        ObjectHelper.m17628b(th, "error is null");
        return new Notification(NotificationLite.m17900e(th));
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m17588b() {
        Object obj = this.f47534a;
        if (NotificationLite.m17903i(obj)) {
            return NotificationLite.m17901f(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m17589c() {
        Object obj = this.f47534a;
        if (obj == null || NotificationLite.m17903i(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17590d() {
        Object obj = this.f47534a;
        return (obj == null || NotificationLite.m17903i(obj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return ObjectHelper.m17627a(this.f47534a, ((Notification) obj).f47534a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f47534a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f47534a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.m17903i(obj)) {
            return "OnErrorNotification[" + NotificationLite.m17901f(obj) + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
