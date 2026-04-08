package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public abstract class AbstractFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: d */
    public static final boolean f33123d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f */
    public static final Logger f33124f = Logger.getLogger(AbstractFuture.class.getName());

    /* JADX INFO: renamed from: g */
    public static final AtomicHelper f33125g;

    /* JADX INFO: renamed from: i */
    public static final Object f33126i;

    /* JADX INFO: renamed from: a */
    public volatile Object f33127a;

    /* JADX INFO: renamed from: b */
    public volatile Listener f33128b;

    /* JADX INFO: renamed from: c */
    public volatile Waiter f33129c;

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AtomicHelper {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo12324a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo12325b(AbstractFuture abstractFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo12326c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        /* JADX INFO: renamed from: d */
        public abstract void mo12327d(Waiter waiter, Waiter waiter2);

        /* JADX INFO: renamed from: e */
        public abstract void mo12328e(Waiter waiter, Thread thread);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Cancellation {

        /* JADX INFO: renamed from: b */
        public static final Cancellation f33130b;

        /* JADX INFO: renamed from: c */
        public static final Cancellation f33131c;

        /* JADX INFO: renamed from: a */
        public final CancellationException f33132a;

        static {
            if (AbstractFuture.f33123d) {
                f33131c = null;
                f33130b = null;
            } else {
                f33131c = new Cancellation(false, null);
                f33130b = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z2, CancellationException cancellationException) {
            this.f33132a = cancellationException;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Failure {

        /* JADX INFO: renamed from: a */
        public final Throwable f33133a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.AbstractFuture$Failure$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C23411 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new Failure(new C23411("Failure occurred while trying to finish a future."));
        }

        public Failure(Throwable th) {
            boolean z2 = AbstractFuture.f33123d;
            th.getClass();
            this.f33133a = th;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Listener {

        /* JADX INFO: renamed from: d */
        public static final Listener f33134d = new Listener(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f33135a;

        /* JADX INFO: renamed from: b */
        public final Executor f33136b;

        /* JADX INFO: renamed from: c */
        public Listener f33137c;

        public Listener(Runnable runnable, Executor executor) {
            this.f33135a = runnable;
            this.f33136b = executor;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater f33138a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater f33139b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater f33140c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater f33141d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater f33142e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f33138a = atomicReferenceFieldUpdater;
            this.f33139b = atomicReferenceFieldUpdater2;
            this.f33140c = atomicReferenceFieldUpdater3;
            this.f33141d = atomicReferenceFieldUpdater4;
            this.f33142e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: a */
        public final boolean mo12324a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f33141d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == listener);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: b */
        public final boolean mo12325b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f33142e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: c */
        public final boolean mo12326c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f33140c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == waiter);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: d */
        public final void mo12327d(Waiter waiter, Waiter waiter2) {
            this.f33139b.lazySet(waiter, waiter2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: e */
        public final void mo12328e(Waiter waiter, Thread thread) {
            this.f33138a.lazySet(waiter, thread);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SetFuture<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: a */
        public final boolean mo12324a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f33128b != listener) {
                        return false;
                    }
                    abstractFuture.f33128b = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: b */
        public final boolean mo12325b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f33127a != obj) {
                        return false;
                    }
                    abstractFuture.f33127a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: c */
        public final boolean mo12326c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f33129c != waiter) {
                        return false;
                    }
                    abstractFuture.f33129c = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: d */
        public final void mo12327d(Waiter waiter, Waiter waiter2) {
            waiter.f33145b = waiter2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        /* JADX INFO: renamed from: e */
        public final void mo12328e(Waiter waiter, Thread thread) {
            waiter.f33144a = thread;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Waiter {

        /* JADX INFO: renamed from: c */
        public static final Waiter f33143c = new Waiter();

        /* JADX INFO: renamed from: a */
        public volatile Thread f33144a;

        /* JADX INFO: renamed from: b */
        public volatile Waiter f33145b;

        public Waiter() {
            AbstractFuture.f33125g.mo12328e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        f33125g = synchronizedHelper;
        if (th != null) {
            f33124f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f33126i = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m12318b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f33124f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m12319c(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            CancellationException cancellationException = ((Cancellation) obj).f33132a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f33133a);
        }
        if (obj == f33126i) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static Object m12320d(AbstractFuture abstractFuture) {
        V v;
        boolean z2 = false;
        while (true) {
            try {
                v = abstractFuture.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: renamed from: a */
    public final void m12321a(StringBuilder sb) {
        try {
            Object objM12320d = m12320d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM12320d == this ? "this future" : String.valueOf(objM12320d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        Listener listener = this.f33128b;
        Listener listener2 = Listener.f33134d;
        if (listener != listener2) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.f33137c = listener;
                if (f33125g.mo12324a(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.f33128b;
                }
            } while (listener != listener2);
        }
        m12318b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Waiter waiter;
        Listener listener;
        Object obj = this.f33127a;
        if ((obj == null) | (obj instanceof SetFuture)) {
            Cancellation cancellation = f33123d ? new Cancellation(z2, new CancellationException("Future.cancel() was called.")) : z2 ? Cancellation.f33130b : Cancellation.f33131c;
            while (!f33125g.mo12325b(this, obj, cancellation)) {
                obj = this.f33127a;
                if (!(obj instanceof SetFuture)) {
                }
            }
            do {
                waiter = this.f33129c;
            } while (!f33125g.mo12326c(this, waiter, Waiter.f33143c));
            while (waiter != null) {
                Thread thread = waiter.f33144a;
                if (thread != null) {
                    waiter.f33144a = null;
                    LockSupport.unpark(thread);
                }
                waiter = waiter.f33145b;
            }
            do {
                listener = this.f33128b;
            } while (!f33125g.mo12324a(this, listener, Listener.f33134d));
            Listener listener2 = null;
            while (listener != null) {
                Listener listener3 = listener.f33137c;
                listener.f33137c = listener2;
                listener2 = listener;
                listener = listener3;
            }
            while (listener2 != null) {
                Listener listener4 = listener2.f33137c;
                Runnable runnable = listener2.f33135a;
                if (runnable instanceof SetFuture) {
                    ((SetFuture) runnable).getClass();
                    throw null;
                }
                m12318b(runnable, listener2.f33136b);
                listener2 = listener4;
            }
            if (!(obj instanceof SetFuture)) {
                return true;
            }
            ((SetFuture) obj).getClass();
            throw null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final String m12322e() {
        Object obj = this.f33127a;
        if (obj instanceof SetFuture) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((SetFuture) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: f */
    public final void m12323f(Waiter waiter) {
        waiter.f33144a = null;
        while (true) {
            Waiter waiter2 = this.f33129c;
            if (waiter2 == Waiter.f33143c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f33145b;
                if (waiter2.f33144a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f33145b = waiter4;
                    if (waiter3.f33144a == null) {
                        break;
                    }
                } else if (!f33125g.mo12326c(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f33127a;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return m12319c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter = this.f33129c;
            Waiter waiter2 = Waiter.f33143c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                z2 = true;
                do {
                    AtomicHelper atomicHelper = f33125g;
                    atomicHelper.mo12327d(waiter3, waiter);
                    if (atomicHelper.mo12326c(this, waiter, waiter3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m12323f(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f33127a;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return m12319c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m12323f(waiter3);
                    } else {
                        waiter = this.f33129c;
                    }
                } while (waiter != waiter2);
            }
            return m12319c(this.f33127a);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.f33127a;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof SetFuture))) {
                return m12319c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM22s = AbstractC0000a.m22s("Waited ", " ", j);
        sbM22s.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM22s.toString();
        if (nanos + 1000 < 0) {
            String strM2C = AbstractC0000a.m2C(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z3 = (jConvert == 0 || nanos2 > 1000) ? z2 : false;
            if (jConvert > 0) {
                String strM2C2 = strM2C + jConvert + " " + lowerCase;
                if (z3) {
                    strM2C2 = AbstractC0000a.m2C(strM2C2, ",");
                }
                strM2C = AbstractC0000a.m2C(strM2C2, " ");
            }
            if (z3) {
                strM2C = strM2C + nanos2 + " nanoseconds ";
            }
            string3 = AbstractC0000a.m2C(strM2C, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0000a.m2C(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC0000a.m14k(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f33127a instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.f33127a != null);
    }

    public final String toString() {
        String strM12322e;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f33127a instanceof Cancellation) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m12321a(sb);
        } else {
            try {
                strM12322e = m12322e();
            } catch (RuntimeException e) {
                strM12322e = "Exception thrown from implementation: " + e.getClass();
            }
            if (strM12322e != null && !strM12322e.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM12322e);
                sb.append("]");
            } else if (isDone()) {
                m12321a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f33127a;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return m12319c(obj2);
            }
            Waiter waiter = this.f33129c;
            Waiter waiter2 = Waiter.f33143c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = f33125g;
                    atomicHelper.mo12327d(waiter3, waiter);
                    if (atomicHelper.mo12326c(this, waiter, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f33127a;
                            } else {
                                m12323f(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return m12319c(obj);
                    }
                    waiter = this.f33129c;
                } while (waiter != waiter2);
            }
            return m12319c(this.f33127a);
        }
        throw new InterruptedException();
    }
}
