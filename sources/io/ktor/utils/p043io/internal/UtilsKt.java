package io.ktor.utils.p043io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class UtilsKt {
    /* JADX INFO: renamed from: a */
    public static final int m17558a(int i, String str) {
        String property;
        Integer numM20428Z;
        try {
            property = System.getProperty("io.ktor.utils.io.".concat(str));
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (numM20428Z = StringsKt.m20428Z(property)) == null) ? i : numM20428Z.intValue();
    }

    /* JADX INFO: renamed from: b */
    public static final int m17559b(ByteBuffer byteBuffer, ByteBuffer sub) {
        Intrinsics.m18599g(sub, "sub");
        int iPosition = sub.position();
        int iRemaining = sub.remaining();
        byte b2 = sub.get(iPosition);
        int iLimit = byteBuffer.limit();
        loop0: for (int iPosition2 = byteBuffer.position(); iPosition2 < iLimit; iPosition2++) {
            if (byteBuffer.get(iPosition2) == b2) {
                for (int i = 1; i < iRemaining; i++) {
                    int i2 = iPosition2 + i;
                    if (i2 == iLimit) {
                        break loop0;
                    }
                    if (byteBuffer.get(i2) != sub.get(iPosition + i)) {
                        break;
                    }
                }
                return iPosition2 - byteBuffer.position();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m17560c(ByteBuffer putAtMost, ByteBuffer byteBuffer, int i) {
        Intrinsics.m18599g(putAtMost, "$this$putAtMost");
        int iRemaining = putAtMost.remaining();
        int iRemaining2 = byteBuffer.remaining();
        if (iRemaining2 <= iRemaining && iRemaining2 <= i) {
            putAtMost.put(byteBuffer);
            return iRemaining2;
        }
        int iMin = Math.min(iRemaining, Math.min(iRemaining2, i));
        int i2 = 1;
        if (1 <= iMin) {
            while (true) {
                putAtMost.put(byteBuffer.get());
                if (i2 == iMin) {
                    break;
                }
                i2++;
            }
        }
        return iMin;
    }

    /* JADX INFO: renamed from: d */
    public static final int m17561d(ByteBuffer putLimited, ByteBuffer byteBuffer, int i) {
        Intrinsics.m18599g(putLimited, "$this$putLimited");
        return m17560c(putLimited, byteBuffer, i - byteBuffer.position());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m17562e(ByteBuffer byteBuffer, ByteBuffer prefix, int i) {
        Intrinsics.m18599g(prefix, "prefix");
        int iMin = Math.min(byteBuffer.remaining(), prefix.remaining() - i);
        if (iMin > 0) {
            int iPosition = byteBuffer.position();
            int iPosition2 = prefix.position() + i;
            for (int i2 = 0; i2 < iMin; i2++) {
                if (byteBuffer.get(iPosition + i2) == prefix.get(iPosition2 + i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
