package io.intercom.android.sdk.utilities.commons;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DeviceUtils {
    public static String getAppMinSdkVersionVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return "";
        }
    }

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        return packageName == null ? "" : packageName;
    }

    public static String getAppVersion(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str != null ? str : "";
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return "";
        }
    }

    public static boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
