package com.engagelab.privates.common.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SystemUtil {
    private static final String TAG = "SystemUtil";

    public static String getCountry(Context context) {
        Object objInvoke;
        try {
            Object systemService = context.getApplicationContext().getSystemService("country_detector");
            if (systemService == null || (objInvoke = systemService.getClass().getDeclaredMethod("detectCountry", new Class[0]).invoke(systemService, new Object[0])) == null) {
                return "";
            }
            String str = (String) objInvoke.getClass().getDeclaredMethod("getCountryIso", new Class[0]).invoke(objInvoke, new Object[0]);
            int iIntValue = ((Integer) objInvoke.getClass().getDeclaredMethod("getSource", new Class[0]).invoke(objInvoke, new Object[0])).intValue();
            return (iIntValue == 0 || iIntValue == 1) ? str : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getSystemProperty(Context context, String str, String str2) {
        try {
            return (String) ReflectUtil.invokeStaticMethod(context.getClassLoader().loadClass("android.os.SystemProperties"), "get", new Object[]{str, str2}, new Class[]{String.class, String.class});
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean isNetworkConnecting(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int isSystemApp(Context context) {
        try {
            String str = context.getApplicationInfo().sourceDir;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            if (str.startsWith("/system/app/")) {
                return 1;
            }
            str.startsWith("/data/app/");
        } catch (Throwable unused) {
        }
        return 0;
    }
}
