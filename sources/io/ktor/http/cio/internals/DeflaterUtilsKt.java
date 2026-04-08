package io.ktor.http.cio.internals;

import io.ktor.utils.p043io.core.BytePacketBuilder;
import io.ktor.utils.p043io.core.OutputArraysJVMKt;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http-cio"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class DeflaterUtilsKt {

    /* JADX INFO: renamed from: a */
    public static final byte[] f45910a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f45911b;

    static {
        byte b2 = (byte) 255;
        f45910a = new byte[]{0, 0, 0, b2, b2};
        f45911b = new byte[]{0, 0, b2, b2};
    }

    /* JADX INFO: renamed from: a */
    public static final int m17044a(BytePacketBuilder bytePacketBuilder, Deflater deflater, ByteBuffer byteBuffer, boolean z2) {
        byteBuffer.clear();
        int iDeflate = z2 ? deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2) : deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (iDeflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + iDeflate);
        byteBuffer.flip();
        OutputArraysJVMKt.m17498a(bytePacketBuilder, byteBuffer);
        return iDeflate;
    }
}
