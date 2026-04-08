package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Notification<T> {

    /* JADX INFO: renamed from: b */
    public static final Notification f49361b = new Notification(null);

    /* JADX INFO: renamed from: a */
    public final Object f49362a;

    public Notification(Object obj) {
        this.f49362a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static Notification m17925a(Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new Notification(NotificationLite.m18262e(th));
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m17926b() {
        Object obj = this.f49362a;
        if (NotificationLite.m18265i(obj)) {
            return NotificationLite.m18263f(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m17927c() {
        Object obj = this.f49362a;
        if (obj == null || NotificationLite.m18265i(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17928d() {
        return this.f49362a == null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17929e() {
        Object obj = this.f49362a;
        return (obj == null || NotificationLite.m18265i(obj)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return Objects.equals(this.f49362a, ((Notification) obj).f49362a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f49362a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f49362a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.m18265i(obj)) {
            return "OnErrorNotification[" + NotificationLite.m18263f(obj) + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
