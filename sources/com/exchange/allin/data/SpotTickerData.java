package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.exchange.allin.p024ui.theme.AppTheme;
import com.exchange.allin.utils.NumberFormaterKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b(\u0010)J\u000f\u0010U\u001a\u00020VH\u0007¢\u0006\u0004\bW\u0010XJ\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\nHÆ\u0003J\t\u0010_\u001a\u00020\fHÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\nHÆ\u0003J\t\u0010b\u001a\u00020\nHÆ\u0003J\t\u0010c\u001a\u00020\nHÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\bHÆ\u0003J\t\u0010g\u001a\u00020\bHÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\t\u0010l\u001a\u00020\fHÆ\u0003J\t\u0010m\u001a\u00020\bHÆ\u0003J\t\u0010n\u001a\u00020\nHÆ\u0003J\t\u0010o\u001a\u00020\fHÆ\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eHÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\"HÆ\u0003J\t\u0010s\u001a\u00020\"HÆ\u0003J\t\u0010t\u001a\u00020\nHÆ\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020'0&HÆ\u0003J·\u0002\u0010v\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\f2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\n2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&HÆ\u0001J\u0013\u0010w\u001a\u00020\"2\b\u0010x\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010y\u001a\u00020\nHÖ\u0001J\t\u0010z\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u00105R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u00105R\u0016\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u00105R\u001e\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00103\"\u0004\b;\u0010<R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010+\"\u0004\b>\u0010-R\u0016\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0016\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010+\"\u0004\bB\u0010-R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010+R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u0016\u0010\u0019\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0016\u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00105R\u0016\u0010\u001c\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00107R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010+\"\u0004\bM\u0010-R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b!\u0010NR\u0011\u0010#\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010NR\u0016\u0010$\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u00105R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\bO\u0010KR\u0011\u0010P\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bQ\u00103R\u0011\u0010R\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bR\u0010NR\u0011\u0010S\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bT\u00103¨\u0006{"}, m18302d2 = {"Lcom/exchange/allin/data/SpotTickerData;", "", "amount", "", "buyMin", "change", "entrustSide", "frm", "", "frmFixed", "", "frmId", "", "high", "isEntrust", "isFeature", "isReturn", "lPrice", "low", "minOrderAmount", "onlineNoticeUrl", FirebaseAnalytics.Param.PRICE, "publishAt", "sellMin", "symbol", "tickerId", "to", "toFixed", "toId", "depth", "", "Lcom/exchange/allin/data/SpotDepthMerge;", "volume", "isHot", "", "isNew", "isMeMe", "kline", "", "Lcom/exchange/allin/data/SpotKline;", "<init>", "(DDDDLjava/lang/String;IJDIIILjava/lang/String;DLjava/lang/String;Ljava/lang/String;DDDLjava/lang/String;JLjava/lang/String;IJLjava/util/List;DZZILjava/util/List;)V", "getAmount", "()D", "setAmount", "(D)V", "getBuyMin", "getChange", "setChange", "getEntrustSide", "getFrm", "()Ljava/lang/String;", "getFrmFixed", "()I", "getFrmId", "()J", "getHigh", "setHigh", "getLPrice", "setLPrice", "(Ljava/lang/String;)V", "getLow", "setLow", "getMinOrderAmount", "getOnlineNoticeUrl", "getPrice", "setPrice", "getPublishAt", "getSellMin", "getSymbol", "getTickerId", "getTo", "getToFixed", "getToId", "getDepth", "()Ljava/util/List;", "getVolume", "setVolume", "()Z", "getKline", "market", "getMarket", "isMemeExt", "changeExt", "getChangeExt", "getChangeColor", "Landroidx/compose/ui/graphics/Color;", "getChangeColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "copy", "equals", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class SpotTickerData {
    public static final int $stable = 8;
    private double amount;

    @SerializedName("buy_min")
    private final double buyMin;
    private double change;

    @NotNull
    private final List<SpotDepthMerge> depth;

    @SerializedName("entrust_side")
    private final double entrustSide;

    @NotNull
    private final String frm;

    @SerializedName("frm_fixed")
    private final int frmFixed;

    @SerializedName("frm_id")
    private final long frmId;
    private double high;

    @SerializedName("is_entrust")
    private final int isEntrust;

    @SerializedName("is_feature")
    private final int isFeature;
    private final boolean isHot;

    @SerializedName("is_meme")
    private final int isMeMe;
    private final boolean isNew;

    @SerializedName("is_return")
    private final int isReturn;

    @NotNull
    private final List<SpotKline> kline;

    @SerializedName("l_price")
    @NotNull
    private String lPrice;
    private double low;

    @SerializedName("min_order_amount")
    @NotNull
    private final String minOrderAmount;

    @SerializedName("online_notice_url")
    @NotNull
    private final String onlineNoticeUrl;
    private double price;

    @SerializedName("publish_at")
    private final double publishAt;

    @SerializedName("sell_min")
    private final double sellMin;

    @NotNull
    private final String symbol;

    @SerializedName("ticker_id")
    private final long tickerId;

    @NotNull
    private final String to;

    @SerializedName("to_fixed")
    private final int toFixed;

    @SerializedName("to_id")
    private final long toId;
    private double volume;

    public SpotTickerData(double d, double d2, double d3, double d4, @NotNull String frm, int i, long j, double d5, int i2, int i3, int i4, @NotNull String lPrice, double d6, @NotNull String minOrderAmount, @NotNull String onlineNoticeUrl, double d7, double d8, double d9, @NotNull String symbol, long j2, @NotNull String to, int i5, long j3, @NotNull List<SpotDepthMerge> depth, double d10, boolean z2, boolean z3, int i6, @NotNull List<SpotKline> kline) {
        Intrinsics.m18599g(frm, "frm");
        Intrinsics.m18599g(lPrice, "lPrice");
        Intrinsics.m18599g(minOrderAmount, "minOrderAmount");
        Intrinsics.m18599g(onlineNoticeUrl, "onlineNoticeUrl");
        Intrinsics.m18599g(symbol, "symbol");
        Intrinsics.m18599g(to, "to");
        Intrinsics.m18599g(depth, "depth");
        Intrinsics.m18599g(kline, "kline");
        this.amount = d;
        this.buyMin = d2;
        this.change = d3;
        this.entrustSide = d4;
        this.frm = frm;
        this.frmFixed = i;
        this.frmId = j;
        this.high = d5;
        this.isEntrust = i2;
        this.isFeature = i3;
        this.isReturn = i4;
        this.lPrice = lPrice;
        this.low = d6;
        this.minOrderAmount = minOrderAmount;
        this.onlineNoticeUrl = onlineNoticeUrl;
        this.price = d7;
        this.publishAt = d8;
        this.sellMin = d9;
        this.symbol = symbol;
        this.tickerId = j2;
        this.to = to;
        this.toFixed = i5;
        this.toId = j3;
        this.depth = depth;
        this.volume = d10;
        this.isHot = z2;
        this.isNew = z3;
        this.isMeMe = i6;
        this.kline = kline;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotTickerData copy$default(SpotTickerData spotTickerData, double d, double d2, double d3, double d4, String str, int i, long j, double d5, int i2, int i3, int i4, String str2, double d6, String str3, String str4, double d7, double d8, double d9, String str5, long j2, String str6, int i5, long j3, List list, double d10, boolean z2, boolean z3, int i6, List list2, int i7, Object obj) {
        List list3;
        int i8;
        double d11 = (i7 & 1) != 0 ? spotTickerData.amount : d;
        double d12 = (i7 & 2) != 0 ? spotTickerData.buyMin : d2;
        double d13 = (i7 & 4) != 0 ? spotTickerData.change : d3;
        double d14 = (i7 & 8) != 0 ? spotTickerData.entrustSide : d4;
        String str7 = (i7 & 16) != 0 ? spotTickerData.frm : str;
        int i9 = (i7 & 32) != 0 ? spotTickerData.frmFixed : i;
        long j4 = (i7 & 64) != 0 ? spotTickerData.frmId : j;
        double d15 = (i7 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? spotTickerData.high : d5;
        double d16 = d11;
        int i10 = (i7 & 256) != 0 ? spotTickerData.isEntrust : i2;
        int i11 = (i7 & 512) != 0 ? spotTickerData.isFeature : i3;
        int i12 = i10;
        int i13 = (i7 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? spotTickerData.isReturn : i4;
        String str8 = (i7 & 2048) != 0 ? spotTickerData.lPrice : str2;
        int i14 = i11;
        double d17 = (i7 & 4096) != 0 ? spotTickerData.low : d6;
        String str9 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? spotTickerData.minOrderAmount : str3;
        String str10 = (i7 & 16384) != 0 ? spotTickerData.onlineNoticeUrl : str4;
        String str11 = str9;
        double d18 = (i7 & 32768) != 0 ? spotTickerData.price : d7;
        double d19 = (i7 & 65536) != 0 ? spotTickerData.publishAt : d8;
        double d20 = (i7 & 131072) != 0 ? spotTickerData.sellMin : d9;
        String str12 = (i7 & 262144) != 0 ? spotTickerData.symbol : str5;
        long j5 = (i7 & 524288) != 0 ? spotTickerData.tickerId : j2;
        String str13 = (i7 & 1048576) != 0 ? spotTickerData.to : str6;
        int i15 = (i7 & 2097152) != 0 ? spotTickerData.toFixed : i5;
        long j6 = (i7 & 4194304) != 0 ? spotTickerData.toId : j3;
        List list4 = (i7 & 8388608) != 0 ? spotTickerData.depth : list;
        double d21 = (i7 & 16777216) != 0 ? spotTickerData.volume : d10;
        boolean z4 = (i7 & 33554432) != 0 ? spotTickerData.isHot : z2;
        boolean z5 = (i7 & 67108864) != 0 ? spotTickerData.isNew : z3;
        boolean z6 = z4;
        int i16 = (i7 & 134217728) != 0 ? spotTickerData.isMeMe : i6;
        if ((i7 & 268435456) != 0) {
            i8 = i16;
            list3 = spotTickerData.kline;
        } else {
            list3 = list2;
            i8 = i16;
        }
        return spotTickerData.copy(d16, d12, d13, d14, str7, i9, j4, d15, i12, i14, i13, str8, d17, str11, str10, d18, d19, d20, str12, j5, str13, i15, j6, list4, d21, z6, z5, i8, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getIsFeature() {
        return this.isFeature;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getIsReturn() {
        return this.isReturn;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLPrice() {
        return this.lPrice;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getLow() {
        return this.low;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMinOrderAmount() {
        return this.minOrderAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOnlineNoticeUrl() {
        return this.onlineNoticeUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final double getPublishAt() {
        return this.publishAt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final double getSellMin() {
        return this.sellMin;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getBuyMin() {
        return this.buyMin;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final long getTickerId() {
        return this.tickerId;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getToFixed() {
        return this.toFixed;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final long getToId() {
        return this.toId;
    }

    @NotNull
    public final List<SpotDepthMerge> component24() {
        return this.depth;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final double getVolume() {
        return this.volume;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsHot() {
        return this.isHot;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getIsMeMe() {
        return this.isMeMe;
    }

    @NotNull
    public final List<SpotKline> component29() {
        return this.kline;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getChange() {
        return this.change;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getEntrustSide() {
        return this.entrustSide;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFrm() {
        return this.frm;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFrmFixed() {
        return this.frmFixed;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getFrmId() {
        return this.frmId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getIsEntrust() {
        return this.isEntrust;
    }

    @NotNull
    public final SpotTickerData copy(double amount, double buyMin, double change, double entrustSide, @NotNull String frm, int frmFixed, long frmId, double high, int isEntrust, int isFeature, int isReturn, @NotNull String lPrice, double low, @NotNull String minOrderAmount, @NotNull String onlineNoticeUrl, double price, double publishAt, double sellMin, @NotNull String symbol, long tickerId, @NotNull String to, int toFixed, long toId, @NotNull List<SpotDepthMerge> depth, double volume, boolean isHot, boolean isNew, int isMeMe, @NotNull List<SpotKline> kline) {
        Intrinsics.m18599g(frm, "frm");
        Intrinsics.m18599g(lPrice, "lPrice");
        Intrinsics.m18599g(minOrderAmount, "minOrderAmount");
        Intrinsics.m18599g(onlineNoticeUrl, "onlineNoticeUrl");
        Intrinsics.m18599g(symbol, "symbol");
        Intrinsics.m18599g(to, "to");
        Intrinsics.m18599g(depth, "depth");
        Intrinsics.m18599g(kline, "kline");
        return new SpotTickerData(amount, buyMin, change, entrustSide, frm, frmFixed, frmId, high, isEntrust, isFeature, isReturn, lPrice, low, minOrderAmount, onlineNoticeUrl, price, publishAt, sellMin, symbol, tickerId, to, toFixed, toId, depth, volume, isHot, isNew, isMeMe, kline);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotTickerData)) {
            return false;
        }
        SpotTickerData spotTickerData = (SpotTickerData) other;
        return Double.compare(this.amount, spotTickerData.amount) == 0 && Double.compare(this.buyMin, spotTickerData.buyMin) == 0 && Double.compare(this.change, spotTickerData.change) == 0 && Double.compare(this.entrustSide, spotTickerData.entrustSide) == 0 && Intrinsics.m18594b(this.frm, spotTickerData.frm) && this.frmFixed == spotTickerData.frmFixed && this.frmId == spotTickerData.frmId && Double.compare(this.high, spotTickerData.high) == 0 && this.isEntrust == spotTickerData.isEntrust && this.isFeature == spotTickerData.isFeature && this.isReturn == spotTickerData.isReturn && Intrinsics.m18594b(this.lPrice, spotTickerData.lPrice) && Double.compare(this.low, spotTickerData.low) == 0 && Intrinsics.m18594b(this.minOrderAmount, spotTickerData.minOrderAmount) && Intrinsics.m18594b(this.onlineNoticeUrl, spotTickerData.onlineNoticeUrl) && Double.compare(this.price, spotTickerData.price) == 0 && Double.compare(this.publishAt, spotTickerData.publishAt) == 0 && Double.compare(this.sellMin, spotTickerData.sellMin) == 0 && Intrinsics.m18594b(this.symbol, spotTickerData.symbol) && this.tickerId == spotTickerData.tickerId && Intrinsics.m18594b(this.to, spotTickerData.to) && this.toFixed == spotTickerData.toFixed && this.toId == spotTickerData.toId && Intrinsics.m18594b(this.depth, spotTickerData.depth) && Double.compare(this.volume, spotTickerData.volume) == 0 && this.isHot == spotTickerData.isHot && this.isNew == spotTickerData.isNew && this.isMeMe == spotTickerData.isMeMe && Intrinsics.m18594b(this.kline, spotTickerData.kline);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getBuyMin() {
        return this.buyMin;
    }

    public final double getChange() {
        return this.change;
    }

    @Composable
    /* JADX INFO: renamed from: getChangeColor-WaAFU9c, reason: not valid java name */
    public final long m21935getChangeColorWaAFU9c(@Nullable Composer composer, int i) {
        long jM13712q;
        composer.mo4221N(-1340025680);
        double d = this.change;
        if (d > 0.0d) {
            composer.mo4221N(-1575115487);
            jM13712q = AppTheme.m14099a(composer).m14092r();
            composer.mo4213F();
        } else {
            jM13712q = d < 0.0d ? AbstractC2929c.m13712q(composer, -1575113857, composer) : AbstractC2929c.m13696a(composer, -1575112548, composer);
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

    @NotNull
    public final List<SpotDepthMerge> getDepth() {
        return this.depth;
    }

    public final double getEntrustSide() {
        return this.entrustSide;
    }

    @NotNull
    public final String getFrm() {
        return this.frm;
    }

    public final int getFrmFixed() {
        return this.frmFixed;
    }

    public final long getFrmId() {
        return this.frmId;
    }

    public final double getHigh() {
        return this.high;
    }

    @NotNull
    public final List<SpotKline> getKline() {
        return this.kline;
    }

    @NotNull
    public final String getLPrice() {
        return this.lPrice;
    }

    public final double getLow() {
        return this.low;
    }

    @NotNull
    public final String getMarket() {
        return StringsKt.m20411I(this.symbol, "-", RemoteSettings.FORWARD_SLASH_STRING);
    }

    @NotNull
    public final String getMinOrderAmount() {
        return this.minOrderAmount;
    }

    @NotNull
    public final String getOnlineNoticeUrl() {
        return this.onlineNoticeUrl;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getPublishAt() {
        return this.publishAt;
    }

    public final double getSellMin() {
        return this.sellMin;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final long getTickerId() {
        return this.tickerId;
    }

    @NotNull
    public final String getTo() {
        return this.to;
    }

    public final int getToFixed() {
        return this.toFixed;
    }

    public final long getToId() {
        return this.toId;
    }

    public final double getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return this.kline.hashCode() + AbstractC0455a.m2228c(this.isMeMe, AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2227b(AbstractC0455a.m2233h(this.depth, AbstractC0455a.m2231f(this.toId, AbstractC0455a.m2228c(this.toFixed, AbstractC0000a.m5b(AbstractC0455a.m2231f(this.tickerId, AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0455a.m2228c(this.isReturn, AbstractC0455a.m2228c(this.isFeature, AbstractC0455a.m2228c(this.isEntrust, AbstractC0455a.m2227b(AbstractC0455a.m2231f(this.frmId, AbstractC0455a.m2228c(this.frmFixed, AbstractC0000a.m5b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(Double.hashCode(this.amount) * 31, 31, this.buyMin), 31, this.change), 31, this.entrustSide), 31, this.frm), 31), 31), 31, this.high), 31), 31), 31), 31, this.lPrice), 31, this.low), 31, this.minOrderAmount), 31, this.onlineNoticeUrl), 31, this.price), 31, this.publishAt), 31, this.sellMin), 31, this.symbol), 31), 31, this.to), 31), 31), 31), 31, this.volume), 31, this.isHot), 31, this.isNew), 31);
    }

    public final int isEntrust() {
        return this.isEntrust;
    }

    public final int isFeature() {
        return this.isFeature;
    }

    public final boolean isHot() {
        return this.isHot;
    }

    public final int isMeMe() {
        return this.isMeMe;
    }

    public final boolean isMemeExt() {
        return this.isMeMe == 1;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final int isReturn() {
        return this.isReturn;
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setChange(double d) {
        this.change = d;
    }

    public final void setHigh(double d) {
        this.high = d;
    }

    public final void setLPrice(@NotNull String str) {
        Intrinsics.m18599g(str, "<set-?>");
        this.lPrice = str;
    }

    public final void setLow(double d) {
        this.low = d;
    }

    public final void setPrice(double d) {
        this.price = d;
    }

    public final void setVolume(double d) {
        this.volume = d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotTickerData(amount=");
        sb.append(this.amount);
        sb.append(", buyMin=");
        sb.append(this.buyMin);
        sb.append(", change=");
        sb.append(this.change);
        sb.append(", entrustSide=");
        sb.append(this.entrustSide);
        sb.append(", frm=");
        sb.append(this.frm);
        sb.append(", frmFixed=");
        sb.append(this.frmFixed);
        sb.append(", frmId=");
        sb.append(this.frmId);
        sb.append(", high=");
        sb.append(this.high);
        sb.append(", isEntrust=");
        sb.append(this.isEntrust);
        sb.append(", isFeature=");
        sb.append(this.isFeature);
        sb.append(", isReturn=");
        sb.append(this.isReturn);
        sb.append(", lPrice=");
        sb.append(this.lPrice);
        sb.append(", low=");
        sb.append(this.low);
        sb.append(", minOrderAmount=");
        sb.append(this.minOrderAmount);
        sb.append(", onlineNoticeUrl=");
        sb.append(this.onlineNoticeUrl);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", publishAt=");
        sb.append(this.publishAt);
        sb.append(", sellMin=");
        sb.append(this.sellMin);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", tickerId=");
        sb.append(this.tickerId);
        sb.append(", to=");
        sb.append(this.to);
        sb.append(", toFixed=");
        sb.append(this.toFixed);
        sb.append(", toId=");
        sb.append(this.toId);
        sb.append(", depth=");
        sb.append(this.depth);
        sb.append(", volume=");
        sb.append(this.volume);
        sb.append(", isHot=");
        sb.append(this.isHot);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", isMeMe=");
        sb.append(this.isMeMe);
        sb.append(", kline=");
        return AbstractC0455a.m2242q(sb, this.kline, ')');
    }
}
