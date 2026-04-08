package com.geetest.captcha;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.geetest.captcha.v */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R4\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R$\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR$\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR(\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013RD\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001f2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R4\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b%\u0010\nR$\u0010&\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000f¨\u0006)"}, m18302d2 = {"Lcom/geetest/captcha/model/DataBean;", "", "<init>", "()V", "", "", "<set-?>", "apiServers", "[Ljava/lang/String;", "getApiServers", "()[Ljava/lang/String;", "", "backgroundColor", "I", "getBackgroundColor", "()I", "captchaId", "Ljava/lang/String;", "getCaptchaId", "()Ljava/lang/String;", "dialogStyle", "getDialogStyle", "html", "getHtml", "", "isCanceledOnTouchOutside", "Z", "()Z", "isDebug", "language", "getLanguage", "", "params", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "staticServers", "getStaticServers", "timeOut", "getTimeOut", "Companion", "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
public final class C3606v {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final a f42276l = new a();

    /* JADX INFO: renamed from: a */
    public String f42277a;

    /* JADX INFO: renamed from: c */
    public boolean f42279c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f42280d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String[] f42281e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String[] f42282f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Map<String, ? extends Object> f42283g;

    /* JADX INFO: renamed from: j */
    public int f42286j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public String f42287k;

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f42278b = "file:///android_asset/gt4-index.html";

    /* JADX INFO: renamed from: h */
    public boolean f42284h = true;

    /* JADX INFO: renamed from: i */
    public int f42285i = 10000;

    /* JADX INFO: renamed from: com.geetest.captcha.v$a */
    /* JADX INFO: compiled from: Proguard */
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3606v m14380a(@NotNull String captchaId, @Nullable GTCaptcha4Config gTCaptcha4Config) {
            Intrinsics.m18599g(captchaId, "captchaId");
            C3606v c3606v = new C3606v();
            c3606v.f42277a = captchaId;
            if (gTCaptcha4Config != null) {
                c3606v.f42279c = gTCaptcha4Config.isDebug();
                String html = gTCaptcha4Config.getHtml();
                Intrinsics.m18598f(html, "it.html");
                c3606v.f42278b = html;
                c3606v.f42280d = gTCaptcha4Config.getLanguage();
                c3606v.f42281e = gTCaptcha4Config.getApiServers();
                c3606v.f42282f = gTCaptcha4Config.getStaticServers();
                c3606v.f42284h = gTCaptcha4Config.isCanceledOnTouchOutside();
                c3606v.f42283g = gTCaptcha4Config.getParams();
                c3606v.f42285i = gTCaptcha4Config.getTimeOut();
                c3606v.f42286j = gTCaptcha4Config.getBackgroundColor();
                c3606v.f42287k = gTCaptcha4Config.getDialogStyle();
            }
            if (StringsKt.m20448x(c3606v.f42278b)) {
                c3606v.f42278b = "file:///android_asset/gt4-index.html";
            }
            return c3606v;
        }
    }
}
