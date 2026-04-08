package com.exchange.allin.p024ui.widgets;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.K */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3512K implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SoftwareKeyboardController f41183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FocusManager f41184c;

    public /* synthetic */ C3512K(SoftwareKeyboardController softwareKeyboardController, FocusManager focusManager, int i) {
        this.f41182a = i;
        this.f41183b = softwareKeyboardController;
        this.f41184c = focusManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
        switch (this.f41182a) {
            case 0:
                Intrinsics.m18599g(KeyboardActions, "$this$KeyboardActions");
                SoftwareKeyboardController softwareKeyboardController = this.f41183b;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                this.f41184c.mo4975s(false);
                break;
            default:
                Intrinsics.m18599g(KeyboardActions, "$this$KeyboardActions");
                SoftwareKeyboardController softwareKeyboardController2 = this.f41183b;
                if (softwareKeyboardController2 != null) {
                    softwareKeyboardController2.hide();
                }
                this.f41184c.mo4975s(false);
                break;
        }
        return Unit.f51459a;
    }
}
