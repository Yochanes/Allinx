package com.geetest.captcha;

import android.content.Context;

/* JADX INFO: renamed from: com.geetest.captcha.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3583f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3585g f42208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f42209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3606v f42210c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3612z f42211d;

    public RunnableC3583f(C3585g c3585g, Context context, C3606v c3606v, InterfaceC3612z interfaceC3612z) {
        this.f42208a = c3585g;
        this.f42209b = context;
        this.f42210c = c3606v;
        this.f42211d = interfaceC3612z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f42208a.m14322b(this.f42209b, this.f42210c, this.f42211d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
