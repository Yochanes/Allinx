package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u00064"}, m18302d2 = {"Lcom/exchange/allin/data/AssetInfo;", "Landroid/os/Parcelable;", "account", "", "icon", "tokenName", "tokenWholeName", "balance", "", "frozenBalance", "balanceUsdt", "frozenUsdt", "total", "totalUsdt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDD)V", "getAccount", "()Ljava/lang/String;", "getIcon", "getTokenName", "getTokenWholeName", "getBalance", "()D", "getFrozenBalance", "getBalanceUsdt", "getFrozenUsdt", "getTotal", "getTotalUsdt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class AssetInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AssetInfo> CREATOR = new Creator();

    @NotNull
    private final String account;

    @SerializedName("balance")
    private final double balance;

    @SerializedName("balance_usdt")
    private final double balanceUsdt;

    @SerializedName("frozen_balance")
    private final double frozenBalance;

    @SerializedName("frozen_usdt")
    private final double frozenUsdt;

    @NotNull
    private final String icon;

    @SerializedName("token_name")
    @NotNull
    private final String tokenName;

    @SerializedName("token_whole_name")
    @NotNull
    private final String tokenWholeName;

    @SerializedName("total")
    private final double total;

    @SerializedName("total_usdt")
    private final double totalUsdt;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetInfo> {
        @Override // android.os.Parcelable.Creator
        public final AssetInfo createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new AssetInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final AssetInfo[] newArray(int i) {
            return new AssetInfo[i];
        }
    }

    public AssetInfo(@NotNull String account, @NotNull String icon, @NotNull String tokenName, @NotNull String tokenWholeName, double d, double d2, double d3, double d4, double d5, double d6) {
        Intrinsics.m18599g(account, "account");
        Intrinsics.m18599g(icon, "icon");
        Intrinsics.m18599g(tokenName, "tokenName");
        Intrinsics.m18599g(tokenWholeName, "tokenWholeName");
        this.account = account;
        this.icon = icon;
        this.tokenName = tokenName;
        this.tokenWholeName = tokenWholeName;
        this.balance = d;
        this.frozenBalance = d2;
        this.balanceUsdt = d3;
        this.frozenUsdt = d4;
        this.total = d5;
        this.totalUsdt = d6;
    }

    public static /* synthetic */ AssetInfo copy$default(AssetInfo assetInfo, String str, String str2, String str3, String str4, double d, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
        double d7;
        String str5;
        String str6 = (i & 1) != 0 ? assetInfo.account : str;
        String str7 = (i & 2) != 0 ? assetInfo.icon : str2;
        String str8 = (i & 4) != 0 ? assetInfo.tokenName : str3;
        String str9 = (i & 8) != 0 ? assetInfo.tokenWholeName : str4;
        double d8 = (i & 16) != 0 ? assetInfo.balance : d;
        double d9 = (i & 32) != 0 ? assetInfo.frozenBalance : d2;
        double d10 = (i & 64) != 0 ? assetInfo.balanceUsdt : d3;
        double d11 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? assetInfo.frozenUsdt : d4;
        double d12 = (i & 256) != 0 ? assetInfo.total : d5;
        if ((i & 512) != 0) {
            str5 = str6;
            d7 = assetInfo.totalUsdt;
        } else {
            d7 = d6;
            str5 = str6;
        }
        return assetInfo.copy(str5, str7, str8, str9, d8, d9, d10, d11, d12, d7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getTotalUsdt() {
        return this.totalUsdt;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTokenName() {
        return this.tokenName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTokenWholeName() {
        return this.tokenWholeName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getFrozenBalance() {
        return this.frozenBalance;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getBalanceUsdt() {
        return this.balanceUsdt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getFrozenUsdt() {
        return this.frozenUsdt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    @NotNull
    public final AssetInfo copy(@NotNull String account, @NotNull String icon, @NotNull String tokenName, @NotNull String tokenWholeName, double balance, double frozenBalance, double balanceUsdt, double frozenUsdt, double total, double totalUsdt) {
        Intrinsics.m18599g(account, "account");
        Intrinsics.m18599g(icon, "icon");
        Intrinsics.m18599g(tokenName, "tokenName");
        Intrinsics.m18599g(tokenWholeName, "tokenWholeName");
        return new AssetInfo(account, icon, tokenName, tokenWholeName, balance, frozenBalance, balanceUsdt, frozenUsdt, total, totalUsdt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetInfo)) {
            return false;
        }
        AssetInfo assetInfo = (AssetInfo) other;
        return Intrinsics.m18594b(this.account, assetInfo.account) && Intrinsics.m18594b(this.icon, assetInfo.icon) && Intrinsics.m18594b(this.tokenName, assetInfo.tokenName) && Intrinsics.m18594b(this.tokenWholeName, assetInfo.tokenWholeName) && Double.compare(this.balance, assetInfo.balance) == 0 && Double.compare(this.frozenBalance, assetInfo.frozenBalance) == 0 && Double.compare(this.balanceUsdt, assetInfo.balanceUsdt) == 0 && Double.compare(this.frozenUsdt, assetInfo.frozenUsdt) == 0 && Double.compare(this.total, assetInfo.total) == 0 && Double.compare(this.totalUsdt, assetInfo.totalUsdt) == 0;
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    public final double getBalance() {
        return this.balance;
    }

    public final double getBalanceUsdt() {
        return this.balanceUsdt;
    }

    public final double getFrozenBalance() {
        return this.frozenBalance;
    }

    public final double getFrozenUsdt() {
        return this.frozenUsdt;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getTokenName() {
        return this.tokenName;
    }

    @NotNull
    public final String getTokenWholeName() {
        return this.tokenWholeName;
    }

    public final double getTotal() {
        return this.total;
    }

    public final double getTotalUsdt() {
        return this.totalUsdt;
    }

    public int hashCode() {
        return Double.hashCode(this.totalUsdt) + AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(this.account.hashCode() * 31, 31, this.icon), 31, this.tokenName), 31, this.tokenWholeName), 31, this.balance), 31, this.frozenBalance), 31, this.balanceUsdt), 31, this.frozenUsdt), 31, this.total);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetInfo(account=");
        sb.append(this.account);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", tokenName=");
        sb.append(this.tokenName);
        sb.append(", tokenWholeName=");
        sb.append(this.tokenWholeName);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", frozenBalance=");
        sb.append(this.frozenBalance);
        sb.append(", balanceUsdt=");
        sb.append(this.balanceUsdt);
        sb.append(", frozenUsdt=");
        sb.append(this.frozenUsdt);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", totalUsdt=");
        return AbstractC0455a.m2239n(sb, this.totalUsdt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.account);
        dest.writeString(this.icon);
        dest.writeString(this.tokenName);
        dest.writeString(this.tokenWholeName);
        dest.writeDouble(this.balance);
        dest.writeDouble(this.frozenBalance);
        dest.writeDouble(this.balanceUsdt);
        dest.writeDouble(this.frozenUsdt);
        dest.writeDouble(this.total);
        dest.writeDouble(this.totalUsdt);
    }
}
