package com.geetest.gtc4;

import android.content.Context;
import androidx.constraintlayout.motion.widget.RunnableC1407a;

/* JADX INFO: renamed from: com.geetest.gtc4.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class C3630c {

    /* JADX INFO: renamed from: a */
    public String f42341a;

    /* JADX INFO: renamed from: com.geetest.gtc4.c$a */
    /* JADX INFO: compiled from: Proguard */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C3630c f42342a = new C3630c();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14402a(C3630c c3630c, Context context) {
        c3630c.m14401a(context);
    }

    /* JADX INFO: renamed from: a */
    public void m14403a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f42341a = str;
        new Thread(new RunnableC1407a(24, this, context)).start();
    }

    /* JADX INFO: renamed from: a */
    private void m14401a(Context context) {
        String str = this.f42341a;
        if (str == null || str.isEmpty()) {
            return;
        }
        C3629b.m14399a(context, this.f42341a, null, 5000, null);
    }
}
