package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.core.internal.UnsafeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class OutputKt {
    /* JADX INFO: renamed from: a */
    public static final void m17499a(BytePacketBuilder writeFully, byte[] src, int i, int i2) {
        Intrinsics.m18599g(writeFully, "$this$writeFully");
        Intrinsics.m18599g(src, "src");
        ChunkBuffer chunkBufferM17530e = UnsafeKt.m17530e(writeFully, 1, null);
        while (true) {
            try {
                BufferSharedState bufferSharedState = chunkBufferM17530e.f47348a;
                int iMin = Math.min(i2, bufferSharedState.f47355d - bufferSharedState.f47353b);
                BufferPrimitivesKt.m17477c(chunkBufferM17530e, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                if (i2 <= 0) {
                    return;
                } else {
                    chunkBufferM17530e = UnsafeKt.m17530e(writeFully, 1, chunkBufferM17530e);
                }
            } finally {
                UnsafeKt.m17526a(writeFully, chunkBufferM17530e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m17500b(BytePacketBuilder bytePacketBuilder, byte[] bArr) {
        m17499a(bytePacketBuilder, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public static void m17501c(Output writeFully, Buffer src) {
        BufferSharedState bufferSharedState = src.f47348a;
        int i = bufferSharedState.f47353b - bufferSharedState.f47352a;
        Intrinsics.m18599g(writeFully, "$this$writeFully");
        Intrinsics.m18599g(src, "src");
        ChunkBuffer chunkBufferM17530e = UnsafeKt.m17530e(writeFully, 1, null);
        while (true) {
            try {
                BufferSharedState bufferSharedState2 = chunkBufferM17530e.f47348a;
                int iMin = Math.min(i, bufferSharedState2.f47355d - bufferSharedState2.f47353b);
                BufferPrimitivesKt.m17476b(chunkBufferM17530e, src, iMin);
                i -= iMin;
                if (i <= 0) {
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
