package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, m18302d2 = {"Lcom/exchange/allin/data/FlashAsset;", "", "available", "", "todayProfit", "investAmount", "totalProfit", "totalBalance", "totalFreezen", "<init>", "(DDDDDD)V", "getAvailable", "()D", "getTodayProfit", "getInvestAmount", "getTotalProfit", "getTotalBalance", "getTotalFreezen", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FlashAsset {
    public static final int $stable = 0;
    private final double available;
    private final double investAmount;
    private final double todayProfit;
    private final double totalBalance;
    private final double totalFreezen;
    private final double totalProfit;

    public FlashAsset(double d, double d2, double d3, double d4, double d5, double d6) {
        this.available = d;
        this.todayProfit = d2;
        this.investAmount = d3;
        this.totalProfit = d4;
        this.totalBalance = d5;
        this.totalFreezen = d6;
    }

    public static /* synthetic */ FlashAsset copy$default(FlashAsset flashAsset, double d, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
        if ((i & 1) != 0) {
            d = flashAsset.available;
        }
        return flashAsset.copy(d, (i & 2) != 0 ? flashAsset.todayProfit : d2, (i & 4) != 0 ? flashAsset.investAmount : d3, (i & 8) != 0 ? flashAsset.totalProfit : d4, (i & 16) != 0 ? flashAsset.totalBalance : d5, (i & 32) != 0 ? flashAsset.totalFreezen : d6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getTodayProfit() {
        return this.todayProfit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getInvestAmount() {
        return this.investAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTotalProfit() {
        return this.totalProfit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getTotalBalance() {
        return this.totalBalance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getTotalFreezen() {
        return this.totalFreezen;
    }

    @NotNull
    public final FlashAsset copy(double available, double todayProfit, double investAmount, double totalProfit, double totalBalance, double totalFreezen) {
        return new FlashAsset(available, todayProfit, investAmount, totalProfit, totalBalance, totalFreezen);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashAsset)) {
            return false;
        }
        FlashAsset flashAsset = (FlashAsset) other;
        return Double.compare(this.available, flashAsset.available) == 0 && Double.compare(this.todayProfit, flashAsset.todayProfit) == 0 && Double.compare(this.investAmount, flashAsset.investAmount) == 0 && Double.compare(this.totalProfit, flashAsset.totalProfit) == 0 && Double.compare(this.totalBalance, flashAsset.totalBalance) == 0 && Double.compare(this.totalFreezen, flashAsset.totalFreezen) == 0;
    }

    public final double getAvailable() {
        return this.available;
    }

    public final double getInvestAmount() {
        return this.investAmount;
    }

    public final double getTodayProfit() {
        return this.todayProfit;
    }

    public final double getTotalBalance() {
        return this.totalBalance;
    }

    public final double getTotalFreezen() {
        return this.totalFreezen;
    }

    public final double getTotalProfit() {
        return this.totalProfit;
    }

    public int hashCode() {
        return Double.hashCode(this.totalFreezen) + AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(Double.hashCode(this.available) * 31, 31, this.todayProfit), 31, this.investAmount), 31, this.totalProfit), 31, this.totalBalance);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FlashAsset(available=");
        sb.append(this.available);
        sb.append(", todayProfit=");
        sb.append(this.todayProfit);
        sb.append(", investAmount=");
        sb.append(this.investAmount);
        sb.append(", totalProfit=");
        sb.append(this.totalProfit);
        sb.append(", totalBalance=");
        sb.append(this.totalBalance);
        sb.append(", totalFreezen=");
        return AbstractC0455a.m2239n(sb, this.totalFreezen, ')');
    }
}
