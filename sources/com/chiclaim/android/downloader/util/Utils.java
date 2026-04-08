package com.chiclaim.android.downloader.util;

import android.content.Context;
import android.database.Cursor;
import com.chiclaim.android.downloader.DownloadException;
import com.exchange.allin.R;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/chiclaim/android/downloader/util/Utils;", "", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class Utils {
    /* JADX WARN: Type inference failed for: r1v2, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: a */
    public static final Serializable m12878a(Cursor cursor, int i, Class cls) {
        if (cls.equals(String.class)) {
            return cursor.getString(i);
        }
        if (cls.equals(Long.class)) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (cls.equals(Integer.class)) {
            return Integer.valueOf(cursor.getInt(i));
        }
        if (cls.equals(Short.class)) {
            return Short.valueOf(cursor.getShort(i));
        }
        if (cls.equals(Float.class)) {
            return Float.valueOf(cursor.getFloat(i));
        }
        if (cls.equals(Double.class)) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (cls.equals(Boolean.class)) {
            return Boolean.valueOf(cursor.getInt(i) != 0);
        }
        if (cls.equals(byte[].class)) {
            return cursor.getBlob(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m12879b(Context context, Throwable th) {
        Intrinsics.m18599g(context, "context");
        if (th instanceof DownloadException) {
            DownloadException downloadException = (DownloadException) th;
            int i = downloadException.f35032a;
            if (i == 1) {
                String string = context.getString(R.string.downloader_notifier_content_without_network);
                Intrinsics.m18598f(string, "context.getString(R.stri…_content_without_network)");
                return string;
            }
            if (i == 5) {
                String string2 = context.getString(R.string.downloader_notifier_content_too_many_redirects);
                Intrinsics.m18598f(string2, "context.getString(R.stri…ntent_too_many_redirects)");
                return string2;
            }
            if (i == 6) {
                String string3 = context.getString(R.string.downloader_notifier_content_partial_error);
                Intrinsics.m18598f(string3, "context.getString(R.stri…er_content_partial_error)");
                return string3;
            }
            if (i != 7) {
                String string4 = context.getString(R.string.downloader_notifier_content_unhandled_err, Integer.valueOf(downloadException.f35033b));
                Intrinsics.m18598f(string4, "context.getString(\n     …ode\n                    )");
                return string4;
            }
            String string5 = context.getString(R.string.downloader_notifier_content_missing_location);
            Intrinsics.m18598f(string5, "context.getString(R.stri…content_missing_location)");
            return string5;
        }
        if (th instanceof SocketTimeoutException) {
            String string6 = context.getString(R.string.downloader_notifier_content_network_timeout);
            Intrinsics.m18598f(string6, "context.getString(R.stri…_content_network_timeout)");
            return string6;
        }
        if (th instanceof SocketException) {
            String string7 = context.getString(R.string.downloader_notifier_content_without_network);
            Intrinsics.m18598f(string7, "context.getString(R.stri…_content_without_network)");
            return string7;
        }
        if (th instanceof ConnectException) {
            String string8 = context.getString(R.string.downloader_notifier_content_without_network);
            Intrinsics.m18598f(string8, "context.getString(R.stri…_content_without_network)");
            return string8;
        }
        if (th instanceof UnknownHostException) {
            String string9 = context.getString(R.string.downloader_notifier_content_without_network);
            Intrinsics.m18598f(string9, "context.getString(R.stri…_content_without_network)");
            return string9;
        }
        String message = th.getMessage();
        if (message == null) {
            message = th.getClass().getName();
        }
        String string10 = context.getString(R.string.downloader_notifier_content_err_placeholder, message);
        Intrinsics.m18598f(string10, "context.getString(\n     …va.name\n                )");
        return string10;
    }
}
