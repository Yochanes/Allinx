package com.geetest.captcha;

import android.webkit.ValueCallback;

/* JADX INFO: renamed from: com.geetest.captcha.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3579d<T> implements ValueCallback<String> {

    /* JADX INFO: renamed from: a */
    public static final C3579d f42199a = new C3579d();

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(String str) {
        C3588h0.f42225d.m14331c("DialogController javascript:jsBridge.callback('showBox') return: " + str);
    }
}
