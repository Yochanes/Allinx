package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
class DelegatingScheduledFuture<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {
    private final ScheduledFuture<?> upstreamFuture;

    /* JADX INFO: renamed from: com.google.firebase.concurrent.DelegatingScheduledFuture$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C46151 implements Completer<V> {
        public C46151() {
        }

        @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
        public void set(V v) {
            DelegatingScheduledFuture.access$000(DelegatingScheduledFuture.this, v);
        }

        @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
        public void setException(Throwable th) {
            DelegatingScheduledFuture.access$100(DelegatingScheduledFuture.this, th);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Completer<T> {
        void set(T t);

        void setException(Throwable th);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Resolver<T> {
        ScheduledFuture<?> addCompleter(Completer<T> completer);
    }

    public DelegatingScheduledFuture(Resolver<V> resolver) {
        this.upstreamFuture = resolver.addCompleter(new C46151());
    }

    public static /* synthetic */ boolean access$000(DelegatingScheduledFuture delegatingScheduledFuture, Object obj) {
        return delegatingScheduledFuture.set(obj);
    }

    public static /* synthetic */ boolean access$100(DelegatingScheduledFuture delegatingScheduledFuture, Throwable th) {
        return delegatingScheduledFuture.setException(th);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public void afterDone() {
        this.upstreamFuture.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return compareTo2(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.upstreamFuture.getDelay(timeUnit);
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Delayed delayed) {
        return this.upstreamFuture.compareTo(delayed);
    }
}
