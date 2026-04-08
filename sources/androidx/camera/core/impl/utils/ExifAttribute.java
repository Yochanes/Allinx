package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class ExifAttribute {

    /* JADX INFO: renamed from: d */
    public static final Charset f2857d = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: e */
    public static final String[] f2858e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: f */
    public static final int[] f2859f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: a */
    public final int f2860a;

    /* JADX INFO: renamed from: b */
    public final int f2861b;

    /* JADX INFO: renamed from: c */
    public final byte[] f2862c;

    public ExifAttribute(byte[] bArr, int i, int i2) {
        this.f2860a = i;
        this.f2861b = i2;
        this.f2862c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static ExifAttribute m1595a(long j, ByteOrder byteOrder) {
        return m1596b(new long[]{j}, byteOrder);
    }

    /* JADX INFO: renamed from: b */
    public static ExifAttribute m1596b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f2859f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new ExifAttribute(byteBufferWrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(f2858e[this.f2860a]);
        sb.append(", data length:");
        return AbstractC0000a.m11h(this.f2862c.length, ")", sb);
    }
}
