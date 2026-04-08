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
@Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m18302d2 = {"Lcom/exchange/allin/data/Country;", "Landroid/os/Parcelable;", "code", "", "name", "iso", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getName", "getIso", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class Country implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Country> CREATOR = new Creator();

    @NotNull
    private final String code;

    @NotNull
    private final String iso;

    @NotNull
    private final String name;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Creator implements Parcelable.Creator<Country> {
        @Override // android.os.Parcelable.Creator
        public final Country createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            return new Country(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Country[] newArray(int i) {
            return new Country[i];
        }
    }

    public Country(@NotNull String code, @NotNull String name, @NotNull String iso) {
        Intrinsics.m18599g(code, "code");
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(iso, "iso");
        this.code = code;
        this.name = name;
        this.iso = iso;
    }

    public static /* synthetic */ Country copy$default(Country country, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = country.code;
        }
        if ((i & 2) != 0) {
            str2 = country.name;
        }
        if ((i & 4) != 0) {
            str3 = country.iso;
        }
        return country.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIso() {
        return this.iso;
    }

    @NotNull
    public final Country copy(@NotNull String code, @NotNull String name, @NotNull String iso) {
        Intrinsics.m18599g(code, "code");
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(iso, "iso");
        return new Country(code, name, iso);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return Intrinsics.m18594b(this.code, country.code) && Intrinsics.m18594b(this.name, country.name) && Intrinsics.m18594b(this.iso, country.iso);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getIso() {
        return this.iso;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.iso.hashCode() + AbstractC0000a.m5b(this.code.hashCode() * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Country(code=");
        sb.append(this.code);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", iso=");
        return AbstractC0455a.m2241p(sb, this.iso, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
        dest.writeString(this.iso);
    }
}
