package io.ktor.http.cio.websocket;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0004"}, m18302d2 = {"xor", "", "Ljava/nio/ByteBuffer;", "other", "ktor-http-cio"}, m18303k = 5, m18304mv = {1, 4, 2}, m18307xs = "io/ktor/http/cio/websocket/UtilsKt")
final /* synthetic */ class UtilsKt__UtilsJvmKt {
    public static final void xor(@NotNull ByteBuffer xor, @NotNull ByteBuffer other) {
        Intrinsics.m18599g(xor, "$this$xor");
        Intrinsics.m18599g(other, "other");
        ByteBuffer byteBufferSlice = xor.slice();
        ByteBuffer byteBufferSlice2 = other.slice();
        int iRemaining = byteBufferSlice2.remaining();
        int iRemaining2 = byteBufferSlice.remaining();
        for (int i = 0; i < iRemaining2; i++) {
            byteBufferSlice.put(i, (byte) (byteBufferSlice.get(i) ^ byteBufferSlice2.get(i % iRemaining)));
        }
    }
}
