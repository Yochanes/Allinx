package com.geetest.captcha;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.Pair;
import com.google.android.material.snackbar.AbstractC3999a;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.l */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3595l {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"SdCardPath"})
    public static final String[] f42241a = {"/sdcard/.system_log.trace", "/sdcard/tencent/.DrvZPZQ", "/sdcard/alipay/.Wg83DS3"};

    /* JADX INFO: renamed from: a */
    public static Pair<String, String> m14353a(Context context) {
        String string;
        try {
            string = context.getSharedPreferences("gt_fp", 0).getString("gt_di", null);
        } catch (Exception unused) {
            string = "$unknown";
        }
        if (!C3589i.m14349b(string)) {
            return new Pair<>(new JSONObject(C3598n.m14360a(C3589i.m14348a(Base64.decode(string, 2), "VedaT=ZbPq0Zv7Do"), "utf-8")).getString("gee_id"), string);
        }
        if (context.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0 && (Build.VERSION.SDK_INT < 29 || AbstractC3999a.m14730j())) {
            try {
                String strM14359a = C3598n.m14359a(new FileReader(f42241a[0]));
                JSONObject jSONObject = new JSONObject(new String(C3589i.m14348a(Base64.decode(strM14359a, 2), "VedaT=ZbPq0Zv7Do")));
                C3589i.m14345a(context, "gt_di", strM14359a);
                return new Pair<>(jSONObject.getString("gee_id"), strM14359a);
            } catch (Exception unused2) {
                try {
                    try {
                        String[] strArr = f42241a;
                        String strM14359a2 = C3598n.m14359a(new FileReader(strArr[1]));
                        JSONObject jSONObject2 = new JSONObject(new String(C3589i.m14348a(Base64.decode(strM14359a2, 2), "VedaT=ZbPq0Zv7Do")));
                        C3589i.m14345a(context, "gt_di", strM14359a2);
                        m14354a(strM14359a2, strArr[0]);
                        return new Pair<>(jSONObject2.getString("gee_id"), strM14359a2);
                    } catch (Exception unused3) {
                        String string2 = UUID.randomUUID().toString();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("gee_id", string2);
                        jSONObject3.put("ts", System.currentTimeMillis());
                        jSONObject3.put("ver", "1.0.0");
                        String strM14360a = C3598n.m14360a(Base64.encode(C3589i.m14347a(jSONObject3.toString(), "VedaT=ZbPq0Zv7Do"), 2), "utf-8");
                        C3589i.m14345a(context, "gt_di", strM14360a);
                        String[] strArr2 = f42241a;
                        m14354a(strM14360a, strArr2[0]);
                        m14354a(strM14360a, strArr2[1]);
                        m14354a(strM14360a, strArr2[2]);
                        return new Pair<>(string2, strM14360a);
                    }
                } catch (Exception unused4) {
                    String[] strArr3 = f42241a;
                    String strM14359a3 = C3598n.m14359a(new FileReader(strArr3[2]));
                    JSONObject jSONObject4 = new JSONObject(new String(C3589i.m14348a(Base64.decode(strM14359a3, 2), "VedaT=ZbPq0Zv7Do")));
                    C3589i.m14345a(context, "gt_di", strM14359a3);
                    m14354a(strM14359a3, strArr3[0]);
                    m14354a(strM14359a3, strArr3[1]);
                    return new Pair<>(jSONObject4.getString("gee_id"), strM14359a3);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m14354a(String str, String str2) {
        try {
            FileWriter fileWriter = new FileWriter(str2);
            C3598n.m14361a(str, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException unused) {
        }
    }
}
