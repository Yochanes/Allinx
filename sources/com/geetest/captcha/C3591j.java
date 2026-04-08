package com.geetest.captcha;

import android.content.Context;
import android.util.Pair;
import com.geetest.captcha.C3593k;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3591j {

    /* JADX INFO: renamed from: com.geetest.captcha.j$a */
    /* JADX INFO: compiled from: Proguard */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C3591j f42236a = new C3591j();
    }

    /* JADX INFO: renamed from: a */
    public String m14350a(Context context) {
        String strM14343a;
        long jCurrentTimeMillis;
        C3593k c3593k = C3593k.a.f42238a;
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            return jSONObject.toString();
        }
        try {
            strM14343a = context.getSharedPreferences("gt_fp", 0).getString("gt_fp", null);
        } catch (Exception unused) {
            strM14343a = "$unknown";
        }
        try {
            jCurrentTimeMillis = context.getSharedPreferences("gt_fp", 0).getLong("gt_ts", 0L);
        } catch (Exception unused2) {
            jCurrentTimeMillis = 0;
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                context.getSharedPreferences("gt_fp", 0).edit().putLong("gt_ts", jCurrentTimeMillis).apply();
            } catch (Exception unused3) {
            }
        }
        try {
            jSONObject.put("bd", "$unknown");
            Pair<String, String> pairM14353a = C3595l.m14353a(context);
            if (pairM14353a != null) {
                jSONObject.put("d", pairM14353a.first);
                jSONObject.put("e", pairM14353a.second);
                if (C3589i.m14349b(strM14343a) && !C3589i.m14349b((String) pairM14353a.first)) {
                    strM14343a = C3589i.m14343a(context, (String) pairM14353a.first);
                }
            } else {
                jSONObject.put("d", "$unknown");
                jSONObject.put("e", "$unknown");
            }
            if (C3589i.m14349b(strM14343a)) {
                strM14343a = C3589i.m14343a(context, UUID.randomUUID().toString());
            }
            jSONObject.put("fp", strM14343a);
            jSONObject.put("ts", jCurrentTimeMillis + "");
            jSONObject.put("ver", "1.0.0");
            jSONObject.put("client_type", "android");
        } catch (JSONException unused4) {
        }
        return jSONObject.toString();
    }
}
