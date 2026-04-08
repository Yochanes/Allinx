package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R \u0010\u001c\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00061"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesAsset;", "", "coinName", "", "available", "", "frozen", "transfer", "balanceTotal", "margin", "profitUnreal", "bonus", "<init>", "(Ljava/lang/String;DDDDDDD)V", "getCoinName", "()Ljava/lang/String;", "getAvailable", "()D", "getFrozen", "getTransfer", "getBalanceTotal", "getMargin", "getProfitUnreal", "setProfitUnreal", "(D)V", "getBonus", "equity", "getEquity", "availableCopy", "getAvailableCopy", "()Ljava/lang/Double;", "setAvailableCopy", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesAsset {
    public static final int $stable = 8;
    private final double available;

    @Nullable
    private Double availableCopy;

    @SerializedName("balance_total")
    private final double balanceTotal;
    private final double bonus;

    @NotNull
    private final String coinName;
    private final double frozen;
    private final double margin;

    @SerializedName("profit_unreal")
    private double profitUnreal;
    private final double transfer;

    public FuturesAsset(@NotNull String coinName, double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        Intrinsics.m18599g(coinName, "coinName");
        this.coinName = coinName;
        this.available = d;
        this.frozen = d2;
        this.transfer = d3;
        this.balanceTotal = d4;
        this.margin = d5;
        this.profitUnreal = d6;
        this.bonus = d7;
    }

    public static /* synthetic */ FuturesAsset copy$default(FuturesAsset futuresAsset, String str, double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, Object obj) {
        double d8;
        String str2;
        FuturesAsset futuresAsset2;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        String str3 = (i & 1) != 0 ? futuresAsset.coinName : str;
        double d15 = (i & 2) != 0 ? futuresAsset.available : d;
        double d16 = (i & 4) != 0 ? futuresAsset.frozen : d2;
        double d17 = (i & 8) != 0 ? futuresAsset.transfer : d3;
        double d18 = (i & 16) != 0 ? futuresAsset.balanceTotal : d4;
        double d19 = (i & 32) != 0 ? futuresAsset.margin : d5;
        double d20 = (i & 64) != 0 ? futuresAsset.profitUnreal : d6;
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str2 = str3;
            d8 = futuresAsset.bonus;
            d9 = d15;
            d10 = d16;
            d11 = d17;
            d12 = d18;
            d13 = d19;
            d14 = d20;
            futuresAsset2 = futuresAsset;
        } else {
            d8 = d7;
            str2 = str3;
            futuresAsset2 = futuresAsset;
            d9 = d15;
            d10 = d16;
            d11 = d17;
            d12 = d18;
            d13 = d19;
            d14 = d20;
        }
        return futuresAsset2.copy(str2, d9, d10, d11, d12, d13, d14, d8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getFrozen() {
        return this.frozen;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTransfer() {
        return this.transfer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getBalanceTotal() {
        return this.balanceTotal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getProfitUnreal() {
        return this.profitUnreal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getBonus() {
        return this.bonus;
    }

    @NotNull
    public final FuturesAsset copy(@NotNull String coinName, double available, double frozen, double transfer, double balanceTotal, double margin, double profitUnreal, double bonus) {
        Intrinsics.m18599g(coinName, "coinName");
        return new FuturesAsset(coinName, available, frozen, transfer, balanceTotal, margin, profitUnreal, bonus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAsset)) {
            return false;
        }
        FuturesAsset futuresAsset = (FuturesAsset) other;
        return Intrinsics.m18594b(this.coinName, futuresAsset.coinName) && Double.compare(this.available, futuresAsset.available) == 0 && Double.compare(this.frozen, futuresAsset.frozen) == 0 && Double.compare(this.transfer, futuresAsset.transfer) == 0 && Double.compare(this.balanceTotal, futuresAsset.balanceTotal) == 0 && Double.compare(this.margin, futuresAsset.margin) == 0 && Double.compare(this.profitUnreal, futuresAsset.profitUnreal) == 0 && Double.compare(this.bonus, futuresAsset.bonus) == 0;
    }

    public final double getAvailable() {
        return this.available;
    }

    @Nullable
    public final Double getAvailableCopy() {
        Double d = this.availableCopy;
        return Double.valueOf(d != null ? d.doubleValue() : this.available);
    }

    public final double getBalanceTotal() {
        return this.balanceTotal;
    }

    public final double getBonus() {
        return this.bonus;
    }

    @NotNull
    public final String getCoinName() {
        return this.coinName;
    }

    public final double getEquity() {
        return this.balanceTotal + this.profitUnreal;
    }

    public final double getFrozen() {
        return this.frozen;
    }

    public final double getMargin() {
        return this.margin;
    }

    public final double getProfitUnreal() {
        return this.profitUnreal;
    }

    public final double getTransfer() {
        return this.transfer;
    }

    public int hashCode() {
        return Double.hashCode(this.bonus) + AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(this.coinName.hashCode() * 31, 31, this.available), 31, this.frozen), 31, this.transfer), 31, this.balanceTotal), 31, this.margin), 31, this.profitUnreal);
    }

    public final void setAvailableCopy(@Nullable Double d) {
        this.availableCopy = d;
    }

    public final void setProfitUnreal(double d) {
        this.profitUnreal = d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesAsset(coinName=");
        sb.append(this.coinName);
        sb.append(", available=");
        sb.append(this.available);
        sb.append(", frozen=");
        sb.append(this.frozen);
        sb.append(", transfer=");
        sb.append(this.transfer);
        sb.append(", balanceTotal=");
        sb.append(this.balanceTotal);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", profitUnreal=");
        sb.append(this.profitUnreal);
        sb.append(", bonus=");
        return AbstractC0455a.m2239n(sb, this.bonus, ')');
    }
}
