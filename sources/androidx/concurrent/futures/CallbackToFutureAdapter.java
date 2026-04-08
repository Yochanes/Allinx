package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    /* JADX INFO: compiled from: Proguard */
    public static final class Completer<T> {

        /* JADX INFO: renamed from: a */
        public Object f20828a;

        /* JADX INFO: renamed from: b */
        public SafeFuture f20829b;

        /* JADX INFO: renamed from: c */
        public ResolvableFuture f20830c;

        /* JADX INFO: renamed from: d */
        public boolean f20831d;

        /* JADX INFO: renamed from: a */
        public final void m6741a(Runnable runnable, Executor executor) {
            ResolvableFuture resolvableFuture = this.f20830c;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m6742b(Object obj) {
            this.f20831d = true;
            SafeFuture safeFuture = this.f20829b;
            boolean z2 = safeFuture != null && safeFuture.f20833b.set(obj);
            if (z2) {
                this.f20828a = null;
                this.f20829b = null;
                this.f20830c = null;
            }
            return z2;
        }

        /* JADX INFO: renamed from: c */
        public final void m6743c() {
            this.f20831d = true;
            SafeFuture safeFuture = this.f20829b;
            if (safeFuture == null || !safeFuture.f20833b.cancel(true)) {
                return;
            }
            this.f20828a = null;
            this.f20829b = null;
            this.f20830c = null;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m6744d(Throwable th) {
            this.f20831d = true;
            SafeFuture safeFuture = this.f20829b;
            boolean z2 = safeFuture != null && safeFuture.f20833b.setException(th);
            if (z2) {
                this.f20828a = null;
                this.f20829b = null;
                this.f20830c = null;
            }
            return z2;
        }

        public final void finalize() {
            ResolvableFuture resolvableFuture;
            SafeFuture safeFuture = this.f20829b;
            if (safeFuture != null) {
                AbstractResolvableFuture abstractResolvableFuture = safeFuture.f20833b;
                if (!abstractResolvableFuture.isDone()) {
                    abstractResolvableFuture.setException(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f20828a));
                }
            }
            if (this.f20831d || (resolvableFuture = this.f20830c) == null) {
                return;
            }
            resolvableFuture.set(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FutureGarbageCollectedException extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Resolver<T> {
        /* JADX INFO: renamed from: d */
        Object mo188d(Completer completer);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SafeFuture<T> implements ListenableFuture<T> {

        /* JADX INFO: renamed from: a */
        public final WeakReference f20832a;

        /* JADX INFO: renamed from: b */
        public final AbstractResolvableFuture f20833b = new C13561();

        /* JADX INFO: renamed from: androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C13561 extends AbstractResolvableFuture<T> {
            public C13561() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public final String pendingToString() {
                Completer completer = (Completer) SafeFuture.this.f20832a.get();
                return completer == null ? "Completer object has been garbage collected, future will fail soon" : AbstractC0000a.m18o(new StringBuilder("tag=["), completer.f20828a, "]");
            }
        }

        public SafeFuture(Completer completer) {
            this.f20832a = new WeakReference(completer);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            this.f20833b.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z2) {
            Completer completer = (Completer) this.f20832a.get();
            boolean zCancel = this.f20833b.cancel(z2);
            if (zCancel && completer != null) {
                completer.f20828a = null;
                completer.f20829b = null;
                completer.f20830c.set(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.f20833b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f20833b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f20833b.isDone();
        }

        public final String toString() {
            return this.f20833b.toString();
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return this.f20833b.get(j, timeUnit);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ListenableFuture m6740a(Resolver resolver) {
        Completer completer = new Completer();
        completer.f20830c = new ResolvableFuture();
        SafeFuture safeFuture = new SafeFuture(completer);
        completer.f20829b = safeFuture;
        completer.f20828a = resolver.getClass();
        try {
            Object objMo188d = resolver.mo188d(completer);
            if (objMo188d != null) {
                completer.f20828a = objMo188d;
                return safeFuture;
            }
        } catch (Exception e) {
            safeFuture.f20833b.setException(e);
        }
        return safeFuture;
    }
}
