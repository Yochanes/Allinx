package okhttp3.internal.p047ws;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class WebSocketProtocol {
    /* JADX INFO: renamed from: a */
    public static String m21544a(int i) {
        if (i < 1000 || i >= 5000) {
            return AbstractC0000a.m9f(i, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
            return null;
        }
        return AbstractC0000a.m10g(i, "Code ", " is reserved and may not be used.");
    }

    /* JADX INFO: renamed from: b */
    public static void m21545b(Buffer.UnsafeCursor cursor, byte[] key) {
        long j;
        Intrinsics.m18599g(cursor, "cursor");
        Intrinsics.m18599g(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.f57835f;
            int i2 = cursor.f57836g;
            int i3 = cursor.f57837i;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = cursor.f57834d;
            Buffer buffer = cursor.f57831a;
            Intrinsics.m18596d(buffer);
            if (j2 == buffer.f57830b) {
                throw new IllegalStateException("no more bytes");
            }
            j = cursor.f57834d;
        } while (cursor.m21610b(j == -1 ? 0L : j + ((long) (cursor.f57837i - cursor.f57836g))) != -1);
    }
}
