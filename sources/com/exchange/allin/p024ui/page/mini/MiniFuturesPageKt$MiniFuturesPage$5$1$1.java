package com.exchange.allin.p024ui.page.mini;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.exchange.allin.data.FuturesMarketState;
import com.exchange.allin.net.p023ws.MiniFuturesWebSocketHelper;
import com.exchange.allin.net.p023ws.data.TopicSubscription;
import com.exchange.allin.p024ui.page.mini.MiniFuturesViewModel;
import com.exchange.allin.utils.ext.ConfigExtKt;
import com.exchange.allin.utils.ext.StringExtKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.p047ws.RealWebSocket;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/allin/ui/page/mini/MiniFuturesPageKt$MiniFuturesPage$5$1$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MiniFuturesPageKt$MiniFuturesPage$5$1$1 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MiniFuturesViewModel f40191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f40192b;

    public MiniFuturesPageKt$MiniFuturesPage$5$1$1(MiniFuturesViewModel miniFuturesViewModel, MutableState mutableState) {
        this.f40191a = miniFuturesViewModel;
        this.f40192b = mutableState;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        String market;
        String market2;
        MiniFuturesViewModel miniFuturesViewModel = this.f40191a;
        if (MiniFuturesWebSocketHelper.f35374b) {
            StateFlow stateFlow = miniFuturesViewModel.f43370c;
            FuturesMarketState futuresMarketState = ((MiniFuturesViewModel.ViewState) stateFlow.getValue()).f40212a;
            String str = "";
            if (futuresMarketState == null || (market = futuresMarketState.getMarket()) == null) {
                market = "";
            }
            TopicSubscription topicSubscription = new TopicSubscription("unsubscribe.trade", MapsKt.m18485h(new Pair("market", market)), 3L);
            RealWebSocket realWebSocket = MiniFuturesWebSocketHelper.f35373a;
            if (realWebSocket != null) {
                realWebSocket.send(StringExtKt.m14225n(topicSubscription));
            }
            LinkedHashMap linkedHashMap = MiniFuturesWebSocketHelper.f35378f;
            linkedHashMap.remove(3);
            FuturesMarketState futuresMarketState2 = ((MiniFuturesViewModel.ViewState) stateFlow.getValue()).f40212a;
            if (futuresMarketState2 != null && (market2 = futuresMarketState2.getMarket()) != null) {
                str = market2;
            }
            TopicSubscription topicSubscription2 = new TopicSubscription("unsubscribe.kline", MapsKt.m18486i(new Pair("market", str), new Pair("period", ((MiniFuturesViewModel.ViewState) stateFlow.getValue()).m13978b())), 6L);
            RealWebSocket realWebSocket2 = MiniFuturesWebSocketHelper.f35373a;
            if (realWebSocket2 != null) {
                realWebSocket2.send(StringExtKt.m14225n(topicSubscription2));
            }
            linkedHashMap.remove(6);
            if (ConfigExtKt.m14196e()) {
                TopicSubscription topicSubscription3 = new TopicSubscription("unsubscribe.asset", null, 4L, 2, null);
                RealWebSocket realWebSocket3 = MiniFuturesWebSocketHelper.f35373a;
                if (realWebSocket3 != null) {
                    realWebSocket3.send(StringExtKt.m14225n(topicSubscription3));
                }
                linkedHashMap.remove(4);
                TopicSubscription topicSubscription4 = new TopicSubscription("unsubscribe.position", null, 5L, 2, null);
                RealWebSocket realWebSocket4 = MiniFuturesWebSocketHelper.f35373a;
                if (realWebSocket4 != null) {
                    realWebSocket4.send(StringExtKt.m14225n(topicSubscription4));
                }
                linkedHashMap.remove(5);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        Intrinsics.m18599g(owner, "owner");
        if (((MiniFuturesViewModel.ViewState) this.f40192b.getF20325a()).f40212a != null) {
            MiniFuturesViewModel miniFuturesViewModel = this.f40191a;
            miniFuturesViewModel.m13976l();
            miniFuturesViewModel.m13975k();
            boolean zM14196e = ConfigExtKt.m14196e();
            StateFlow stateFlow = miniFuturesViewModel.f43370c;
            if (!zM14196e) {
                ((MiniFuturesViewModel.ViewState) stateFlow.getValue()).f40217f.clear();
            } else {
                if (((MiniFuturesViewModel.ViewState) stateFlow.getValue()).f40217f.isEmpty()) {
                    return;
                }
                miniFuturesViewModel.m13974j(MiniFuturesViewModel.UiAction.LoadPendingPosition.f40210a);
            }
        }
    }
}
