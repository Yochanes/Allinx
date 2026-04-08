package androidx.compose.material3;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: androidx.compose.material3.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1138b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f15291a;

    public /* synthetic */ C1138b(Function0 function0) {
        this.f15291a = function0;
    }

    public final void onBackInvoked() {
        this.f15291a.invoke();
    }
}
