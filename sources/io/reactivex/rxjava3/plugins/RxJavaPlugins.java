package io.reactivex.rxjava3.plugins;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class RxJavaPlugins {
    /* JADX INFO: renamed from: a */
    public static Scheduler m18274a(Supplier supplier) {
        try {
            Object obj = supplier.get();
            Objects.requireNonNull(obj, "Scheduler Supplier result can't be null");
            return (Scheduler) obj;
        } catch (Throwable th) {
            throw ExceptionHelper.m18251f(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18275b(Throwable th) {
        if (th == null) {
            th = ExceptionHelper.m18247b("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
