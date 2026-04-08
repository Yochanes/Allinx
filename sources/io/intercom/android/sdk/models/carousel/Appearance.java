package io.intercom.android.sdk.models.carousel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class Appearance implements Parcelable {
    public static Appearance NULL = new Builder().build();
    public static final Parcelable.Creator<Appearance> CREATOR = new C56351();

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.carousel.Appearance$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56351 implements Parcelable.Creator<Appearance> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Appearance createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Appearance[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Appearance createFromParcel(Parcel parcel) {
            return Appearance.create(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Appearance[] newArray(int i) {
            return new Appearance[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        String alignment;

        @Nullable
        String text_color;

        @Nullable
        String type;

        public Appearance build() {
            return Appearance.create(NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.alignment), NullSafety.valueOrEmpty(this.text_color));
        }

        public Builder withTextAlignment(String str) {
            this.alignment = str;
            return this;
        }

        public Builder withTextColor(String str) {
            this.text_color = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }
    }

    public static Appearance create(String str, String str2, String str3) {
        return new AutoValue_Appearance(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getAlignment();

    public abstract String getTextColor();

    public abstract String getType();

    public Builder toBuilder() {
        return new Builder().withType(getType()).withTextAlignment(getAlignment()).withTextColor(getTextColor());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getType());
        parcel.writeString(getAlignment());
        parcel.writeString(getTextColor());
    }
}
