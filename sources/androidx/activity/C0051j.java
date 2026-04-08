package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: androidx.activity.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0051j implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f209a;

    public /* synthetic */ C0051j(Function0 function0) {
        this.f209a = function0;
    }

    public final void onBackInvoked() {
        this.f209a.invoke();
    }
}
