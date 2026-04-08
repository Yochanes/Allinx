package com.engagelab.privates.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p001A.AbstractC0000a;

/* JADX INFO: renamed from: com.engagelab.privates.common.c0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2472c0 {

    /* JADX INFO: renamed from: a */
    public static Map<String, SharedPreferences> f35124a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m12910a(Context context, int i) {
        return m12934j(context).getString("notification_layout_" + i, "");
    }

    /* JADX INFO: renamed from: b */
    public static void m12920b(Context context, int i) {
        m12934j(context).edit().putInt(MTPushConstants.NotificationBadge.KEY_BADGE, i).commit();
    }

    /* JADX INFO: renamed from: c */
    public static void m12926c(Context context, String str) {
        m12934j(context).edit().putString("notification_show_time", str).commit();
    }

    /* JADX INFO: renamed from: d */
    public static void m12928d(Context context, String str) {
        m12934j(context).edit().putString("notification_silence_time", str).commit();
    }

    /* JADX INFO: renamed from: e */
    public static int m12929e(Context context) {
        return m12934j(context).getInt(MTPushConstants.NotificationCount.KEY_COUNT, 5);
    }

    /* JADX INFO: renamed from: f */
    public static String m12930f(Context context) {
        return m12934j(context).getString("notification_show_time", "");
    }

    /* JADX INFO: renamed from: g */
    public static String m12931g(Context context) {
        return m12934j(context).getString("notification_silence_time", "");
    }

    /* JADX INFO: renamed from: h */
    public static Set<String> m12932h(Context context) {
        return m12934j(context).getStringSet("override_message_id_set", new LinkedHashSet());
    }

    /* JADX INFO: renamed from: i */
    public static Set<String> m12933i(Context context) {
        return m12934j(context).getStringSet("revoke_message_id_set", new LinkedHashSet());
    }

    /* JADX INFO: renamed from: j */
    public static SharedPreferences m12934j(Context context) {
        String str = "com.engagelab.privates.push.prefs." + MTGlobal.getAppKey(context);
        SharedPreferences sharedPreferences = f35124a.get(str);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        f35124a.put(str, sharedPreferences2);
        return sharedPreferences2;
    }

    /* JADX INFO: renamed from: a */
    public static void m12914a(Context context, int i, String str) {
        m12934j(context).edit().putString("notification_layout_" + i, str).commit();
    }

    /* JADX INFO: renamed from: b */
    public static void m12923b(Context context, Set<String> set) {
        m12934j(context).edit().putStringSet("revoke_message_id_set", set).commit();
    }

    /* JADX INFO: renamed from: c */
    public static void m12925c(Context context, int i) {
        m12934j(context).edit().putInt(MTPushConstants.NotificationCount.KEY_COUNT, i).commit();
    }

    /* JADX INFO: renamed from: d */
    public static int m12927d(Context context) {
        return m12934j(context).getInt(MTPushConstants.NotificationBadge.KEY_BADGE, 0);
    }

    /* JADX INFO: renamed from: a */
    public static Set<String> m12911a(Context context, byte b2) {
        return m12934j(context).getStringSet(AbstractC0000a.m9f(b2, "message_id_set_"), new LinkedHashSet());
    }

    /* JADX INFO: renamed from: b */
    public static String m12919b(Context context, byte b2) {
        return m12934j(context).getString("p_t_k_" + ((int) b2), "");
    }

    /* JADX INFO: renamed from: c */
    public static long m12924c(Context context) {
        return m12934j(context).getLong("last_to_background_time", 0L);
    }

    /* JADX INFO: renamed from: b */
    public static void m12921b(Context context, long j) {
        m12934j(context).edit().putLong("last_to_foreground_time", j).commit();
    }

    /* JADX INFO: renamed from: b */
    public static String m12918b(Context context) {
        return m12934j(context).getString("last_lifecycle_session_json", "");
    }

    /* JADX INFO: renamed from: b */
    public static void m12922b(Context context, String str) {
        m12934j(context).edit().putString("last_lifecycle_session_json", str).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m12913a(Context context, byte b2, Set<String> set) {
        m12934j(context).edit().putStringSet("message_id_set_" + ((int) b2), set).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m12917a(Context context, Set<String> set) {
        m12934j(context).edit().putStringSet("override_message_id_set", set).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m12912a(Context context, byte b2, String str) {
        m12934j(context).edit().putString("p_t_k_" + ((int) b2), str).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m12915a(Context context, long j) {
        m12934j(context).edit().putLong("last_to_background_time", j).commit();
    }

    /* JADX INFO: renamed from: a */
    public static String m12909a(Context context) {
        return m12934j(context).getString("last_lifecycle_session", "");
    }

    /* JADX INFO: renamed from: a */
    public static void m12916a(Context context, String str) {
        m12934j(context).edit().putString("last_lifecycle_session", str).commit();
    }
}
