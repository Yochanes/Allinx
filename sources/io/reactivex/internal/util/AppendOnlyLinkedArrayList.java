package io.reactivex.internal.util;

import io.reactivex.functions.Predicate;
import io.reactivex.internal.util.NotificationLite;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AppendOnlyLinkedArrayList<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f49268a;

    /* JADX INFO: renamed from: b */
    public Object[] f49269b;

    /* JADX INFO: renamed from: c */
    public int f49270c;

    /* JADX INFO: compiled from: Proguard */
    public interface NonThrowingPredicate<T> extends Predicate<T> {
    }

    public AppendOnlyLinkedArrayList() {
        Object[] objArr = new Object[5];
        this.f49268a = objArr;
        this.f49269b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17875a(Subscriber subscriber) {
        Object obj;
        Object[] objArr = this.f49268a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == NotificationLite.f49279a) {
                    subscriber.onComplete();
                    return true;
                }
                if (obj instanceof NotificationLite.ErrorNotification) {
                    subscriber.onError(((NotificationLite.ErrorNotification) obj).f49282a);
                    return true;
                }
                if (obj instanceof NotificationLite.SubscriptionNotification) {
                    subscriber.mo12367j(((NotificationLite.SubscriptionNotification) obj).f49283a);
                } else {
                    subscriber.onNext(obj);
                }
            }
            objArr = objArr[4];
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17876b(Object obj) {
        int i = this.f49270c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.f49269b[4] = objArr;
            this.f49269b = objArr;
            i = 0;
        }
        this.f49269b[i] = obj;
        this.f49270c = i + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m17877c(NonThrowingPredicate nonThrowingPredicate) {
        Object obj;
        for (Object[] objArr = this.f49268a; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (nonThrowingPredicate.test(obj)) {
                    return;
                }
            }
        }
    }
}
