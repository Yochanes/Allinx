package androidx.camera.core.impl.utils.futures;

import androidx.annotation.RequiresApi;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class FutureChain<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: a */
    public final ListenableFuture f2933a;

    /* JADX INFO: renamed from: b */
    public CallbackToFutureAdapter.Completer f2934b;

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.FutureChain$1 */
    /* JADX INFO: compiled from: Proguard */
    class C02971 implements CallbackToFutureAdapter.Resolver<Object> {
        public C02971() {
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        /* JADX INFO: renamed from: d */
        public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
            FutureChain futureChain = FutureChain.this;
            Preconditions.m7699f(futureChain.f2934b == null, "The result can only set once!");
            futureChain.f2934b = completer;
            return "FutureChain[" + futureChain + "]";
        }
    }

    public FutureChain(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.f2933a = listenableFuture;
    }

    /* JADX INFO: renamed from: a */
    public static FutureChain m1623a(ListenableFuture listenableFuture) {
        return listenableFuture instanceof FutureChain ? (FutureChain) listenableFuture : new FutureChain(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f2933a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return this.f2933a.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f2933a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2933a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2933a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.f2933a.get(j, timeUnit);
    }

    public FutureChain() {
        this.f2933a = CallbackToFutureAdapter.m6740a(new C02971());
    }
}
