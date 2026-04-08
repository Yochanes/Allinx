package com.airbnb.lottie.utils;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Logger {

    /* JADX INFO: renamed from: a */
    public static final LogcatLogger f34863a = new LogcatLogger();

    /* JADX INFO: renamed from: a */
    public static void m12735a() {
        f34863a.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m12736b(String str) {
        f34863a.getClass();
        HashSet hashSet = LogcatLogger.f34862a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m12737c(String str, Throwable th) {
        f34863a.getClass();
        HashSet hashSet = LogcatLogger.f34862a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
