package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.C2394a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class NetworkCache {

    /* JADX INFO: renamed from: a */
    public final C2394a f34751a;

    public NetworkCache(C2394a c2394a) {
        this.f34751a = c2394a;
    }

    /* JADX INFO: renamed from: a */
    public static String m12675a(String str, FileExtension fileExtension, boolean z2) {
        String strConcat = fileExtension.f34750a;
        if (z2) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return AbstractC0000a.m3D("lottie_cache_", strReplaceAll, strConcat);
    }

    /* JADX INFO: renamed from: b */
    public final File m12676b() {
        File file = new File(this.f34751a.f34113a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: c */
    public final File m12677c(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(m12676b(), m12675a(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }
}
