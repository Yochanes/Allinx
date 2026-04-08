package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.util.NotificationLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AppendOnlyLinkedArrayList<T> {

    /* JADX INFO: renamed from: a */
    public final Object[] f51216a;

    /* JADX INFO: renamed from: b */
    public Object[] f51217b;

    /* JADX INFO: renamed from: c */
    public int f51218c;

    /* JADX INFO: compiled from: Proguard */
    public interface NonThrowingPredicate<T> extends Predicate<T> {
    }

    public AppendOnlyLinkedArrayList() {
        Object[] objArr = new Object[5];
        this.f51216a = objArr;
        this.f51217b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18228a(FlowableSubscriber flowableSubscriber) {
        Object obj;
        Object[] objArr = this.f51216a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == NotificationLite.f51228a) {
                    flowableSubscriber.onComplete();
                    return true;
                }
                if (obj instanceof NotificationLite.ErrorNotification) {
                    flowableSubscriber.onError(((NotificationLite.ErrorNotification) obj).f51231a);
                    return true;
                }
                if (obj instanceof NotificationLite.SubscriptionNotification) {
                    flowableSubscriber.mo12367j(((NotificationLite.SubscriptionNotification) obj).f51232a);
                } else {
                    flowableSubscriber.onNext(obj);
                }
            }
            objArr = objArr[4];
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18229b(Object obj) {
        int i = this.f51218c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.f51217b[4] = objArr;
            this.f51217b = objArr;
            i = 0;
        }
        this.f51217b[i] = obj;
        this.f51218c = i + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m18230c(NonThrowingPredicate nonThrowingPredicate) {
        Object obj;
        for (Object[] objArr = this.f51216a; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (nonThrowingPredicate.test(obj)) {
                    return;
                }
            }
        }
    }
}
