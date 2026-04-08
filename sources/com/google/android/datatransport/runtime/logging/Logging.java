package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static String concatTag(String str, String str2) {
        String strM2C = AbstractC0000a.m2C(str, str2);
        return strM2C.length() > 23 ? strM2C.substring(0, 23) : strM2C;
    }

    /* JADX INFO: renamed from: d */
    public static void m14413d(String str, String str2) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m14417e(String str, String str2, Throwable th) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, str2, th);
        }
    }

    private static String getTag(String str) {
        return Build.VERSION.SDK_INT < 26 ? concatTag(LOG_PREFIX, str) : AbstractC0000a.m13j(LOG_PREFIX, str);
    }

    /* JADX INFO: renamed from: i */
    public static void m14418i(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 4)) {
            Log.i(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m14419w(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 5)) {
            Log.w(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14414d(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14415d(String str, String str2, Object obj, Object obj2) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14416d(String str, String str2, Object... objArr) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, objArr));
        }
    }
}
