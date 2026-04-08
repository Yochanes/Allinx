package io.reactivex.plugins;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class RxJavaPlugins {
    /* JADX INFO: renamed from: a */
    public static Scheduler m17910a(Callable callable) {
        try {
            Object objCall = callable.call();
            ObjectHelper.m17628b(objCall, "Scheduler Callable result can't be null");
            return (Scheduler) objCall;
        } catch (Throwable th) {
            throw ExceptionHelper.m17889c(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m17911b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException(th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
