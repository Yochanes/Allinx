package com.engagelab.privates.common;

import android.text.TextUtils;
import com.engagelab.privates.push.utils.NotificationUtil;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.engagelab.privates.common.u */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2493u implements Serializable {

    /* JADX INFO: renamed from: a */
    public String f35157a;

    /* JADX INFO: renamed from: b */
    public String f35158b;

    public C2493u(String str, String str2) {
        this.f35157a = str;
        this.f35158b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C2493u m13119a(JSONObject jSONObject) {
        return new C2493u(NotificationUtil.getMessageId(jSONObject), jSONObject.optString("override_msg_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2493u)) {
            return false;
        }
        C2493u c2493u = (C2493u) obj;
        if (TextUtils.isEmpty(this.f35157a) || TextUtils.isEmpty(c2493u.f35157a) || !TextUtils.equals(this.f35157a, c2493u.f35157a)) {
            return false;
        }
        if (TextUtils.isEmpty(this.f35158b) && TextUtils.isEmpty(c2493u.f35158b)) {
            return true;
        }
        return (TextUtils.isEmpty(this.f35158b) || TextUtils.isEmpty(c2493u.f35158b) || !TextUtils.equals(this.f35158b, c2493u.f35158b)) ? false : true;
    }

    public String toString() {
        return "msg_id = " + this.f35157a + ",  override_msg_id = " + this.f35158b;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m13120a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg_id", this.f35157a);
            jSONObject.put("override_msg_id", this.f35158b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
