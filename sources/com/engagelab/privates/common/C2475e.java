package com.engagelab.privates.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.AESUtil;
import com.engagelab.privates.common.utils.SM4Util;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.engagelab.privates.common.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2475e {
    /* JADX INFO: renamed from: a */
    public static String m12953a(Context context) {
        try {
            List<String> httpAddress = MTCoreGlobal.getHttpAddress(context);
            if (httpAddress.isEmpty()) {
                MTCommonLog.m13013w("CrtClient", "there are no report url");
                return null;
            }
            String md5AesKey = AESUtil.getMd5AesKey(AESUtil.generateSeed());
            String iv = AESUtil.getIv(new String(new byte[]{Ascii.f42547VT, Ascii.f42534CR, Ascii.DC2, 80, 82, 81, 82, 86, 82, 87, 82, 84, 3, 50, 9, 67}, Charset.forName("UTF-8")), 'b');
            String appKey = MTGlobal.getAppKey(context);
            String str = appKey + ":" + md5AesKey;
            MTCommonLog.m13010d("CrtClient", "atn:" + str);
            String str2 = "Basic " + Base64.encodeToString(SM4Util.encryptBytes(StringUtil.stringToUtf8Bytes(str), StringUtil.get32MD5String(appKey), iv), 10);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 3; i++) {
                arrayList.addAll(httpAddress);
            }
            String str3 = "/get_cert?ver=" + C2485m.m13047p(context) + "&k=" + appKey;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrM13063a = C2487o.m13063a(context, ((String) it.next()) + str3, str2);
                if (bArrM13063a != null) {
                    JSONObject jSONObject = new JSONObject(new String(bArrM13063a, MTCommonConstants.UTF_8));
                    if (jSONObject.has("cert")) {
                        jSONObject.put("cert", new String(SM4Util.decryptBytes(Base64.decode(jSONObject.optString("cert"), 10), md5AesKey, iv), MTCommonConstants.UTF_8));
                    }
                    return jSONObject.toString();
                }
            }
            MTCommonLog.m13013w("CrtClient", "get crt failed");
            return null;
        } catch (Exception e) {
            MTCommonLog.m13013w("CrtClient", "get crt failed un :" + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m12954b(Context context) {
        JSONObject jSONObject;
        String strM12953a = m12953a(context);
        if (TextUtils.isEmpty(strM12953a)) {
            MTCommonLog.m13013w("CrtClient", "get crt failed");
            return false;
        }
        try {
            MTCommonLog.m13010d("CrtClient", "get crt body : " + strM12953a);
            jSONObject = new JSONObject(strM12953a);
        } catch (Exception e) {
            MTCommonLog.m13011e("CrtClient", "get crt failed : " + e);
        }
        if (jSONObject.optInt("code", -1) != 0) {
            MTCommonLog.m13011e("CrtClient", "get crt failed jsonObject : " + jSONObject);
            return false;
        }
        int i = jSONObject.getInt("ver");
        String string = jSONObject.getString("cert");
        C2485m.m13016a(context, i);
        C2485m.m13018a(context, string);
        MTCommonLog.m13010d("CrtClient", "get crt Success ver = " + i);
        return true;
    }
}
