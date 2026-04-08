package io.reactivex.exceptions;

import io.reactivex.annotations.Beta;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Beta
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
