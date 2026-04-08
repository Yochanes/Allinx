package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
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
public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {
    static final AtomicHelper ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;

    @Nullable
    volatile Listener listeners;

    @Nullable
    volatile Object value;

    @Nullable
    volatile Waiter waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AtomicHelper {
        /* JADX INFO: renamed from: a */
        public abstract boolean mo6735a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo6736b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo6737c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2);

        /* JADX INFO: renamed from: d */
        public abstract void mo6738d(Waiter waiter, Waiter waiter2);

        /* JADX INFO: renamed from: e */
        public abstract void mo6739e(Waiter waiter, Thread thread);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Cancellation {

        /* JADX INFO: renamed from: c */
        public static final Cancellation f20808c;

        /* JADX INFO: renamed from: d */
        public static final Cancellation f20809d;

        /* JADX INFO: renamed from: a */
        public final boolean f20810a;

        /* JADX INFO: renamed from: b */
        public final CancellationException f20811b;

        static {
            if (AbstractResolvableFuture.GENERATE_CANCELLATION_CAUSES) {
                f20809d = null;
                f20808c = null;
            } else {
                f20809d = new Cancellation(false, null);
                f20808c = new Cancellation(true, null);
            }
        }

        public Cancellation(boolean z2, CancellationException cancellationException) {
            this.f20810a = z2;
            this.f20811b = cancellationException;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Failure {

        /* JADX INFO: renamed from: b */
        public static final Failure f20812b = new Failure(new C13551("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        public final Throwable f20813a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.AbstractResolvableFuture$Failure$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C13551 extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th) {
            this.f20813a = (Throwable) AbstractResolvableFuture.checkNotNull(th);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Listener {

        /* JADX INFO: renamed from: d */
        public static final Listener f20814d = new Listener(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f20815a;

        /* JADX INFO: renamed from: b */
        public final Executor f20816b;

        /* JADX INFO: renamed from: c */
        public Listener f20817c;

        public Listener(Runnable runnable, Executor executor) {
            this.f20815a = runnable;
            this.f20816b = executor;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SafeAtomicHelper extends AtomicHelper {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater f20818a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater f20819b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater f20820c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater f20821d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater f20822e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f20818a = atomicReferenceFieldUpdater;
            this.f20819b = atomicReferenceFieldUpdater2;
            this.f20820c = atomicReferenceFieldUpdater3;
            this.f20821d = atomicReferenceFieldUpdater4;
            this.f20822e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: a */
        public final boolean mo6735a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f20821d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == listener);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: b */
        public final boolean mo6736b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f20822e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: c */
        public final boolean mo6737c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f20820c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == waiter);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: d */
        public final void mo6738d(Waiter waiter, Waiter waiter2) {
            this.f20819b.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: e */
        public final void mo6739e(Waiter waiter, Thread thread) {
            this.f20818a.lazySet(waiter, thread);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SetFuture<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractResolvableFuture f20823a;

        /* JADX INFO: renamed from: b */
        public final ListenableFuture f20824b;

        public SetFuture(AbstractResolvableFuture abstractResolvableFuture, ListenableFuture listenableFuture) {
            this.f20823a = abstractResolvableFuture;
            this.f20824b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20823a.value != this) {
                return;
            }
            if (AbstractResolvableFuture.ATOMIC_HELPER.mo6736b(this.f20823a, this, AbstractResolvableFuture.getFutureValue(this.f20824b))) {
                AbstractResolvableFuture.complete(this.f20823a);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: a */
        public final boolean mo6735a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.listeners != listener) {
                        return false;
                    }
                    abstractResolvableFuture.listeners = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: b */
        public final boolean mo6736b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.value != obj) {
                        return false;
                    }
                    abstractResolvableFuture.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: c */
        public final boolean mo6737c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.waiters != waiter) {
                        return false;
                    }
                    abstractResolvableFuture.waiters = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: d */
        public final void mo6738d(Waiter waiter, Waiter waiter2) {
            waiter.f20827b = waiter2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        /* JADX INFO: renamed from: e */
        public final void mo6739e(Waiter waiter, Thread thread) {
            waiter.f20826a = thread;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Waiter {

        /* JADX INFO: renamed from: c */
        public static final Waiter f20825c = new Waiter();

        /* JADX INFO: renamed from: a */
        public volatile Thread f20826a;

        /* JADX INFO: renamed from: b */
        public volatile Waiter f20827b;

        public Waiter() {
            AbstractResolvableFuture.ATOMIC_HELPER.mo6739e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        ATOMIC_HELPER = synchronizedHelper;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m6731b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m6732c(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            CancellationException cancellationException = ((Cancellation) obj).f20811b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f20813a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }

    public static void complete(AbstractResolvableFuture<?> abstractResolvableFuture) {
        Listener listener;
        Listener listener2;
        Listener listener3 = null;
        while (true) {
            Waiter waiter = abstractResolvableFuture.waiters;
            if (ATOMIC_HELPER.mo6737c(abstractResolvableFuture, waiter, Waiter.f20825c)) {
                while (waiter != null) {
                    Thread thread = waiter.f20826a;
                    if (thread != null) {
                        waiter.f20826a = null;
                        LockSupport.unpark(thread);
                    }
                    waiter = waiter.f20827b;
                }
                abstractResolvableFuture.afterDone();
                do {
                    listener = abstractResolvableFuture.listeners;
                } while (!ATOMIC_HELPER.mo6735a(abstractResolvableFuture, listener, Listener.f20814d));
                while (true) {
                    listener2 = listener3;
                    listener3 = listener;
                    if (listener3 == null) {
                        break;
                    }
                    listener = listener3.f20817c;
                    listener3.f20817c = listener2;
                }
                while (listener2 != null) {
                    listener3 = listener2.f20817c;
                    Runnable runnable = listener2.f20815a;
                    if (runnable instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable;
                        abstractResolvableFuture = setFuture.f20823a;
                        if (abstractResolvableFuture.value == setFuture) {
                            if (ATOMIC_HELPER.mo6736b(abstractResolvableFuture, setFuture, getFutureValue(setFuture.f20824b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m6731b(runnable, listener2.f20816b);
                    }
                    listener2 = listener3;
                }
                return;
            }
        }
    }

    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) listenableFuture).value;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            return cancellation.f20810a ? cancellation.f20811b != null ? new Cancellation(false, cancellation.f20811b) : Cancellation.f20809d : obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return Cancellation.f20809d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new Cancellation(false, e);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e));
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    @RestrictTo
    public static <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z2 = false;
        while (true) {
            try {
                v = future.get();
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
    public final void m6733a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(uninterruptibly == this ? "this future" : String.valueOf(uninterruptibly));
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
        checkNotNull(runnable);
        checkNotNull(executor);
        Listener listener = this.listeners;
        Listener listener2 = Listener.f20814d;
        if (listener != listener2) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.f20817c = listener;
                if (ATOMIC_HELPER.mo6735a(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.listeners;
                }
            } while (listener != listener2);
        }
        m6731b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        Cancellation cancellation = GENERATE_CANCELLATION_CAUSES ? new Cancellation(z2, new CancellationException("Future.cancel() was called.")) : z2 ? Cancellation.f20808c : Cancellation.f20809d;
        AbstractResolvableFuture<V> abstractResolvableFuture = this;
        boolean z3 = false;
        while (true) {
            if (ATOMIC_HELPER.mo6736b(abstractResolvableFuture, obj, cancellation)) {
                if (z2) {
                    abstractResolvableFuture.interruptTask();
                }
                complete(abstractResolvableFuture);
                if (!(obj instanceof SetFuture)) {
                    break;
                }
                ListenableFuture listenableFuture = ((SetFuture) obj).f20824b;
                if (!(listenableFuture instanceof AbstractResolvableFuture)) {
                    listenableFuture.cancel(z2);
                    break;
                }
                abstractResolvableFuture = (AbstractResolvableFuture) listenableFuture;
                obj = abstractResolvableFuture.value;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    break;
                }
                z3 = true;
            } else {
                obj = abstractResolvableFuture.value;
                if (!(obj instanceof SetFuture)) {
                    return z3;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m6734d(Waiter waiter) {
        waiter.f20826a = null;
        while (true) {
            Waiter waiter2 = this.waiters;
            if (waiter2 == Waiter.f20825c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.f20827b;
                if (waiter2.f20826a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.f20827b = waiter4;
                    if (waiter3.f20826a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.mo6737c(this, waiter2, waiter4)) {
                    break;
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return (V) m6732c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            Waiter waiter = this.waiters;
            Waiter waiter2 = Waiter.f20825c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                z2 = true;
                do {
                    AtomicHelper atomicHelper = ATOMIC_HELPER;
                    atomicHelper.mo6738d(waiter3, waiter);
                    if (atomicHelper.mo6737c(this, waiter, waiter3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m6734d(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return (V) m6732c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        m6734d(waiter3);
                    } else {
                        waiter = this.waiters;
                    }
                } while (waiter != waiter2);
            }
            return (V) m6732c(this.value);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof SetFuture))) {
                return (V) m6732c(obj3);
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
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String strM2C = AbstractC0000a.m2C(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z3 = (jConvert == 0 || nanos2 > SPIN_THRESHOLD_NANOS) ? z2 : false;
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
        return this.value instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof SetFuture)) & (this.value != null);
    }

    public final void maybePropagateCancellationTo(@Nullable Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof SetFuture) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((SetFuture) obj).f20824b;
            return AbstractC0000a.m19p(sb, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean set(@Nullable V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.mo6736b(this, null, v)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.mo6736b(this, null, new Failure((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        Failure failure;
        checkNotNull(listenableFuture);
        Object obj = this.value;
        if (obj != null) {
            if (obj instanceof Cancellation) {
                listenableFuture.cancel(((Cancellation) obj).f20810a);
            }
        } else if (listenableFuture.isDone()) {
            if (ATOMIC_HELPER.mo6736b(this, null, getFutureValue(listenableFuture))) {
                complete(this);
                return true;
            }
        } else {
            SetFuture setFuture = new SetFuture(this, listenableFuture);
            if (ATOMIC_HELPER.mo6736b(this, null, setFuture)) {
                try {
                    listenableFuture.addListener(setFuture, DirectExecutor.f20835a);
                    return true;
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Throwable unused) {
                        failure = Failure.f20812b;
                    }
                    ATOMIC_HELPER.mo6736b(this, setFuture, failure);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof Cancellation) {
            }
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m6733a(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e) {
                strPendingToString = "Exception thrown from implementation: " + e.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strPendingToString);
                sb.append("]");
            } else if (isDone()) {
                m6733a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f20810a;
    }

    public void afterDone() {
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return (V) m6732c(obj2);
            }
            Waiter waiter = this.waiters;
            Waiter waiter2 = Waiter.f20825c;
            if (waiter != waiter2) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = ATOMIC_HELPER;
                    atomicHelper.mo6738d(waiter3, waiter);
                    if (atomicHelper.mo6737c(this, waiter, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m6734d(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return (V) m6732c(obj);
                    }
                    waiter = this.waiters;
                } while (waiter != waiter2);
            }
            return (V) m6732c(this.value);
        }
        throw new InterruptedException();
    }
}
