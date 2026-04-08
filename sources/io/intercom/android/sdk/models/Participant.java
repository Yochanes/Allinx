package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class Participant implements Parcelable {
    public static final String ADMIN_TYPE = "admin";
    public static final String USER_TYPE = "user";
    public static final Participant NULL = create("", "", "", "", Avatar.create("", ""), Boolean.FALSE);
    public static final Parcelable.Creator<Participant> CREATOR = new C56321();

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.Participant$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56321 implements Parcelable.Creator<Participant> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Participant createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Participant[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Participant createFromParcel(Parcel parcel) {
            return Participant.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Avatar) parcel.readValue(Avatar.class.getClassLoader()), Boolean.valueOf(parcel.readByte() == 0));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Participant[] newArray(int i) {
            return new Participant[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        Avatar.Builder avatar;

        @Nullable
        String email;

        /* JADX INFO: renamed from: id */
        @Nullable
        String f44369id;

        @Nullable
        Boolean is_bot;

        @Nullable
        String name;

        @Nullable
        String type;

        public Participant build() {
            String initial;
            String str = this.type;
            if (str == null) {
                str = Participant.USER_TYPE;
            }
            String str2 = str;
            String strValueOrEmpty = NullSafety.valueOrEmpty(this.name);
            String strValueOrEmpty2 = NullSafety.valueOrEmpty(this.email);
            Avatar.Builder builder = this.avatar;
            if (NullSafety.valueOrEmpty(builder != null ? builder.initials : null).isEmpty()) {
                initial = NameUtils.getInitial(strValueOrEmpty.isEmpty() ? strValueOrEmpty2 : strValueOrEmpty);
            } else {
                initial = this.avatar.initials;
            }
            Avatar.Builder builder2 = this.avatar;
            return Participant.create(NullSafety.valueOrEmpty(this.f44369id), strValueOrEmpty, str2, strValueOrEmpty2, builder2 == null ? Avatar.create("", initial) : builder2.withInitials(initial).build(), Boolean.valueOf(NullSafety.valueOrDefault(this.is_bot, false)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Builder.class == obj.getClass()) {
                Builder builder = (Builder) obj;
                if (Objects.equals(this.f44369id, builder.f44369id) && Objects.equals(this.name, builder.name) && Objects.equals(this.type, builder.type) && Objects.equals(this.email, builder.email) && Objects.equals(this.avatar, builder.avatar) && Objects.equals(this.is_bot, builder.is_bot)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f44369id, this.name, this.type, this.email, this.avatar, this.is_bot);
        }

        public Builder withAvatar(Avatar.Builder builder) {
            this.avatar = builder;
            return this;
        }

        public Builder withEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder withId(String str) {
            this.f44369id = str;
            return this;
        }

        public Builder withIsBot(boolean z2) {
            this.is_bot = Boolean.valueOf(z2);
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }
    }

    public static Participant create(String str, String str2, String str3, String str4, Avatar avatar, Boolean bool) {
        return new AutoValue_Participant(str, str2, str3, str4, avatar, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract Avatar getAvatar();

    public abstract String getEmail();

    public String getForename() {
        return nameOrEmail().trim().split(" ")[0];
    }

    public abstract String getId();

    public abstract String getName();

    public abstract String getType();

    public boolean isAdmin() {
        return ADMIN_TYPE.equals(getType());
    }

    public abstract Boolean isBot();

    public boolean isUserWithId(@Nullable String str) {
        return USER_TYPE.equals(getType()) && getId().equals(str);
    }

    @VisibleForTesting
    public String nameOrEmail() {
        return getName().isEmpty() ? getEmail() : getName();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getId());
        parcel.writeString(getName());
        parcel.writeString(getType());
        parcel.writeString(getEmail());
        parcel.writeValue(getAvatar());
        parcel.writeByte(isBot().booleanValue() ? (byte) 1 : (byte) 0);
    }
}
