package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class BuffersKt {
    /* JADX INFO: renamed from: a */
    public static final ChunkBuffer m17478a(ChunkBuffer findTail) {
        while (true) {
            Intrinsics.m18599g(findTail, "$this$findTail");
            ChunkBuffer chunkBufferM17512C = findTail.m17512C();
            if (chunkBufferM17512C == null) {
                return findTail;
            }
            findTail = chunkBufferM17512C;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m17479b(ChunkBuffer remainingAll) {
        Intrinsics.m18599g(remainingAll, "$this$remainingAll");
        long j = 0;
        do {
            BufferSharedState bufferSharedState = remainingAll.f47348a;
            j += (long) (bufferSharedState.f47353b - bufferSharedState.f47352a);
            remainingAll = remainingAll.m17512C();
        } while (remainingAll != null);
        return j;
    }
}
