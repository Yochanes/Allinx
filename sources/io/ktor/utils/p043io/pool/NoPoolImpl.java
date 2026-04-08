package io.ktor.utils.p043io.pool;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/utils/io/pool/NoPoolImpl;", "", "T", "Lio/ktor/utils/io/pool/ObjectPool;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class NoPoolImpl<T> implements ObjectPool<T> {
    @Override // io.ktor.utils.p043io.pool.ObjectPool
    /* JADX INFO: renamed from: N0 */
    public void mo17522N0(Object instance) {
        Intrinsics.m18599g(instance, "instance");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
