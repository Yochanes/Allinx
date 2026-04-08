package com.exchange.allin.p024ui.page.account.forget.setting;

import androidx.compose.p013ui.focus.FocusManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.forget.setting.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2854c implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FocusManager f37208b;

    public /* synthetic */ C2854c(FocusManager focusManager, int i) {
        this.f37207a = i;
        this.f37208b = focusManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37207a) {
            case 0:
                this.f37208b.mo4975s(false);
                break;
            case 1:
                this.f37208b.mo4975s(false);
                break;
            case 2:
                this.f37208b.mo4975s(false);
                break;
            default:
                this.f37208b.mo4975s(false);
                break;
        }
        return Unit.f51459a;
    }
}
