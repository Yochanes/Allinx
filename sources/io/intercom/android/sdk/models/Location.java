package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class Location implements Parcelable {
    public static final Parcelable.Creator<Location> CREATOR = new C56301();

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.Location$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56301 implements Parcelable.Creator<Location> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Location createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Location[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Location createFromParcel(Parcel parcel) {
            return Location.create(parcel.readString(), parcel.readString(), parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Location[] newArray(int i) {
            return new Location[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        String city_name;

        @Nullable
        String country_name;

        @Nullable
        Integer timezone_offset;

        public Location build() {
            return Location.create(NullSafety.valueOrEmpty(this.city_name), NullSafety.valueOrEmpty(this.country_name), this.timezone_offset);
        }
    }

    public static Location create(String str, String str2, @Nullable Integer num) {
        return new AutoValue_Location(str, str2, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getCityName();

    public abstract String getCountryName();

    @Nullable
    public abstract Integer getTimezoneOffset();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getCityName());
        parcel.writeString(getCountryName());
        Integer timezoneOffset = getTimezoneOffset();
        if (timezoneOffset == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(timezoneOffset.intValue());
        }
    }
}
