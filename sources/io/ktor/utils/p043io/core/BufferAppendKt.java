package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.bits.Memory;
import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class BufferAppendKt {
    /* JADX INFO: renamed from: a */
    public static final int m17469a(ChunkBuffer writeBufferAppend, ChunkBuffer chunkBuffer, int i) {
        Intrinsics.m18599g(writeBufferAppend, "$this$writeBufferAppend");
        BufferSharedState bufferSharedState = chunkBuffer.f47348a;
        int iMin = Math.min(bufferSharedState.f47353b - bufferSharedState.f47352a, i);
        BufferSharedState bufferSharedState2 = writeBufferAppend.f47348a;
        int i2 = bufferSharedState2.f47355d;
        int i3 = bufferSharedState2.f47353b;
        int i4 = i2 - i3;
        if (i4 <= iMin) {
            int i5 = writeBufferAppend.f47349b;
            if ((i5 - i2) + i4 < iMin) {
                throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
            }
            if ((i3 + iMin) - i2 > 0) {
                bufferSharedState2.f47355d = i5;
            }
        }
        Memory.m17406a(chunkBuffer.f47350c, writeBufferAppend.f47350c, bufferSharedState.f47352a, iMin, i3);
        chunkBuffer.m17461d(iMin);
        writeBufferAppend.m17459a(iMin);
        return iMin;
    }
}
