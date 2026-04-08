package io.ktor.network.util;

import io.ktor.utils.p043io.pool.DefaultPool;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/util/DirectByteBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DirectByteBufferPool extends DefaultPool<ByteBuffer> {
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
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(0);
        Intrinsics.m18598f(byteBufferAllocateDirect, "java.nio.ByteBuffer.allocateDirect(bufferSize)");
        return byteBufferAllocateDirect;
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: i */
    public final void mo17150i(Object obj) {
        ByteBuffer instance = (ByteBuffer) obj;
        Intrinsics.m18599g(instance, "instance");
        if (!instance.isDirect()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (instance.capacity() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
