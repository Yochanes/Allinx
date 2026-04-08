package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/utils/io/core/ByteReadPacket;", "Lio/ktor/utils/io/core/ByteReadPacketPlatformBase;", "Lio/ktor/utils/io/core/Input;", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ByteReadPacket extends ByteReadPacketPlatformBase implements Input {

    /* JADX INFO: renamed from: d */
    public static final ByteReadPacket f47360d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/core/ByteReadPacket$Companion;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        ChunkBuffer.f47375o.getClass();
        f47360d = new ByteReadPacket(IoBuffer.f47367r, 0L, ChunkBuffer.f47374n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteReadPacket(ChunkBuffer head, long j, ObjectPool pool) {
        super(head, j, pool);
        Intrinsics.m18599g(head, "head");
        Intrinsics.m18599g(pool, "pool");
        if (this.f47331b) {
            return;
        }
        this.f47331b = true;
    }

    /* JADX INFO: renamed from: N */
    public final ByteReadPacket m17485N() {
        ChunkBuffer chunkBufferM17440k = m17440k();
        ChunkBuffer chunkBufferMo17496z = chunkBufferM17440k.mo17496z();
        ChunkBuffer chunkBufferM17512C = chunkBufferM17440k.m17512C();
        if (chunkBufferM17512C != null) {
            ChunkBuffer chunkBuffer = chunkBufferMo17496z;
            while (true) {
                ChunkBuffer chunkBufferMo17496z2 = chunkBufferM17512C.mo17496z();
                chunkBuffer.m17517S(chunkBufferMo17496z2);
                chunkBufferM17512C = chunkBufferM17512C.m17512C();
                if (chunkBufferM17512C == null) {
                    break;
                }
                chunkBuffer = chunkBufferMo17496z2;
            }
        }
        return new ByteReadPacket(chunkBufferMo17496z, m17441n(), this.f47332c);
    }

    @Override // io.ktor.utils.p043io.core.AbstractInput
    /* JADX INFO: renamed from: h */
    public final ChunkBuffer mo17437h() {
        return null;
    }

    @Override // io.ktor.utils.p043io.core.AbstractInput
    /* JADX INFO: renamed from: i */
    public final int mo17438i(ByteBuffer destination, int i, int i2) {
        Intrinsics.m18599g(destination, "destination");
        return 0;
    }

    public final String toString() {
        return "ByteReadPacket(" + m17441n() + " bytes remaining)";
    }

    @Override // io.ktor.utils.p043io.core.AbstractInput
    /* JADX INFO: renamed from: a */
    public final void mo17432a() {
    }
}
