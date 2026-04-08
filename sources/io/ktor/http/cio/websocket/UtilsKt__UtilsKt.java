package io.ktor.http.cio.websocket;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0080\f¨\u0006\u0007"}, m18302d2 = {"flagAt", "", "", "at", "xor", "", "other", "ktor-http-cio"}, m18303k = 5, m18304mv = {1, 4, 2}, m18307xs = "io/ktor/http/cio/websocket/UtilsKt")
final /* synthetic */ class UtilsKt__UtilsKt {
    public static final int flagAt(boolean z2, int i) {
        if (z2) {
            return 1 << i;
        }
        return 0;
    }

    public static final byte xor(byte b2, byte b3) {
        return (byte) (b2 ^ b3);
    }
}
