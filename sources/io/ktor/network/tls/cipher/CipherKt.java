package io.ktor.network.tls.cipher;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-network-tls"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class CipherKt {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f46342a;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        Intrinsics.m18598f(byteBufferAllocate, "ByteBuffer.allocate(0)");
        f46342a = byteBufferAllocate;
    }

    /* JADX INFO: renamed from: a */
    public static final void m17146a(byte[] bArr, int i, long j) {
        for (int i2 = 0; i2 <= 7; i2++) {
            bArr[i2 + i] = (byte) (j >>> ((7 - i2) * 8));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m17147b(byte[] bArr, short s) {
        for (int i = 0; i <= 1; i++) {
            bArr[i + 11] = (byte) (s >>> ((1 - i) * 8));
        }
    }
}
