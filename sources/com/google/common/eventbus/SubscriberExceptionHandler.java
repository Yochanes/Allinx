package com.google.common.eventbus;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
public interface SubscriberExceptionHandler {
    void handleException(Throwable th, SubscriberExceptionContext subscriberExceptionContext);
}
