package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.exchange.allin.utils.ext.StringExtKt;
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
@Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0006HÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u000eHÆ\u0003J\t\u0010Y\u001a\u00020\u000eHÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\t\u0010[\u001a\u00020\u000eHÆ\u0003J\t\u0010\\\u001a\u00020\u000eHÆ\u0003J\t\u0010]\u001a\u00020\u0006HÆ\u0003J\t\u0010^\u001a\u00020\u0006HÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\t\u0010`\u001a\u00020\u0006HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\u000eHÆ\u0003J\t\u0010c\u001a\u00020\u000eHÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\bHÆ\u0003J\t\u0010f\u001a\u00020\u0006HÆ\u0003J\t\u0010g\u001a\u00020\u0006HÆ\u0003J\t\u0010h\u001a\u00020\u0006HÆ\u0003J\t\u0010i\u001a\u00020\bHÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\t\u0010m\u001a\u00020\u0006HÆ\u0003Jµ\u0002\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006HÆ\u0001J\u0013\u0010o\u001a\u00020I2\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020\bHÖ\u0001J\t\u0010r\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0016\u0010\u0016\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0016\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0016\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u0016\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010,R\u0016\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0016\u0010\u001c\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0016\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0016\u0010\u001e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0016\u0010\u001f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010,R\u0016\u0010\"\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0016\u0010#\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010*R\u0011\u0010H\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bH\u0010JR\u0011\u0010K\u001a\u00020I8F¢\u0006\u0006\u001a\u0004\bK\u0010JR\u0011\u0010L\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bM\u0010*R\u0011\u0010N\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bO\u0010*¨\u0006s"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesOrder;", "", "orderId", "", "positionId", "market", "", "type", "", "side", "target", "effectType", "userId", "createTime", "", "updateTime", "source", FirebaseAnalytics.Param.PRICE, "amount", "takerFee", "makerFee", BlockAlignment.LEFT, "avgPrice", "dealProfit", "dealStock", "dealFee", "leverage", "positionType", "feeAsset", "feeDiscount", "dealAssetFee", "adlSort", "filled", "status", "takeProfitPrice", "stopLossPrice", "<init>", "(JJLjava/lang/String;IIIIJDDLjava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getOrderId", "()J", "getPositionId", "getMarket", "()Ljava/lang/String;", "getType", "()I", "getSide", "getTarget", "getEffectType", "getUserId", "getCreateTime", "()D", "getUpdateTime", "getSource", "getPrice", "getAmount", "getTakerFee", "getMakerFee", "getLeft", "getAvgPrice", "getDealProfit", "getDealStock", "getDealFee", "getLeverage", "getPositionType", "getFeeAsset", "getFeeDiscount", "getDealAssetFee", "getAdlSort", "getFilled", "getStatus", "getTakeProfitPrice", "getStopLossPrice", "isSell", "", "()Z", "isCross", "orderStatus", "getOrderStatus", "positionTypeExt", "getPositionTypeExt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "equals", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesOrder {
    public static final int $stable = 0;

    @SerializedName("adl_sort")
    private final int adlSort;
    private final double amount;

    @SerializedName("avg_price")
    @NotNull
    private final String avgPrice;

    @SerializedName("create_time")
    private final double createTime;

    @SerializedName("deal_asset_fee")
    @NotNull
    private final String dealAssetFee;

    @SerializedName("deal_fee")
    private final double dealFee;

    @SerializedName("deal_profit")
    @NotNull
    private final String dealProfit;

    @SerializedName("deal_stock")
    private final double dealStock;

    @SerializedName("effect_type")
    private final int effectType;

    @SerializedName("fee_asset")
    @NotNull
    private final String feeAsset;

    @SerializedName("fee_discount")
    @NotNull
    private final String feeDiscount;

    @NotNull
    private final String filled;

    @NotNull
    private final String left;
    private final int leverage;

    @SerializedName("maker_fee")
    @NotNull
    private final String makerFee;

    @NotNull
    private final String market;

    @SerializedName("order_id")
    private final long orderId;

    @SerializedName("position_id")
    private final long positionId;

    @SerializedName("position_type")
    private final int positionType;
    private final double price;
    private final int side;

    @NotNull
    private final String source;
    private final int status;

    @SerializedName("stop_loss_price")
    @NotNull
    private final String stopLossPrice;

    @SerializedName("take_profit_price")
    @NotNull
    private final String takeProfitPrice;

    @SerializedName("taker_fee")
    @NotNull
    private final String takerFee;
    private final int target;
    private final int type;

    @SerializedName("update_time")
    private final double updateTime;

    @SerializedName(MTCoreConstants.Register.KEY_USER_ID)
    private final long userId;

    public FuturesOrder(long j, long j2, @NotNull String market, int i, int i2, int i3, int i4, long j3, double d, double d2, @NotNull String source, double d3, double d4, @NotNull String takerFee, @NotNull String makerFee, @NotNull String left, @NotNull String avgPrice, @NotNull String dealProfit, double d5, double d6, int i5, int i6, @NotNull String feeAsset, @NotNull String feeDiscount, @NotNull String dealAssetFee, int i7, @NotNull String filled, int i8, @NotNull String takeProfitPrice, @NotNull String stopLossPrice) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(source, "source");
        Intrinsics.m18599g(takerFee, "takerFee");
        Intrinsics.m18599g(makerFee, "makerFee");
        Intrinsics.m18599g(left, "left");
        Intrinsics.m18599g(avgPrice, "avgPrice");
        Intrinsics.m18599g(dealProfit, "dealProfit");
        Intrinsics.m18599g(feeAsset, "feeAsset");
        Intrinsics.m18599g(feeDiscount, "feeDiscount");
        Intrinsics.m18599g(dealAssetFee, "dealAssetFee");
        Intrinsics.m18599g(filled, "filled");
        Intrinsics.m18599g(takeProfitPrice, "takeProfitPrice");
        Intrinsics.m18599g(stopLossPrice, "stopLossPrice");
        this.orderId = j;
        this.positionId = j2;
        this.market = market;
        this.type = i;
        this.side = i2;
        this.target = i3;
        this.effectType = i4;
        this.userId = j3;
        this.createTime = d;
        this.updateTime = d2;
        this.source = source;
        this.price = d3;
        this.amount = d4;
        this.takerFee = takerFee;
        this.makerFee = makerFee;
        this.left = left;
        this.avgPrice = avgPrice;
        this.dealProfit = dealProfit;
        this.dealStock = d5;
        this.dealFee = d6;
        this.leverage = i5;
        this.positionType = i6;
        this.feeAsset = feeAsset;
        this.feeDiscount = feeDiscount;
        this.dealAssetFee = dealAssetFee;
        this.adlSort = i7;
        this.filled = filled;
        this.status = i8;
        this.takeProfitPrice = takeProfitPrice;
        this.stopLossPrice = stopLossPrice;
    }

    public static /* synthetic */ FuturesOrder copy$default(FuturesOrder futuresOrder, long j, long j2, String str, int i, int i2, int i3, int i4, long j3, double d, double d2, String str2, double d3, double d4, String str3, String str4, String str5, String str6, String str7, double d5, double d6, int i5, int i6, String str8, String str9, String str10, int i7, String str11, int i8, String str12, String str13, int i9, Object obj) {
        long j4;
        double d7;
        String str14;
        String str15;
        long j5 = (i9 & 1) != 0 ? futuresOrder.orderId : j;
        long j6 = (i9 & 2) != 0 ? futuresOrder.positionId : j2;
        String str16 = (i9 & 4) != 0 ? futuresOrder.market : str;
        int i10 = (i9 & 8) != 0 ? futuresOrder.type : i;
        int i11 = (i9 & 16) != 0 ? futuresOrder.side : i2;
        int i12 = (i9 & 32) != 0 ? futuresOrder.target : i3;
        int i13 = (i9 & 64) != 0 ? futuresOrder.effectType : i4;
        long j7 = (i9 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? futuresOrder.userId : j3;
        double d8 = (i9 & 256) != 0 ? futuresOrder.createTime : d;
        if ((i9 & 512) != 0) {
            j4 = j5;
            d7 = futuresOrder.updateTime;
        } else {
            j4 = j5;
            d7 = d2;
        }
        double d9 = d7;
        String str17 = (i9 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? futuresOrder.source : str2;
        double d10 = (i9 & 2048) != 0 ? futuresOrder.price : d3;
        double d11 = (i9 & 4096) != 0 ? futuresOrder.amount : d4;
        String str18 = (i9 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? futuresOrder.takerFee : str3;
        String str19 = (i9 & 16384) != 0 ? futuresOrder.makerFee : str4;
        String str20 = (i9 & 32768) != 0 ? futuresOrder.left : str5;
        String str21 = (i9 & 65536) != 0 ? futuresOrder.avgPrice : str6;
        String str22 = (i9 & 131072) != 0 ? futuresOrder.dealProfit : str7;
        String str23 = str18;
        double d12 = (i9 & 262144) != 0 ? futuresOrder.dealStock : d5;
        double d13 = (i9 & 524288) != 0 ? futuresOrder.dealFee : d6;
        int i14 = (i9 & 1048576) != 0 ? futuresOrder.leverage : i5;
        int i15 = (i9 & 2097152) != 0 ? futuresOrder.positionType : i6;
        int i16 = i14;
        String str24 = (i9 & 4194304) != 0 ? futuresOrder.feeAsset : str8;
        String str25 = (i9 & 8388608) != 0 ? futuresOrder.feeDiscount : str9;
        String str26 = (i9 & 16777216) != 0 ? futuresOrder.dealAssetFee : str10;
        int i17 = (i9 & 33554432) != 0 ? futuresOrder.adlSort : i7;
        String str27 = (i9 & 67108864) != 0 ? futuresOrder.filled : str11;
        int i18 = (i9 & 134217728) != 0 ? futuresOrder.status : i8;
        String str28 = (i9 & 268435456) != 0 ? futuresOrder.takeProfitPrice : str12;
        if ((i9 & 536870912) != 0) {
            str15 = str28;
            str14 = futuresOrder.stopLossPrice;
        } else {
            str14 = str13;
            str15 = str28;
        }
        return futuresOrder.copy(j4, j6, str16, i10, i11, i12, i13, j7, d8, d9, str17, d10, d11, str23, str19, str20, str21, str22, d12, d13, i16, i15, str24, str25, str26, i17, str27, i18, str15, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTakerFee() {
        return this.takerFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMakerFee() {
        return this.makerFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getLeft() {
        return this.left;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getAvgPrice() {
        return this.avgPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getDealProfit() {
        return this.dealProfit;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final double getDealStock() {
        return this.dealStock;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPositionId() {
        return this.positionId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final double getDealFee() {
        return this.dealFee;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getPositionType() {
        return this.positionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getFeeAsset() {
        return this.feeAsset;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getFeeDiscount() {
        return this.feeDiscount;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDealAssetFee() {
        return this.dealAssetFee;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getAdlSort() {
        return this.adlSort;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getFilled() {
        return this.filled;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTakeProfitPrice() {
        return this.takeProfitPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getStopLossPrice() {
        return this.stopLossPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getEffectType() {
        return this.effectType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final FuturesOrder copy(long orderId, long positionId, @NotNull String market, int type, int side, int target, int effectType, long userId, double createTime, double updateTime, @NotNull String source, double price, double amount, @NotNull String takerFee, @NotNull String makerFee, @NotNull String left, @NotNull String avgPrice, @NotNull String dealProfit, double dealStock, double dealFee, int leverage, int positionType, @NotNull String feeAsset, @NotNull String feeDiscount, @NotNull String dealAssetFee, int adlSort, @NotNull String filled, int status, @NotNull String takeProfitPrice, @NotNull String stopLossPrice) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(source, "source");
        Intrinsics.m18599g(takerFee, "takerFee");
        Intrinsics.m18599g(makerFee, "makerFee");
        Intrinsics.m18599g(left, "left");
        Intrinsics.m18599g(avgPrice, "avgPrice");
        Intrinsics.m18599g(dealProfit, "dealProfit");
        Intrinsics.m18599g(feeAsset, "feeAsset");
        Intrinsics.m18599g(feeDiscount, "feeDiscount");
        Intrinsics.m18599g(dealAssetFee, "dealAssetFee");
        Intrinsics.m18599g(filled, "filled");
        Intrinsics.m18599g(takeProfitPrice, "takeProfitPrice");
        Intrinsics.m18599g(stopLossPrice, "stopLossPrice");
        return new FuturesOrder(orderId, positionId, market, type, side, target, effectType, userId, createTime, updateTime, source, price, amount, takerFee, makerFee, left, avgPrice, dealProfit, dealStock, dealFee, leverage, positionType, feeAsset, feeDiscount, dealAssetFee, adlSort, filled, status, takeProfitPrice, stopLossPrice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOrder)) {
            return false;
        }
        FuturesOrder futuresOrder = (FuturesOrder) other;
        return this.orderId == futuresOrder.orderId && this.positionId == futuresOrder.positionId && Intrinsics.m18594b(this.market, futuresOrder.market) && this.type == futuresOrder.type && this.side == futuresOrder.side && this.target == futuresOrder.target && this.effectType == futuresOrder.effectType && this.userId == futuresOrder.userId && Double.compare(this.createTime, futuresOrder.createTime) == 0 && Double.compare(this.updateTime, futuresOrder.updateTime) == 0 && Intrinsics.m18594b(this.source, futuresOrder.source) && Double.compare(this.price, futuresOrder.price) == 0 && Double.compare(this.amount, futuresOrder.amount) == 0 && Intrinsics.m18594b(this.takerFee, futuresOrder.takerFee) && Intrinsics.m18594b(this.makerFee, futuresOrder.makerFee) && Intrinsics.m18594b(this.left, futuresOrder.left) && Intrinsics.m18594b(this.avgPrice, futuresOrder.avgPrice) && Intrinsics.m18594b(this.dealProfit, futuresOrder.dealProfit) && Double.compare(this.dealStock, futuresOrder.dealStock) == 0 && Double.compare(this.dealFee, futuresOrder.dealFee) == 0 && this.leverage == futuresOrder.leverage && this.positionType == futuresOrder.positionType && Intrinsics.m18594b(this.feeAsset, futuresOrder.feeAsset) && Intrinsics.m18594b(this.feeDiscount, futuresOrder.feeDiscount) && Intrinsics.m18594b(this.dealAssetFee, futuresOrder.dealAssetFee) && this.adlSort == futuresOrder.adlSort && Intrinsics.m18594b(this.filled, futuresOrder.filled) && this.status == futuresOrder.status && Intrinsics.m18594b(this.takeProfitPrice, futuresOrder.takeProfitPrice) && Intrinsics.m18594b(this.stopLossPrice, futuresOrder.stopLossPrice);
    }

    public final int getAdlSort() {
        return this.adlSort;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getAvgPrice() {
        return this.avgPrice;
    }

    public final double getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getDealAssetFee() {
        return this.dealAssetFee;
    }

    public final double getDealFee() {
        return this.dealFee;
    }

    @NotNull
    public final String getDealProfit() {
        return this.dealProfit;
    }

    public final double getDealStock() {
        return this.dealStock;
    }

    public final int getEffectType() {
        return this.effectType;
    }

    @NotNull
    public final String getFeeAsset() {
        return this.feeAsset;
    }

    @NotNull
    public final String getFeeDiscount() {
        return this.feeDiscount;
    }

    @NotNull
    public final String getFilled() {
        return this.filled;
    }

    @NotNull
    public final String getLeft() {
        return this.left;
    }

    public final int getLeverage() {
        return this.leverage;
    }

    @NotNull
    public final String getMakerFee() {
        return this.makerFee;
    }

    @NotNull
    public final String getMarket() {
        return this.market;
    }

    public final long getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getOrderStatus() {
        int i = this.status;
        return (i == 1 || i == 2) ? StringExtKt.m14217f("futures_history_order_status_text_active") : i != 3 ? i != 4 ? i != 5 ? "" : StringExtKt.m14217f("futures_history_order_status_text_canceled") : StringExtKt.m14217f("futures_history_order_status_text_partially_filled") : StringExtKt.m14217f("futures_history_order_status_text_filled");
    }

    public final long getPositionId() {
        return this.positionId;
    }

    public final int getPositionType() {
        return this.positionType;
    }

    @NotNull
    public final String getPositionTypeExt() {
        int i = this.positionType;
        return i != 1 ? i != 2 ? "" : "Cross" : "Isolated";
    }

    public final double getPrice() {
        return this.price;
    }

    public final int getSide() {
        return this.side;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStopLossPrice() {
        return this.stopLossPrice;
    }

    @NotNull
    public final String getTakeProfitPrice() {
        return this.takeProfitPrice;
    }

    @NotNull
    public final String getTakerFee() {
        return this.takerFee;
    }

    public final int getTarget() {
        return this.target;
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
        return this.stopLossPrice.hashCode() + AbstractC0000a.m5b(AbstractC0455a.m2228c(this.status, AbstractC0000a.m5b(AbstractC0455a.m2228c(this.adlSort, AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2228c(this.positionType, AbstractC0455a.m2228c(this.leverage, AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2231f(this.userId, AbstractC0455a.m2228c(this.effectType, AbstractC0455a.m2228c(this.target, AbstractC0455a.m2228c(this.side, AbstractC0455a.m2228c(this.type, AbstractC0000a.m5b(AbstractC0455a.m2231f(this.positionId, Long.hashCode(this.orderId) * 31, 31), 31, this.market), 31), 31), 31), 31), 31), 31, this.createTime), 31, this.updateTime), 31, this.source), 31, this.price), 31, this.amount), 31, this.takerFee), 31, this.makerFee), 31, this.left), 31, this.avgPrice), 31, this.dealProfit), 31, this.dealStock), 31, this.dealFee), 31), 31), 31, this.feeAsset), 31, this.feeDiscount), 31, this.dealAssetFee), 31), 31, this.filled), 31), 31, this.takeProfitPrice);
    }

    public final boolean isCross() {
        return this.positionType == 2;
    }

    public final boolean isSell() {
        return this.side == 1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesOrder(orderId=");
        sb.append(this.orderId);
        sb.append(", positionId=");
        sb.append(this.positionId);
        sb.append(", market=");
        sb.append(this.market);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", side=");
        sb.append(this.side);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", effectType=");
        sb.append(this.effectType);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", takerFee=");
        sb.append(this.takerFee);
        sb.append(", makerFee=");
        sb.append(this.makerFee);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", avgPrice=");
        sb.append(this.avgPrice);
        sb.append(", dealProfit=");
        sb.append(this.dealProfit);
        sb.append(", dealStock=");
        sb.append(this.dealStock);
        sb.append(", dealFee=");
        sb.append(this.dealFee);
        sb.append(", leverage=");
        sb.append(this.leverage);
        sb.append(", positionType=");
        sb.append(this.positionType);
        sb.append(", feeAsset=");
        sb.append(this.feeAsset);
        sb.append(", feeDiscount=");
        sb.append(this.feeDiscount);
        sb.append(", dealAssetFee=");
        sb.append(this.dealAssetFee);
        sb.append(", adlSort=");
        sb.append(this.adlSort);
        sb.append(", filled=");
        sb.append(this.filled);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", takeProfitPrice=");
        sb.append(this.takeProfitPrice);
        sb.append(", stopLossPrice=");
        return AbstractC0455a.m2241p(sb, this.stopLossPrice, ')');
    }
}
