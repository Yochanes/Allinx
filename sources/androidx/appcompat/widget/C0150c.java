package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0150c implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f1495a;

    public /* synthetic */ C0150c(Runnable runnable) {
        this.f1495a = runnable;
    }

    public final void onBackInvoked() {
        this.f1495a.run();
    }
}
