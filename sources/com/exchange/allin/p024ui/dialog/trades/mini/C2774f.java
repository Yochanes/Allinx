package com.exchange.allin.p024ui.dialog.trades.mini;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.exchange.allin.data.FuturesMarketState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.mini.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2774f implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SnapshotStateList f36698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FuturesMarketState f36699c;

    public /* synthetic */ C2774f(SnapshotStateList snapshotStateList, FuturesMarketState futuresMarketState, int i) {
        this.f36697a = i;
        this.f36698b = snapshotStateList;
        this.f36699c = futuresMarketState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36697a) {
            case 0:
                FuturesMarketState futuresMarketState = this.f36699c;
                String market = futuresMarketState.getMarket();
                SnapshotStateList snapshotStateList = this.f36698b;
                if (snapshotStateList.contains(market)) {
                    snapshotStateList.remove(futuresMarketState.getMarket());
                } else {
                    snapshotStateList.add(futuresMarketState.getMarket());
                }
                break;
            default:
                FuturesMarketState futuresMarketState2 = this.f36699c;
                String market2 = futuresMarketState2.getMarket();
                SnapshotStateList snapshotStateList2 = this.f36698b;
                if (snapshotStateList2.contains(market2)) {
                    snapshotStateList2.remove(futuresMarketState2.getMarket());
                } else {
                    snapshotStateList2.add(futuresMarketState2.getMarket());
                }
                break;
        }
        return Unit.f51459a;
    }
}
