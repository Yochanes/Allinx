package com.exchange.allin.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
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
@Metadata(m18301d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006 "}, m18302d2 = {"Lcom/exchange/allin/data/LoginData;", "Landroid/os/Parcelable;", "isEmail", "", "account", "", "code", "country", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getAccount", "()Ljava/lang/String;", "getCode", "getCountry", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class LoginData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<LoginData> CREATOR = new Creator();

    @NotNull
    private final String account;

    @NotNull
    private final String code;

    @NotNull
    private final String country;
    private final boolean isEmail;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<LoginData> {
        @Override // android.os.Parcelable.Creator
        public final LoginData createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new LoginData(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LoginData[] newArray(int i) {
            return new LoginData[i];
        }
    }

    public LoginData() {
        this(false, null, null, null, 15, null);
    }

    public static /* synthetic */ LoginData copy$default(LoginData loginData, boolean z2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = loginData.isEmail;
        }
        if ((i & 2) != 0) {
            str = loginData.account;
        }
        if ((i & 4) != 0) {
            str2 = loginData.code;
        }
        if ((i & 8) != 0) {
            str3 = loginData.country;
        }
        return loginData.copy(z2, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEmail() {
        return this.isEmail;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    public final LoginData copy(boolean isEmail, @NotNull String account, @NotNull String code, @NotNull String country) {
        Intrinsics.m18599g(account, "account");
        Intrinsics.m18599g(code, "code");
        Intrinsics.m18599g(country, "country");
        return new LoginData(isEmail, account, code, country);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginData)) {
            return false;
        }
        LoginData loginData = (LoginData) other;
        return this.isEmail == loginData.isEmail && Intrinsics.m18594b(this.account, loginData.account) && Intrinsics.m18594b(this.code, loginData.code) && Intrinsics.m18594b(this.country, loginData.country);
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        return this.country.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(Boolean.hashCode(this.isEmail) * 31, 31, this.account), 31, this.code);
    }

    public final boolean isEmail() {
        return this.isEmail;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LoginData(isEmail=");
        sb.append(this.isEmail);
        sb.append(", account=");
        sb.append(this.account);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", country=");
        return AbstractC0455a.m2241p(sb, this.country, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeInt(this.isEmail ? 1 : 0);
        dest.writeString(this.account);
        dest.writeString(this.code);
        dest.writeString(this.country);
    }

    public LoginData(boolean z2, @NotNull String account, @NotNull String code, @NotNull String country) {
        Intrinsics.m18599g(account, "account");
        Intrinsics.m18599g(code, "code");
        Intrinsics.m18599g(country, "country");
        this.isEmail = z2;
        this.account = account;
        this.code = code;
        this.country = country;
    }

    public /* synthetic */ LoginData(boolean z2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z2, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
