package androidx.camera.core;

import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public final class Logger {

    /* JADX INFO: renamed from: a */
    public static int f2321a = 3;

    /* JADX INFO: renamed from: a */
    public static void m1280a(String str, String str2) {
        String strM1287h = m1287h(str);
        if (m1286g(3, strM1287h)) {
            Log.d(strM1287h, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1281b(String str, String str2, Throwable th) {
        String strM1287h = m1287h(str);
        if (m1286g(3, strM1287h)) {
            Log.d(strM1287h, str2, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1282c(String str, String str2) {
        String strM1287h = m1287h(str);
        if (m1286g(6, strM1287h)) {
            Log.e(strM1287h, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1283d(String str, String str2, Throwable th) {
        String strM1287h = m1287h(str);
        if (m1286g(6, strM1287h)) {
            Log.e(strM1287h, str2, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1284e(String str, String str2) {
        String strM1287h = m1287h(str);
        if (m1286g(4, strM1287h)) {
            Log.i(strM1287h, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1285f(String str) {
        return m1286g(3, m1287h(str));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1286g(int i, String str) {
        return f2321a <= i || Log.isLoggable(str, i);
    }

    /* JADX INFO: renamed from: h */
    public static String m1287h(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* JADX INFO: renamed from: i */
    public static void m1288i(String str, String str2) {
        String strM1287h = m1287h(str);
        if (m1286g(5, strM1287h)) {
            Log.w(strM1287h, str2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1289j(String str, String str2, Throwable th) {
        String strM1287h = m1287h(str);
        if (m1286g(5, strM1287h)) {
            Log.w(strM1287h, str2, th);
        }
    }
}
