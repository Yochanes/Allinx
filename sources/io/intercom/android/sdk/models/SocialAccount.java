package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class SocialAccount implements Parcelable {
    public static final SocialAccount NULL = create("", "");
    public static final Parcelable.Creator<SocialAccount> CREATOR = new C56341();

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.SocialAccount$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56341 implements Parcelable.Creator<SocialAccount> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SocialAccount createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SocialAccount[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SocialAccount createFromParcel(Parcel parcel) {
            return SocialAccount.create(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SocialAccount[] newArray(int i) {
            return new SocialAccount[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        String profile_url;

        @Nullable
        String provider;

        public SocialAccount build() {
            return SocialAccount.create(NullSafety.valueOrEmpty(this.provider), NullSafety.valueOrEmpty(this.profile_url));
        }
    }

    public static SocialAccount create(String str, String str2) {
        return new AutoValue_SocialAccount(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getProfileUrl();

    public abstract String getProvider();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getProvider());
        parcel.writeString(getProfileUrl());
    }
}
