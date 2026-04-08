package com.chiclaim.android.downloader.util;

import com.google.common.base.Ascii;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/chiclaim/android/downloader/util/MD5;", "", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class MD5 {

    /* JADX INFO: renamed from: a */
    public static final String[] f35108a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    /* JADX INFO: renamed from: a */
    public static String m12875a(String str) {
        Intrinsics.m18599g(str, "str");
        byte[] bytes = str.getBytes(Charsets.f55167a);
        Intrinsics.m18598f(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bytes);
        Intrinsics.m18598f(bArrDigest, "md.digest(origin)");
        StringBuilder sb = new StringBuilder();
        int length = bArrDigest.length;
        int i = 0;
        while (i < length) {
            byte b2 = bArrDigest[i];
            i++;
            String[] strArr = f35108a;
            sb.append(Intrinsics.m18604l(strArr[b2 & Ascii.f42543SI], strArr[(b2 & 240) >> 4]));
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "buf.toString()");
        return string;
    }
}
