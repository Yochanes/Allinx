package org.mp4parser.tools;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Hex {

    /* JADX INFO: renamed from: a */
    public static final char[] f59281a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m21848a(int i, byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i > 0 ? length / i : 0)];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (i > 0 && i3 % i == 0 && i2 > 0) {
                cArr[i2] = '-';
                i2++;
            }
            int i4 = i2 + 1;
            char[] cArr2 = f59281a;
            byte b2 = bArr[i3];
            cArr[i2] = cArr2[(b2 & 240) >>> 4];
            i2 += 2;
            cArr[i4] = cArr2[b2 & com.google.common.base.Ascii.f42543SI];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m21849b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        StringBuilder sb = new StringBuilder();
        while (byteBufferDuplicate.remaining() > 0) {
            byte b2 = byteBufferDuplicate.get();
            char[] cArr = f59281a;
            sb.append(cArr[(b2 & 240) >>> 4]);
            sb.append(cArr[b2 & com.google.common.base.Ascii.f42543SI]);
        }
        return sb.toString();
    }
}
