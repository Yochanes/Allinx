package me.jessyan.retrofiturlmanager;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class Utils {
    private Utils() {
        throw new IllegalStateException("do not instantiation me");
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static HttpUrl checkUrl(String str) throws EOFException {
        HttpUrl httpUrlM21276c;
        Intrinsics.m18599g(str, "<this>");
        try {
            httpUrlM21276c = HttpUrl.Companion.m21276c(str);
        } catch (IllegalArgumentException unused) {
            httpUrlM21276c = null;
        }
        if (httpUrlM21276c != null) {
            return httpUrlM21276c;
        }
        throw new InvalidUrlException(str);
    }
}
