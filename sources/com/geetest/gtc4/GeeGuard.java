package com.geetest.gtc4;

import android.content.Context;
import com.geetest.gtc4.C3630c;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class GeeGuard {

    /* JADX INFO: compiled from: Proguard */
    public interface CallbackHandler {
        void onCompletion(Integer num, GeeGuardReceipt geeGuardReceipt);
    }

    public static GeeGuardReceipt fetchReceipt(Context context, String str) {
        C3630c c3630c = C3630c.a.f42342a;
        String str2 = c3630c.f42341a;
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        return C3629b.m14398a(context, c3630c.f42341a, str);
    }

    @Deprecated
    public static String getData(Context context, GeeGuardConfiguration geeGuardConfiguration) {
        return Core.getData(context.getApplicationContext(), geeGuardConfiguration);
    }

    public static boolean getLogEnabled() {
        return C3628a.f42340a;
    }

    public static String getVersion() {
        return "2.3.0.3";
    }

    public static void register(Context context, String str) {
        C3630c.a.f42342a.m14403a(context, str);
    }

    public static void setLogEnabled(boolean z2) {
        C3628a.f42340a = z2;
    }

    public static void submitReceipt(Context context, String str, int i, CallbackHandler callbackHandler) {
        C3630c c3630c = C3630c.a.f42342a;
        String str2 = c3630c.f42341a;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        C3629b.m14399a(context, c3630c.f42341a, str, i, callbackHandler);
    }

    @Deprecated
    public static GeeGuardReceipt fetchReceipt(Context context, String str, String str2) {
        return C3629b.m14398a(context, str, str2);
    }

    public static void submitReceipt(Context context, String str, CallbackHandler callbackHandler) {
        C3630c c3630c = C3630c.a.f42342a;
        String str2 = c3630c.f42341a;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        C3629b.m14399a(context, c3630c.f42341a, str, 5000, callbackHandler);
    }

    @Deprecated
    public static void submitReceipt(Context context, String str, String str2, int i, CallbackHandler callbackHandler) {
        C3629b.m14399a(context, str, str2, i, callbackHandler);
    }

    @Deprecated
    public static void submitReceipt(Context context, String str, String str2, CallbackHandler callbackHandler) {
        C3629b.m14399a(context, str, str2, 5000, callbackHandler);
    }
}
