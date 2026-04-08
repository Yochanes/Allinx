package com.geetest.captcha;

import android.content.Context;
import com.geetest.captcha.C3606v;
import com.geetest.captcha.EnumC3610x;
import com.geetest.captcha.GTCaptcha4Client;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt$thread$thread$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.geetest.captcha.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0014R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+¨\u0006-"}, m18302d2 = {"Lcom/geetest/captcha/GTCaptcha4Holder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addOnFailureListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "response", "addOnSuccessListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;)V", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "webViewShowListener", "addOnWebViewShowListener", "(Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;)V", "cancel", "()V", "Landroid/content/res/Configuration;", "newConfig", "configurationChanged", "(Landroid/content/res/Configuration;)V", "destroy", "", "appId", "Lcom/geetest/captcha/GTCaptcha4Config;", "config", "init", "(Ljava/lang/String;Lcom/geetest/captcha/GTCaptcha4Config;)V", "preLoadWithCaptcha", "", "enable", "setLogEnable", "(Z)V", "verifyWithCaptcha", "Lcom/geetest/captcha/controller/Controller;", "controller", "Lcom/geetest/captcha/controller/Controller;", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "Companion", "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
public final class GTCaptcha4Holder {

    /* JADX INFO: renamed from: e */
    public static long f42179e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final b f42180f = new b();

    /* JADX INFO: renamed from: a */
    public final C3575b f42181a;

    /* JADX INFO: renamed from: b */
    public GTCaptcha4Client.OnSuccessListener f42182b;

    /* JADX INFO: renamed from: c */
    public GTCaptcha4Client.OnFailureListener f42183c;

    /* JADX INFO: renamed from: d */
    public GTCaptcha4Client.OnWebViewShowListener f42184d;

    /* JADX INFO: renamed from: com.geetest.captcha.a$a */
    /* JADX INFO: compiled from: Proguard */
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m21936invoke();
            return Unit.f51459a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m21936invoke() {
            File externalFilesDir = this.$context.getApplicationContext().getExternalFilesDir(null);
            C3590i0.f42234a = externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null;
        }
    }

    /* JADX INFO: renamed from: com.geetest.captcha.a$b */
    /* JADX INFO: compiled from: Proguard */
    public static final class b {
    }

    public GTCaptcha4Holder(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        this.f42181a = new C3575b(context);
        try {
            new ThreadsKt$thread$thread$1(new a(context)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        C3582e0.f42207f.m14319a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m14316a(@NotNull String appId, @Nullable GTCaptcha4Config gTCaptcha4Config) {
        Intrinsics.m18599g(appId, "appId");
        C3575b c3575b = this.f42181a;
        c3575b.getClass();
        c3575b.f42187a = appId;
        C3575b c3575b2 = this.f42181a;
        c3575b2.f42191e = gTCaptcha4Config;
        c3575b2.f42193g = new C3599o();
        C3603s c3603s = new C3603s();
        c3575b2.f42194h = c3603s;
        C3599o c3599o = c3575b2.f42193g;
        if (c3599o == null) {
            Intrinsics.m18606n("preLoadHandler");
            throw null;
        }
        c3599o.f42275a = c3603s;
        Context context = c3575b2.f42195i;
        C3606v.a aVar = C3606v.f42276l;
        String str = c3575b2.f42187a;
        if (str == null) {
            Intrinsics.m18606n("appId");
            throw null;
        }
        C3600p c3600p = new C3600p(context, aVar.m14380a(str, c3575b2.f42191e));
        c3575b2.f42192f = c3600p;
        c3600p.m14370a(EnumC3610x.a.FLOWING);
        C3600p c3600p2 = c3575b2.f42192f;
        if (c3600p2 == null) {
            Intrinsics.m18606n("request");
            throw null;
        }
        c3600p2.m14371a(EnumC3610x.NONE);
        C3600p c3600p3 = c3575b2.f42192f;
        if (c3600p3 == null) {
            Intrinsics.m18606n("request");
            throw null;
        }
        GTCaptcha4Config gTCaptcha4Config2 = c3575b2.f42191e;
        c3600p3.f42260c = new C3585g(gTCaptcha4Config2 != null ? gTCaptcha4Config2.getDialogShowListener() : null);
        C3599o c3599o2 = c3575b2.f42193g;
        if (c3599o2 == null) {
            Intrinsics.m18606n("preLoadHandler");
            throw null;
        }
        C3600p c3600p4 = c3575b2.f42192f;
        if (c3600p4 != null) {
            c3599o2.m14379b(c3600p4);
        } else {
            Intrinsics.m18606n("request");
            throw null;
        }
    }
}
