package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"okhttp-logging-interceptor"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Utf8Kt {
    /* JADX INFO: renamed from: a */
    public static final boolean m21552a(Buffer buffer) {
        Buffer buffer2;
        int i;
        Intrinsics.m18599g(buffer, "<this>");
        try {
            buffer2 = new Buffer();
            long j = buffer.f57830b;
            long j2 = 64;
            if (j <= 64) {
                j2 = j;
            }
            buffer.m21593h(buffer2, 0L, j2);
        } catch (EOFException unused) {
        }
        for (i = 0; i < 16; i++) {
            if (buffer2.m21595i()) {
                return true;
            }
            int iM21598j0 = buffer2.m21598j0();
            if (Character.isISOControl(iM21598j0) && !Character.isWhitespace(iM21598j0)) {
                return false;
            }
        }
        return true;
    }
}
