package io.reactivex.internal.util;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ExceptionHelper {

    /* JADX INFO: renamed from: a */
    public static final Throwable f49276a = new Termination("No further exceptions");

    /* JADX INFO: renamed from: a */
    public static boolean m17887a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == f49276a) {
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
    public static Throwable m17888b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f49276a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* JADX INFO: renamed from: c */
    public static RuntimeException m17889c(Throwable th) {
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
