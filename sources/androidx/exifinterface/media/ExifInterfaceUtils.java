package androidx.exifinterface.media;

import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ExifInterfaceUtils {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: renamed from: a */
    public static void m8891a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static long[] m8892b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8893c(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }
}
