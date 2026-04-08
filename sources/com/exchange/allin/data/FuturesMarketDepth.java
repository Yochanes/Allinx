package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000bHÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000bHÆ\u0003Jg\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006("}, m18302d2 = {"Lcom/exchange/allin/data/FuturesMarketDepth;", "", "market", "", "indexPrice", "", "signPrice", "time", "", "last", "asks", "", "bids", "<init>", "(Ljava/lang/String;DDJDLjava/util/List;Ljava/util/List;)V", "getMarket", "()Ljava/lang/String;", "getIndexPrice", "()D", "getSignPrice", "getTime", "()J", "getLast", "getAsks", "()Ljava/util/List;", "getBids", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesMarketDepth {
    public static final int $stable = 8;

    @NotNull
    private final List<List<Double>> asks;

    @NotNull
    private final List<List<Double>> bids;

    @SerializedName("index_price")
    private final double indexPrice;
    private final double last;

    @SerializedName("market")
    @NotNull
    private final String market;

    @SerializedName("sign_price")
    private final double signPrice;
    private final long time;

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesMarketDepth(@NotNull String market, double d, double d2, long j, double d3, @NotNull List<? extends List<Double>> asks, @NotNull List<? extends List<Double>> bids) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(asks, "asks");
        Intrinsics.m18599g(bids, "bids");
        this.market = market;
        this.indexPrice = d;
        this.signPrice = d2;
        this.time = j;
        this.last = d3;
        this.asks = asks;
        this.bids = bids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesMarketDepth copy$default(FuturesMarketDepth futuresMarketDepth, String str, double d, double d2, long j, double d3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresMarketDepth.market;
        }
        if ((i & 2) != 0) {
            d = futuresMarketDepth.indexPrice;
        }
        if ((i & 4) != 0) {
            d2 = futuresMarketDepth.signPrice;
        }
        if ((i & 8) != 0) {
            j = futuresMarketDepth.time;
        }
        if ((i & 16) != 0) {
            d3 = futuresMarketDepth.last;
        }
        if ((i & 32) != 0) {
            list = futuresMarketDepth.asks;
        }
        if ((i & 64) != 0) {
            list2 = futuresMarketDepth.bids;
        }
        double d4 = d3;
        long j2 = j;
        double d5 = d2;
        return futuresMarketDepth.copy(str, d, d5, j2, d4, list, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getIndexPrice() {
        return this.indexPrice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getSignPrice() {
        return this.signPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLast() {
        return this.last;
    }

    @NotNull
    public final List<List<Double>> component6() {
        return this.asks;
    }

    @NotNull
    public final List<List<Double>> component7() {
        return this.bids;
    }

    @NotNull
    public final FuturesMarketDepth copy(@NotNull String market, double indexPrice, double signPrice, long time, double last, @NotNull List<? extends List<Double>> asks, @NotNull List<? extends List<Double>> bids) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(asks, "asks");
        Intrinsics.m18599g(bids, "bids");
        return new FuturesMarketDepth(market, indexPrice, signPrice, time, last, asks, bids);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesMarketDepth)) {
            return false;
        }
        FuturesMarketDepth futuresMarketDepth = (FuturesMarketDepth) other;
        return Intrinsics.m18594b(this.market, futuresMarketDepth.market) && Double.compare(this.indexPrice, futuresMarketDepth.indexPrice) == 0 && Double.compare(this.signPrice, futuresMarketDepth.signPrice) == 0 && this.time == futuresMarketDepth.time && Double.compare(this.last, futuresMarketDepth.last) == 0 && Intrinsics.m18594b(this.asks, futuresMarketDepth.asks) && Intrinsics.m18594b(this.bids, futuresMarketDepth.bids);
    }

    @NotNull
    public final List<List<Double>> getAsks() {
        return this.asks;
    }

    @NotNull
    public final List<List<Double>> getBids() {
        return this.bids;
    }

    public final double getIndexPrice() {
        return this.indexPrice;
    }

    public final double getLast() {
        return this.last;
    }

    @NotNull
    public final String getMarket() {
        return this.market;
    }

    public final double getSignPrice() {
        return this.signPrice;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.bids.hashCode() + AbstractC0455a.m2233h(this.asks, AbstractC0455a.m2227b(AbstractC0455a.m2231f(this.time, AbstractC0455a.m2227b(AbstractC0455a.m2227b(this.market.hashCode() * 31, 31, this.indexPrice), 31, this.signPrice), 31), 31, this.last), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesMarketDepth(market=");
        sb.append(this.market);
        sb.append(", indexPrice=");
        sb.append(this.indexPrice);
        sb.append(", signPrice=");
        sb.append(this.signPrice);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", asks=");
        sb.append(this.asks);
        sb.append(", bids=");
        return AbstractC0455a.m2242q(sb, this.bids, ')');
    }
}
