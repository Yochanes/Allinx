package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J½\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0005HÆ\u0001J\u0013\u0010I\u001a\u0002012\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u000bHÖ\u0001J\t\u0010L\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u00100\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b0\u00102R\u0011\u00103\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b3\u00102R\u0011\u00104\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010 ¨\u0006M"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesPositionHistory;", "", "positionId", "", "createTime", "", "updateTime", "market", "", "userId", "type", "", "finishType", "side", "sys", "amountMax", "openPrice", "closePrice", "openValMax", "profitReal", "marginAmount", "fee", "leverage", "roe", "<init>", "(JDDLjava/lang/String;JIIIIDDDLjava/lang/String;DDDLjava/lang/String;D)V", "getPositionId", "()J", "getCreateTime", "()D", "getUpdateTime", "getMarket", "()Ljava/lang/String;", "getUserId", "getType", "()I", "getFinishType", "getSide", "getSys", "getAmountMax", "getOpenPrice", "getClosePrice", "getOpenValMax", "getProfitReal", "getMarginAmount", "getFee", "getLeverage", "getRoe", "isSell", "", "()Z", "isCross", "finishTypeExt", "getFinishTypeExt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesPositionHistory {
    public static final int $stable = 0;

    @SerializedName("amount_max")
    private final double amountMax;

    @SerializedName("close_price")
    private final double closePrice;

    @SerializedName("create_time")
    private final double createTime;
    private final double fee;

    @SerializedName("finish_type")
    private final int finishType;

    @NotNull
    private final String leverage;

    @SerializedName("margin_amount")
    private final double marginAmount;

    @NotNull
    private final String market;

    @SerializedName("open_price")
    private final double openPrice;

    @SerializedName("open_val_max")
    @NotNull
    private final String openValMax;

    @SerializedName("position_id")
    private final long positionId;

    @SerializedName("profit_real")
    private final double profitReal;
    private final double roe;
    private final int side;
    private final int sys;
    private final int type;

    @SerializedName("update_time")
    private final double updateTime;

    @SerializedName(MTCoreConstants.Register.KEY_USER_ID)
    private final long userId;

    public FuturesPositionHistory(long j, double d, double d2, @NotNull String market, long j2, int i, int i2, int i3, int i4, double d3, double d4, double d5, @NotNull String openValMax, double d6, double d7, double d8, @NotNull String leverage, double d9) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(openValMax, "openValMax");
        Intrinsics.m18599g(leverage, "leverage");
        this.positionId = j;
        this.createTime = d;
        this.updateTime = d2;
        this.market = market;
        this.userId = j2;
        this.type = i;
        this.finishType = i2;
        this.side = i3;
        this.sys = i4;
        this.amountMax = d3;
        this.openPrice = d4;
        this.closePrice = d5;
        this.openValMax = openValMax;
        this.profitReal = d6;
        this.marginAmount = d7;
        this.fee = d8;
        this.leverage = leverage;
        this.roe = d9;
    }

    public static /* synthetic */ FuturesPositionHistory copy$default(FuturesPositionHistory futuresPositionHistory, long j, double d, double d2, String str, long j2, int i, int i2, int i3, int i4, double d3, double d4, double d5, String str2, double d6, double d7, double d8, String str3, double d9, int i5, Object obj) {
        long j3;
        double d10;
        double d11;
        double d12;
        long j4 = (i5 & 1) != 0 ? futuresPositionHistory.positionId : j;
        double d13 = (i5 & 2) != 0 ? futuresPositionHistory.createTime : d;
        double d14 = (i5 & 4) != 0 ? futuresPositionHistory.updateTime : d2;
        String str4 = (i5 & 8) != 0 ? futuresPositionHistory.market : str;
        long j5 = (i5 & 16) != 0 ? futuresPositionHistory.userId : j2;
        int i6 = (i5 & 32) != 0 ? futuresPositionHistory.type : i;
        int i7 = (i5 & 64) != 0 ? futuresPositionHistory.finishType : i2;
        int i8 = (i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? futuresPositionHistory.side : i3;
        int i9 = (i5 & 256) != 0 ? futuresPositionHistory.sys : i4;
        if ((i5 & 512) != 0) {
            j3 = j4;
            d10 = futuresPositionHistory.amountMax;
        } else {
            j3 = j4;
            d10 = d3;
        }
        double d15 = d10;
        double d16 = (i5 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? futuresPositionHistory.openPrice : d4;
        double d17 = (i5 & 2048) != 0 ? futuresPositionHistory.closePrice : d5;
        String str5 = (i5 & 4096) != 0 ? futuresPositionHistory.openValMax : str2;
        double d18 = (i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? futuresPositionHistory.profitReal : d6;
        double d19 = (i5 & 16384) != 0 ? futuresPositionHistory.marginAmount : d7;
        double d20 = (i5 & 32768) != 0 ? futuresPositionHistory.fee : d8;
        String str6 = (i5 & 65536) != 0 ? futuresPositionHistory.leverage : str3;
        if ((i5 & 131072) != 0) {
            d12 = d20;
            d11 = futuresPositionHistory.roe;
        } else {
            d11 = d9;
            d12 = d20;
        }
        return futuresPositionHistory.copy(j3, d13, d14, str4, j5, i6, i7, i8, i9, d15, d16, d17, str5, d18, d19, d12, str6, d11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getPositionId() {
        return this.positionId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getAmountMax() {
        return this.amountMax;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getOpenPrice() {
        return this.openPrice;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getClosePrice() {
        return this.closePrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOpenValMax() {
        return this.openValMax;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getProfitReal() {
        return this.profitReal;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final double getMarginAmount() {
        return this.marginAmount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final double getFee() {
        return this.fee;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final double getRoe() {
        return this.roe;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFinishType() {
        return this.finishType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSys() {
        return this.sys;
    }

    @NotNull
    public final FuturesPositionHistory copy(long positionId, double createTime, double updateTime, @NotNull String market, long userId, int type, int finishType, int side, int sys, double amountMax, double openPrice, double closePrice, @NotNull String openValMax, double profitReal, double marginAmount, double fee, @NotNull String leverage, double roe) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(openValMax, "openValMax");
        Intrinsics.m18599g(leverage, "leverage");
        return new FuturesPositionHistory(positionId, createTime, updateTime, market, userId, type, finishType, side, sys, amountMax, openPrice, closePrice, openValMax, profitReal, marginAmount, fee, leverage, roe);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesPositionHistory)) {
            return false;
        }
        FuturesPositionHistory futuresPositionHistory = (FuturesPositionHistory) other;
        return this.positionId == futuresPositionHistory.positionId && Double.compare(this.createTime, futuresPositionHistory.createTime) == 0 && Double.compare(this.updateTime, futuresPositionHistory.updateTime) == 0 && Intrinsics.m18594b(this.market, futuresPositionHistory.market) && this.userId == futuresPositionHistory.userId && this.type == futuresPositionHistory.type && this.finishType == futuresPositionHistory.finishType && this.side == futuresPositionHistory.side && this.sys == futuresPositionHistory.sys && Double.compare(this.amountMax, futuresPositionHistory.amountMax) == 0 && Double.compare(this.openPrice, futuresPositionHistory.openPrice) == 0 && Double.compare(this.closePrice, futuresPositionHistory.closePrice) == 0 && Intrinsics.m18594b(this.openValMax, futuresPositionHistory.openValMax) && Double.compare(this.profitReal, futuresPositionHistory.profitReal) == 0 && Double.compare(this.marginAmount, futuresPositionHistory.marginAmount) == 0 && Double.compare(this.fee, futuresPositionHistory.fee) == 0 && Intrinsics.m18594b(this.leverage, futuresPositionHistory.leverage) && Double.compare(this.roe, futuresPositionHistory.roe) == 0;
    }

    public final double getAmountMax() {
        return this.amountMax;
    }

    public final double getClosePrice() {
        return this.closePrice;
    }

    public final double getCreateTime() {
        return this.createTime;
    }

    public final double getFee() {
        return this.fee;
    }

    public final int getFinishType() {
        return this.finishType;
    }

    @NotNull
    public final String getFinishTypeExt() {
        int i = this.finishType;
        return i != 1 ? i != 2 ? i != 3 ? "" : StringExtKt.m14217f("futures_history_finish_type_text_adl") : StringExtKt.m14217f("futures_history_finish_type_text_liquidation") : StringExtKt.m14217f("futures_history_finish_type_text_trade");
    }

    @NotNull
    public final String getLeverage() {
        return this.leverage;
    }

    public final double getMarginAmount() {
        return this.marginAmount;
    }

    @NotNull
    public final String getMarket() {
        return this.market;
    }

    public final double getOpenPrice() {
        return this.openPrice;
    }

    @NotNull
    public final String getOpenValMax() {
        return this.openValMax;
    }

    public final long getPositionId() {
        return this.positionId;
    }

    public final double getProfitReal() {
        return this.profitReal;
    }

    public final double getRoe() {
        return this.roe;
    }

    public final int getSide() {
        return this.side;
    }

    public final int getSys() {
        return this.sys;
    }

    public final int getType() {
        return this.type;
    }

    public final double getUpdateTime() {
        return this.updateTime;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Double.hashCode(this.roe) + AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2228c(this.sys, AbstractC0455a.m2228c(this.side, AbstractC0455a.m2228c(this.finishType, AbstractC0455a.m2228c(this.type, AbstractC0455a.m2231f(this.userId, AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(Long.hashCode(this.positionId) * 31, 31, this.createTime), 31, this.updateTime), 31, this.market), 31), 31), 31), 31), 31), 31, this.amountMax), 31, this.openPrice), 31, this.closePrice), 31, this.openValMax), 31, this.profitReal), 31, this.marginAmount), 31, this.fee), 31, this.leverage);
    }

    public final boolean isCross() {
        return this.type == 2;
    }

    public final boolean isSell() {
        return this.side == 1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesPositionHistory(positionId=");
        sb.append(this.positionId);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", market=");
        sb.append(this.market);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", finishType=");
        sb.append(this.finishType);
        sb.append(", side=");
        sb.append(this.side);
        sb.append(", sys=");
        sb.append(this.sys);
        sb.append(", amountMax=");
        sb.append(this.amountMax);
        sb.append(", openPrice=");
        sb.append(this.openPrice);
        sb.append(", closePrice=");
        sb.append(this.closePrice);
        sb.append(", openValMax=");
        sb.append(this.openValMax);
        sb.append(", profitReal=");
        sb.append(this.profitReal);
        sb.append(", marginAmount=");
        sb.append(this.marginAmount);
        sb.append(", fee=");
        sb.append(this.fee);
        sb.append(", leverage=");
        sb.append(this.leverage);
        sb.append(", roe=");
        return AbstractC0455a.m2239n(sb, this.roe, ')');
    }
}
