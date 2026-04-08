package org.mp4parser.tools;

import java.nio.ByteBuffer;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IsoTypeWriter {
    /* JADX INFO: renamed from: a */
    public static void m21850a(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: b */
    public static void m21851b(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: c */
    public static void m21852c(ByteBuffer byteBuffer, double d) {
        short s = (short) (d * 256.0d);
        byteBuffer.put((byte) ((65280 & s) >> 8));
        byteBuffer.put((byte) (s & 255));
    }

    /* JADX INFO: renamed from: d */
    public static void m21853d(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException(AbstractC0000a.m3D("\"", str, "\" language string isn't exactly 3 characters long!"));
        }
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
        }
        m21854e(i, byteBuffer);
    }

    /* JADX INFO: renamed from: e */
    public static void m21854e(int i, ByteBuffer byteBuffer) {
        m21857h((65535 & i) >> 8, byteBuffer);
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: f */
    public static void m21855f(int i, ByteBuffer byteBuffer) {
        m21857h(i & 255, byteBuffer);
        byteBuffer.put((byte) (((65535 & i) >> 8) & 255));
    }

    /* JADX INFO: renamed from: g */
    public static void m21856g(int i, ByteBuffer byteBuffer) {
        m21854e((16777215 & i) >> 8, byteBuffer);
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: h */
    public static void m21857h(int i, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: i */
    public static void m21858i(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(Utf8.m21860a(str));
        byteBuffer.put((byte) 0);
    }
}
