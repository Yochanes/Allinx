package io.ktor.http.cio.websocket;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"io/ktor/http/cio/websocket/UtilsKt__UtilsJvmKt", "io/ktor/http/cio/websocket/UtilsKt__UtilsKt"}, m18303k = 4, m18304mv = {1, 4, 2})
public final class UtilsKt {
    public static final int flagAt(boolean z2, int i) {
        return UtilsKt__UtilsKt.flagAt(z2, i);
    }

    public static final byte xor(byte b2, byte b3) {
        return UtilsKt__UtilsKt.xor(b2, b3);
    }

    public static final void xor(@NotNull ByteBuffer byteBuffer, @NotNull ByteBuffer byteBuffer2) {
        UtilsKt__UtilsJvmKt.xor(byteBuffer, byteBuffer2);
    }
}
