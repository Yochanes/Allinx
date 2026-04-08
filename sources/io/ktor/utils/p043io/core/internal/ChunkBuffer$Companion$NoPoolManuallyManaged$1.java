package io.ktor.utils.p043io.core.internal;

import io.ktor.utils.p043io.pool.NoPoolImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"io/ktor/utils/io/core/internal/ChunkBuffer$Companion$NoPoolManuallyManaged$1", "Lio/ktor/utils/io/pool/NoPoolImpl;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ChunkBuffer$Companion$NoPoolManuallyManaged$1 extends NoPoolImpl<ChunkBuffer> {
    @Override // io.ktor.utils.p043io.pool.ObjectPool
    /* JADX INFO: renamed from: G */
    public final Object mo17488G() {
        throw new UnsupportedOperationException("This pool doesn't support borrow");
    }

    @Override // io.ktor.utils.p043io.pool.NoPoolImpl, io.ktor.utils.p043io.pool.ObjectPool
    /* JADX INFO: renamed from: N0 */
    public final void mo17522N0(Object obj) {
        ChunkBuffer instance = (ChunkBuffer) obj;
        Intrinsics.m18599g(instance, "instance");
    }
}
