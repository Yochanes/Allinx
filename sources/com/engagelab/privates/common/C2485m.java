package com.engagelab.privates.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.core.constants.MTCoreConstants;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.engagelab.privates.common.m */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2485m {

    /* JADX INFO: renamed from: a */
    public static Map<String, SharedPreferences> f35146a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m13019a(Context context, Set<String> set) {
        m13044m(context).edit().putStringSet("g_s_ar", set).commit();
    }

    /* JADX INFO: renamed from: b */
    public static void m13025b(Context context, Set<String> set) {
        m13044m(context).edit().putStringSet("http_address", set).commit();
    }

    /* JADX INFO: renamed from: c */
    public static void m13028c(Context context, Set<String> set) {
        m13044m(context).edit().putStringSet("tcp_address", set).commit();
    }

    /* JADX INFO: renamed from: d */
    public static void m13033d(Context context, Set<String> set) {
        m13044m(context).edit().putStringSet("tcp_address_ssl", set).commit();
    }

    /* JADX INFO: renamed from: e */
    public static void m13036e(Context context, Set<String> set) {
        m13044m(context).edit().putStringSet("udp_address", set).commit();
    }

    /* JADX INFO: renamed from: f */
    public static int m13037f(Context context) {
        return m13044m(context).getInt("login_code", -1);
    }

    /* JADX INFO: renamed from: g */
    public static String m13038g(Context context) {
        return m13044m(context).getString("p_w_d", "");
    }

    /* JADX INFO: renamed from: h */
    public static byte m13039h(Context context) {
        return (byte) m13044m(context).getInt("platform_state", 0);
    }

    /* JADX INFO: renamed from: i */
    public static int m13040i(Context context) {
        return m13044m(context).getInt("register_code", -1);
    }

    /* JADX INFO: renamed from: j */
    public static String m13041j(Context context) {
        return m13044m(context).getString(MTCoreConstants.Register.KEY_REGISTRATION_ID, "");
    }

    /* JADX INFO: renamed from: k */
    public static int m13042k(Context context) {
        return m13044m(context).getInt(MTCoreConstants.Login.KEY_SEED_ID, 0);
    }

    /* JADX INFO: renamed from: l */
    public static long m13043l(Context context) {
        return m13044m(context).getLong(MTCoreConstants.Login.KEY_SERVER_TIME, 0L);
    }

    /* JADX INFO: renamed from: m */
    public static SharedPreferences m13044m(Context context) {
        String str = "com.engagelab.privates.core.prefs." + MTGlobal.getAppKey(context);
        SharedPreferences sharedPreferences = f35146a.get(str);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
        f35146a.put(str, sharedPreferences2);
        return sharedPreferences2;
    }

    /* JADX INFO: renamed from: n */
    public static Set<String> m13045n(Context context) {
        return m13044m(context).getStringSet("tcp_address", new LinkedHashSet());
    }

    /* JADX INFO: renamed from: o */
    public static Set<String> m13046o(Context context) {
        return m13044m(context).getStringSet("tcp_address_ssl", new LinkedHashSet());
    }

    /* JADX INFO: renamed from: p */
    public static int m13047p(Context context) {
        return m13044m(context).getInt("tcp_address_ssl_c_v", -1);
    }

    /* JADX INFO: renamed from: q */
    public static Set<String> m13048q(Context context) {
        return m13044m(context).getStringSet("udp_address", new LinkedHashSet());
    }

    /* JADX INFO: renamed from: r */
    public static long m13049r(Context context) {
        return m13044m(context).getLong(MTCoreConstants.Register.KEY_USER_ID, 0L);
    }

    /* JADX INFO: renamed from: s */
    public static String m13050s(Context context) {
        return m13044m(context).getString("user_language", "");
    }

    /* JADX INFO: renamed from: a */
    public static void m13017a(Context context, long j) {
        m13044m(context).edit().putLong(MTCoreConstants.Login.KEY_SERVER_TIME, j).commit();
    }

    /* JADX INFO: renamed from: b */
    public static void m13023b(Context context, long j) {
        m13044m(context).edit().putLong(MTCoreConstants.Register.KEY_USER_ID, j).commit();
    }

    /* JADX INFO: renamed from: c */
    public static void m13026c(Context context, int i) {
        m13044m(context).edit().putInt("register_code", i).commit();
    }

    /* JADX INFO: renamed from: d */
    public static Set<String> m13030d(Context context) {
        return m13044m(context).getStringSet("g_s_ar", new LinkedHashSet());
    }

    /* JADX INFO: renamed from: e */
    public static void m13035e(Context context, int i) {
        m13044m(context).edit().putInt("tcp_address_ssl_c_v", i).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m13020a(Context context, boolean z2) {
        m13044m(context).edit().putBoolean("connect_state", z2).commit();
    }

    /* JADX INFO: renamed from: b */
    public static void m13024b(Context context, String str) {
        m13044m(context).edit().putString("p_w_d", str).commit();
    }

    /* JADX INFO: renamed from: c */
    public static void m13027c(Context context, String str) {
        m13044m(context).edit().putString(MTCoreConstants.Register.KEY_REGISTRATION_ID, str).commit();
    }

    /* JADX INFO: renamed from: d */
    public static void m13031d(Context context, int i) {
        m13044m(context).edit().putInt(MTCoreConstants.Login.KEY_SEED_ID, i).commit();
    }

    /* JADX INFO: renamed from: e */
    public static Set<String> m13034e(Context context) {
        return m13044m(context).getStringSet("http_address", new LinkedHashSet());
    }

    /* JADX INFO: renamed from: a */
    public static void m13015a(Context context, byte b2) {
        m13044m(context).edit().putInt("platform_state", b2).commit();
    }

    /* JADX INFO: renamed from: b */
    public static void m13022b(Context context, int i) {
        m13044m(context).edit().putInt("login_code", i).commit();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m13029c(Context context) {
        return m13044m(context).getBoolean("connect_state", true);
    }

    /* JADX INFO: renamed from: d */
    public static void m13032d(Context context, String str) {
        m13044m(context).edit().putString("user_language", str).commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m13016a(Context context, int i) {
        m13044m(context).edit().putInt("connect_ssl_c_v", i).commit();
    }

    /* JADX INFO: renamed from: b */
    public static int m13021b(Context context) {
        return m13044m(context).getInt("connect_ssl_c_v", -1);
    }

    /* JADX INFO: renamed from: a */
    public static String m13014a(Context context) {
        return m13044m(context).getString("connect_ssl_crt", "");
    }

    /* JADX INFO: renamed from: a */
    public static void m13018a(Context context, String str) {
        m13044m(context).edit().putString("connect_ssl_crt", str).commit();
    }
}
