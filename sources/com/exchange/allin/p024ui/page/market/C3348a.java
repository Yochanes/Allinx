package com.exchange.allin.p024ui.page.market;

import com.exchange.allin.p024ui.page.market.MarketViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.market.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3348a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MarketViewModel f39997b;

    public /* synthetic */ C3348a(MarketViewModel marketViewModel, int i) {
        this.f39996a = i;
        this.f39997b = marketViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39996a) {
            case 0:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangePairSort.f39987a);
                break;
            case 1:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangePriceSort.f39988a);
                break;
            case 2:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangeChangeSort.f39986a);
                break;
            case 3:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangePairSort.f39987a);
                break;
            case 4:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangeTurnoverSort.f39989a);
                break;
            case 5:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangeTurnoverSort.f39989a);
                break;
            case 6:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangePriceSort.f39988a);
                break;
            case 7:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangeChangeSort.f39986a);
                break;
            case 8:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangePriceSort.f39988a);
                break;
            case 9:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangeChangeSort.f39986a);
                break;
            case 10:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangePairSort.f39987a);
                break;
            default:
                this.f39997b.m13947f(MarketViewModel.UiAction.ChangeTurnoverSort.f39989a);
                break;
        }
        return Unit.f51459a;
    }
}
