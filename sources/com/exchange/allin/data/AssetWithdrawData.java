package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
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
@Metadata(m18301d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jq\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020\u0005J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0005HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014¨\u00067"}, m18302d2 = {"Lcom/exchange/allin/data/AssetWithdrawData;", "Landroid/os/Parcelable;", "address", "", "curNetworkIndex", "", "assetPayToken", "Lcom/exchange/allin/data/AssetPayToken;", "amount", "", "actualAmount", "isInternalWithdraw", "", "toUserAccount", "toUserAccountType", "toUserCountry", "toUserPhoneCode", "<init>", "(Ljava/lang/String;ILcom/exchange/allin/data/AssetPayToken;DDZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCurNetworkIndex", "()I", "getAssetPayToken", "()Lcom/exchange/allin/data/AssetPayToken;", "getAmount", "()D", "getActualAmount", "()Z", "getToUserAccount", "getToUserAccountType", "getToUserCountry", "getToUserPhoneCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class AssetWithdrawData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AssetWithdrawData> CREATOR = new Creator();
    private final double actualAmount;

    @NotNull
    private final String address;
    private final double amount;

    @NotNull
    private final AssetPayToken assetPayToken;
    private final int curNetworkIndex;
    private final boolean isInternalWithdraw;

    @NotNull
    private final String toUserAccount;
    private final int toUserAccountType;

    @Nullable
    private final String toUserCountry;

    @Nullable
    private final String toUserPhoneCode;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetWithdrawData> {
        @Override // android.os.Parcelable.Creator
        public final AssetWithdrawData createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new AssetWithdrawData(parcel.readString(), parcel.readInt(), AssetPayToken.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AssetWithdrawData[] newArray(int i) {
            return new AssetWithdrawData[i];
        }
    }

    public AssetWithdrawData(@NotNull String address, int i, @NotNull AssetPayToken assetPayToken, double d, double d2, boolean z2, @NotNull String toUserAccount, int i2, @Nullable String str, @Nullable String str2) {
        Intrinsics.m18599g(address, "address");
        Intrinsics.m18599g(assetPayToken, "assetPayToken");
        Intrinsics.m18599g(toUserAccount, "toUserAccount");
        this.address = address;
        this.curNetworkIndex = i;
        this.assetPayToken = assetPayToken;
        this.amount = d;
        this.actualAmount = d2;
        this.isInternalWithdraw = z2;
        this.toUserAccount = toUserAccount;
        this.toUserAccountType = i2;
        this.toUserCountry = str;
        this.toUserPhoneCode = str2;
    }

    public static /* synthetic */ AssetWithdrawData copy$default(AssetWithdrawData assetWithdrawData, String str, int i, AssetPayToken assetPayToken, double d, double d2, boolean z2, String str2, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = assetWithdrawData.address;
        }
        if ((i3 & 2) != 0) {
            i = assetWithdrawData.curNetworkIndex;
        }
        if ((i3 & 4) != 0) {
            assetPayToken = assetWithdrawData.assetPayToken;
        }
        if ((i3 & 8) != 0) {
            d = assetWithdrawData.amount;
        }
        if ((i3 & 16) != 0) {
            d2 = assetWithdrawData.actualAmount;
        }
        if ((i3 & 32) != 0) {
            z2 = assetWithdrawData.isInternalWithdraw;
        }
        if ((i3 & 64) != 0) {
            str2 = assetWithdrawData.toUserAccount;
        }
        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            i2 = assetWithdrawData.toUserAccountType;
        }
        if ((i3 & 256) != 0) {
            str3 = assetWithdrawData.toUserCountry;
        }
        if ((i3 & 512) != 0) {
            str4 = assetWithdrawData.toUserPhoneCode;
        }
        String str5 = str4;
        int i4 = i2;
        boolean z3 = z2;
        double d3 = d2;
        double d4 = d;
        AssetPayToken assetPayToken2 = assetPayToken;
        return assetWithdrawData.copy(str, i, assetPayToken2, d4, d3, z3, str2, i4, str3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getToUserPhoneCode() {
        return this.toUserPhoneCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCurNetworkIndex() {
        return this.curNetworkIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AssetPayToken getAssetPayToken() {
        return this.assetPayToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getActualAmount() {
        return this.actualAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsInternalWithdraw() {
        return this.isInternalWithdraw;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getToUserAccount() {
        return this.toUserAccount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getToUserAccountType() {
        return this.toUserAccountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getToUserCountry() {
        return this.toUserCountry;
    }

    @NotNull
    public final AssetWithdrawData copy(@NotNull String address, int curNetworkIndex, @NotNull AssetPayToken assetPayToken, double amount, double actualAmount, boolean isInternalWithdraw, @NotNull String toUserAccount, int toUserAccountType, @Nullable String toUserCountry, @Nullable String toUserPhoneCode) {
        Intrinsics.m18599g(address, "address");
        Intrinsics.m18599g(assetPayToken, "assetPayToken");
        Intrinsics.m18599g(toUserAccount, "toUserAccount");
        return new AssetWithdrawData(address, curNetworkIndex, assetPayToken, amount, actualAmount, isInternalWithdraw, toUserAccount, toUserAccountType, toUserCountry, toUserPhoneCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetWithdrawData)) {
            return false;
        }
        AssetWithdrawData assetWithdrawData = (AssetWithdrawData) other;
        return Intrinsics.m18594b(this.address, assetWithdrawData.address) && this.curNetworkIndex == assetWithdrawData.curNetworkIndex && Intrinsics.m18594b(this.assetPayToken, assetWithdrawData.assetPayToken) && Double.compare(this.amount, assetWithdrawData.amount) == 0 && Double.compare(this.actualAmount, assetWithdrawData.actualAmount) == 0 && this.isInternalWithdraw == assetWithdrawData.isInternalWithdraw && Intrinsics.m18594b(this.toUserAccount, assetWithdrawData.toUserAccount) && this.toUserAccountType == assetWithdrawData.toUserAccountType && Intrinsics.m18594b(this.toUserCountry, assetWithdrawData.toUserCountry) && Intrinsics.m18594b(this.toUserPhoneCode, assetWithdrawData.toUserPhoneCode);
    }

    public final double getActualAmount() {
        return this.actualAmount;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final double getAmount() {
        return this.amount;
    }

    @NotNull
    public final AssetPayToken getAssetPayToken() {
        return this.assetPayToken;
    }

    public final int getCurNetworkIndex() {
        return this.curNetworkIndex;
    }

    @NotNull
    public final String getToUserAccount() {
        return this.toUserAccount;
    }

    public final int getToUserAccountType() {
        return this.toUserAccountType;
    }

    @Nullable
    public final String getToUserCountry() {
        return this.toUserCountry;
    }

    @Nullable
    public final String getToUserPhoneCode() {
        return this.toUserPhoneCode;
    }

    public int hashCode() {
        int iM2228c = AbstractC0455a.m2228c(this.toUserAccountType, AbstractC0000a.m5b(AbstractC0455a.m2230e(AbstractC0455a.m2227b(AbstractC0455a.m2227b((this.assetPayToken.hashCode() + AbstractC0455a.m2228c(this.curNetworkIndex, this.address.hashCode() * 31, 31)) * 31, 31, this.amount), 31, this.actualAmount), 31, this.isInternalWithdraw), 31, this.toUserAccount), 31);
        String str = this.toUserCountry;
        int iHashCode = (iM2228c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toUserPhoneCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isInternalWithdraw() {
        return this.isInternalWithdraw;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetWithdrawData(address=");
        sb.append(this.address);
        sb.append(", curNetworkIndex=");
        sb.append(this.curNetworkIndex);
        sb.append(", assetPayToken=");
        sb.append(this.assetPayToken);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", actualAmount=");
        sb.append(this.actualAmount);
        sb.append(", isInternalWithdraw=");
        sb.append(this.isInternalWithdraw);
        sb.append(", toUserAccount=");
        sb.append(this.toUserAccount);
        sb.append(", toUserAccountType=");
        sb.append(this.toUserAccountType);
        sb.append(", toUserCountry=");
        sb.append(this.toUserCountry);
        sb.append(", toUserPhoneCode=");
        return AbstractC0455a.m2241p(sb, this.toUserPhoneCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.address);
        dest.writeInt(this.curNetworkIndex);
        this.assetPayToken.writeToParcel(dest, flags);
        dest.writeDouble(this.amount);
        dest.writeDouble(this.actualAmount);
        dest.writeInt(this.isInternalWithdraw ? 1 : 0);
        dest.writeString(this.toUserAccount);
        dest.writeInt(this.toUserAccountType);
        dest.writeString(this.toUserCountry);
        dest.writeString(this.toUserPhoneCode);
    }

    public /* synthetic */ AssetWithdrawData(String str, int i, AssetPayToken assetPayToken, double d, double d2, boolean z2, String str2, int i2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, assetPayToken, d, d2, z2, (i3 & 64) != 0 ? "" : str2, (i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : str4);
    }
}
