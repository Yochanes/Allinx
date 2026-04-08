package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class Attachments implements Parcelable {
    public static final Parcelable.Creator<Attachments> CREATOR = new C56261();

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.Attachments$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56261 implements Parcelable.Creator<Attachments> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Attachments createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Attachments[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Attachments createFromParcel(Parcel parcel) {
            return Attachments.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Attachments[] newArray(int i) {
            return new Attachments[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        String content_type;

        @Nullable
        String human_file_size;

        @Nullable
        String name;

        @Nullable
        String url;

        public Attachments build() {
            return Attachments.create(NullSafety.valueOrEmpty(this.name), NullSafety.valueOrEmpty(this.url), NullSafety.valueOrEmpty(this.content_type), NullSafety.valueOrEmpty(this.human_file_size));
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }
    }

    public static Attachments create(String str, String str2, String str3, String str4) {
        return new AutoValue_Attachments(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getContentType();

    public abstract String getHumanFileSize();

    public abstract String getName();

    public abstract String getUrl();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getName());
        parcel.writeString(getUrl());
        parcel.writeString(getContentType());
        parcel.writeString(getHumanFileSize());
    }
}
