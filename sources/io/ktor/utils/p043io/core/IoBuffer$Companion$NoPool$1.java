package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.pool.NoPoolImpl;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"io/ktor/utils/io/core/IoBuffer$Companion$NoPool$1", "Lio/ktor/utils/io/pool/NoPoolImpl;", "Lio/ktor/utils/io/core/IoBuffer;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class IoBuffer$Companion$NoPool$1 extends NoPoolImpl<IoBuffer> {
    @Override // io.ktor.utils.p043io.pool.ObjectPool
    /* JADX INFO: renamed from: G */
    public final Object mo17488G() {
        ByteBuffer buffer = IoBuffer.f47366q != 0 ? ByteBuffer.allocateDirect(IoBuffer.f47365p) : ByteBuffer.allocate(IoBuffer.f47365p);
        Intrinsics.m18598f(buffer, "buffer");
        return new IoBuffer(buffer);
    }
}
