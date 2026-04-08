package androidx.compose.p013ui.window;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: androidx.compose.ui.window.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1353a implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20807b;

    public /* synthetic */ C1353a(Object obj, int i) {
        this.f20806a = i;
        this.f20807b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f20806a) {
            case 0:
                Function0 function0 = (Function0) this.f20807b;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                ((MaterialBackHandler) this.f20807b).handleBackInvoked();
                break;
        }
    }
}
