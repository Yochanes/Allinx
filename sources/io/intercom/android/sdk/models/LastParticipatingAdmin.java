package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Location;
import io.intercom.android.sdk.models.SocialAccount;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LastParticipatingAdmin implements Parcelable {
    private static final String LINKED_IN = "linkedin";
    private static final String TWITTER = "twitter";
    private final Avatar avatar;
    private final String firstName;
    private final String intro;
    private final boolean isActive;
    private final boolean isBot;
    private final String jobTitle;
    private final long lastActiveAt;
    private final SocialAccount linkedIn;
    private final Location location;
    private final SocialAccount twitter;
    public static final Parcelable.Creator<LastParticipatingAdmin> CREATOR = new C56291();
    public static final LastParticipatingAdmin NULL = new LastParticipatingAdmin(new Builder());
    public static final LastParticipatingAdmin NONE = new LastParticipatingAdmin(new Builder());

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.LastParticipatingAdmin$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56291 implements Parcelable.Creator<LastParticipatingAdmin> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LastParticipatingAdmin createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LastParticipatingAdmin[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastParticipatingAdmin createFromParcel(Parcel parcel) {
            return new LastParticipatingAdmin(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastParticipatingAdmin[] newArray(int i) {
            return new LastParticipatingAdmin[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        Avatar.Builder avatar;

        @Nullable
        String first_name;

        @Nullable
        String intro;
        boolean is_active;
        boolean is_bot;

        @Nullable
        String job_title;
        long last_active_at;

        @Nullable
        Location.Builder location;

        @Nullable
        List<SocialAccount.Builder> social_accounts;

        public LastParticipatingAdmin build() {
            return new LastParticipatingAdmin(this);
        }

        @VisibleForTesting
        public Builder withAvatar(Avatar.Builder builder) {
            this.avatar = builder;
            return this;
        }

        @VisibleForTesting
        public Builder withFirstName(String str) {
            this.first_name = str;
            return this;
        }

        @VisibleForTesting
        public Builder withIntro(String str) {
            this.intro = str;
            return this;
        }

        @VisibleForTesting
        public Builder withIsBot(Boolean bool) {
            this.is_bot = bool.booleanValue();
            return this;
        }

        @VisibleForTesting
        public Builder withJobTitle(String str) {
            this.job_title = str;
            return this;
        }
    }

    public LastParticipatingAdmin(Builder builder) {
        SocialAccount socialAccount;
        Avatar.Builder builder2 = builder.avatar;
        this.avatar = (builder2 == null ? new Avatar.Builder() : builder2).build();
        this.firstName = NullSafety.valueOrEmpty(builder.first_name);
        this.intro = NullSafety.valueOrEmpty(builder.intro);
        this.jobTitle = NullSafety.valueOrEmpty(builder.job_title);
        Location.Builder builder3 = builder.location;
        this.location = (builder3 == null ? new Location.Builder() : builder3).build();
        this.lastActiveAt = builder.last_active_at;
        this.isActive = builder.is_active;
        this.isBot = builder.is_bot;
        SocialAccount socialAccount2 = SocialAccount.NULL;
        List<SocialAccount.Builder> list = builder.social_accounts;
        if (list != null) {
            Iterator<SocialAccount.Builder> it = list.iterator();
            socialAccount = socialAccount2;
            while (it.hasNext()) {
                SocialAccount socialAccountBuild = it.next().build();
                if (TWITTER.equals(socialAccountBuild.getProvider())) {
                    socialAccount2 = socialAccountBuild;
                } else if (LINKED_IN.equals(socialAccountBuild.getProvider())) {
                    socialAccount = socialAccountBuild;
                }
            }
        } else {
            socialAccount = socialAccount2;
        }
        this.twitter = socialAccount2;
        this.linkedIn = socialAccount;
    }

    public static boolean isNull(@Nullable LastParticipatingAdmin lastParticipatingAdmin) {
        if (lastParticipatingAdmin != NONE) {
            return NULL.equals(lastParticipatingAdmin) || lastParticipatingAdmin == null;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getIntro() {
        return this.intro;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public long getLastActiveAt() {
        return this.lastActiveAt;
    }

    public SocialAccount getLinkedIn() {
        return this.linkedIn;
    }

    public Location getLocation() {
        return this.location;
    }

    public SocialAccount getTwitter() {
        return this.twitter;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isBot() {
        return this.isBot;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.lastActiveAt);
        parcel.writeByte(this.isActive ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.intro);
        parcel.writeString(this.jobTitle);
        parcel.writeValue(this.location);
        parcel.writeValue(this.twitter);
        parcel.writeValue(this.linkedIn);
        parcel.writeByte(this.isBot ? (byte) 1 : (byte) 0);
    }

    public LastParticipatingAdmin(Parcel parcel) {
        this.lastActiveAt = parcel.readLong();
        this.isActive = parcel.readByte() != 0;
        this.avatar = (Avatar) parcel.readValue(Avatar.class.getClassLoader());
        this.firstName = parcel.readString();
        this.intro = parcel.readString();
        this.jobTitle = parcel.readString();
        this.location = (Location) parcel.readValue(Location.class.getClassLoader());
        this.twitter = (SocialAccount) parcel.readValue(SocialAccount.class.getClassLoader());
        this.linkedIn = (SocialAccount) parcel.readValue(SocialAccount.class.getClassLoader());
        this.isBot = parcel.readByte() != 0;
    }
}
