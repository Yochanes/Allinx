package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.kline.KData;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m18302d2 = {"Lcom/exchange/allin/data/SpotKline;", "", "time", "", "open", "", "close", "high", "low", "volume", "amount", "<init>", "(JDDDDDD)V", "getTime", "()J", "getOpen", "()D", "getClose", "getHigh", "getLow", "getVolume", "getAmount", "kData", "Lcom/exchange/kline/KData;", "getKData", "()Lcom/exchange/kline/KData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class SpotKline {
    public static final int $stable = 0;
    private final double amount;
    private final double close;
    private final double high;
    private final double low;
    private final double open;

    @SerializedName(alternate = {"timestamp"}, value = "time")
    private final long time;
    private final double volume;

    public SpotKline(long j, double d, double d2, double d3, double d4, double d5, double d6) {
        this.time = j;
        this.open = d;
        this.close = d2;
        this.high = d3;
        this.low = d4;
        this.volume = d5;
        this.amount = d6;
    }

    public static /* synthetic */ SpotKline copy$default(SpotKline spotKline, long j, double d, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
        return spotKline.copy((i & 1) != 0 ? spotKline.time : j, (i & 2) != 0 ? spotKline.open : d, (i & 4) != 0 ? spotKline.close : d2, (i & 8) != 0 ? spotKline.high : d3, (i & 16) != 0 ? spotKline.low : d4, (i & 32) != 0 ? spotKline.volume : d5, (i & 64) != 0 ? spotKline.amount : d6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getOpen() {
        return this.open;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getVolume() {
        return this.volume;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final SpotKline copy(long time, double open, double close, double high, double low, double volume, double amount) {
        return new SpotKline(time, open, close, high, low, volume, amount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotKline)) {
            return false;
        }
        SpotKline spotKline = (SpotKline) other;
        return this.time == spotKline.time && Double.compare(this.open, spotKline.open) == 0 && Double.compare(this.close, spotKline.close) == 0 && Double.compare(this.high, spotKline.high) == 0 && Double.compare(this.low, spotKline.low) == 0 && Double.compare(this.volume, spotKline.volume) == 0 && Double.compare(this.amount, spotKline.amount) == 0;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getClose() {
        return this.close;
    }

    public final double getHigh() {
        return this.high;
    }

    @NotNull
    public final KData getKData() {
        return new KData(this.time * ((long) 1000), this.open, this.close, this.high, this.low, this.volume, this.amount);
    }

    public final double getLow() {
        return this.low;
    }

    public final double getOpen() {
        return this.open;
    }

    public final long getTime() {
        return this.time;
    }

    public final double getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return Double.hashCode(this.amount) + AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(Long.hashCode(this.time) * 31, 31, this.open), 31, this.close), 31, this.high), 31, this.low), 31, this.volume);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotKline(time=");
        sb.append(this.time);
        sb.append(", open=");
        sb.append(this.open);
        sb.append(", close=");
        sb.append(this.close);
        sb.append(", high=");
        sb.append(this.high);
        sb.append(", low=");
        sb.append(this.low);
        sb.append(", volume=");
        sb.append(this.volume);
        sb.append(", amount=");
        return AbstractC0455a.m2239n(sb, this.amount, ')');
    }
}
