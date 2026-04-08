package com.exchange.allin.p024ui.widgets;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.p013ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.G */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3507G implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FocusRequester f41149b;

    public /* synthetic */ C3507G(FocusRequester focusRequester, int i) {
        this.f41148a = i;
        this.f41149b = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
        switch (this.f41148a) {
            case 0:
                Intrinsics.m18599g(KeyboardActions, "$this$KeyboardActions");
                FocusRequester focusRequester = this.f41149b;
                if (focusRequester != null) {
                    FocusRequester.m5001c(focusRequester);
                }
                break;
            default:
                Intrinsics.m18599g(KeyboardActions, "$this$KeyboardActions");
                FocusRequester focusRequester2 = this.f41149b;
                if (focusRequester2 != null) {
                    FocusRequester.m5001c(focusRequester2);
                }
                break;
        }
        return Unit.f51459a;
    }
}
