package com.geetest.captcha;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.w */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\rB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\u000e"}, m18302d2 = {"Lcom/geetest/captcha/model/ErrorBean;", "", "", "code", "msg", "Lorg/json/JSONObject;", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "toJson", "()Ljava/lang/String;", "Ljava/lang/String;", "Lorg/json/JSONObject;", "Companion", "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
public final class C3609w {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final a f42290d = new a();

    /* JADX INFO: renamed from: a */
    public final String f42291a;

    /* JADX INFO: renamed from: b */
    public final String f42292b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f42293c;

    /* JADX INFO: renamed from: com.geetest.captcha.w$a */
    /* JADX INFO: compiled from: Proguard */
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3609w m14383a(@NotNull String code, @NotNull String msg, @NotNull JSONObject desc) {
            Intrinsics.m18599g(code, "code");
            Intrinsics.m18599g(msg, "msg");
            Intrinsics.m18599g(desc, "desc");
            return new C3609w(code, msg, desc);
        }
    }

    public C3609w(String str, String str2, JSONObject jSONObject) {
        this.f42291a = str;
        this.f42292b = str2;
        this.f42293c = jSONObject;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m14382a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.f42291a);
            jSONObject.put("msg", this.f42292b);
            jSONObject.put("desc", this.f42293c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String string = jSONObject.toString();
        Intrinsics.m18598f(string, "jsonObject.toString()");
        return string;
    }
}
