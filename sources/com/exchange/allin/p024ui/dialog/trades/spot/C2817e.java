package com.exchange.allin.p024ui.dialog.trades.spot;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.exchange.allin.data.SpotTickerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.spot.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2817e implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SnapshotStateList f36786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SpotTickerData f36787c;

    public /* synthetic */ C2817e(SnapshotStateList snapshotStateList, SpotTickerData spotTickerData, int i) {
        this.f36785a = i;
        this.f36786b = snapshotStateList;
        this.f36787c = spotTickerData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36785a) {
            case 0:
                SpotTickerData spotTickerData = this.f36787c;
                String symbol = spotTickerData.getSymbol();
                SnapshotStateList snapshotStateList = this.f36786b;
                if (snapshotStateList.contains(symbol)) {
                    snapshotStateList.remove(spotTickerData.getSymbol());
                } else {
                    snapshotStateList.add(spotTickerData.getSymbol());
                }
                break;
            default:
                SpotTickerData spotTickerData2 = this.f36787c;
                String symbol2 = spotTickerData2.getSymbol();
                SnapshotStateList snapshotStateList2 = this.f36786b;
                if (snapshotStateList2.contains(symbol2)) {
                    snapshotStateList2.remove(spotTickerData2.getSymbol());
                } else {
                    snapshotStateList2.add(spotTickerData2.getSymbol());
                }
                break;
        }
        return Unit.f51459a;
    }
}
