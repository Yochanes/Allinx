package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m18302d2 = {"Lcom/exchange/allin/data/SpotTickerDepthData;", "", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.QUANTITY, "<init>", "(DD)V", "getPrice", "()D", "getQuantity", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class SpotTickerDepthData {
    public static final int $stable = 0;
    private final double price;
    private final double quantity;

    public SpotTickerDepthData(double d, double d2) {
        this.price = d;
        this.quantity = d2;
    }

    public static /* synthetic */ SpotTickerDepthData copy$default(SpotTickerDepthData spotTickerDepthData, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = spotTickerDepthData.price;
        }
        if ((i & 2) != 0) {
            d2 = spotTickerDepthData.quantity;
        }
        return spotTickerDepthData.copy(d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final SpotTickerDepthData copy(double price, double quantity) {
        return new SpotTickerDepthData(price, quantity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotTickerDepthData)) {
            return false;
        }
        SpotTickerDepthData spotTickerDepthData = (SpotTickerDepthData) other;
        return Double.compare(this.price, spotTickerDepthData.price) == 0 && Double.compare(this.quantity, spotTickerDepthData.quantity) == 0;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return Double.hashCode(this.quantity) + (Double.hashCode(this.price) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotTickerDepthData(price=");
        sb.append(this.price);
        sb.append(", quantity=");
        return AbstractC0455a.m2239n(sb, this.quantity, ')');
    }
}
