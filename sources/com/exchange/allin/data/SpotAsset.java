package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.p024ui.helper.AssetsHelper;
import com.exchange.allin.p024ui.helper.AssetsHelperKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003Jw\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\u0006\u00109\u001a\u00020:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020:HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020:R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010'\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006F"}, m18302d2 = {"Lcom/exchange/allin/data/SpotAsset;", "Landroid/os/Parcelable;", "coinId", "", "coinName", "", "symbol", "coinIcon", "total", "", "totalUsdt", "available", "availableUsdt", "freeze", "freezeUsdt", FirebaseAnalytics.Param.PRICE, "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDDD)V", "getCoinId", "()J", "getCoinName", "()Ljava/lang/String;", "getSymbol", "getCoinIcon", "getTotal", "()D", "setTotal", "(D)V", "getTotalUsdt", "setTotalUsdt", "getAvailable", "setAvailable", "getAvailableUsdt", "setAvailableUsdt", "getFreeze", "setFreeze", "getFreezeUsdt", "setFreezeUsdt", "getPrice", "coinWholeName", "getCoinWholeName", "assetInfo", "Lcom/exchange/allin/data/AssetInfo;", "getAssetInfo", "()Lcom/exchange/allin/data/AssetInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class SpotAsset implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<SpotAsset> CREATOR = new Creator();
    private double available;

    @SerializedName("available_usdt")
    private double availableUsdt;

    @SerializedName("coin_icon")
    @NotNull
    private final String coinIcon;

    @SerializedName("coin_id")
    private final long coinId;

    @SerializedName("coin_name")
    @NotNull
    private final String coinName;
    private double freeze;

    @SerializedName("freeze_usdt")
    private double freezeUsdt;
    private final double price;

    @NotNull
    private final String symbol;

    @SerializedName("total")
    private double total;

    @SerializedName("total_usdt")
    private double totalUsdt;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<SpotAsset> {
        @Override // android.os.Parcelable.Creator
        public final SpotAsset createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new SpotAsset(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final SpotAsset[] newArray(int i) {
            return new SpotAsset[i];
        }
    }

    public SpotAsset(long j, @NotNull String coinName, @NotNull String symbol, @NotNull String coinIcon, double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        Intrinsics.m18599g(coinName, "coinName");
        Intrinsics.m18599g(symbol, "symbol");
        Intrinsics.m18599g(coinIcon, "coinIcon");
        this.coinId = j;
        this.coinName = coinName;
        this.symbol = symbol;
        this.coinIcon = coinIcon;
        this.total = d;
        this.totalUsdt = d2;
        this.available = d3;
        this.availableUsdt = d4;
        this.freeze = d5;
        this.freezeUsdt = d6;
        this.price = d7;
    }

    public static /* synthetic */ SpotAsset copy$default(SpotAsset spotAsset, long j, String str, String str2, String str3, double d, double d2, double d3, double d4, double d5, double d6, double d7, int i, Object obj) {
        long j2;
        double d8;
        double d9;
        double d10;
        long j3 = (i & 1) != 0 ? spotAsset.coinId : j;
        String str4 = (i & 2) != 0 ? spotAsset.coinName : str;
        String str5 = (i & 4) != 0 ? spotAsset.symbol : str2;
        String str6 = (i & 8) != 0 ? spotAsset.coinIcon : str3;
        double d11 = (i & 16) != 0 ? spotAsset.total : d;
        double d12 = (i & 32) != 0 ? spotAsset.totalUsdt : d2;
        double d13 = (i & 64) != 0 ? spotAsset.available : d3;
        double d14 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? spotAsset.availableUsdt : d4;
        if ((i & 256) != 0) {
            j2 = j3;
            d8 = spotAsset.freeze;
        } else {
            j2 = j3;
            d8 = d5;
        }
        double d15 = d8;
        double d16 = (i & 512) != 0 ? spotAsset.freezeUsdt : d6;
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            d10 = d16;
            d9 = spotAsset.price;
        } else {
            d9 = d7;
            d10 = d16;
        }
        return spotAsset.copy(j2, str4, str5, str6, d11, d12, d13, d14, d15, d10, d9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getFreezeUsdt() {
        return this.freezeUsdt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCoinName() {
        return this.coinName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCoinIcon() {
        return this.coinIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getTotalUsdt() {
        return this.totalUsdt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getAvailableUsdt() {
        return this.availableUsdt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getFreeze() {
        return this.freeze;
    }

    @NotNull
    public final SpotAsset copy(long coinId, @NotNull String coinName, @NotNull String symbol, @NotNull String coinIcon, double total, double totalUsdt, double available, double availableUsdt, double freeze, double freezeUsdt, double price) {
        Intrinsics.m18599g(coinName, "coinName");
        Intrinsics.m18599g(symbol, "symbol");
        Intrinsics.m18599g(coinIcon, "coinIcon");
        return new SpotAsset(coinId, coinName, symbol, coinIcon, total, totalUsdt, available, availableUsdt, freeze, freezeUsdt, price);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotAsset)) {
            return false;
        }
        SpotAsset spotAsset = (SpotAsset) other;
        return this.coinId == spotAsset.coinId && Intrinsics.m18594b(this.coinName, spotAsset.coinName) && Intrinsics.m18594b(this.symbol, spotAsset.symbol) && Intrinsics.m18594b(this.coinIcon, spotAsset.coinIcon) && Double.compare(this.total, spotAsset.total) == 0 && Double.compare(this.totalUsdt, spotAsset.totalUsdt) == 0 && Double.compare(this.available, spotAsset.available) == 0 && Double.compare(this.availableUsdt, spotAsset.availableUsdt) == 0 && Double.compare(this.freeze, spotAsset.freeze) == 0 && Double.compare(this.freezeUsdt, spotAsset.freezeUsdt) == 0 && Double.compare(this.price, spotAsset.price) == 0;
    }

    @NotNull
    public final AssetInfo getAssetInfo() {
        return new AssetInfo("SPOT", AssetsHelperKt.m13611a(this.coinName), this.coinName, getCoinWholeName(), this.available, this.freeze, this.availableUsdt, this.freezeUsdt, this.total, this.totalUsdt);
    }

    public final double getAvailable() {
        return this.available;
    }

    public final double getAvailableUsdt() {
        return this.availableUsdt;
    }

    @NotNull
    public final String getCoinIcon() {
        return this.coinIcon;
    }

    public final long getCoinId() {
        return this.coinId;
    }

    @NotNull
    public final String getCoinName() {
        return this.coinName;
    }

    @NotNull
    public final String getCoinWholeName() {
        Object next;
        String tokenWholeName;
        String str = this.coinName;
        Intrinsics.m18599g(str, "<this>");
        Iterator<E> it = ((AssetsHelper.ViewState) AssetsHelper.f36831c.getValue()).f36848b.m4827f().f17060c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.m20434j(((AssetInfo) next).getTokenName(), str, true)) {
                break;
            }
        }
        AssetInfo assetInfo = (AssetInfo) next;
        return (assetInfo == null || (tokenWholeName = assetInfo.getTokenWholeName()) == null) ? this.coinName : tokenWholeName;
    }

    public final double getFreeze() {
        return this.freeze;
    }

    public final double getFreezeUsdt() {
        return this.freezeUsdt;
    }

    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final double getTotal() {
        return this.total;
    }

    public final double getTotalUsdt() {
        return this.totalUsdt;
    }

    public int hashCode() {
        return Double.hashCode(this.price) + AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(Long.hashCode(this.coinId) * 31, 31, this.coinName), 31, this.symbol), 31, this.coinIcon), 31, this.total), 31, this.totalUsdt), 31, this.available), 31, this.availableUsdt), 31, this.freeze), 31, this.freezeUsdt);
    }

    public final void setAvailable(double d) {
        this.available = d;
    }

    public final void setAvailableUsdt(double d) {
        this.availableUsdt = d;
    }

    public final void setFreeze(double d) {
        this.freeze = d;
    }

    public final void setFreezeUsdt(double d) {
        this.freezeUsdt = d;
    }

    public final void setTotal(double d) {
        this.total = d;
    }

    public final void setTotalUsdt(double d) {
        this.totalUsdt = d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotAsset(coinId=");
        sb.append(this.coinId);
        sb.append(", coinName=");
        sb.append(this.coinName);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", coinIcon=");
        sb.append(this.coinIcon);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", totalUsdt=");
        sb.append(this.totalUsdt);
        sb.append(", available=");
        sb.append(this.available);
        sb.append(", availableUsdt=");
        sb.append(this.availableUsdt);
        sb.append(", freeze=");
        sb.append(this.freeze);
        sb.append(", freezeUsdt=");
        sb.append(this.freezeUsdt);
        sb.append(", price=");
        return AbstractC0455a.m2239n(sb, this.price, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeLong(this.coinId);
        dest.writeString(this.coinName);
        dest.writeString(this.symbol);
        dest.writeString(this.coinIcon);
        dest.writeDouble(this.total);
        dest.writeDouble(this.totalUsdt);
        dest.writeDouble(this.available);
        dest.writeDouble(this.availableUsdt);
        dest.writeDouble(this.freeze);
        dest.writeDouble(this.freezeUsdt);
        dest.writeDouble(this.price);
    }
}
