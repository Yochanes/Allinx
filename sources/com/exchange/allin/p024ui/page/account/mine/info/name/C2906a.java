package com.exchange.allin.p024ui.page.account.mine.info.name;

import com.exchange.allin.p024ui.page.account.mine.info.name.ModifyUserNameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.mine.info.name.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2906a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ModifyUserNameViewModel f37522b;

    public /* synthetic */ C2906a(ModifyUserNameViewModel modifyUserNameViewModel, int i) {
        this.f37521a = i;
        this.f37522b = modifyUserNameViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37521a) {
            case 0:
                this.f37522b.m13678f(ModifyUserNameViewModel.UiAction.Submit.f37512a);
                break;
            default:
                this.f37522b.m13678f(new ModifyUserNameViewModel.UiAction.ChangeName(""));
                break;
        }
        return Unit.f51459a;
    }
}
