package io.ktor.utils.p043io.core;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.ktor.utils.p043io.bits.Memory;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.core.internal.UTF8Kt;
import io.ktor.utils.p043io.pool.ObjectPool;
import io.ktor.utils.p043io.utils.AtomicKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lio/ktor/utils/io/core/IoBuffer;", "Lio/ktor/utils/io/core/Input;", "Lio/ktor/utils/io/core/Output;", "Lio/ktor/utils/io/core/internal/ChunkBuffer;", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class IoBuffer extends ChunkBuffer implements Input, Output {

    /* JADX INFO: renamed from: p */
    public static final int f47365p = AtomicKt.m17577a(4096, "buffer.size");

    /* JADX INFO: renamed from: q */
    public static final int f47366q;

    /* JADX INFO: renamed from: r */
    public static final IoBuffer f47367r;

    /* JADX INFO: renamed from: s */
    public static final IoBuffer$Companion$Pool$1 f47368s;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Lio/ktor/utils/io/core/IoBuffer$Companion;", "", "", "DEFAULT_BUFFER_POOL_DIRECT", "I", "DEFAULT_BUFFER_POOL_SIZE", "DEFAULT_BUFFER_SIZE", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        int iM17577a = AtomicKt.m17577a(100, "buffer.pool.size");
        f47366q = AtomicKt.m17577a(0, "buffer.pool.direct");
        f47367r = new IoBuffer(null, Memory.f47323b);
        f47368s = new IoBuffer$Companion$Pool$1(iM17577a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IoBuffer(ByteBuffer external) {
        Intrinsics.m18599g(external, "external");
        ByteBuffer byteBuffer = Memory.f47323b;
        ByteBuffer byteBufferOrder = external.slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.m18598f(byteBufferOrder, "buffer.slice().order(ByteOrder.BIG_ENDIAN)");
        super(null, byteBufferOrder);
    }

    @Override // io.ktor.utils.p043io.core.Input
    /* JADX INFO: renamed from: F */
    public final long mo17428F(ByteBuffer destination, long j, long j2, long j3, long j4) {
        Intrinsics.m18599g(destination, "destination");
        long jLimit = ((long) destination.limit()) - j;
        BufferSharedState bufferSharedState = this.f47348a;
        long jMin = Math.min(jLimit, Math.min(j4, bufferSharedState.f47353b - bufferSharedState.f47352a));
        Memory.m17407b(this.f47350c, destination, ((long) bufferSharedState.f47352a) + j2, jMin, j);
        return jMin;
    }

    @Override // io.ktor.utils.p043io.core.internal.ChunkBuffer
    /* JADX INFO: renamed from: M */
    public final void mo17494M(ObjectPool pool) {
        Intrinsics.m18599g(pool, "pool");
        if (m17515N()) {
            ChunkBuffer chunkBufferM17513H = m17513H();
            if (!(chunkBufferM17513H instanceof IoBuffer)) {
                pool.mo17522N0(this);
            } else {
                m17518V();
                ((IoBuffer) chunkBufferM17513H).mo17494M(pool);
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) throws BufferLimitExceededException, EOFException {
        int i;
        BufferSharedState bufferSharedState = this.f47348a;
        int i2 = bufferSharedState.f47353b;
        int i3 = bufferSharedState.f47355d;
        ByteBuffer byteBuffer = this.f47350c;
        if (c2 >= 0 && 127 >= c2) {
            byteBuffer.put(i2, (byte) c2);
            i = 1;
        } else if (128 <= c2 && 2047 >= c2) {
            byteBuffer.put(i2, (byte) (((c2 >> 6) & 31) | 192));
            byteBuffer.put(i2 + 1, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            i = 2;
        } else if (2048 <= c2 && 65535 >= c2) {
            byteBuffer.put(i2, (byte) (((c2 >> '\f') & 15) | 224));
            byteBuffer.put(i2 + 1, (byte) (((c2 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            byteBuffer.put(i2 + 2, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            i = 3;
        } else {
            if (0 > c2 || 65535 < c2) {
                UTF8Kt.m17525b(c2);
                throw null;
            }
            byteBuffer.put(i2, (byte) (((c2 >> 18) & 7) | 240));
            byteBuffer.put(i2 + 1, (byte) (((c2 >> '\f') & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            byteBuffer.put(i2 + 2, (byte) (((c2 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            byteBuffer.put(i2 + 3, (byte) ((c2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            i = 4;
        }
        if (i > i3 - i2) {
            throw new BufferLimitExceededException("Not enough free space available to write 1 character(s).");
        }
        m17459a(i);
        return this;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m17495b0(ByteBuffer child) throws EOFException {
        Intrinsics.m18599g(child, "child");
        m17467n(child.limit());
        m17460b(child.position());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("close for buffer view is not supported");
    }

    @Override // io.ktor.utils.p043io.core.Input
    /* JADX INFO: renamed from: f0 */
    public final boolean mo17435f0() {
        BufferSharedState bufferSharedState = this.f47348a;
        return !(bufferSharedState.f47353b > bufferSharedState.f47352a);
    }

    @Override // io.ktor.utils.p043io.core.Buffer
    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer[readable = ");
        BufferSharedState bufferSharedState = this.f47348a;
        sb.append(bufferSharedState.f47353b - bufferSharedState.f47352a);
        sb.append(", writable = ");
        sb.append(bufferSharedState.f47355d - bufferSharedState.f47353b);
        sb.append(", startGap = ");
        sb.append(bufferSharedState.f47354c);
        sb.append(", endGap = ");
        sb.append(this.f47349b - bufferSharedState.f47355d);
        sb.append(']');
        return sb.toString();
    }

    @Override // io.ktor.utils.p043io.core.internal.ChunkBuffer
    /* JADX INFO: renamed from: z */
    public final ChunkBuffer mo17496z() {
        ChunkBuffer chunkBufferM17513H = m17513H();
        if (chunkBufferM17513H == null) {
            chunkBufferM17513H = this;
        }
        chunkBufferM17513H.m17520u();
        IoBuffer ioBuffer = new IoBuffer(chunkBufferM17513H, this.f47350c);
        BufferSharedState bufferSharedState = this.f47348a;
        int i = bufferSharedState.f47355d;
        BufferSharedState bufferSharedState2 = ioBuffer.f47348a;
        bufferSharedState2.f47355d = i;
        bufferSharedState2.f47354c = bufferSharedState.f47354c;
        bufferSharedState2.f47352a = bufferSharedState.f47352a;
        bufferSharedState2.f47353b = bufferSharedState.f47353b;
        return ioBuffer;
    }

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        BufferCompatibilityKt.m17471b(this, charSequence, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public final /* synthetic */ Appendable append(CharSequence charSequence) {
        BufferCompatibilityKt.m17470a(this, charSequence);
        return this;
    }
}
