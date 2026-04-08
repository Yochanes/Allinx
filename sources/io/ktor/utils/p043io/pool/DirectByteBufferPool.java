package io.ktor.utils.p043io.pool;

import io.ktor.utils.p043io.core.ExperimentalIoApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalIoApi
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/pool/DirectByteBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DirectByteBufferPool extends DefaultPool<ByteBuffer> {

    /* JADX INFO: renamed from: g */
    public final int f47525g;

    public DirectByteBufferPool(int i, int i2) {
        super(i);
        this.f47525g = i2;
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: b */
    public final Object mo16936b(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: g */
    public final Object mo16937g() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f47525g);
        Intrinsics.m18596d(byteBufferAllocateDirect);
        return byteBufferAllocateDirect;
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: i */
    public final void mo17150i(Object obj) {
        ByteBuffer instance = (ByteBuffer) obj;
        Intrinsics.m18599g(instance, "instance");
        if (!(instance.capacity() == this.f47525g)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
