package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ExceptionHelper {

    /* JADX INFO: renamed from: a */
    public static final Throwable f51225a = new Termination("No further exceptions");

    /* JADX INFO: renamed from: a */
    public static boolean m18246a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == f51225a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!atomicReference.compareAndSet(th2, compositeException)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static NullPointerException m18247b(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    /* JADX INFO: renamed from: c */
    public static void m18248c(Object obj, String str) {
        if (obj == null) {
            throw m18247b(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Throwable m18249d(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f51225a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* JADX INFO: renamed from: e */
    public static String m18250e(long j, TimeUnit timeUnit) {
        StringBuilder sbM22s = AbstractC0000a.m22s("The source did not signal an event for ", " ", j);
        sbM22s.append(timeUnit.toString().toLowerCase());
        sbM22s.append(" and has been terminated.");
        return sbM22s.toString();
    }

    /* JADX INFO: renamed from: f */
    public static RuntimeException m18251f(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Termination extends Throwable {
        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }
}
