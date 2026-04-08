package androidx.appcompat.app;

import android.view.KeyEvent;
import androidx.core.view.KeyEventDispatcher;

/* JADX INFO: renamed from: androidx.appcompat.app.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0085e implements KeyEventDispatcher.Component {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppCompatDialog f577a;

    public /* synthetic */ C0085e(AppCompatDialog appCompatDialog) {
        this.f577a = appCompatDialog;
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return this.f577a.superDispatchKeyEvent(keyEvent);
    }
}
