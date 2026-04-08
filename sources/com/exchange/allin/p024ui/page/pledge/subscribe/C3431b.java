package com.exchange.allin.p024ui.page.pledge.subscribe;

import com.exchange.allin.p024ui.page.pledge.subscribe.SubscribeConfirmViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.pledge.subscribe.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3431b implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SubscribeConfirmViewModel.UiAction f40467b;

    public /* synthetic */ C3431b(SubscribeConfirmViewModel.UiAction uiAction, int i) {
        this.f40466a = i;
        this.f40467b = uiAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SubscribeConfirmViewModel.ViewState viewState = (SubscribeConfirmViewModel.ViewState) obj;
        switch (this.f40466a) {
            case 0:
                return SubscribeConfirmViewModel.ViewState.m14011a(viewState, ((SubscribeConfirmViewModel.UiAction.ChangeLevel) this.f40467b).f40449a, 0, false, 12);
            case 1:
                return SubscribeConfirmViewModel.ViewState.m14011a(viewState, 0, ((SubscribeConfirmViewModel.UiAction.ChangePeriod) this.f40467b).f40450a, false, 13);
            default:
                return SubscribeConfirmViewModel.ViewState.m14011a(viewState, 0, 0, false, 11);
        }
    }
}
