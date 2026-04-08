package com.engagelab.privates.common.utils;

import com.engagelab.privates.common.log.MTCommonLog;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class GZipUtil {
    private static final String TAG = "GZipUtil";

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                AbstractC2929c.m13709n(TAG, new StringBuilder("closeQuietly failed "), th);
            }
        }
    }

    public static byte[] unzip(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        try {
            byte[] bArr2 = new byte[256];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i < 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (Throwable th) {
            try {
                MTCommonLog.m13013w(TAG, "unzip failed " + th.getMessage());
                closeQuietly(byteArrayOutputStream);
                closeQuietly(byteArrayInputStream);
                closeQuietly(gZIPInputStream);
                return null;
            } finally {
                closeQuietly(byteArrayOutputStream);
                closeQuietly(byteArrayInputStream);
                closeQuietly(gZIPInputStream);
            }
        }
    }

    public static byte[] zip(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                MTCommonLog.m13013w(TAG, "zip failed " + th.getMessage());
                closeQuietly(byteArrayOutputStream);
                closeQuietly(gZIPOutputStream);
                return null;
            } finally {
                closeQuietly(byteArrayOutputStream);
                closeQuietly(gZIPOutputStream);
            }
        }
    }
}
