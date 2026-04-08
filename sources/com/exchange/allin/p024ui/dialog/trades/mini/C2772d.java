package com.exchange.allin.p024ui.dialog.trades.mini;

import com.exchange.allin.data.FuturesMarketState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.mini.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2772d implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f36692b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FuturesMarketState f36693c;

    public /* synthetic */ C2772d(Function1 function1, FuturesMarketState futuresMarketState, int i) {
        this.f36691a = i;
        this.f36692b = function1;
        this.f36693c = futuresMarketState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36691a) {
            case 0:
                this.f36692b.invoke(this.f36693c.getMarket());
                break;
            default:
                this.f36692b.invoke(this.f36693c.getMarket());
                break;
        }
        return Unit.f51459a;
    }
}
