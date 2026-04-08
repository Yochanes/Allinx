package com.engagelab.privates.common.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Utils {
    private static final String TAG = "Utils";
    private static final Object dateLock = new Object();
    private static ConcurrentHashMap<String, ThreadLocal<SimpleDateFormat>> sdfMap = new ConcurrentHashMap<>();

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int dpToPx(Context context, int i) {
        return context == null ? i : (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static double getDistance(double d, double d2, double d3, double d4) {
        double d5 = d2 * 0.008726646259971648d;
        double d6 = d4 * 0.008726646259971648d;
        double d7 = (d - d3) * 0.008726646259971648d;
        return Math.round((Math.asin(Math.sqrt((Math.pow(Math.sin(d7), 2.0d) * (Math.cos(d6 * 2.0d) * Math.cos(d5 * 2.0d))) + Math.pow(Math.sin(d5 - d6), 2.0d))) * 1.2756274E7d) * 10000.0d) / 10000;
    }

    public static ArrayList<String> jsonArray2StringList(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
        }
        return arrayList;
    }

    public static String listToString(Collection<String> collection, String str) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(str);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static DisplayMetrics providesDisplayMetrics(Context context) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context != null && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static byte[] read1024(InputStream inputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (inputStream == null) {
            throw new IOException("InputStream is null");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = null;
        }
        try {
            byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    closeQuietly(byteArrayOutputStream);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th2) {
            th = th2;
            closeQuietly(byteArrayOutputStream);
            throw th;
        }
    }

    public static byte[] readAvailable(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IOException("InputStream is null");
        }
        byte[] bArr = new byte[inputStream.available()];
        inputStream.read(bArr);
        return bArr;
    }

    public static ViewGroup.LayoutParams setViewMargin(Context context, View view, boolean z2, int i, int i2, int i3, int i4) {
        if (context == null || view == null) {
            return null;
        }
        try {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
            if (z2) {
                i = dpToPx(context, i);
                i3 = dpToPx(context, i3);
                i2 = dpToPx(context, i2);
                i4 = dpToPx(context, i4);
            }
            marginLayoutParams.setMargins(i, i2, i3, i4);
            view.setLayoutParams(marginLayoutParams);
            return marginLayoutParams;
        } catch (Throwable th) {
            AbstractC2929c.m13709n(TAG, new StringBuilder("[setViewMargin] failed. err: "), th);
            return null;
        }
    }
}
