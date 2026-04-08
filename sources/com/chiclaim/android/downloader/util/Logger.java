package com.chiclaim.android.downloader.util;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"downloader_release"}, m18303k = 2, m18304mv = {1, 6, 0}, m18306xi = 48)
@JvmName
public final class Logger {
    /* JADX INFO: renamed from: a */
    public static final void m12874a(String message) {
        Intrinsics.m18599g(message, "message");
        Log.d("AndroidUpdater", message);
    }
}
