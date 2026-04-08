package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesPositionMargin;", "", "amount", "", "available", "leverage", "", "marginAmount", "maxRemovableMargin", "<init>", "(DDIDD)V", "getAmount", "()D", "getAvailable", "getLeverage", "()I", "getMarginAmount", "getMaxRemovableMargin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesPositionMargin {
    public static final int $stable = 0;
    private final double amount;
    private final double available;
    private final int leverage;

    @SerializedName("margin_amount")
    private final double marginAmount;

    @SerializedName("max_removable_margin")
    private final double maxRemovableMargin;

    public FuturesPositionMargin(double d, double d2, int i, double d3, double d4) {
        this.amount = d;
        this.available = d2;
        this.leverage = i;
        this.marginAmount = d3;
        this.maxRemovableMargin = d4;
    }

    public static /* synthetic */ FuturesPositionMargin copy$default(FuturesPositionMargin futuresPositionMargin, double d, double d2, int i, double d3, double d4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = futuresPositionMargin.amount;
        }
        double d5 = d;
        if ((i2 & 2) != 0) {
            d2 = futuresPositionMargin.available;
        }
        double d6 = d2;
        if ((i2 & 4) != 0) {
            i = futuresPositionMargin.leverage;
        }
        return futuresPositionMargin.copy(d5, d6, i, (i2 & 8) != 0 ? futuresPositionMargin.marginAmount : d3, (i2 & 16) != 0 ? futuresPositionMargin.maxRemovableMargin : d4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMarginAmount() {
        return this.marginAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMaxRemovableMargin() {
        return this.maxRemovableMargin;
    }

    @NotNull
    public final FuturesPositionMargin copy(double amount, double available, int leverage, double marginAmount, double maxRemovableMargin) {
        return new FuturesPositionMargin(amount, available, leverage, marginAmount, maxRemovableMargin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesPositionMargin)) {
            return false;
        }
        FuturesPositionMargin futuresPositionMargin = (FuturesPositionMargin) other;
        return Double.compare(this.amount, futuresPositionMargin.amount) == 0 && Double.compare(this.available, futuresPositionMargin.available) == 0 && this.leverage == futuresPositionMargin.leverage && Double.compare(this.marginAmount, futuresPositionMargin.marginAmount) == 0 && Double.compare(this.maxRemovableMargin, futuresPositionMargin.maxRemovableMargin) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getAvailable() {
        return this.available;
    }

    public final int getLeverage() {
        return this.leverage;
    }

    public final double getMarginAmount() {
        return this.marginAmount;
    }

    public final double getMaxRemovableMargin() {
        return this.maxRemovableMargin;
    }

    public int hashCode() {
        return Double.hashCode(this.maxRemovableMargin) + AbstractC0455a.m2227b(AbstractC0455a.m2228c(this.leverage, AbstractC0455a.m2227b(Double.hashCode(this.amount) * 31, 31, this.available), 31), 31, this.marginAmount);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesPositionMargin(amount=");
        sb.append(this.amount);
        sb.append(", available=");
        sb.append(this.available);
        sb.append(", leverage=");
        sb.append(this.leverage);
        sb.append(", marginAmount=");
        sb.append(this.marginAmount);
        sb.append(", maxRemovableMargin=");
        return AbstractC0455a.m2239n(sb, this.maxRemovableMargin, ')');
    }
}
