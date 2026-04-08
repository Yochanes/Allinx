package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.p032m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class Avatar implements Parcelable {
    public static final Avatar NULL = create("", "", AvatarShape.CIRCLE, "", "");
    public static final Parcelable.Creator<Avatar> CREATOR = new C56271();

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.Avatar$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56271 implements Parcelable.Creator<Avatar> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Avatar createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Avatar[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Avatar createFromParcel(Parcel parcel) {
            return Avatar.create(parcel.readString(), parcel.readString(), AvatarShape.INSTANCE.fromName(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Avatar[] newArray(int i) {
            return new Avatar[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        String image_dark_url;

        @Nullable
        String image_url;

        @Nullable
        String initials;

        @Nullable
        String label;

        @Nullable
        AvatarShape shape;

        @Nullable
        String square_128;

        public Avatar build() {
            String str = this.image_url;
            if (str == null) {
                str = this.square_128;
            }
            AvatarShape avatarShape = this.shape;
            if (avatarShape == null) {
                avatarShape = AvatarShape.CIRCLE;
            }
            String strValueOrEmpty = NullSafety.valueOrEmpty(this.initials);
            String str2 = this.label;
            if (str2 == null) {
                str2 = strValueOrEmpty;
            }
            return Avatar.create(NullSafety.valueOrEmpty(str), strValueOrEmpty, avatarShape, str2, NullSafety.valueOrEmpty(this.image_dark_url));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Builder.class == obj.getClass()) {
                Builder builder = (Builder) obj;
                if (Objects.equals(this.image_url, builder.image_url) && Objects.equals(this.image_dark_url, builder.image_dark_url) && Objects.equals(this.initials, builder.initials) && Objects.equals(this.square_128, builder.square_128) && Objects.equals(this.shape, builder.shape) && Objects.equals(this.label, builder.label)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.image_url, this.image_dark_url, this.initials, this.square_128, this.shape);
        }

        public Builder withImageDarkUrl(@Nullable String str) {
            this.image_dark_url = str;
            return this;
        }

        public Builder withImageUrl(@Nullable String str) {
            this.image_url = str;
            return this;
        }

        public Builder withInitials(@Nullable String str) {
            this.initials = str;
            return this;
        }

        public Builder withShape(AvatarShape avatarShape) {
            this.shape = avatarShape;
            return this;
        }
    }

    public static Avatar create(String str, String str2, AvatarShape avatarShape, String str3, String str4) {
        return new AutoValue_Avatar(str, str2, avatarShape, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getImageDarkUrl();

    public abstract String getImageUrl();

    public abstract String getInitials();

    public abstract String getLabel();

    public abstract AvatarShape getShape();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getImageUrl());
        parcel.writeString(getInitials());
        parcel.writeString(getShape().name());
        parcel.writeString(getLabel());
        parcel.writeString(getImageDarkUrl());
    }

    public static Avatar create(String str, String str2, AvatarShape avatarShape, String str3) {
        return new AutoValue_Avatar(str, str2, avatarShape, str3, "");
    }

    public static Avatar create(String str, String str2, AvatarShape avatarShape) {
        return new AutoValue_Avatar(str, str2, avatarShape, str2, "");
    }

    public static Avatar create(String str, String str2) {
        return new AutoValue_Avatar(str, str2, AvatarShape.CIRCLE, str2, "");
    }
}
