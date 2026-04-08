package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {
    private volatile Provider<T> delegate;

    @GuardedBy
    private Deferred.DeferredHandler<T> handler;
    private static final Deferred.DeferredHandler<Object> NOOP_HANDLER = new C4612f();
    private static final Provider<Object> EMPTY_PROVIDER = new C4613g(0);

    private OptionalProvider(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.handler = deferredHandler;
        this.delegate = provider;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m15119a() {
        return lambda$static$1();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15120b(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        lambda$whenAvailable$2(deferredHandler, deferredHandler2, provider);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15121c(Provider provider) {
        lambda$static$0(provider);
    }

    public static <T> OptionalProvider<T> empty() {
        return new OptionalProvider<>(NOOP_HANDLER, EMPTY_PROVIDER);
    }

    private static /* synthetic */ Object lambda$static$1() {
        return null;
    }

    private static /* synthetic */ void lambda$whenAvailable$2(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    /* JADX INFO: renamed from: of */
    public static <T> OptionalProvider<T> m15122of(Provider<T> provider) {
        return new OptionalProvider<>(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.delegate.get();
    }

    public void set(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.delegate != EMPTY_PROVIDER) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            deferredHandler = this.handler;
            this.handler = null;
            this.delegate = provider;
        }
        deferredHandler.handle(provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(@NonNull Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.delegate;
        Provider<Object> provider4 = EMPTY_PROVIDER;
        if (provider3 != provider4) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.delegate;
            if (provider != provider4) {
                provider2 = provider;
            } else {
                this.handler = new C4614h(this.handler, deferredHandler);
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }

    private static /* synthetic */ void lambda$static$0(Provider provider) {
    }
}
