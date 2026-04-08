package com.google.common.cache;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
public abstract class CacheLoader<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41311 extends CacheLoader<K, V> {
        final /* synthetic */ Executor val$executor;

        public C41311(Executor executor) {
            this.val$executor = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m14772a(CacheLoader cacheLoader, Object obj, Object obj2) {
            return lambda$reload$0(cacheLoader, obj, obj2);
        }

        private static /* synthetic */ Object lambda$reload$0(CacheLoader cacheLoader, Object obj, Object obj2) {
            return cacheLoader.reload(obj, obj2).get();
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return (V) CacheLoader.this.load(k);
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> loadAll(Iterable<? extends K> iterable) {
            return CacheLoader.this.loadAll(iterable);
        }

        @Override // com.google.common.cache.CacheLoader
        public ListenableFuture<V> reload(K k, V v) {
            ListenableFutureTask listenableFutureTaskCreate = ListenableFutureTask.create(new CallableC4158a(CacheLoader.this, k, v));
            this.val$executor.execute(listenableFutureTaskCreate);
            return listenableFutureTaskCreate;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Function<K, V> computingFunction;

        public FunctionToCacheLoader(Function<K, V> function) {
            this.computingFunction = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return this.computingFunction.apply((K) Preconditions.checkNotNull(k));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<V> computingSupplier;

        public SupplierToCacheLoader(Supplier<V> supplier) {
            this.computingSupplier = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
            Preconditions.checkNotNull(obj);
            return this.computingSupplier.get();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    @GwtIncompatible
    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(executor);
        return cacheLoader.new C41311(executor);
    }

    public static <K, V> CacheLoader<K, V> from(Function<K, V> function) {
        return new FunctionToCacheLoader(function);
    }

    public abstract V load(K k);

    public Map<K, V> loadAll(Iterable<? extends K> iterable) {
        throw new UnsupportedLoadingOperationException();
    }

    @GwtIncompatible
    public ListenableFuture<V> reload(K k, V v) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        return Futures.immediateFuture(load(k));
    }

    public static <V> CacheLoader<Object, V> from(Supplier<V> supplier) {
        return new SupplierToCacheLoader(supplier);
    }
}
