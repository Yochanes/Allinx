package com.geetest.captcha;

import com.geetest.captcha.GTCaptcha4Client;

/* JADX INFO: renamed from: com.geetest.captcha.q */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3601q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3600p f42268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f42269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f42270c;

    public RunnableC3601q(C3600p c3600p, boolean z2, String str) {
        this.f42268a = c3600p;
        this.f42269b = z2;
        this.f42270c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GTCaptcha4Client.OnSuccessListener onSuccessListener = this.f42268a.f42261d;
        if (onSuccessListener != null) {
            onSuccessListener.onSuccess(this.f42269b, this.f42270c);
        }
    }
}
