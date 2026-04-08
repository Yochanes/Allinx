package com.geetest.captcha;

import android.content.DialogInterface;
import android.view.KeyEvent;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.geetest.captcha.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnKeyListenerC3581e implements DialogInterface.OnKeyListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3612z f42201a;

    public DialogInterfaceOnKeyListenerC3581e(InterfaceC3612z interfaceC3612z) {
        this.f42201a = interfaceC3612z;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(@Nullable DialogInterface dialogInterface, int i, @Nullable KeyEvent keyEvent) {
        if (i != 4 || keyEvent == null || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1) {
            return false;
        }
        this.f42201a.mo14368b();
        return false;
    }
}
