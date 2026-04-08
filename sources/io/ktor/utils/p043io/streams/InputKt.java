package io.ktor.utils.p043io.streams;

import io.ktor.utils.p043io.core.internal.ChunkBuffer;
import io.ktor.utils.p043io.core.internal.ChunkBuffer$Companion$Pool$1;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class InputKt {
    /* JADX INFO: renamed from: a */
    public static InputStreamAsInput m17576a(InputStream inputStream) {
        ChunkBuffer.f47375o.getClass();
        ChunkBuffer$Companion$Pool$1 pool = ChunkBuffer.f47373j;
        Intrinsics.m18599g(pool, "pool");
        return new InputStreamAsInput(inputStream, pool);
    }
}
