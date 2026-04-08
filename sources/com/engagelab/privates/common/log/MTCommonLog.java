package com.engagelab.privates.common.log;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.engagelab.privates.common.BuildConfig;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import org.json.JSONObject;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTCommonLog {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    /* JADX INFO: renamed from: d */
    public static void m13010d(String str, String str2) {
        if (MTGlobal.getDebugMode()) {
            Log.d(getTag(), "[" + str + "] " + str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m13011e(String str, String str2) {
        Log.e(getTag(), "[" + str + "] " + str2);
    }

    private static String getLogTag() {
        try {
            String name = Thread.currentThread().getName();
            if (TextUtils.isEmpty(name)) {
                return MTCommonConstants.getLogTag() + "SDK";
            }
            if (TextUtils.equals(name, Looper.getMainLooper().getThread().getName())) {
                return MTCommonConstants.getLogTag() + "MAIN";
            }
            if (name.startsWith(MTCommonConstants.getLogTag())) {
                return name;
            }
            return MTCommonConstants.getLogTag() + name;
        } catch (Throwable unused) {
            return MTCommonConstants.getLogTag() + "SDK";
        }
    }

    private static String getTag() {
        return AbstractC0000a.m19p(new StringBuilder(), getLogTag(), BuildConfig.LOG_TAG);
    }

    /* JADX INFO: renamed from: i */
    public static void m13012i(String str, String str2) {
        Log.i(getTag(), "[" + str + "] " + str2);
    }

    public static String toLogString(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{ ");
            for (String str : bundle.keySet()) {
                sb.append(str);
                sb.append(":");
                sb.append(bundle.get(str));
                sb.append(" ");
            }
            sb.append("}");
            return sb.toString();
        } catch (Throwable unused) {
            return bundle.toString();
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m13013w(String str, String str2) {
        if (MTGlobal.getDebugMode()) {
            Log.w(getTag(), "[" + str + "] " + str2);
        }
    }

    public static String toLogString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "null";
        }
        try {
            return LINE_SEPARATOR + jSONObject.toString(2);
        } catch (Throwable unused) {
            return jSONObject.toString();
        }
    }
}
