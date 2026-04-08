package androidx.profileinstaller;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class Encoding {
    /* JADX INFO: renamed from: a */
    public static byte[] m11493a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m11494b(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(AbstractC0000a.m9f(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m11495c(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m11496d(InputStream inputStream, int i) throws IOException {
        byte[] bArrM11494b = m11494b(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM11494b[i2] & UnsignedBytes.MAX_VALUE)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public static void m11497e(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: f */
    public static void m11498f(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m11497e(byteArrayOutputStream, i, 2);
    }
}
