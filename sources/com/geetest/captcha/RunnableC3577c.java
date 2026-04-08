package com.geetest.captcha;

/* JADX INFO: renamed from: com.geetest.captcha.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3577c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogC3587h f42197a;

    public RunnableC3577c(DialogC3587h dialogC3587h) {
        this.f42197a = dialogC3587h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42197a.dismiss();
    }
}
