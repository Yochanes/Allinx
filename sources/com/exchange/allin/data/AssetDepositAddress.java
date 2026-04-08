package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Parcelize
@Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m18302d2 = {"Lcom/exchange/allin/data/AssetDepositAddress;", "Landroid/os/Parcelable;", "address", "", "chainName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getChainName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class AssetDepositAddress implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AssetDepositAddress> CREATOR = new Creator();

    @NotNull
    private final String address;

    @SerializedName("chain_name")
    @NotNull
    private final String chainName;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetDepositAddress> {
        @Override // android.os.Parcelable.Creator
        public final AssetDepositAddress createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new AssetDepositAddress(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AssetDepositAddress[] newArray(int i) {
            return new AssetDepositAddress[i];
        }
    }

    public AssetDepositAddress(@NotNull String address, @NotNull String chainName) {
        Intrinsics.m18599g(address, "address");
        Intrinsics.m18599g(chainName, "chainName");
        this.address = address;
        this.chainName = chainName;
    }

    public static /* synthetic */ AssetDepositAddress copy$default(AssetDepositAddress assetDepositAddress, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetDepositAddress.address;
        }
        if ((i & 2) != 0) {
            str2 = assetDepositAddress.chainName;
        }
        return assetDepositAddress.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @NotNull
    public final AssetDepositAddress copy(@NotNull String address, @NotNull String chainName) {
        Intrinsics.m18599g(address, "address");
        Intrinsics.m18599g(chainName, "chainName");
        return new AssetDepositAddress(address, chainName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetDepositAddress)) {
            return false;
        }
        AssetDepositAddress assetDepositAddress = (AssetDepositAddress) other;
        return Intrinsics.m18594b(this.address, assetDepositAddress.address) && Intrinsics.m18594b(this.chainName, assetDepositAddress.chainName);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getChainName() {
        return this.chainName;
    }

    public int hashCode() {
        return this.chainName.hashCode() + (this.address.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetDepositAddress(address=");
        sb.append(this.address);
        sb.append(", chainName=");
        return AbstractC0455a.m2241p(sb, this.chainName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.address);
        dest.writeString(this.chainName);
    }
}
