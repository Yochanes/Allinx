package org.mp4parser.tools;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Utf8 {
    /* JADX INFO: renamed from: a */
    public static byte[] m21860a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m21861b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }
}
