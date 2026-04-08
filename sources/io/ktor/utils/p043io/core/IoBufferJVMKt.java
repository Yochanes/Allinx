package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.bits.MemoryJvmKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class IoBufferJVMKt {
    /* JADX INFO: renamed from: a */
    public static final void m17497a(Buffer readFully, ByteBuffer dst, int i) throws EOFException {
        Intrinsics.m18599g(readFully, "$this$readFully");
        Intrinsics.m18599g(dst, "dst");
        ByteBuffer byteBuffer = readFully.f47350c;
        BufferSharedState bufferSharedState = readFully.f47348a;
        int i2 = bufferSharedState.f47352a;
        if (bufferSharedState.f47353b - i2 < i) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i + '.');
        }
        int iLimit = dst.limit();
        try {
            dst.limit(dst.position() + i);
            MemoryJvmKt.m17410a(byteBuffer, dst, i2);
            dst.limit(iLimit);
            readFully.m17461d(i);
        } catch (Throwable th) {
            dst.limit(iLimit);
            throw th;
        }
    }
}
