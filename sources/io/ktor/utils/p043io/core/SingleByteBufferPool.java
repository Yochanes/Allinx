package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.pool.SingleInstancePool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/SingleByteBufferPool;", "Lio/ktor/utils/io/pool/SingleInstancePool;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
final class SingleByteBufferPool extends SingleInstancePool<ChunkBuffer> {
    @Override // io.ktor.utils.p043io.pool.SingleInstancePool
    /* JADX INFO: renamed from: a */
    public final void mo17505a(Object obj) {
        ChunkBuffer instance = (ChunkBuffer) obj;
        Intrinsics.m18599g(instance, "instance");
        if (!(instance instanceof IoBuffer)) {
            throw new IllegalStateException("Only IoBuffer could be recycled");
        }
        throw null;
    }

    @Override // io.ktor.utils.p043io.pool.SingleInstancePool
    /* JADX INFO: renamed from: b */
    public final Object mo17506b() {
        throw null;
    }
}
