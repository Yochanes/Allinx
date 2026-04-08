package io.ktor.utils.p043io.pool;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0018\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/ktor/utils/io/pool/SingleInstancePool;", "", "T", "Lio/ktor/utils/io/pool/ObjectPool;", "instance", "Ljava/lang/Object;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class SingleInstancePool<T> implements ObjectPool<T> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47526a = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "borrowed");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47527b = AtomicIntegerFieldUpdater.newUpdater(SingleInstancePool.class, "disposed");
    private volatile /* synthetic */ int borrowed;
    private volatile /* synthetic */ int disposed;
    private volatile T instance;

    @Override // io.ktor.utils.p043io.pool.ObjectPool
    /* JADX INFO: renamed from: G */
    public final Object mo17488G() {
        int i;
        do {
            i = this.borrowed;
            if (i != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!f47526a.compareAndSet(this, i, 1));
        T t = (T) mo17506b();
        this.instance = t;
        return t;
    }

    @Override // io.ktor.utils.p043io.pool.ObjectPool
    /* JADX INFO: renamed from: N0 */
    public final void mo17522N0(Object instance) {
        Intrinsics.m18599g(instance, "instance");
        if (this.instance != instance) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (!f47527b.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("An instance is already disposed");
        }
        mo17505a(instance);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17505a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo17506b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        T t;
        if (!f47527b.compareAndSet(this, 0, 1) || (t = this.instance) == null) {
            return;
        }
        this.instance = null;
        mo17505a(t);
    }
}
