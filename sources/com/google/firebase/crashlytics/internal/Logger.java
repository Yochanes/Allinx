package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    /* JADX INFO: renamed from: d */
    public void m15162d(String str, Throwable th) {
        if (canLog(3)) {
            Log.d(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15164e(String str, Throwable th) {
        if (canLog(6)) {
            Log.e(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m15166i(String str, Throwable th) {
        if (canLog(4)) {
            Log.i(this.tag, str, th);
        }
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* JADX INFO: renamed from: v */
    public void m15168v(String str, Throwable th) {
        if (canLog(2)) {
            Log.v(this.tag, str, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m15170w(String str, Throwable th) {
        if (canLog(5)) {
            Log.w(this.tag, str, th);
        }
    }

    public void log(int i, String str, boolean z2) {
        if (z2 || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15161d(String str) {
        m15162d(str, null);
    }

    /* JADX INFO: renamed from: e */
    public void m15163e(String str) {
        m15164e(str, null);
    }

    /* JADX INFO: renamed from: i */
    public void m15165i(String str) {
        m15166i(str, null);
    }

    /* JADX INFO: renamed from: v */
    public void m15167v(String str) {
        m15168v(str, null);
    }

    /* JADX INFO: renamed from: w */
    public void m15169w(String str) {
        m15170w(str, null);
    }
}
