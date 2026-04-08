package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.geetest.captcha.C3596l0;
import com.geetest.captcha.EnumC3610x;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.views.GTC4WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import io.intercom.android.sdk.models.carousel.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.geetest.captcha.p */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001PB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b-\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010GR\"\u0010\u0015\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, m18302d2 = {"Lcom/geetest/captcha/handlers/Request;", "", "Landroid/content/Context;", "context", "Lcom/geetest/captcha/model/DataBean;", "dataBean", "<init>", "(Landroid/content/Context;Lcom/geetest/captcha/model/DataBean;)V", "", "cancel", "()Z", "", "currentStatus", "()V", ActionType.DISMISS, "hideLoading", "notifyWebViewShowed", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onFailure", "(Ljava/lang/String;)V", "status", "result", "onSuccess", "(ZLjava/lang/String;)V", "onWebViewShow", "Lcom/geetest/captcha/observer/WebViewObserver;", "webViewObserver", "preLoadWebView", "(Landroid/content/Context;Lcom/geetest/captcha/model/DataBean;Lcom/geetest/captcha/observer/WebViewObserver;)V", "Lcom/geetest/captcha/controller/DialogController;", "dialogController", "setDialogController", "(Lcom/geetest/captcha/controller/DialogController;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "response", "setResponse", "(Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "setWebViewShowListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;)V", "showWebViewDialog", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/geetest/captcha/model/DataBean;", "getDataBean", "()Lcom/geetest/captcha/model/DataBean;", "Lcom/geetest/captcha/controller/DialogController;", "getDialogController$captcha_release", "()Lcom/geetest/captcha/controller/DialogController;", "setDialogController$captcha_release", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;", "preLoadStatus", "Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;", "getPreLoadStatus", "()Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;", "setPreLoadStatus", "(Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;)V", "", "requestLevel", "I", "getRequestLevel", "()I", "setRequestLevel", "(I)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "Lcom/geetest/captcha/model/StatusEnum;", "Lcom/geetest/captcha/model/StatusEnum;", "getStatus", "()Lcom/geetest/captcha/model/StatusEnum;", "setStatus", "(Lcom/geetest/captcha/model/StatusEnum;)V", "webViewShowListener", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "Companion", "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
public final class C3600p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public EnumC3610x.a f42258a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public EnumC3610x f42259b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C3585g f42260c;

    /* JADX INFO: renamed from: d */
    public GTCaptcha4Client.OnSuccessListener f42261d;

    /* JADX INFO: renamed from: e */
    public GTCaptcha4Client.OnFailureListener f42262e;

    /* JADX INFO: renamed from: f */
    public GTCaptcha4Client.OnWebViewShowListener f42263f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Context f42264g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final C3606v f42265h;

    /* JADX INFO: renamed from: com.geetest.captcha.p$a */
    /* JADX INFO: compiled from: Proguard */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f42267b;

        public a(String str) {
            this.f42267b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GTCaptcha4Client.OnFailureListener onFailureListener = C3600p.this.f42262e;
            if (onFailureListener != null) {
                onFailureListener.onFailure(this.f42267b);
            }
        }
    }

    public C3600p(@NotNull Context context, @NotNull C3606v dataBean) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(dataBean, "dataBean");
        this.f42264g = context;
        this.f42265h = dataBean;
        this.f42258a = EnumC3610x.a.NONE;
        this.f42259b = EnumC3610x.FLOWING;
    }

    /* JADX INFO: renamed from: a */
    public final void m14370a(@NotNull EnumC3610x.a aVar) {
        Intrinsics.m18599g(aVar, "<set-?>");
        this.f42258a = aVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m14375b(@NotNull Context context, @NotNull C3606v dataBean, @NotNull InterfaceC3612z webViewObserver) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(dataBean, "dataBean");
        Intrinsics.m18599g(webViewObserver, "webViewObserver");
        C3585g c3585g = this.f42260c;
        if (c3585g != null) {
            try {
                C3611y c3611y = new C3611y();
                c3611y.m14384a(webViewObserver);
                GTC4WebView gTC4WebView = c3585g.f42216b;
                if (gTC4WebView != null) {
                    gTC4WebView.setWebViewObservable(c3611y);
                }
                C3596l0 c3596l0 = c3585g.f42217c;
                if (c3596l0 != null) {
                    c3596l0.f42243b = c3611y;
                    C3596l0.b bVar = c3596l0.f42245d;
                    if (bVar == null) {
                        Intrinsics.m18606n("jsInterface");
                        throw null;
                    }
                    String url = c3596l0.f42242a;
                    GTC4WebView webView = c3596l0.f42244c;
                    if (bVar == null) {
                        throw null;
                    }
                    Intrinsics.m18599g(url, "url");
                    Intrinsics.m18599g(webView, "webView");
                    bVar.f42251c = c3611y;
                    bVar.f42250b = webView;
                    bVar.f42249a = url;
                }
                if (Intrinsics.m18594b(Looper.getMainLooper(), Looper.myLooper())) {
                    c3585g.m14322b(context, dataBean, webViewObserver);
                } else {
                    ((Activity) context).runOnUiThread(new RunnableC3583f(c3585g, context, dataBean, webViewObserver));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14376c() {
        GTC4WebView gTC4WebView;
        C3585g c3585g = this.f42260c;
        if (c3585g != null && (gTC4WebView = c3585g.f42216b) != null) {
            gTC4WebView.evaluateJavascript("javascript:jsBridge.callback('showBox')", C3579d.f42199a);
        }
        try {
            C3588h0.f42225d.m14327a("Request.onWebViewShow");
            if (m14373a()) {
                return;
            }
            if (Intrinsics.m18594b(Looper.getMainLooper(), Looper.myLooper())) {
                GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = this.f42263f;
                if (onWebViewShowListener != null) {
                    onWebViewShowListener.onWebViewShow();
                    return;
                }
                return;
            }
            Context context = this.f42264g;
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            ((Activity) context).runOnUiThread(new RunnableC3602r(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14371a(@NotNull EnumC3610x enumC3610x) {
        Intrinsics.m18599g(enumC3610x, "<set-?>");
        this.f42259b = enumC3610x;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14373a() {
        return this.f42259b == EnumC3610x.CANCEL;
    }

    /* JADX INFO: renamed from: a */
    public final void m14369a(@NotNull Context context, @NotNull C3606v dataBean, @NotNull InterfaceC3612z webViewObserver) throws Throwable {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(dataBean, "dataBean");
        Intrinsics.m18599g(webViewObserver, "webViewObserver");
        C3585g c3585g = this.f42260c;
        if (c3585g != null) {
            c3585g.m14321a(context, dataBean, webViewObserver);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14372a(@NotNull String error) {
        Intrinsics.m18599g(error, "error");
        try {
            C3588h0.f42225d.m14327a("Request.onFailure: ".concat(error));
            if (m14373a()) {
                return;
            }
            if (!Intrinsics.m18594b(Looper.getMainLooper(), Looper.myLooper())) {
                Context context = this.f42264g;
                if (context == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) context).runOnUiThread(new a(error));
            } else {
                GTCaptcha4Client.OnFailureListener onFailureListener = this.f42262e;
                if (onFailureListener != null) {
                    onFailureListener.onFailure(error);
                }
            }
            this.f42259b = EnumC3610x.CANCEL;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14374b() {
        DialogC3587h dialogC3587h;
        C3585g c3585g = this.f42260c;
        if (c3585g == null || (dialogC3587h = c3585g.f42215a) == null || !dialogC3587h.isShowing()) {
            return;
        }
        GTC4WebView gTC4WebView = c3585g.f42216b;
        Context context = gTC4WebView != null ? gTC4WebView.getContext() : null;
        if (context != null) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            if (!Intrinsics.m18594b(Looper.getMainLooper(), Looper.myLooper())) {
                activity.runOnUiThread(new RunnableC3577c(dialogC3587h));
                return;
            } else {
                dialogC3587h.dismiss();
                return;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }
}
