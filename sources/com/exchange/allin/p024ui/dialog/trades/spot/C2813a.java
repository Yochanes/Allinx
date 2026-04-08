package com.exchange.allin.p024ui.dialog.trades.spot;

import com.exchange.allin.data.SpotTickerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.spot.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2813a implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36759a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f36760b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SpotTickerData f36761c;

    public /* synthetic */ C2813a(Function1 function1, SpotTickerData spotTickerData, int i) {
        this.f36759a = i;
        this.f36760b = function1;
        this.f36761c = spotTickerData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36759a) {
            case 0:
                this.f36760b.invoke(this.f36761c.getSymbol());
                break;
            default:
                this.f36760b.invoke(this.f36761c.getSymbol());
                break;
        }
        return Unit.f51459a;
    }
}
