package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.bits.Allocator;
import io.ktor.utils.p043io.bits.DefaultAllocator;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.pool.DefaultPool;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/DefaultBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Lio/ktor/utils/io/core/IoBuffer;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DefaultBufferPool extends DefaultPool<IoBuffer> {

    /* JADX INFO: renamed from: g */
    public final int f47363g;

    /* JADX INFO: renamed from: i */
    public final Allocator f47364i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultBufferPool() {
        super(1000);
        DefaultAllocator defaultAllocator = DefaultAllocator.f47322a;
        this.f47363g = 4096;
        this.f47364i = defaultAllocator;
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: b */
    public final Object mo16936b(Object obj) {
        IoBuffer ioBuffer = (IoBuffer) obj;
        ioBuffer.m17519W();
        ioBuffer.m17516R();
        return ioBuffer;
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: d */
    public final void mo17487d(Object obj) {
        IoBuffer instance = (IoBuffer) obj;
        Intrinsics.m18599g(instance, "instance");
        this.f47364i.mo17404a(instance.f47350c);
        instance.m17518V();
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: g */
    public final Object mo16937g() {
        return new IoBuffer(null, this.f47364i.mo17405b(this.f47363g));
    }

    @Override // io.ktor.utils.p043io.pool.DefaultPool
    /* JADX INFO: renamed from: i */
    public final void mo17150i(Object obj) {
        IoBuffer instance = (IoBuffer) obj;
        Intrinsics.m18599g(instance, "instance");
        IoBuffer ioBuffer = IoBuffer.f47367r;
        if (instance == ioBuffer) {
            throw new IllegalStateException("IoBuffer.Empty couldn't be recycled");
        }
        if (!(instance != ioBuffer)) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance == ioBuffer) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        ChunkBuffer.f47375o.getClass();
        if (instance == ioBuffer) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.getRefCount() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.m17512C() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (instance.m17513H() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }
}
