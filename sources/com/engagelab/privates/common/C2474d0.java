package com.engagelab.privates.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.engagelab.privates.common.global.MTGlobal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.engagelab.privates.common.d0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2474d0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, SharedPreferences> f35129a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m12948a(Context context) {
        return m12952c(context).getString("platform_token_fail", "");
    }

    /* JADX INFO: renamed from: b */
    public static int m12951b(Context context) {
        return m12952c(context).getInt("platform_token_fail_from", 0);
    }

    /* JADX INFO: renamed from: c */
    public static SharedPreferences m12952c(Context context) {
        String str = "com.engagelab.privates.push.prefs.platform." + MTGlobal.getAppKey(context);
        SharedPreferences sharedPreferences = f35129a.get(str);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        f35129a.put(str, sharedPreferences2);
        return sharedPreferences2;
    }

    /* JADX INFO: renamed from: a */
    public static void m12950a(Context context, String str) {
        m12952c(context).edit().putString("platform_token_fail", str).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m12949a(Context context, int i) {
        m12952c(context).edit().putInt("platform_token_fail_from", i).commit();
    }
}
