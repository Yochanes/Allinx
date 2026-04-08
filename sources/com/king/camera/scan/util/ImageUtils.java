package com.king.camera.scan.util;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.SettableImageProxy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ImageUtils {
    /* JADX INFO: renamed from: a */
    public static void m15341a(SettableImageProxy settableImageProxy, byte[] bArr) {
        int i;
        int i2;
        ImageProxy imageProxy = settableImageProxy.f2265b;
        ImageProxy.PlaneProxy planeProxy = imageProxy.mo1179m()[0];
        ImageProxy.PlaneProxy planeProxy2 = imageProxy.mo1179m()[1];
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.mo1179m()[2];
        ByteBuffer byteBufferMo1181c = planeProxy.mo1181c();
        ByteBuffer byteBufferMo1181c2 = planeProxy2.mo1181c();
        ByteBuffer byteBufferMo1181c3 = planeProxy3.mo1181c();
        byteBufferMo1181c.rewind();
        byteBufferMo1181c2.rewind();
        byteBufferMo1181c3.rewind();
        int iRemaining = byteBufferMo1181c.remaining();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = settableImageProxy.f2359g;
            i2 = settableImageProxy.f2360i;
            if (i3 >= i2) {
                break;
            }
            byteBufferMo1181c.get(bArr, i4, i);
            i4 += i;
            byteBufferMo1181c.position(Math.min(iRemaining, planeProxy.mo1182d() + (byteBufferMo1181c.position() - i)));
            i3++;
        }
        int i5 = i2 / 2;
        int i6 = i / 2;
        int iMo1182d = planeProxy3.mo1182d();
        int iMo1182d2 = planeProxy2.mo1182d();
        int iMo1183e = planeProxy3.mo1183e();
        int iMo1183e2 = planeProxy2.mo1183e();
        byte[] bArr2 = new byte[iMo1182d];
        byte[] bArr3 = new byte[iMo1182d2];
        for (int i7 = 0; i7 < i5; i7++) {
            byteBufferMo1181c3.get(bArr2, 0, Math.min(iMo1182d, byteBufferMo1181c3.remaining()));
            byteBufferMo1181c2.get(bArr3, 0, Math.min(iMo1182d2, byteBufferMo1181c2.remaining()));
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                int i11 = i4 + 1;
                bArr[i4] = bArr2[i8];
                i4 += 2;
                bArr[i11] = bArr3[i9];
                i8 += iMo1183e;
                i9 += iMo1183e2;
            }
        }
    }
}
