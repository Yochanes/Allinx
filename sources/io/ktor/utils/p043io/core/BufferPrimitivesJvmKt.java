package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.bits.MemoryJvmKt;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class BufferPrimitivesJvmKt {
    /* JADX INFO: renamed from: a */
    public static final void m17474a(ChunkBuffer writeFully, ByteBuffer source) throws InsufficientSpaceException, EOFException {
        Intrinsics.m18599g(writeFully, "$this$writeFully");
        Intrinsics.m18599g(source, "source");
        int iRemaining = source.remaining();
        BufferSharedState bufferSharedState = writeFully.f47348a;
        int i = bufferSharedState.f47353b;
        int i2 = bufferSharedState.f47355d - i;
        if (i2 < iRemaining) {
            throw new InsufficientSpaceException("buffer content", iRemaining, i2);
        }
        MemoryJvmKt.m17411b(source, writeFully.f47350c, i);
        writeFully.m17459a(iRemaining);
    }
}
