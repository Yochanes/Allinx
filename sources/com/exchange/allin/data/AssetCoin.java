package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m18302d2 = {"Lcom/exchange/allin/data/AssetCoin;", "Landroid/os/Parcelable;", "icon", "", "coinName", "coinWholeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getCoinName", "getCoinWholeName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class AssetCoin implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AssetCoin> CREATOR = new Creator();

    @NotNull
    private final String coinName;

    @NotNull
    private final String coinWholeName;

    @NotNull
    private final String icon;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetCoin> {
        @Override // android.os.Parcelable.Creator
        public final AssetCoin createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new AssetCoin(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AssetCoin[] newArray(int i) {
            return new AssetCoin[i];
        }
    }

    public AssetCoin(@NotNull String icon, @NotNull String coinName, @NotNull String coinWholeName) {
        Intrinsics.m18599g(icon, "icon");
        Intrinsics.m18599g(coinName, "coinName");
        Intrinsics.m18599g(coinWholeName, "coinWholeName");
        this.icon = icon;
        this.coinName = coinName;
        this.coinWholeName = coinWholeName;
    }

    public static /* synthetic */ AssetCoin copy$default(AssetCoin assetCoin, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetCoin.icon;
        }
        if ((i & 2) != 0) {
            str2 = assetCoin.coinName;
        }
        if ((i & 4) != 0) {
            str3 = assetCoin.coinWholeName;
        }
        return assetCoin.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCoinName() {
        return this.coinName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCoinWholeName() {
        return this.coinWholeName;
    }

    @NotNull
    public final AssetCoin copy(@NotNull String icon, @NotNull String coinName, @NotNull String coinWholeName) {
        Intrinsics.m18599g(icon, "icon");
        Intrinsics.m18599g(coinName, "coinName");
        Intrinsics.m18599g(coinWholeName, "coinWholeName");
        return new AssetCoin(icon, coinName, coinWholeName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetCoin)) {
            return false;
        }
        AssetCoin assetCoin = (AssetCoin) other;
        return Intrinsics.m18594b(this.icon, assetCoin.icon) && Intrinsics.m18594b(this.coinName, assetCoin.coinName) && Intrinsics.m18594b(this.coinWholeName, assetCoin.coinWholeName);
    }

    @NotNull
    public final String getCoinName() {
        return this.coinName;
    }

    @NotNull
    public final String getCoinWholeName() {
        return this.coinWholeName;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.coinWholeName.hashCode() + AbstractC0000a.m5b(this.icon.hashCode() * 31, 31, this.coinName);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetCoin(icon=");
        sb.append(this.icon);
        sb.append(", coinName=");
        sb.append(this.coinName);
        sb.append(", coinWholeName=");
        return AbstractC0455a.m2241p(sb, this.coinWholeName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.icon);
        dest.writeString(this.coinName);
        dest.writeString(this.coinWholeName);
    }
}
