package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.exchange.allin.p024ui.theme.AppTheme;
import com.exchange.allin.utils.NumberFormaterKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B×\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010L\u001a\u00020MH\u0007¢\u0006\u0004\bN\u0010OJ\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\fHÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0010HÆ\u0003J\t\u0010[\u001a\u00020\u0010HÆ\u0003J\t\u0010\\\u001a\u00020\u0010HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0005HÆ\u0003J\t\u0010f\u001a\u00020\u0010HÆ\u0003J\t\u0010g\u001a\u00020\u0010HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fHÆ\u0003J\u008b\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fHÆ\u0001J\u0013\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020\fHÖ\u0001J\t\u0010n\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010%\"\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010%\"\u0004\b1\u0010)R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001e\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0016\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0016\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0016\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0011\u0010\u001c\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u001a\u0010\u001d\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00103\"\u0004\bE\u00105R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bI\u0010%R\u0011\u0010J\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bK\u0010#¨\u0006o"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesMarketState;", "", "market", "", "deal", "", "high", "last", "low", "open", "change", "period", "", "volume", "amount", "fundingTime", "", "nextFundingTime", "serverTime", "positionAmount", "fundingRateLast", "fundingRateNext", "fundingRatePredict", "insurance", "signPrice", "indexPrice", "sellTotal", "buyTotal", "time", "fundingRateCountDown", "prices", "", "<init>", "(Ljava/lang/String;DDDDDDIDDJJJLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DDDDJJLjava/util/List;)V", "getMarket", "()Ljava/lang/String;", "getDeal", "()D", "getHigh", "getLast", "setLast", "(D)V", "getLow", "getOpen", "getChange", "getPeriod", "()I", "getVolume", "getAmount", "setAmount", "getFundingTime", "()J", "setFundingTime", "(J)V", "getNextFundingTime", "setNextFundingTime", "getServerTime", "setServerTime", "getPositionAmount", "getFundingRateLast", "getFundingRateNext", "getFundingRatePredict", "getInsurance", "getSignPrice", "getIndexPrice", "getSellTotal", "getBuyTotal", "getTime", "getFundingRateCountDown", "setFundingRateCountDown", "getPrices", "()Ljava/util/List;", "turnover", "getTurnover", "changeExt", "getChangeExt", "getChangeColor", "Landroidx/compose/ui/graphics/Color;", "getChangeColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesMarketState {
    public static final int $stable = 8;
    private double amount;

    @SerializedName("buy_total")
    private final double buyTotal;
    private final double change;
    private final double deal;
    private long fundingRateCountDown;

    @SerializedName("funding_rate_last")
    @NotNull
    private final String fundingRateLast;

    @SerializedName("funding_rate_next")
    private final double fundingRateNext;

    @SerializedName("funding_rate_predict")
    @NotNull
    private final String fundingRatePredict;

    @SerializedName("funding_time")
    private long fundingTime;
    private final double high;

    @SerializedName("index_price")
    private final double indexPrice;

    @NotNull
    private final String insurance;
    private double last;
    private final double low;

    @NotNull
    private final String market;

    @SerializedName("next_funding_time")
    private long nextFundingTime;
    private final double open;
    private final int period;

    @SerializedName("position_amount")
    @NotNull
    private final String positionAmount;

    @Nullable
    private final List<Double> prices;

    @SerializedName("sell_total")
    private final double sellTotal;

    @SerializedName(MTCoreConstants.Login.KEY_SERVER_TIME)
    private long serverTime;

    @SerializedName("sign_price")
    private final double signPrice;
    private final long time;
    private final double volume;

    public FuturesMarketState(@NotNull String market, double d, double d2, double d3, double d4, double d5, double d6, int i, double d7, double d8, long j, long j2, long j3, @NotNull String positionAmount, @NotNull String fundingRateLast, double d9, @NotNull String fundingRatePredict, @NotNull String insurance, double d10, double d11, double d12, double d13, long j4, long j5, @Nullable List<Double> list) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(positionAmount, "positionAmount");
        Intrinsics.m18599g(fundingRateLast, "fundingRateLast");
        Intrinsics.m18599g(fundingRatePredict, "fundingRatePredict");
        Intrinsics.m18599g(insurance, "insurance");
        this.market = market;
        this.deal = d;
        this.high = d2;
        this.last = d3;
        this.low = d4;
        this.open = d5;
        this.change = d6;
        this.period = i;
        this.volume = d7;
        this.amount = d8;
        this.fundingTime = j;
        this.nextFundingTime = j2;
        this.serverTime = j3;
        this.positionAmount = positionAmount;
        this.fundingRateLast = fundingRateLast;
        this.fundingRateNext = d9;
        this.fundingRatePredict = fundingRatePredict;
        this.insurance = insurance;
        this.signPrice = d10;
        this.indexPrice = d11;
        this.sellTotal = d12;
        this.buyTotal = d13;
        this.time = j4;
        this.fundingRateCountDown = j5;
        this.prices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesMarketState copy$default(FuturesMarketState futuresMarketState, String str, double d, double d2, double d3, double d4, double d5, double d6, int i, double d7, double d8, long j, long j2, long j3, String str2, String str3, double d9, String str4, String str5, double d10, double d11, double d12, double d13, long j4, long j5, List list, int i2, Object obj) {
        List list2;
        long j6;
        String str6;
        double d14;
        String str7;
        double d15;
        double d16;
        double d17;
        double d18;
        long j7;
        String str8;
        String str9;
        double d19;
        int i3;
        double d20;
        double d21;
        long j8;
        long j9;
        long j10;
        String str10 = (i2 & 1) != 0 ? futuresMarketState.market : str;
        double d22 = (i2 & 2) != 0 ? futuresMarketState.deal : d;
        double d23 = (i2 & 4) != 0 ? futuresMarketState.high : d2;
        double d24 = (i2 & 8) != 0 ? futuresMarketState.last : d3;
        double d25 = (i2 & 16) != 0 ? futuresMarketState.low : d4;
        double d26 = (i2 & 32) != 0 ? futuresMarketState.open : d5;
        double d27 = (i2 & 64) != 0 ? futuresMarketState.change : d6;
        int i4 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? futuresMarketState.period : i;
        String str11 = str10;
        double d28 = d22;
        double d29 = (i2 & 256) != 0 ? futuresMarketState.volume : d7;
        double d30 = (i2 & 512) != 0 ? futuresMarketState.amount : d8;
        long j11 = (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? futuresMarketState.fundingTime : j;
        long j12 = (i2 & 2048) != 0 ? futuresMarketState.nextFundingTime : j2;
        long j13 = (i2 & 4096) != 0 ? futuresMarketState.serverTime : j3;
        String str12 = (i2 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? futuresMarketState.positionAmount : str2;
        long j14 = j13;
        String str13 = (i2 & 16384) != 0 ? futuresMarketState.fundingRateLast : str3;
        double d31 = (32768 & i2) != 0 ? futuresMarketState.fundingRateNext : d9;
        String str14 = (i2 & 65536) != 0 ? futuresMarketState.fundingRatePredict : str4;
        double d32 = d31;
        String str15 = (i2 & 131072) != 0 ? futuresMarketState.insurance : str5;
        double d33 = (i2 & 262144) != 0 ? futuresMarketState.signPrice : d10;
        double d34 = (i2 & 524288) != 0 ? futuresMarketState.indexPrice : d11;
        double d35 = (i2 & 1048576) != 0 ? futuresMarketState.sellTotal : d12;
        double d36 = (i2 & 2097152) != 0 ? futuresMarketState.buyTotal : d13;
        long j15 = (i2 & 4194304) != 0 ? futuresMarketState.time : j4;
        long j16 = (i2 & 8388608) != 0 ? futuresMarketState.fundingRateCountDown : j5;
        if ((i2 & 16777216) != 0) {
            j6 = j16;
            list2 = futuresMarketState.prices;
            d14 = d32;
            str7 = str15;
            d15 = d33;
            d16 = d34;
            d17 = d35;
            d18 = d36;
            j7 = j15;
            str8 = str14;
            str9 = str12;
            d19 = d27;
            i3 = i4;
            d20 = d29;
            d21 = d30;
            j8 = j11;
            j9 = j12;
            j10 = j14;
            str6 = str13;
        } else {
            list2 = list;
            j6 = j16;
            str6 = str13;
            d14 = d32;
            str7 = str15;
            d15 = d33;
            d16 = d34;
            d17 = d35;
            d18 = d36;
            j7 = j15;
            str8 = str14;
            str9 = str12;
            d19 = d27;
            i3 = i4;
            d20 = d29;
            d21 = d30;
            j8 = j11;
            j9 = j12;
            j10 = j14;
        }
        return futuresMarketState.copy(str11, d28, d23, d24, d25, d26, d19, i3, d20, d21, j8, j9, j10, str9, str6, d14, str8, str7, d15, d16, d17, d18, j7, j6, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getFundingTime() {
        return this.fundingTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getNextFundingTime() {
        return this.nextFundingTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getServerTime() {
        return this.serverTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPositionAmount() {
        return this.positionAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFundingRateLast() {
        return this.fundingRateLast;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final double getFundingRateNext() {
        return this.fundingRateNext;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getFundingRatePredict() {
        return this.fundingRatePredict;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getInsurance() {
        return this.insurance;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final double getSignPrice() {
        return this.signPrice;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getDeal() {
        return this.deal;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final double getIndexPrice() {
        return this.indexPrice;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final double getSellTotal() {
        return this.sellTotal;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final double getBuyTotal() {
        return this.buyTotal;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final long getFundingRateCountDown() {
        return this.fundingRateCountDown;
    }

    @Nullable
    public final List<Double> component25() {
        return this.prices;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getLast() {
        return this.last;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getOpen() {
        return this.open;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getChange() {
        return this.change;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getVolume() {
        return this.volume;
    }

    @NotNull
    public final FuturesMarketState copy(@NotNull String market, double deal, double high, double last, double low, double open, double change, int period, double volume, double amount, long fundingTime, long nextFundingTime, long serverTime, @NotNull String positionAmount, @NotNull String fundingRateLast, double fundingRateNext, @NotNull String fundingRatePredict, @NotNull String insurance, double signPrice, double indexPrice, double sellTotal, double buyTotal, long time, long fundingRateCountDown, @Nullable List<Double> prices) {
        Intrinsics.m18599g(market, "market");
        Intrinsics.m18599g(positionAmount, "positionAmount");
        Intrinsics.m18599g(fundingRateLast, "fundingRateLast");
        Intrinsics.m18599g(fundingRatePredict, "fundingRatePredict");
        Intrinsics.m18599g(insurance, "insurance");
        return new FuturesMarketState(market, deal, high, last, low, open, change, period, volume, amount, fundingTime, nextFundingTime, serverTime, positionAmount, fundingRateLast, fundingRateNext, fundingRatePredict, insurance, signPrice, indexPrice, sellTotal, buyTotal, time, fundingRateCountDown, prices);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesMarketState)) {
            return false;
        }
        FuturesMarketState futuresMarketState = (FuturesMarketState) other;
        return Intrinsics.m18594b(this.market, futuresMarketState.market) && Double.compare(this.deal, futuresMarketState.deal) == 0 && Double.compare(this.high, futuresMarketState.high) == 0 && Double.compare(this.last, futuresMarketState.last) == 0 && Double.compare(this.low, futuresMarketState.low) == 0 && Double.compare(this.open, futuresMarketState.open) == 0 && Double.compare(this.change, futuresMarketState.change) == 0 && this.period == futuresMarketState.period && Double.compare(this.volume, futuresMarketState.volume) == 0 && Double.compare(this.amount, futuresMarketState.amount) == 0 && this.fundingTime == futuresMarketState.fundingTime && this.nextFundingTime == futuresMarketState.nextFundingTime && this.serverTime == futuresMarketState.serverTime && Intrinsics.m18594b(this.positionAmount, futuresMarketState.positionAmount) && Intrinsics.m18594b(this.fundingRateLast, futuresMarketState.fundingRateLast) && Double.compare(this.fundingRateNext, futuresMarketState.fundingRateNext) == 0 && Intrinsics.m18594b(this.fundingRatePredict, futuresMarketState.fundingRatePredict) && Intrinsics.m18594b(this.insurance, futuresMarketState.insurance) && Double.compare(this.signPrice, futuresMarketState.signPrice) == 0 && Double.compare(this.indexPrice, futuresMarketState.indexPrice) == 0 && Double.compare(this.sellTotal, futuresMarketState.sellTotal) == 0 && Double.compare(this.buyTotal, futuresMarketState.buyTotal) == 0 && this.time == futuresMarketState.time && this.fundingRateCountDown == futuresMarketState.fundingRateCountDown && Intrinsics.m18594b(this.prices, futuresMarketState.prices);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getBuyTotal() {
        return this.buyTotal;
    }

    public final double getChange() {
        return this.change;
    }

    @Composable
    /* JADX INFO: renamed from: getChangeColor-WaAFU9c, reason: not valid java name */
    public final long m21934getChangeColorWaAFU9c(@Nullable Composer composer, int i) {
        long jM13712q;
        composer.mo4221N(-1962667173);
        double d = this.change;
        if (d > 0.0d) {
            composer.mo4221N(1540527954);
            jM13712q = AppTheme.m14099a(composer).m14092r();
            composer.mo4213F();
        } else {
            jM13712q = d < 0.0d ? AbstractC2929c.m13712q(composer, 1540529584, composer) : AbstractC2929c.m13696a(composer, 1540530893, composer);
        }
        composer.mo4213F();
        return jM13712q;
    }

    @NotNull
    public final String getChangeExt() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.change >= 0.0d ? Marker.ANY_NON_NULL_MARKER : "");
        return AbstractC0455a.m2241p(sb, NumberFormaterKt.m14182a(this.change * ((double) 100), 2, 2, false, 0.0d, 60), '%');
    }

    public final double getDeal() {
        return this.deal;
    }

    public final long getFundingRateCountDown() {
        return this.fundingRateCountDown;
    }

    @NotNull
    public final String getFundingRateLast() {
        return this.fundingRateLast;
    }

    public final double getFundingRateNext() {
        return this.fundingRateNext;
    }

    @NotNull
    public final String getFundingRatePredict() {
        return this.fundingRatePredict;
    }

    public final long getFundingTime() {
        return this.fundingTime;
    }

    public final double getHigh() {
        return this.high;
    }

    public final double getIndexPrice() {
        return this.indexPrice;
    }

    @NotNull
    public final String getInsurance() {
        return this.insurance;
    }

    public final double getLast() {
        return this.last;
    }

    public final double getLow() {
        return this.low;
    }

    @NotNull
    public final String getMarket() {
        return this.market;
    }

    public final long getNextFundingTime() {
        return this.nextFundingTime;
    }

    public final double getOpen() {
        return this.open;
    }

    public final int getPeriod() {
        return this.period;
    }

    @NotNull
    public final String getPositionAmount() {
        return this.positionAmount;
    }

    @Nullable
    public final List<Double> getPrices() {
        return this.prices;
    }

    public final double getSellTotal() {
        return this.sellTotal;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public final double getSignPrice() {
        return this.signPrice;
    }

    public final long getTime() {
        return this.time;
    }

    public final double getTurnover() {
        return this.last * this.volume;
    }

    public final double getVolume() {
        return this.volume;
    }

    public int hashCode() {
        int iM2231f = AbstractC0455a.m2231f(this.fundingRateCountDown, AbstractC0455a.m2231f(this.time, AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2231f(this.serverTime, AbstractC0455a.m2231f(this.nextFundingTime, AbstractC0455a.m2231f(this.fundingTime, AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2228c(this.period, AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(this.market.hashCode() * 31, 31, this.deal), 31, this.high), 31, this.last), 31, this.low), 31, this.open), 31, this.change), 31), 31, this.volume), 31, this.amount), 31), 31), 31), 31, this.positionAmount), 31, this.fundingRateLast), 31, this.fundingRateNext), 31, this.fundingRatePredict), 31, this.insurance), 31, this.signPrice), 31, this.indexPrice), 31, this.sellTotal), 31, this.buyTotal), 31), 31);
        List<Double> list = this.prices;
        return iM2231f + (list == null ? 0 : list.hashCode());
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setFundingRateCountDown(long j) {
        this.fundingRateCountDown = j;
    }

    public final void setFundingTime(long j) {
        this.fundingTime = j;
    }

    public final void setLast(double d) {
        this.last = d;
    }

    public final void setNextFundingTime(long j) {
        this.nextFundingTime = j;
    }

    public final void setServerTime(long j) {
        this.serverTime = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesMarketState(market=");
        sb.append(this.market);
        sb.append(", deal=");
        sb.append(this.deal);
        sb.append(", high=");
        sb.append(this.high);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", low=");
        sb.append(this.low);
        sb.append(", open=");
        sb.append(this.open);
        sb.append(", change=");
        sb.append(this.change);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", volume=");
        sb.append(this.volume);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", fundingTime=");
        sb.append(this.fundingTime);
        sb.append(", nextFundingTime=");
        sb.append(this.nextFundingTime);
        sb.append(", serverTime=");
        sb.append(this.serverTime);
        sb.append(", positionAmount=");
        sb.append(this.positionAmount);
        sb.append(", fundingRateLast=");
        sb.append(this.fundingRateLast);
        sb.append(", fundingRateNext=");
        sb.append(this.fundingRateNext);
        sb.append(", fundingRatePredict=");
        sb.append(this.fundingRatePredict);
        sb.append(", insurance=");
        sb.append(this.insurance);
        sb.append(", signPrice=");
        sb.append(this.signPrice);
        sb.append(", indexPrice=");
        sb.append(this.indexPrice);
        sb.append(", sellTotal=");
        sb.append(this.sellTotal);
        sb.append(", buyTotal=");
        sb.append(this.buyTotal);
        sb.append(", time=");
        sb.append(this.time);
        sb.append(", fundingRateCountDown=");
        sb.append(this.fundingRateCountDown);
        sb.append(", prices=");
        return AbstractC0455a.m2242q(sb, this.prices, ')');
    }
}
