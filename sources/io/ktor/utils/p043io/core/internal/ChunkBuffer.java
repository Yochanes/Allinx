package io.ktor.utils.p043io.core.internal;

import io.ktor.utils.p043io.concurrent.SharedJvmKt$shared$1;
import io.ktor.utils.p043io.core.Buffer;
import io.ktor.utils.p043io.core.BufferSharedState;
import io.ktor.utils.p043io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/internal/ChunkBuffer;", "Lio/ktor/utils/io/core/Buffer;", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
@DangerousInternalIoApi
public class ChunkBuffer extends Buffer {

    /* JADX INFO: renamed from: d */
    public final SharedJvmKt$shared$1 f47376d;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty[] f47370f = {Reflection.f51660a.mo18615e(new MutablePropertyReference1Impl(ChunkBuffer.class, "origin", "getOrigin()Lio/ktor/utils/io/core/internal/ChunkBuffer;", 0))};

    /* JADX INFO: renamed from: o */
    public static final Companion f47375o = new Companion();

    /* JADX INFO: renamed from: j */
    public static final ChunkBuffer$Companion$Pool$1 f47373j = new ChunkBuffer$Companion$Pool$1();

    /* JADX INFO: renamed from: n */
    public static final ChunkBuffer$Companion$EmptyPool$1 f47374n = new ChunkBuffer$Companion$EmptyPool$1();

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f47371g = AtomicReferenceFieldUpdater.newUpdater(ChunkBuffer.class, Object.class, "nextRef");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47372i = AtomicIntegerFieldUpdater.newUpdater(ChunkBuffer.class, "refCount");

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/core/internal/ChunkBuffer$Companion;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public ChunkBuffer(ChunkBuffer chunkBuffer, ByteBuffer byteBuffer) {
        super(byteBuffer);
        if (chunkBuffer == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        SharedJvmKt$shared$1 sharedJvmKt$shared$1 = new SharedJvmKt$shared$1();
        sharedJvmKt$shared$1.f47328a = chunkBuffer;
        this.f47376d = sharedJvmKt$shared$1;
    }

    /* JADX INFO: renamed from: C */
    public final ChunkBuffer m17512C() {
        return (ChunkBuffer) this.nextRef;
    }

    /* JADX INFO: renamed from: H */
    public final ChunkBuffer m17513H() {
        return (ChunkBuffer) this.f47376d.getValue(this, f47370f[0]);
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    /* JADX INFO: renamed from: M */
    public void mo17494M(ObjectPool pool) {
        Intrinsics.m18599g(pool, "pool");
        if (m17515N()) {
            ChunkBuffer chunkBufferM17513H = m17513H();
            if (chunkBufferM17513H == null) {
                pool.mo17522N0(this);
            } else {
                m17518V();
                chunkBufferM17513H.mo17494M(pool);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m17515N() {
        int i;
        int i2;
        do {
            i = this.refCount;
            if (i <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i2 = i - 1;
        } while (!f47372i.compareAndSet(this, i, i2));
        return i2 == 0;
    }

    /* JADX INFO: renamed from: R */
    public final void m17516R() {
        if (m17513H() != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        m17464i(0);
        this.f47348a.f47355d = this.f47349b;
        m17466k();
        this.f47348a.getClass();
        this.nextRef = null;
    }

    /* JADX INFO: renamed from: S */
    public final void m17517S(ChunkBuffer chunkBuffer) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (chunkBuffer == null) {
            m17521x();
            return;
        }
        do {
            atomicReferenceFieldUpdater = f47371g;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, chunkBuffer)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        throw new IllegalStateException("This chunk has already a next chunk.");
    }

    /* JADX INFO: renamed from: V */
    public final void m17518V() {
        if (!f47372i.compareAndSet(this, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        m17521x();
        this.f47376d.setValue(this, f47370f[0], null);
    }

    /* JADX INFO: renamed from: W */
    public final void m17519W() {
        int i;
        do {
            i = this.refCount;
            if (i < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f47372i.compareAndSet(this, i, 1));
    }

    /* JADX INFO: renamed from: u */
    public final void m17520u() {
        int i;
        do {
            i = this.refCount;
            if (i <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f47372i.compareAndSet(this, i, i + 1));
    }

    /* JADX INFO: renamed from: x */
    public final ChunkBuffer m17521x() {
        return (ChunkBuffer) f47371g.getAndSet(this, null);
    }

    /* JADX INFO: renamed from: z */
    public ChunkBuffer mo17496z() {
        ChunkBuffer chunkBufferM17513H = m17513H();
        if (chunkBufferM17513H == null) {
            chunkBufferM17513H = this;
        }
        chunkBufferM17513H.m17520u();
        ChunkBuffer chunkBuffer = new ChunkBuffer(chunkBufferM17513H, this.f47350c);
        BufferSharedState bufferSharedState = this.f47348a;
        int i = bufferSharedState.f47355d;
        BufferSharedState bufferSharedState2 = chunkBuffer.f47348a;
        bufferSharedState2.f47355d = i;
        bufferSharedState2.f47354c = bufferSharedState.f47354c;
        bufferSharedState2.f47352a = bufferSharedState.f47352a;
        bufferSharedState2.f47353b = bufferSharedState.f47353b;
        return chunkBuffer;
    }
}
