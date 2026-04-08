package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@Metadata(m18301d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010 \u001a\u00020\u0007J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m18302d2 = {"Lcom/exchange/allin/data/AssetPayToken;", "Landroid/os/Parcelable;", "tokenName", "", "tokenWholeName", "tokenImageUrl", "decimals", "", "chain", "", "Lcom/exchange/allin/data/AssetPayTokenChain;", "internalWithdraw", "Lcom/exchange/allin/data/InternalWithdraw;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/exchange/allin/data/InternalWithdraw;)V", "getTokenName", "()Ljava/lang/String;", "getTokenWholeName", "getTokenImageUrl", "getDecimals", "()I", "getChain", "()Ljava/util/List;", "getInternalWithdraw", "()Lcom/exchange/allin/data/InternalWithdraw;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class AssetPayToken implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AssetPayToken> CREATOR = new Creator();

    @NotNull
    private final List<AssetPayTokenChain> chain;
    private final int decimals;

    @SerializedName("internal_withdraw")
    @Nullable
    private final InternalWithdraw internalWithdraw;

    @SerializedName("token_image_url")
    @NotNull
    private final String tokenImageUrl;

    @SerializedName("token_name")
    @NotNull
    private final String tokenName;

    @SerializedName("token_whole_name")
    @NotNull
    private final String tokenWholeName;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetPayToken> {
        @Override // android.os.Parcelable.Creator
        public final AssetPayToken createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(AssetPayTokenChain.CREATOR.createFromParcel(parcel));
            }
            return new AssetPayToken(string, string2, string3, i, arrayList, parcel.readInt() == 0 ? null : InternalWithdraw.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AssetPayToken[] newArray(int i) {
            return new AssetPayToken[i];
        }
    }

    public AssetPayToken(@NotNull String tokenName, @NotNull String tokenWholeName, @NotNull String tokenImageUrl, int i, @NotNull List<AssetPayTokenChain> chain, @Nullable InternalWithdraw internalWithdraw) {
        Intrinsics.m18599g(tokenName, "tokenName");
        Intrinsics.m18599g(tokenWholeName, "tokenWholeName");
        Intrinsics.m18599g(tokenImageUrl, "tokenImageUrl");
        Intrinsics.m18599g(chain, "chain");
        this.tokenName = tokenName;
        this.tokenWholeName = tokenWholeName;
        this.tokenImageUrl = tokenImageUrl;
        this.decimals = i;
        this.chain = chain;
        this.internalWithdraw = internalWithdraw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetPayToken copy$default(AssetPayToken assetPayToken, String str, String str2, String str3, int i, List list, InternalWithdraw internalWithdraw, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = assetPayToken.tokenName;
        }
        if ((i2 & 2) != 0) {
            str2 = assetPayToken.tokenWholeName;
        }
        if ((i2 & 4) != 0) {
            str3 = assetPayToken.tokenImageUrl;
        }
        if ((i2 & 8) != 0) {
            i = assetPayToken.decimals;
        }
        if ((i2 & 16) != 0) {
            list = assetPayToken.chain;
        }
        if ((i2 & 32) != 0) {
            internalWithdraw = assetPayToken.internalWithdraw;
        }
        List list2 = list;
        InternalWithdraw internalWithdraw2 = internalWithdraw;
        return assetPayToken.copy(str, str2, str3, i, list2, internalWithdraw2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenName() {
        return this.tokenName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenWholeName() {
        return this.tokenWholeName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTokenImageUrl() {
        return this.tokenImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDecimals() {
        return this.decimals;
    }

    @NotNull
    public final List<AssetPayTokenChain> component5() {
        return this.chain;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InternalWithdraw getInternalWithdraw() {
        return this.internalWithdraw;
    }

    @NotNull
    public final AssetPayToken copy(@NotNull String tokenName, @NotNull String tokenWholeName, @NotNull String tokenImageUrl, int decimals, @NotNull List<AssetPayTokenChain> chain, @Nullable InternalWithdraw internalWithdraw) {
        Intrinsics.m18599g(tokenName, "tokenName");
        Intrinsics.m18599g(tokenWholeName, "tokenWholeName");
        Intrinsics.m18599g(tokenImageUrl, "tokenImageUrl");
        Intrinsics.m18599g(chain, "chain");
        return new AssetPayToken(tokenName, tokenWholeName, tokenImageUrl, decimals, chain, internalWithdraw);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetPayToken)) {
            return false;
        }
        AssetPayToken assetPayToken = (AssetPayToken) other;
        return Intrinsics.m18594b(this.tokenName, assetPayToken.tokenName) && Intrinsics.m18594b(this.tokenWholeName, assetPayToken.tokenWholeName) && Intrinsics.m18594b(this.tokenImageUrl, assetPayToken.tokenImageUrl) && this.decimals == assetPayToken.decimals && Intrinsics.m18594b(this.chain, assetPayToken.chain) && Intrinsics.m18594b(this.internalWithdraw, assetPayToken.internalWithdraw);
    }

    @NotNull
    public final List<AssetPayTokenChain> getChain() {
        return this.chain;
    }

    public final int getDecimals() {
        return this.decimals;
    }

    @Nullable
    public final InternalWithdraw getInternalWithdraw() {
        return this.internalWithdraw;
    }

    @NotNull
    public final String getTokenImageUrl() {
        return this.tokenImageUrl;
    }

    @NotNull
    public final String getTokenName() {
        return this.tokenName;
    }

    @NotNull
    public final String getTokenWholeName() {
        return this.tokenWholeName;
    }

    public int hashCode() {
        int iM2233h = AbstractC0455a.m2233h(this.chain, AbstractC0455a.m2228c(this.decimals, AbstractC0000a.m5b(AbstractC0000a.m5b(this.tokenName.hashCode() * 31, 31, this.tokenWholeName), 31, this.tokenImageUrl), 31), 31);
        InternalWithdraw internalWithdraw = this.internalWithdraw;
        return iM2233h + (internalWithdraw == null ? 0 : internalWithdraw.hashCode());
    }

    @NotNull
    public String toString() {
        return "AssetPayToken(tokenName=" + this.tokenName + ", tokenWholeName=" + this.tokenWholeName + ", tokenImageUrl=" + this.tokenImageUrl + ", decimals=" + this.decimals + ", chain=" + this.chain + ", internalWithdraw=" + this.internalWithdraw + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.tokenName);
        dest.writeString(this.tokenWholeName);
        dest.writeString(this.tokenImageUrl);
        dest.writeInt(this.decimals);
        List<AssetPayTokenChain> list = this.chain;
        dest.writeInt(list.size());
        Iterator<AssetPayTokenChain> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        InternalWithdraw internalWithdraw = this.internalWithdraw;
        if (internalWithdraw == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            internalWithdraw.writeToParcel(dest, flags);
        }
    }
}
