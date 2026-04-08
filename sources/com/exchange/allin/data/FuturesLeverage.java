package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesLeverage;", "", "positionType", "", "leverage", "", "<init>", "(ILjava/lang/String;)V", "getPositionType", "()I", "getLeverage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesLeverage {
    public static final int $stable = 0;

    @NotNull
    private final String leverage;

    @SerializedName("position_type")
    private final int positionType;

    public FuturesLeverage(int i, @NotNull String leverage) {
        Intrinsics.m18599g(leverage, "leverage");
        this.positionType = i;
        this.leverage = leverage;
    }

    public static /* synthetic */ FuturesLeverage copy$default(FuturesLeverage futuresLeverage, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = futuresLeverage.positionType;
        }
        if ((i2 & 2) != 0) {
            str = futuresLeverage.leverage;
        }
        return futuresLeverage.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPositionType() {
        return this.positionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @NotNull
    public final FuturesLeverage copy(int positionType, @NotNull String leverage) {
        Intrinsics.m18599g(leverage, "leverage");
        return new FuturesLeverage(positionType, leverage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesLeverage)) {
            return false;
        }
        FuturesLeverage futuresLeverage = (FuturesLeverage) other;
        return this.positionType == futuresLeverage.positionType && Intrinsics.m18594b(this.leverage, futuresLeverage.leverage);
    }

    @NotNull
    public final String getLeverage() {
        return this.leverage;
    }

    public final int getPositionType() {
        return this.positionType;
    }

    public int hashCode() {
        return this.leverage.hashCode() + (Integer.hashCode(this.positionType) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesLeverage(positionType=");
        sb.append(this.positionType);
        sb.append(", leverage=");
        return AbstractC0455a.m2241p(sb, this.leverage, ')');
    }
}
