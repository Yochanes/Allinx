package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class OutputArraysJVMKt {
    /* JADX INFO: renamed from: a */
    public static final void m17498a(Output writeFully, ByteBuffer bb) {
        Intrinsics.m18599g(writeFully, "$this$writeFully");
        Intrinsics.m18599g(bb, "bb");
        int iLimit = bb.limit();
        ChunkBuffer chunkBufferM17530e = UnsafeKt.m17530e(writeFully, 1, null);
        while (true) {
            try {
                int iRemaining = bb.remaining();
                BufferSharedState bufferSharedState = chunkBufferM17530e.f47348a;
                bb.limit(bb.position() + Math.min(iRemaining, bufferSharedState.f47355d - bufferSharedState.f47353b));
                BufferPrimitivesJvmKt.m17474a(chunkBufferM17530e, bb);
                bb.limit(iLimit);
                if (!bb.hasRemaining()) {
                    return;
                } else {
                    chunkBufferM17530e = UnsafeKt.m17530e(writeFully, 1, chunkBufferM17530e);
                }
            } finally {
                UnsafeKt.m17526a(writeFully, chunkBufferM17530e);
            }
        }
    }
}
