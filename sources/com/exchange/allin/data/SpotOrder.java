package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bF\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u000bHÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u000eHÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u000eHÆ\u0003J\t\u0010I\u001a\u00020\u000eHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00107Jî\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\u000eHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0011\u0010:\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b;\u0010\u001f¨\u0006Y"}, m18302d2 = {"Lcom/exchange/allin/data/SpotOrder;", "", "frm", "", BlockAlignment.LEFT, "matchAmt", "", "matchQty", "matchPrice", "matchFee", "orderId", "", "realOrderId", "orderSubType", "", "orderType", FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.QUANTITY, "side", "status", "stopPrice", "tickerId", "timestamp", "to", "symbol", "tradeNo", "updateAt", "createAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDDDJJIIDDIILjava/lang/String;JDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getFrm", "()Ljava/lang/String;", "getLeft", "getMatchAmt", "()D", "getMatchQty", "getMatchPrice", "getMatchFee", "getOrderId", "()J", "getRealOrderId", "getOrderSubType", "()I", "getOrderType", "getPrice", "getQuantity", "getSide", "getStatus", "getStopPrice", "getTickerId", "getTimestamp", "getTo", "getSymbol", "getTradeNo", "getUpdateAt", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCreateAt", "statusExt", "getStatusExt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;DDDDJJIIDDIILjava/lang/String;JDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/exchange/allin/data/SpotOrder;", "equals", "", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class SpotOrder {
    public static final int $stable = 0;

    @SerializedName("create_at")
    @Nullable
    private final Double createAt;

    @NotNull
    private final String frm;

    @NotNull
    private final String left;

    @SerializedName("match_amt")
    private final double matchAmt;

    @SerializedName("match_fee")
    private final double matchFee;

    @SerializedName("match_price")
    private final double matchPrice;

    @SerializedName("match_qty")
    private final double matchQty;

    @SerializedName("order_id")
    private final long orderId;

    @SerializedName("order_sub_type")
    private final int orderSubType;

    @SerializedName("order_type")
    private final int orderType;
    private final double price;
    private final double quantity;

    @SerializedName("real_order_id")
    private final long realOrderId;
    private final int side;
    private final int status;

    @SerializedName("stop_price")
    @NotNull
    private final String stopPrice;

    @NotNull
    private final String symbol;

    @SerializedName("ticker_id")
    private final long tickerId;
    private final double timestamp;

    @NotNull
    private final String to;

    @SerializedName("trade_no")
    @NotNull
    private final String tradeNo;

    @SerializedName(alternate = {"update_timestamp"}, value = "update_at")
    @Nullable
    private final Double updateAt;

    public SpotOrder(@NotNull String frm, @NotNull String left, double d, double d2, double d3, double d4, long j, long j2, int i, int i2, double d5, double d6, int i3, int i4, @NotNull String stopPrice, long j3, double d7, @NotNull String to, @NotNull String symbol, @NotNull String tradeNo, @Nullable Double d8, @Nullable Double d9) {
        Intrinsics.m18599g(frm, "frm");
        Intrinsics.m18599g(left, "left");
        Intrinsics.m18599g(stopPrice, "stopPrice");
        Intrinsics.m18599g(to, "to");
        Intrinsics.m18599g(symbol, "symbol");
        Intrinsics.m18599g(tradeNo, "tradeNo");
        this.frm = frm;
        this.left = left;
        this.matchAmt = d;
        this.matchQty = d2;
        this.matchPrice = d3;
        this.matchFee = d4;
        this.orderId = j;
        this.realOrderId = j2;
        this.orderSubType = i;
        this.orderType = i2;
        this.price = d5;
        this.quantity = d6;
        this.side = i3;
        this.status = i4;
        this.stopPrice = stopPrice;
        this.tickerId = j3;
        this.timestamp = d7;
        this.to = to;
        this.symbol = symbol;
        this.tradeNo = tradeNo;
        this.updateAt = d8;
        this.createAt = d9;
    }

    public static /* synthetic */ SpotOrder copy$default(SpotOrder spotOrder, String str, String str2, double d, double d2, double d3, double d4, long j, long j2, int i, int i2, double d5, double d6, int i3, int i4, String str3, long j3, double d7, String str4, String str5, String str6, Double d8, Double d9, int i5, Object obj) {
        Double d10;
        Double d11;
        int i6;
        int i7;
        double d12;
        double d13;
        int i8;
        String str7;
        long j4;
        double d14;
        String str8;
        String str9;
        String str10;
        String str11;
        int i9;
        double d15;
        double d16;
        double d17;
        double d18;
        long j5;
        long j6;
        String str12 = (i5 & 1) != 0 ? spotOrder.frm : str;
        String str13 = (i5 & 2) != 0 ? spotOrder.left : str2;
        double d19 = (i5 & 4) != 0 ? spotOrder.matchAmt : d;
        double d20 = (i5 & 8) != 0 ? spotOrder.matchQty : d2;
        double d21 = (i5 & 16) != 0 ? spotOrder.matchPrice : d3;
        double d22 = (i5 & 32) != 0 ? spotOrder.matchFee : d4;
        long j7 = (i5 & 64) != 0 ? spotOrder.orderId : j;
        long j8 = (i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? spotOrder.realOrderId : j2;
        String str14 = str12;
        int i10 = (i5 & 256) != 0 ? spotOrder.orderSubType : i;
        int i11 = (i5 & 512) != 0 ? spotOrder.orderType : i2;
        String str15 = str13;
        double d23 = (i5 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? spotOrder.price : d5;
        double d24 = (i5 & 2048) != 0 ? spotOrder.quantity : d6;
        int i12 = (i5 & 4096) != 0 ? spotOrder.side : i3;
        int i13 = (i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? spotOrder.status : i4;
        int i14 = i12;
        String str16 = (i5 & 16384) != 0 ? spotOrder.stopPrice : str3;
        long j9 = (i5 & 32768) != 0 ? spotOrder.tickerId : j3;
        double d25 = (i5 & 65536) != 0 ? spotOrder.timestamp : d7;
        String str17 = (i5 & 131072) != 0 ? spotOrder.to : str4;
        String str18 = (i5 & 262144) != 0 ? spotOrder.symbol : str5;
        String str19 = str17;
        String str20 = (i5 & 524288) != 0 ? spotOrder.tradeNo : str6;
        Double d26 = (i5 & 1048576) != 0 ? spotOrder.updateAt : d8;
        if ((i5 & 2097152) != 0) {
            d11 = d26;
            d10 = spotOrder.createAt;
            i7 = i11;
            d12 = d23;
            d13 = d24;
            i8 = i14;
            str7 = str16;
            j4 = j9;
            d14 = d25;
            str8 = str19;
            str9 = str20;
            str10 = str15;
            str11 = str18;
            i9 = i13;
            d15 = d19;
            d16 = d20;
            d17 = d21;
            d18 = d22;
            j5 = j7;
            j6 = j8;
            i6 = i10;
        } else {
            d10 = d9;
            d11 = d26;
            i6 = i10;
            i7 = i11;
            d12 = d23;
            d13 = d24;
            i8 = i14;
            str7 = str16;
            j4 = j9;
            d14 = d25;
            str8 = str19;
            str9 = str20;
            str10 = str15;
            str11 = str18;
            i9 = i13;
            d15 = d19;
            d16 = d20;
            d17 = d21;
            d18 = d22;
            j5 = j7;
            j6 = j8;
        }
        return spotOrder.copy(str14, str10, d15, d16, d17, d18, j5, j6, i6, i7, d12, d13, i8, i9, str7, j4, d14, str8, str11, str9, d11, d10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrm() {
        return this.frm;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStopPrice() {
        return this.stopPrice;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getTickerId() {
        return this.tickerId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final double getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeft() {
        return this.left;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTradeNo() {
        return this.tradeNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Double getUpdateAt() {
        return this.updateAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Double getCreateAt() {
        return this.createAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMatchAmt() {
        return this.matchAmt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMatchQty() {
        return this.matchQty;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMatchPrice() {
        return this.matchPrice;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getMatchFee() {
        return this.matchFee;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getRealOrderId() {
        return this.realOrderId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getOrderSubType() {
        return this.orderSubType;
    }

    @NotNull
    public final SpotOrder copy(@NotNull String frm, @NotNull String left, double matchAmt, double matchQty, double matchPrice, double matchFee, long orderId, long realOrderId, int orderSubType, int orderType, double price, double quantity, int side, int status, @NotNull String stopPrice, long tickerId, double timestamp, @NotNull String to, @NotNull String symbol, @NotNull String tradeNo, @Nullable Double updateAt, @Nullable Double createAt) {
        Intrinsics.m18599g(frm, "frm");
        Intrinsics.m18599g(left, "left");
        Intrinsics.m18599g(stopPrice, "stopPrice");
        Intrinsics.m18599g(to, "to");
        Intrinsics.m18599g(symbol, "symbol");
        Intrinsics.m18599g(tradeNo, "tradeNo");
        return new SpotOrder(frm, left, matchAmt, matchQty, matchPrice, matchFee, orderId, realOrderId, orderSubType, orderType, price, quantity, side, status, stopPrice, tickerId, timestamp, to, symbol, tradeNo, updateAt, createAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotOrder)) {
            return false;
        }
        SpotOrder spotOrder = (SpotOrder) other;
        return Intrinsics.m18594b(this.frm, spotOrder.frm) && Intrinsics.m18594b(this.left, spotOrder.left) && Double.compare(this.matchAmt, spotOrder.matchAmt) == 0 && Double.compare(this.matchQty, spotOrder.matchQty) == 0 && Double.compare(this.matchPrice, spotOrder.matchPrice) == 0 && Double.compare(this.matchFee, spotOrder.matchFee) == 0 && this.orderId == spotOrder.orderId && this.realOrderId == spotOrder.realOrderId && this.orderSubType == spotOrder.orderSubType && this.orderType == spotOrder.orderType && Double.compare(this.price, spotOrder.price) == 0 && Double.compare(this.quantity, spotOrder.quantity) == 0 && this.side == spotOrder.side && this.status == spotOrder.status && Intrinsics.m18594b(this.stopPrice, spotOrder.stopPrice) && this.tickerId == spotOrder.tickerId && Double.compare(this.timestamp, spotOrder.timestamp) == 0 && Intrinsics.m18594b(this.to, spotOrder.to) && Intrinsics.m18594b(this.symbol, spotOrder.symbol) && Intrinsics.m18594b(this.tradeNo, spotOrder.tradeNo) && Intrinsics.m18594b(this.updateAt, spotOrder.updateAt) && Intrinsics.m18594b(this.createAt, spotOrder.createAt);
    }

    @Nullable
    public final Double getCreateAt() {
        return this.createAt;
    }

    @NotNull
    public final String getFrm() {
        return this.frm;
    }

    @NotNull
    public final String getLeft() {
        return this.left;
    }

    public final double getMatchAmt() {
        return this.matchAmt;
    }

    public final double getMatchFee() {
        return this.matchFee;
    }

    public final double getMatchPrice() {
        return this.matchPrice;
    }

    public final double getMatchQty() {
        return this.matchQty;
    }

    public final long getOrderId() {
        return this.orderId;
    }

    public final int getOrderSubType() {
        return this.orderSubType;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public final long getRealOrderId() {
        return this.realOrderId;
    }

    public final int getSide() {
        return this.side;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStatusExt() {
        int i = this.status;
        return (i == 2 || i == 3) ? "Pending" : i != 4 ? i != 5 ? i != 6 ? "Pending" : "Canceled" : "Partially Filled" : "Filled";
    }

    @NotNull
    public final String getStopPrice() {
        return this.stopPrice;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final long getTickerId() {
        return this.tickerId;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTo() {
        return this.to;
    }

    @NotNull
    public final String getTradeNo() {
        return this.tradeNo;
    }

    @Nullable
    public final Double getUpdateAt() {
        return this.updateAt;
    }

    public int hashCode() {
        int iM5b = AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2231f(this.tickerId, AbstractC0000a.m5b(AbstractC0455a.m2228c(this.status, AbstractC0455a.m2228c(this.side, AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2228c(this.orderType, AbstractC0455a.m2228c(this.orderSubType, AbstractC0455a.m2231f(this.realOrderId, AbstractC0455a.m2231f(this.orderId, AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0000a.m5b(this.frm.hashCode() * 31, 31, this.left), 31, this.matchAmt), 31, this.matchQty), 31, this.matchPrice), 31, this.matchFee), 31), 31), 31), 31), 31, this.price), 31, this.quantity), 31), 31), 31, this.stopPrice), 31), 31, this.timestamp), 31, this.to), 31, this.symbol), 31, this.tradeNo);
        Double d = this.updateAt;
        int iHashCode = (iM5b + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.createAt;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotOrder(frm=" + this.frm + ", left=" + this.left + ", matchAmt=" + this.matchAmt + ", matchQty=" + this.matchQty + ", matchPrice=" + this.matchPrice + ", matchFee=" + this.matchFee + ", orderId=" + this.orderId + ", realOrderId=" + this.realOrderId + ", orderSubType=" + this.orderSubType + ", orderType=" + this.orderType + ", price=" + this.price + ", quantity=" + this.quantity + ", side=" + this.side + ", status=" + this.status + ", stopPrice=" + this.stopPrice + ", tickerId=" + this.tickerId + ", timestamp=" + this.timestamp + ", to=" + this.to + ", symbol=" + this.symbol + ", tradeNo=" + this.tradeNo + ", updateAt=" + this.updateAt + ", createAt=" + this.createAt + ')';
    }
}
