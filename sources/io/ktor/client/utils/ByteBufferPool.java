package io.ktor.client.utils;

import io.ktor.util.InternalAPI;
import io.ktor.utils.p043io.pool.DefaultPool;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/client/utils/ByteBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ByteBufferPool extends DefaultPool<ByteBuffer> {
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
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4096);
        Intrinsics.m18596d(byteBufferAllocate);
        return byteBufferAllocate;
    }
}
