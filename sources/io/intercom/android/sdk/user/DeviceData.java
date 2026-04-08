package io.intercom.android.sdk.user;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.engagelab.privates.push.constants.MTPushConstants;
import io.intercom.android.sdk.api.PlatformIdentifierUtilKt;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DeviceData {
    private static final String PREFS_PUSH_TOKEN = "push_token";

    public static void cacheDeviceToken(Context context, String str) {
        getPreferences(context).edit().putString(PREFS_PUSH_TOKEN, str).apply();
    }

    public static Map<String, Object> generateDeviceData(Context context) {
        HashMap map = new HashMap();
        map.put("platform_version", Build.VERSION.RELEASE);
        map.put("sdk_type", PlatformIdentifierUtilKt.getPlatformIdentifier(context));
        map.put(MTPushConstants.PlatformNode.KEY_PLATFORM, Build.MODEL);
        map.put("browser", "Intercom-Android-SDK");
        map.put("version", DeviceUtils.getAppVersion(context));
        map.put("application", getApplicationName(context));
        map.put("application_id", DeviceUtils.getAppName(context));
        map.put("language", Locale.getDefault().getDisplayLanguage());
        String string = getPreferences(context).getString(PREFS_PUSH_TOKEN, "");
        if (!string.isEmpty()) {
            map.put("device_token", string);
        }
        return map;
    }

    public static String getApplicationName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            return (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "").toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getDeviceToken(Context context) {
        return getPreferences(context).getString(PREFS_PUSH_TOKEN, "");
    }

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PreferenceKeys.INTERCOM_DATA_PREFS, 0);
    }

    public static boolean hasCachedDeviceToken(Context context, String str) {
        return str.equals(getDeviceToken(context));
    }
}
