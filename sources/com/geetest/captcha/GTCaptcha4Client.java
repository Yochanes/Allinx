package com.geetest.captcha;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Pair;
import com.geetest.captcha.C3588h0;
import com.geetest.captcha.C3606v;
import com.geetest.captcha.C3609w;
import com.geetest.captcha.EnumC3610x;
import com.geetest.captcha.GTCaptcha4Holder;
import com.geetest.captcha.views.GTC4WebView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class GTCaptcha4Client implements NoProguard {

    /* JADX INFO: renamed from: a */
    public final GTCaptcha4Holder f42156a;

    /* JADX INFO: compiled from: Proguard */
    public interface OnDialogShowListener extends NoProguard {
        void actionAfterDialogShow(Dialog dialog);

        void actionBeforeDialogShow(Dialog dialog);

        void onDialogFocusChanged(Dialog dialog, boolean z2);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnFailureListener extends NoProguard {
        void onFailure(String str);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnSuccessListener extends NoProguard {
        void onSuccess(boolean z2, String str);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnWebViewShowListener extends NoProguard {
        void onWebViewShow();
    }

    public GTCaptcha4Client(Context context) {
        this.f42156a = new GTCaptcha4Holder(context);
    }

    public static GTCaptcha4Client getClient(Context context) {
        return new GTCaptcha4Client(context);
    }

    public static String getVersion() {
        return "1.8.3.1";
    }

    public static Pair<Boolean, String> isSupportWebView(Context context) {
        GTCaptcha4Holder.b bVar = GTCaptcha4Holder.f42180f;
        Intrinsics.m18599g(context, "context");
        try {
            new GTC4WebView(context).destroy();
            return new Pair<>(Boolean.TRUE, null);
        } catch (Exception e) {
            e.printStackTrace();
            C3588h0.f42225d.m14331c("The device does not support WebViews, error message: " + e.getMessage());
            return new Pair<>(Boolean.FALSE, e.getMessage());
        }
    }

    public GTCaptcha4Client addOnFailureListener(OnFailureListener listener) {
        GTCaptcha4Holder gTCaptcha4Holder = this.f42156a;
        gTCaptcha4Holder.getClass();
        Intrinsics.m18599g(listener, "listener");
        gTCaptcha4Holder.f42183c = listener;
        return this;
    }

    public GTCaptcha4Client addOnSuccessListener(OnSuccessListener response) {
        GTCaptcha4Holder gTCaptcha4Holder = this.f42156a;
        gTCaptcha4Holder.getClass();
        Intrinsics.m18599g(response, "response");
        gTCaptcha4Holder.f42182b = response;
        return this;
    }

    public GTCaptcha4Client addOnWebViewShowListener(OnWebViewShowListener webViewShowListener) {
        GTCaptcha4Holder gTCaptcha4Holder = this.f42156a;
        gTCaptcha4Holder.getClass();
        Intrinsics.m18599g(webViewShowListener, "webViewShowListener");
        gTCaptcha4Holder.f42184d = webViewShowListener;
        return this;
    }

    public void cancel() throws JSONException {
        GTCaptcha4Holder gTCaptcha4Holder = this.f42156a;
        gTCaptcha4Holder.getClass();
        if (System.currentTimeMillis() - GTCaptcha4Holder.f42179e < 1000) {
            C3588h0.f42225d.m14331c("The interval between the two cancel is at least 1 second.");
            return;
        }
        C3575b c3575b = gTCaptcha4Holder.f42181a;
        C3600p c3600p = c3575b.f42192f;
        if (c3600p == null) {
            Intrinsics.m18606n("request");
            throw null;
        }
        if (c3600p.m14373a()) {
            return;
        }
        C3600p c3600p2 = c3575b.f42192f;
        if (c3600p2 == null) {
            Intrinsics.m18606n("request");
            throw null;
        }
        c3600p2.m14371a(EnumC3610x.FAIL);
        String type = EnumC3610x.CANCEL.getType();
        String code = EnumC3580d0.USER_ERROR.getType() + "60";
        Intrinsics.m18599g(code, "code");
        String strM18604l = Intrinsics.m18604l(code, type);
        C3609w.a aVar = C3609w.f42290d;
        String str = C3582e0.f42205d;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("description", "User cancelled 'Captcha'");
        String strM14382a = aVar.m14383a(strM18604l, str, jSONObject).m14382a();
        C3588h0.f42225d.m14331c("Controller: " + strM14382a);
        C3600p c3600p3 = c3575b.f42192f;
        if (c3600p3 == null) {
            Intrinsics.m18606n("request");
            throw null;
        }
        c3600p3.m14374b();
        C3600p c3600p4 = c3575b.f42192f;
        if (c3600p4 != null) {
            c3600p4.m14372a(strM14382a);
        } else {
            Intrinsics.m18606n("request");
            throw null;
        }
    }

    public void configurationChanged(Configuration newConfig) {
        DialogC3587h dialogC3587h;
        GTCaptcha4Holder gTCaptcha4Holder = this.f42156a;
        gTCaptcha4Holder.getClass();
        Intrinsics.m18599g(newConfig, "newConfig");
        C3575b c3575b = gTCaptcha4Holder.f42181a;
        c3575b.getClass();
        try {
            C3600p c3600p = c3575b.f42192f;
            if (c3600p == null) {
                Intrinsics.m18606n("request");
                throw null;
            }
            C3585g c3585g = c3600p.f42260c;
            if (c3585g == null || (dialogC3587h = c3585g.f42215a) == null) {
                return;
            }
            dialogC3587h.m14326a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
        this.f42156a.getClass();
        try {
            C3588h0.a aVar = C3588h0.f42223b;
            if (aVar != null) {
                if (aVar != null) {
                    aVar.m14337b();
                }
                C3588h0.f42223b = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public GTCaptcha4Client init(String str) {
        this.f42156a.m14316a(str, null);
        return this;
    }

    public void setLogEnable(boolean z2) {
        this.f42156a.getClass();
        C3588h0.f42224c = z2;
        C3588h0.f42222a = z2 ? 1 : 9999;
    }

    public GTCaptcha4Client verifyWithCaptcha() throws JSONException {
        GTCaptcha4Holder gTCaptcha4Holder = this.f42156a;
        gTCaptcha4Holder.getClass();
        if (System.currentTimeMillis() - GTCaptcha4Holder.f42179e < 1000) {
            C3588h0.f42225d.m14331c("The interval between the two captcha is at least 1 second.");
            return this;
        }
        GTCaptcha4Holder.f42179e = System.currentTimeMillis();
        C3575b c3575b = gTCaptcha4Holder.f42181a;
        OnSuccessListener onSuccessListener = gTCaptcha4Holder.f42182b;
        c3575b.f42188b = onSuccessListener;
        OnFailureListener onFailureListener = gTCaptcha4Holder.f42183c;
        c3575b.f42189c = onFailureListener;
        c3575b.f42190d = gTCaptcha4Holder.f42184d;
        Context context = c3575b.f42195i;
        if (onFailureListener == null) {
            throw new IllegalArgumentException("The OnFailureListener object cannot be null.");
        }
        if (onSuccessListener == null) {
            C3609w.a aVar = C3609w.f42290d;
            String str = EnumC3610x.FLOWING.getType() + EnumC3580d0.PARAM.getType() + "70";
            String str2 = C3582e0.f42204c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", "The GTC4SessionResponse object cannot be null");
            String strM14382a = aVar.m14383a(str, str2, jSONObject).m14382a();
            C3588h0.f42225d.m14331c(strM14382a);
            OnFailureListener onFailureListener2 = c3575b.f42189c;
            if (onFailureListener2 != null) {
                onFailureListener2.onFailure(strM14382a);
            }
        } else if (context == null) {
            C3609w.a aVar2 = C3609w.f42290d;
            String str3 = EnumC3610x.FLOWING.getType() + EnumC3580d0.PARAM.getType() + "71";
            String str4 = C3582e0.f42204c;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("description", "The context parameter should not be null");
            String strM14382a2 = aVar2.m14383a(str3, str4, jSONObject2).m14382a();
            C3588h0.f42225d.m14331c(strM14382a2);
            OnFailureListener onFailureListener3 = c3575b.f42189c;
            if (onFailureListener3 != null) {
                onFailureListener3.onFailure(strM14382a2);
            }
        } else if (context instanceof Activity) {
            String str5 = c3575b.f42187a;
            if (str5 == null) {
                Intrinsics.m18606n("appId");
                throw null;
            }
            if (!TextUtils.isEmpty(str5)) {
                C3600p c3600p = c3575b.f42192f;
                if (c3600p == null) {
                    Intrinsics.m18606n("request");
                    throw null;
                }
                EnumC3610x.a aVar3 = c3600p.f42258a;
                EnumC3610x.a aVar4 = EnumC3610x.a.NONE;
                if (aVar3 != aVar4) {
                    if (c3600p == null) {
                        Intrinsics.m18606n("request");
                        throw null;
                    }
                    if (c3600p.f42259b == EnumC3610x.NONE) {
                        if (c3600p == null) {
                            Intrinsics.m18606n("request");
                            throw null;
                        }
                        c3600p.m14371a(EnumC3610x.FLOWING);
                        C3600p c3600p2 = c3575b.f42192f;
                        if (c3600p2 == null) {
                            Intrinsics.m18606n("request");
                            throw null;
                        }
                        c3600p2.f42261d = c3575b.f42188b;
                        if (c3600p2 == null) {
                            Intrinsics.m18606n("request");
                            throw null;
                        }
                        c3600p2.f42262e = c3575b.f42189c;
                        if (c3600p2 == null) {
                            Intrinsics.m18606n("request");
                            throw null;
                        }
                        c3600p2.f42263f = c3575b.f42190d;
                        C3603s c3603s = c3575b.f42194h;
                        if (c3603s == null) {
                            Intrinsics.m18606n("webViewHandler");
                            throw null;
                        }
                        if (c3600p2 != null) {
                            c3603s.m14379b(c3600p2);
                            return this;
                        }
                        Intrinsics.m18606n("request");
                        throw null;
                    }
                }
                c3575b.f42194h = new C3603s();
                Context context2 = c3575b.f42195i;
                C3606v.a aVar5 = C3606v.f42276l;
                String str6 = c3575b.f42187a;
                if (str6 == null) {
                    Intrinsics.m18606n("appId");
                    throw null;
                }
                C3600p c3600p3 = new C3600p(context2, aVar5.m14380a(str6, c3575b.f42191e));
                c3575b.f42192f = c3600p3;
                c3600p3.m14370a(aVar4);
                C3600p c3600p4 = c3575b.f42192f;
                if (c3600p4 == null) {
                    Intrinsics.m18606n("request");
                    throw null;
                }
                c3600p4.m14371a(EnumC3610x.FLOWING);
                C3600p c3600p5 = c3575b.f42192f;
                if (c3600p5 == null) {
                    Intrinsics.m18606n("request");
                    throw null;
                }
                GTCaptcha4Config gTCaptcha4Config = c3575b.f42191e;
                c3600p5.f42260c = new C3585g(gTCaptcha4Config != null ? gTCaptcha4Config.getDialogShowListener() : null);
                C3600p c3600p6 = c3575b.f42192f;
                if (c3600p6 == null) {
                    Intrinsics.m18606n("request");
                    throw null;
                }
                c3600p6.f42261d = c3575b.f42188b;
                if (c3600p6 == null) {
                    Intrinsics.m18606n("request");
                    throw null;
                }
                c3600p6.f42262e = c3575b.f42189c;
                if (c3600p6 == null) {
                    Intrinsics.m18606n("request");
                    throw null;
                }
                c3600p6.f42263f = c3575b.f42190d;
                C3603s c3603s2 = c3575b.f42194h;
                if (c3603s2 == null) {
                    Intrinsics.m18606n("webViewHandler");
                    throw null;
                }
                if (c3600p6 != null) {
                    c3603s2.m14379b(c3600p6);
                    return this;
                }
                Intrinsics.m18606n("request");
                throw null;
            }
            C3609w.a aVar6 = C3609w.f42290d;
            String str7 = EnumC3610x.FLOWING.getType() + EnumC3580d0.PARAM.getType() + "74";
            String str8 = C3582e0.f42204c;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("description", "The 'AppId' parameter should not be null");
            String strM14382a3 = aVar6.m14383a(str7, str8, jSONObject3).m14382a();
            C3588h0.f42225d.m14331c(strM14382a3);
            OnFailureListener onFailureListener4 = c3575b.f42189c;
            if (onFailureListener4 != null) {
                onFailureListener4.onFailure(strM14382a3);
            }
        } else {
            C3609w.a aVar7 = C3609w.f42290d;
            String str9 = EnumC3610x.FLOWING.getType() + EnumC3580d0.PARAM.getType() + "72";
            String str10 = C3582e0.f42204c;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("description", "The context must be an 'Activity' object");
            String strM14382a4 = aVar7.m14383a(str9, str10, jSONObject4).m14382a();
            C3588h0.f42225d.m14331c(strM14382a4);
            OnFailureListener onFailureListener5 = c3575b.f42189c;
            if (onFailureListener5 != null) {
                onFailureListener5.onFailure(strM14382a4);
            }
        }
        return this;
    }

    public GTCaptcha4Client init(String str, GTCaptcha4Config gTCaptcha4Config) {
        this.f42156a.m14316a(str, gTCaptcha4Config);
        return this;
    }
}
