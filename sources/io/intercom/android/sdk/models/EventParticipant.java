package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class EventParticipant implements Parcelable {
    private final Avatar avatar;

    /* JADX INFO: renamed from: id */
    private final String f44362id;
    private final String initial;
    private final String label;
    private final String type;
    public static final EventParticipant NULL = new EventParticipant(new Builder());
    public static final Parcelable.Creator<EventParticipant> CREATOR = new C56281();

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.EventParticipant$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56281 implements Parcelable.Creator<EventParticipant> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ EventParticipant createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ EventParticipant[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventParticipant createFromParcel(Parcel parcel) {
            return new EventParticipant(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventParticipant[] newArray(int i) {
            return new EventParticipant[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        Avatar.Builder avatar;

        /* JADX INFO: renamed from: id */
        @Nullable
        String f44363id;

        @Nullable
        String initial;

        @Nullable
        String label;

        @Nullable
        String type;

        public EventParticipant build() {
            return new EventParticipant(this, null);
        }
    }

    public /* synthetic */ EventParticipant(Builder builder, C56281 c56281) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public String getId() {
        return this.f44362id;
    }

    public String getInitial() {
        return this.initial;
    }

    public String getLabel() {
        return this.label;
    }

    public String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44362id);
        parcel.writeString(this.initial);
        parcel.writeString(this.label);
        parcel.writeString(this.type);
        parcel.writeValue(this.avatar);
    }

    private EventParticipant(Builder builder) {
        this.f44362id = NullSafety.valueOrEmpty(builder.f44363id);
        this.initial = NullSafety.valueOrEmpty(builder.initial);
        this.label = NullSafety.valueOrEmpty(builder.label);
        this.type = NullSafety.valueOrEmpty(builder.type);
        Avatar.Builder builder2 = builder.avatar;
        this.avatar = (builder2 == null ? new Avatar.Builder() : builder2).build();
    }

    public EventParticipant(Parcel parcel) {
        this.f44362id = parcel.readString();
        this.initial = parcel.readString();
        this.label = parcel.readString();
        this.type = parcel.readString();
        this.avatar = (Avatar) parcel.readValue(Avatar.class.getClassLoader());
    }
}
