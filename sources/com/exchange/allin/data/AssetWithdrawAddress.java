package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0006\u0010#\u001a\u00020\nJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\nHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006/"}, m18302d2 = {"Lcom/exchange/allin/data/AssetWithdrawAddress;", "Landroid/os/Parcelable;", "id", "", "coin", "", "network", "address", "remark", "enable", "", "createAt", "updateAt", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJ)V", "getId", "()J", "getCoin", "()Ljava/lang/String;", "getNetwork", "getAddress", "getRemark", "getEnable", "()I", "getCreateAt", "getUpdateAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class AssetWithdrawAddress implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AssetWithdrawAddress> CREATOR = new Creator();

    @NotNull
    private final String address;

    @NotNull
    private final String coin;

    @SerializedName("create_at")
    private final long createAt;
    private final int enable;
    private final long id;

    @NotNull
    private final String network;

    @NotNull
    private final String remark;

    @SerializedName("update_at")
    private final long updateAt;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetWithdrawAddress> {
        @Override // android.os.Parcelable.Creator
        public final AssetWithdrawAddress createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new AssetWithdrawAddress(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AssetWithdrawAddress[] newArray(int i) {
            return new AssetWithdrawAddress[i];
        }
    }

    public AssetWithdrawAddress(long j, @NotNull String coin, @NotNull String network, @NotNull String address, @NotNull String remark, int i, long j2, long j3) {
        Intrinsics.m18599g(coin, "coin");
        Intrinsics.m18599g(network, "network");
        Intrinsics.m18599g(address, "address");
        Intrinsics.m18599g(remark, "remark");
        this.id = j;
        this.coin = coin;
        this.network = network;
        this.address = address;
        this.remark = remark;
        this.enable = i;
        this.createAt = j2;
        this.updateAt = j3;
    }

    public static /* synthetic */ AssetWithdrawAddress copy$default(AssetWithdrawAddress assetWithdrawAddress, long j, String str, String str2, String str3, String str4, int i, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = assetWithdrawAddress.id;
        }
        return assetWithdrawAddress.copy(j, (i2 & 2) != 0 ? assetWithdrawAddress.coin : str, (i2 & 4) != 0 ? assetWithdrawAddress.network : str2, (i2 & 8) != 0 ? assetWithdrawAddress.address : str3, (i2 & 16) != 0 ? assetWithdrawAddress.remark : str4, (i2 & 32) != 0 ? assetWithdrawAddress.enable : i, (i2 & 64) != 0 ? assetWithdrawAddress.createAt : j2, (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? assetWithdrawAddress.updateAt : j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCoin() {
        return this.coin;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getUpdateAt() {
        return this.updateAt;
    }

    @NotNull
    public final AssetWithdrawAddress copy(long id, @NotNull String coin, @NotNull String network, @NotNull String address, @NotNull String remark, int enable, long createAt, long updateAt) {
        Intrinsics.m18599g(coin, "coin");
        Intrinsics.m18599g(network, "network");
        Intrinsics.m18599g(address, "address");
        Intrinsics.m18599g(remark, "remark");
        return new AssetWithdrawAddress(id, coin, network, address, remark, enable, createAt, updateAt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetWithdrawAddress)) {
            return false;
        }
        AssetWithdrawAddress assetWithdrawAddress = (AssetWithdrawAddress) other;
        return this.id == assetWithdrawAddress.id && Intrinsics.m18594b(this.coin, assetWithdrawAddress.coin) && Intrinsics.m18594b(this.network, assetWithdrawAddress.network) && Intrinsics.m18594b(this.address, assetWithdrawAddress.address) && Intrinsics.m18594b(this.remark, assetWithdrawAddress.remark) && this.enable == assetWithdrawAddress.enable && this.createAt == assetWithdrawAddress.createAt && this.updateAt == assetWithdrawAddress.updateAt;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getCoin() {
        return this.coin;
    }

    public final long getCreateAt() {
        return this.createAt;
    }

    public final int getEnable() {
        return this.enable;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getNetwork() {
        return this.network;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    public final long getUpdateAt() {
        return this.updateAt;
    }

    public int hashCode() {
        return Long.hashCode(this.updateAt) + AbstractC0455a.m2231f(this.createAt, AbstractC0455a.m2228c(this.enable, AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(Long.hashCode(this.id) * 31, 31, this.coin), 31, this.network), 31, this.address), 31, this.remark), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetWithdrawAddress(id=");
        sb.append(this.id);
        sb.append(", coin=");
        sb.append(this.coin);
        sb.append(", network=");
        sb.append(this.network);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", remark=");
        sb.append(this.remark);
        sb.append(", enable=");
        sb.append(this.enable);
        sb.append(", createAt=");
        sb.append(this.createAt);
        sb.append(", updateAt=");
        return AbstractC0455a.m2240o(sb, this.updateAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.coin);
        dest.writeString(this.network);
        dest.writeString(this.address);
        dest.writeString(this.remark);
        dest.writeInt(this.enable);
        dest.writeLong(this.createAt);
        dest.writeLong(this.updateAt);
    }

    public /* synthetic */ AssetWithdrawAddress(long j, String str, String str2, String str3, String str4, int i, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, i, (i2 & 64) != 0 ? 0L : j2, (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 0L : j3);
    }
}
