package com.exchange.allin.net.p023ws.event;

import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.data.FuturesMarketDeal;
import com.exchange.allin.data.FuturesWsKline;
import com.exchange.allin.data.FuturesWsPosition;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent;", "", "MarketState", "MarketTrade", "UserAsset", "Position", "MarketKline", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$MarketKline;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$MarketState;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$MarketTrade;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$Position;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$UserAsset;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class MiniFuturesWebSocketViewEvent {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$MarketKline;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class MarketKline extends MiniFuturesWebSocketViewEvent {

        /* JADX INFO: renamed from: a */
        public final FuturesWsKline f35408a;

        public MarketKline(FuturesWsKline futuresWsKline) {
            this.f35408a = futuresWsKline;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarketKline) && Intrinsics.m18594b(this.f35408a, ((MarketKline) obj).f35408a);
        }

        public final int hashCode() {
            return this.f35408a.hashCode();
        }

        public final String toString() {
            return "MarketKline(data=" + this.f35408a + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$MarketState;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class MarketState extends MiniFuturesWebSocketViewEvent {

        /* JADX INFO: renamed from: a */
        public final Map f35409a;

        public MarketState(Map map) {
            this.f35409a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarketState) && Intrinsics.m18594b(this.f35409a, ((MarketState) obj).f35409a);
        }

        public final int hashCode() {
            return this.f35409a.hashCode();
        }

        public final String toString() {
            return "MarketState(data=" + this.f35409a + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$MarketTrade;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class MarketTrade extends MiniFuturesWebSocketViewEvent {

        /* JADX INFO: renamed from: a */
        public final FuturesMarketDeal f35410a;

        public MarketTrade(FuturesMarketDeal futuresMarketDeal) {
            this.f35410a = futuresMarketDeal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarketTrade) && Intrinsics.m18594b(this.f35410a, ((MarketTrade) obj).f35410a);
        }

        public final int hashCode() {
            return this.f35410a.hashCode();
        }

        public final String toString() {
            return "MarketTrade(data=" + this.f35410a + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$Position;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class Position extends MiniFuturesWebSocketViewEvent {

        /* JADX INFO: renamed from: a */
        public final FuturesWsPosition f35411a;

        public Position(FuturesWsPosition futuresWsPosition) {
            this.f35411a = futuresWsPosition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Position) && Intrinsics.m18594b(this.f35411a, ((Position) obj).f35411a);
        }

        public final int hashCode() {
            return this.f35411a.hashCode();
        }

        public final String toString() {
            return "Position(data=" + this.f35411a + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent$UserAsset;", "Lcom/exchange/allin/net/ws/event/MiniFuturesWebSocketViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class UserAsset extends MiniFuturesWebSocketViewEvent {

        /* JADX INFO: renamed from: a */
        public final Map f35412a;

        public UserAsset(Map map) {
            this.f35412a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserAsset) && Intrinsics.m18594b(this.f35412a, ((UserAsset) obj).f35412a);
        }

        public final int hashCode() {
            return this.f35412a.hashCode();
        }

        public final String toString() {
            return "UserAsset(data=" + this.f35412a + ')';
        }
    }
}
