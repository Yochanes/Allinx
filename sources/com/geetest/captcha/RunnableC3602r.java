package com.geetest.captcha;

import com.geetest.captcha.GTCaptcha4Client;

/* JADX INFO: renamed from: com.geetest.captcha.r */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3602r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3600p f42271a;

    public RunnableC3602r(C3600p c3600p) {
        this.f42271a = c3600p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = this.f42271a.f42263f;
        if (onWebViewShowListener != null) {
            onWebViewShowListener.onWebViewShow();
        }
    }
}
