package io.ktor.network.util;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-network"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class PoolsKt {

    /* JADX INFO: renamed from: a */
    public static final io.ktor.utils.p043io.pool.DirectByteBufferPool f46391a;

    /* JADX INFO: renamed from: b */
    public static final io.ktor.utils.p043io.pool.DirectByteBufferPool f46392b;

    static {
        new ThreadGroup("io-pool-group");
        f46391a = new io.ktor.utils.p043io.pool.DirectByteBufferPool(4096, 4096);
        f46392b = new io.ktor.utils.p043io.pool.DirectByteBufferPool(2048, 65535);
    }
}
