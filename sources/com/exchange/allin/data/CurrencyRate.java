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
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m18302d2 = {"Lcom/exchange/allin/data/CurrencyRate;", "", "symbol", "", FirebaseAnalytics.Param.PRICE, "", "baseCode", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getPrice", "()D", "getBaseCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class CurrencyRate {
    public static final int $stable = 0;

    @SerializedName("base_code")
    @NotNull
    private final String baseCode;
    private final double price;

    @NotNull
    private final String symbol;

    public CurrencyRate(@NotNull String symbol, double d, @NotNull String baseCode) {
        Intrinsics.m18599g(symbol, "symbol");
        Intrinsics.m18599g(baseCode, "baseCode");
        this.symbol = symbol;
        this.price = d;
        this.baseCode = baseCode;
    }

    public static /* synthetic */ CurrencyRate copy$default(CurrencyRate currencyRate, String str, double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyRate.symbol;
        }
        if ((i & 2) != 0) {
            d = currencyRate.price;
        }
        if ((i & 4) != 0) {
            str2 = currencyRate.baseCode;
        }
        return currencyRate.copy(str, d, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseCode() {
        return this.baseCode;
    }

    @NotNull
    public final CurrencyRate copy(@NotNull String symbol, double price, @NotNull String baseCode) {
        Intrinsics.m18599g(symbol, "symbol");
        Intrinsics.m18599g(baseCode, "baseCode");
        return new CurrencyRate(symbol, price, baseCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyRate)) {
            return false;
        }
        CurrencyRate currencyRate = (CurrencyRate) other;
        return Intrinsics.m18594b(this.symbol, currencyRate.symbol) && Double.compare(this.price, currencyRate.price) == 0 && Intrinsics.m18594b(this.baseCode, currencyRate.baseCode);
    }

    @NotNull
    public final String getBaseCode() {
        return this.baseCode;
    }

    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return this.baseCode.hashCode() + AbstractC0455a.m2227b(this.symbol.hashCode() * 31, 31, this.price);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CurrencyRate(symbol=");
        sb.append(this.symbol);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", baseCode=");
        return AbstractC0455a.m2241p(sb, this.baseCode, ')');
    }
}
