package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000e¨\u0006%"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesMarketDeal;", "", "market", "", "id", "", "time", "", "type", "amount", FirebaseAnalytics.Param.PRICE, "<init>", "(Ljava/lang/String;JDLjava/lang/String;DD)V", "getMarket", "()Ljava/lang/String;", "getId", "()J", "getTime", "()D", "getType", "getAmount", "getPrice", "typeExt", "getTypeExt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesMarketDeal {
    public static final int $stable = 0;
    private final double amount;
    private final long id;

    @NotNull
    private final String market;
    private final double price;
    private final double time;

    @NotNull
    private final String type;

    public FuturesMarketDeal(@NotNull String market, long j, double d, @NotNull String type, double d2, double d3) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(type, "type");
        this.market = market;
        this.id = j;
        this.time = d;
        this.type = type;
        this.amount = d2;
        this.price = d3;
    }

    public static /* synthetic */ FuturesMarketDeal copy$default(FuturesMarketDeal futuresMarketDeal, String str, long j, double d, String str2, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresMarketDeal.market;
        }
        if ((i & 2) != 0) {
            j = futuresMarketDeal.id;
        }
        if ((i & 4) != 0) {
            d = futuresMarketDeal.time;
        }
        if ((i & 8) != 0) {
            str2 = futuresMarketDeal.type;
        }
        if ((i & 16) != 0) {
            d2 = futuresMarketDeal.amount;
        }
        if ((i & 32) != 0) {
            d3 = futuresMarketDeal.price;
        }
        String str3 = str2;
        double d4 = d;
        return futuresMarketDeal.copy(str, j, d4, str3, d2, d3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final FuturesMarketDeal copy(@NotNull String market, long id, double time, @NotNull String type, double amount, double price) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(type, "type");
        return new FuturesMarketDeal(market, id, time, type, amount, price);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesMarketDeal)) {
            return false;
        }
        FuturesMarketDeal futuresMarketDeal = (FuturesMarketDeal) other;
        return Intrinsics.m18594b(this.market, futuresMarketDeal.market) && this.id == futuresMarketDeal.id && Double.compare(this.time, futuresMarketDeal.time) == 0 && Intrinsics.m18594b(this.type, futuresMarketDeal.type) && Double.compare(this.amount, futuresMarketDeal.amount) == 0 && Double.compare(this.price, futuresMarketDeal.price) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getMarket() {
        return this.market;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getTime() {
        return this.time;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getTypeExt() {
        return StringExtKt.m14217f(Intrinsics.m18594b(this.type, "buy") ? "futures_detail_text_buy" : "futures_detail_text_sell");
    }

    public int hashCode() {
        return Double.hashCode(this.price) + AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2231f(this.id, this.market.hashCode() * 31, 31), 31, this.time), 31, this.type), 31, this.amount);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesMarketDeal(market=");
        sb.append(this.market);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", price=");
        return AbstractC0455a.m2239n(sb, this.price, ')');
    }
}
