package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, m18302d2 = {"Lcom/exchange/allin/data/SpotTrade;", "", "symbol", "", "amount", "", FirebaseAnalytics.Param.PRICE, "side", "", "time", "volume", "<init>", "(Ljava/lang/String;DDIDD)V", "getSymbol", "()Ljava/lang/String;", "getAmount", "()D", "getPrice", "getSide", "()I", "getTime", "getVolume", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class SpotTrade {
    public static final int $stable = 0;
    private final double amount;
    private final double price;
    private final int side;

    @NotNull
    private final String symbol;

    @SerializedName(alternate = {"timestamp"}, value = "time")
    private final double time;
    private final double volume;

    public SpotTrade(@NotNull String symbol, double d, double d2, int i, double d3, double d4) {
        Intrinsics.m18599g(symbol, "symbol");
        this.symbol = symbol;
        this.amount = d;
        this.price = d2;
        this.side = i;
        this.time = d3;
        this.volume = d4;
    }

    public static /* synthetic */ SpotTrade copy$default(SpotTrade spotTrade, String str, double d, double d2, int i, double d3, double d4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = spotTrade.symbol;
        }
        if ((i2 & 2) != 0) {
            d = spotTrade.amount;
        }
        if ((i2 & 4) != 0) {
            d2 = spotTrade.price;
        }
        if ((i2 & 8) != 0) {
            i = spotTrade.side;
        }
        if ((i2 & 16) != 0) {
            d3 = spotTrade.time;
        }
        if ((i2 & 32) != 0) {
            d4 = spotTrade.volume;
        }
        int i3 = i;
        double d5 = d2;
        return spotTrade.copy(str, d, d5, i3, d3, d4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getVolume() {
        return this.volume;
    }

    @NotNull
    public final SpotTrade copy(@NotNull String symbol, double amount, double price, int side, double time, double volume) {
        Intrinsics.m18599g(symbol, "symbol");
        return new SpotTrade(symbol, amount, price, side, time, volume);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotTrade)) {
            return false;
        }
        SpotTrade spotTrade = (SpotTrade) other;
        return Intrinsics.m18594b(this.symbol, spotTrade.symbol) && Double.compare(this.amount, spotTrade.amount) == 0 && Double.compare(this.price, spotTrade.price) == 0 && this.side == spotTrade.side && Double.compare(this.time, spotTrade.time) == 0 && Double.compare(this.volume, spotTrade.volume) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getPrice() {
        return this.price;
    }

    public final int getSide() {
        return this.side;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final double getTime() {
        return this.time;
    }

    public final double getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return Double.hashCode(this.volume) + AbstractC0455a.m2227b(AbstractC0455a.m2228c(this.side, AbstractC0455a.m2227b(AbstractC0455a.m2227b(this.symbol.hashCode() * 31, 31, this.amount), 31, this.price), 31), 31, this.time);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotTrade(symbol=");
        sb.append(this.symbol);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", side=");
        sb.append(this.side);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", volume=");
        return AbstractC0455a.m2239n(sb, this.volume, ')');
    }
}
