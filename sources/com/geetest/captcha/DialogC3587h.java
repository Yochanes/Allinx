package com.geetest.captcha;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.geetest.captcha.GTCaptcha4Client;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: renamed from: com.geetest.captcha.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC3587h extends Dialog {

    /* JADX INFO: renamed from: a */
    public View f42220a;

    /* JADX INFO: renamed from: b */
    public GTCaptcha4Client.OnDialogShowListener f42221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3587h(@NotNull Context context) {
        super(context, C3586g0.f42219a.m14325b(context, "gt4_captcha_dialog_style"));
        Intrinsics.m18599g(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m14326a() {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(1280);
        }
        Window window2 = getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        Context context = getContext();
        Intrinsics.m18598f(context, "context");
        Resources resources = context.getResources();
        Intrinsics.m18598f(resources, "context.resources");
        int i = resources.getDisplayMetrics().widthPixels;
        Context context2 = getContext();
        Intrinsics.m18598f(context2, "context");
        Resources resources2 = context2.getResources();
        Intrinsics.m18598f(resources2, "context.resources");
        int i2 = resources2.getDisplayMetrics().heightPixels;
        if (attributes != null) {
            attributes.width = i;
        }
        if (attributes != null) {
            attributes.height = i2;
        }
        C3588h0 c3588h0 = C3588h0.f42225d;
        StringBuilder sbM24u = AbstractC0000a.m24u("ScreenWidth: ", ", ScreenHeight: ", ", DialogWidth: ", i, i2);
        sbM24u.append(attributes != null ? Integer.valueOf(attributes.width) : null);
        sbM24u.append(", DialogHeight: ");
        sbM24u.append(attributes != null ? Integer.valueOf(attributes.height) : null);
        c3588h0.m14331c(sbM24u.toString());
        if (attributes != null) {
            attributes.gravity = 17;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(attributes);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater inflater = LayoutInflater.from(getContext());
        Intrinsics.m18598f(inflater, "inflater");
        View view = this.f42220a;
        if (view != null) {
            setContentView(view);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener = this.f42221b;
        if (onDialogShowListener != null) {
            onDialogShowListener.onDialogFocusChanged(this, z2);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener = this.f42221b;
        if (onDialogShowListener != null) {
            onDialogShowListener.actionBeforeDialogShow(this);
        }
        super.show();
        GTCaptcha4Client.OnDialogShowListener onDialogShowListener2 = this.f42221b;
        if (onDialogShowListener2 != null) {
            onDialogShowListener2.actionAfterDialogShow(this);
        }
        m14326a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3587h(@NotNull Context context, @NotNull String dialogStyle) {
        super(context, C3586g0.f42219a.m14325b(context, dialogStyle));
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(dialogStyle, "dialogStyle");
    }
}
