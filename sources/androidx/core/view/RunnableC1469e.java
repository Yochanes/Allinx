package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: androidx.core.view.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1469e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f23539b;

    public /* synthetic */ RunnableC1469e(int i, View view) {
        this.f23538a = i;
        this.f23539b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23538a) {
            case 0:
                View view = this.f23539b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                BottomAppBar.m14500p(this.f23539b);
                break;
        }
    }
}
