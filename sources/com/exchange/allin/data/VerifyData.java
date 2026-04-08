package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mvi.base.IgnoredOnProguard;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
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
@Metadata(m18301d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u0089\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0006\u0010.\u001a\u00020\u0003J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0006HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u0006:"}, m18302d2 = {"Lcom/exchange/allin/data/VerifyData;", "Landroid/os/Parcelable;", "codeType", "", "codeMap", "", "", "account", "curPassword", "newPassword", "country", "countryCode", "inviteCode", "token", "googleAuthData", "Lcom/exchange/allin/data/GoogleAuthData;", "backRouteName", "<init>", "(ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/exchange/allin/data/GoogleAuthData;Ljava/lang/String;)V", "getCodeType", "()I", "getCodeMap", "()Ljava/util/Map;", "getAccount", "()Ljava/lang/String;", "getCurPassword", "getNewPassword", "getCountry", "getCountryCode", "getInviteCode", "getToken", "getGoogleAuthData", "()Lcom/exchange/allin/data/GoogleAuthData;", "getBackRouteName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class VerifyData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<VerifyData> CREATOR = new Creator();

    @NotNull
    private final String account;

    @NotNull
    private final String backRouteName;

    @NotNull
    private final Map<String, String> codeMap;
    private final int codeType;

    @Nullable
    private final String country;

    @Nullable
    private final String countryCode;

    @NotNull
    private final String curPassword;

    @Nullable
    private final GoogleAuthData googleAuthData;

    @NotNull
    private final String inviteCode;

    @NotNull
    private final String newPassword;

    @NotNull
    private final String token;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<VerifyData> {
        @Override // android.os.Parcelable.Creator
        public final VerifyData createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            int i3 = 0;
            while (true) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (i3 == i2) {
                    return new VerifyData(i, linkedHashMap, string, string2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (GoogleAuthData) parcel.readParcelable(VerifyData.class.getClassLoader()), parcel.readString());
                }
                linkedHashMap.put(string, string2);
                i3++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final VerifyData[] newArray(int i) {
            return new VerifyData[i];
        }
    }

    public VerifyData(int i, @NotNull Map<String, String> codeMap, @NotNull String account, @NotNull String curPassword, @NotNull String newPassword, @Nullable String str, @Nullable String str2, @NotNull String inviteCode, @NotNull String token, @Nullable GoogleAuthData googleAuthData, @NotNull String backRouteName) {
        Intrinsics.m18599g(codeMap, "codeMap");
        Intrinsics.m18599g(account, "account");
        Intrinsics.m18599g(curPassword, "curPassword");
        Intrinsics.m18599g(newPassword, "newPassword");
        Intrinsics.m18599g(inviteCode, "inviteCode");
        Intrinsics.m18599g(token, "token");
        Intrinsics.m18599g(backRouteName, "backRouteName");
        this.codeType = i;
        this.codeMap = codeMap;
        this.account = account;
        this.curPassword = curPassword;
        this.newPassword = newPassword;
        this.country = str;
        this.countryCode = str2;
        this.inviteCode = inviteCode;
        this.token = token;
        this.googleAuthData = googleAuthData;
        this.backRouteName = backRouteName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerifyData copy$default(VerifyData verifyData, int i, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, GoogleAuthData googleAuthData, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = verifyData.codeType;
        }
        if ((i2 & 2) != 0) {
            map = verifyData.codeMap;
        }
        if ((i2 & 4) != 0) {
            str = verifyData.account;
        }
        if ((i2 & 8) != 0) {
            str2 = verifyData.curPassword;
        }
        if ((i2 & 16) != 0) {
            str3 = verifyData.newPassword;
        }
        if ((i2 & 32) != 0) {
            str4 = verifyData.country;
        }
        if ((i2 & 64) != 0) {
            str5 = verifyData.countryCode;
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str6 = verifyData.inviteCode;
        }
        if ((i2 & 256) != 0) {
            str7 = verifyData.token;
        }
        if ((i2 & 512) != 0) {
            googleAuthData = verifyData.googleAuthData;
        }
        if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str8 = verifyData.backRouteName;
        }
        GoogleAuthData googleAuthData2 = googleAuthData;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        String str14 = str3;
        String str15 = str;
        return verifyData.copy(i, map, str15, str2, str14, str12, str13, str10, str11, googleAuthData2, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCodeType() {
        return this.codeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GoogleAuthData getGoogleAuthData() {
        return this.googleAuthData;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBackRouteName() {
        return this.backRouteName;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.codeMap;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurPassword() {
        return this.curPassword;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNewPassword() {
        return this.newPassword;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final VerifyData copy(int codeType, @NotNull Map<String, String> codeMap, @NotNull String account, @NotNull String curPassword, @NotNull String newPassword, @Nullable String country, @Nullable String countryCode, @NotNull String inviteCode, @NotNull String token, @Nullable GoogleAuthData googleAuthData, @NotNull String backRouteName) {
        Intrinsics.m18599g(codeMap, "codeMap");
        Intrinsics.m18599g(account, "account");
        Intrinsics.m18599g(curPassword, "curPassword");
        Intrinsics.m18599g(newPassword, "newPassword");
        Intrinsics.m18599g(inviteCode, "inviteCode");
        Intrinsics.m18599g(token, "token");
        Intrinsics.m18599g(backRouteName, "backRouteName");
        return new VerifyData(codeType, codeMap, account, curPassword, newPassword, country, countryCode, inviteCode, token, googleAuthData, backRouteName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyData)) {
            return false;
        }
        VerifyData verifyData = (VerifyData) other;
        return this.codeType == verifyData.codeType && Intrinsics.m18594b(this.codeMap, verifyData.codeMap) && Intrinsics.m18594b(this.account, verifyData.account) && Intrinsics.m18594b(this.curPassword, verifyData.curPassword) && Intrinsics.m18594b(this.newPassword, verifyData.newPassword) && Intrinsics.m18594b(this.country, verifyData.country) && Intrinsics.m18594b(this.countryCode, verifyData.countryCode) && Intrinsics.m18594b(this.inviteCode, verifyData.inviteCode) && Intrinsics.m18594b(this.token, verifyData.token) && Intrinsics.m18594b(this.googleAuthData, verifyData.googleAuthData) && Intrinsics.m18594b(this.backRouteName, verifyData.backRouteName);
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    public final String getBackRouteName() {
        return this.backRouteName;
    }

    @NotNull
    public final Map<String, String> getCodeMap() {
        return this.codeMap;
    }

    public final int getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCurPassword() {
        return this.curPassword;
    }

    @Nullable
    public final GoogleAuthData getGoogleAuthData() {
        return this.googleAuthData;
    }

    @NotNull
    public final String getInviteCode() {
        return this.inviteCode;
    }

    @NotNull
    public final String getNewPassword() {
        return this.newPassword;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iM5b = AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b((this.codeMap.hashCode() + (Integer.hashCode(this.codeType) * 31)) * 31, 31, this.account), 31, this.curPassword), 31, this.newPassword);
        String str = this.country;
        int iHashCode = (iM5b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryCode;
        int iM5b2 = AbstractC0000a.m5b(AbstractC0000a.m5b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.inviteCode), 31, this.token);
        GoogleAuthData googleAuthData = this.googleAuthData;
        return this.backRouteName.hashCode() + ((iM5b2 + (googleAuthData != null ? googleAuthData.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("VerifyData(codeType=");
        sb.append(this.codeType);
        sb.append(", codeMap=");
        sb.append(this.codeMap);
        sb.append(", account=");
        sb.append(this.account);
        sb.append(", curPassword=");
        sb.append(this.curPassword);
        sb.append(", newPassword=");
        sb.append(this.newPassword);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", inviteCode=");
        sb.append(this.inviteCode);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", googleAuthData=");
        sb.append(this.googleAuthData);
        sb.append(", backRouteName=");
        return AbstractC0455a.m2241p(sb, this.backRouteName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeInt(this.codeType);
        Map<String, String> map = this.codeMap;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        dest.writeString(this.account);
        dest.writeString(this.curPassword);
        dest.writeString(this.newPassword);
        dest.writeString(this.country);
        dest.writeString(this.countryCode);
        dest.writeString(this.inviteCode);
        dest.writeString(this.token);
        dest.writeParcelable(this.googleAuthData, flags);
        dest.writeString(this.backRouteName);
    }

    public /* synthetic */ VerifyData(int i, Map map, String str, String str2, String str3, String str4, String str5, String str6, String str7, GoogleAuthData googleAuthData, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? MapsKt.m18481d() : map, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? "" : str6, (i2 & 256) == 0 ? str7 : "", (i2 & 512) == 0 ? googleAuthData : null, (i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? "main" : str8);
    }
}
