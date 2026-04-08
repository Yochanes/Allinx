package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.core.internal.UTF8Kt;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-io"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class BufferCompatibilityKt {
    /* JADX INFO: renamed from: a */
    public static final Buffer m17470a(IoBuffer ioBuffer, CharSequence charSequence) {
        return charSequence == null ? m17470a(ioBuffer, "null") : m17471b(ioBuffer, charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: b */
    public static final Buffer m17471b(IoBuffer ioBuffer, CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return m17471b(ioBuffer, "null", i, i2);
        }
        BufferSharedState bufferSharedState = ioBuffer.f47348a;
        int iM17524a = UTF8Kt.m17524a(ioBuffer.f47350c, charSequence, i, i2, bufferSharedState.f47353b, bufferSharedState.f47355d);
        int i3 = ((short) (iM17524a >>> 16)) & 65535;
        ioBuffer.m17459a(((short) (iM17524a & 65535)) & 65535);
        if (i3 + i == i2) {
            return ioBuffer;
        }
        throw new BufferLimitExceededException(AbstractC0000a.m10g(i2 - i, "Not enough free space available to write ", " character(s)."));
    }
}
