package me.jessyan.autosize.utils;

import android.util.Log;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AutoSizeLog {
    private static final String TAG = "AndroidAutoSize";
    private static boolean debug;

    private AutoSizeLog() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    /* JADX INFO: renamed from: d */
    public static void m21167d(String str) {
        if (debug) {
            Log.d(TAG, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m21168e(String str) {
        if (debug) {
            Log.e(TAG, str);
        }
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void setDebug(boolean z2) {
        debug = z2;
    }

    /* JADX INFO: renamed from: w */
    public static void m21169w(String str) {
        if (debug) {
            Log.w(TAG, str);
        }
    }
}
