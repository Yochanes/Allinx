package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ConversationRatingOption implements Parcelable {
    public static final Parcelable.Creator<ConversationRatingOption> CREATOR = new C51821();
    private final String emoji;
    private final int index;
    private final String unicode;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51821 implements Parcelable.Creator<ConversationRatingOption> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationRatingOption createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationRatingOption[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRatingOption createFromParcel(Parcel parcel) {
            return new ConversationRatingOption(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRatingOption[] newArray(int i) {
            return new ConversationRatingOption[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        String emoji;
        Integer index;
        String unicode;

        public ConversationRatingOption build() {
            return new ConversationRatingOption(this, null);
        }

        public Builder withEmoji(String str) {
            this.emoji = str;
            return this;
        }

        public Builder withIndex(Integer num) {
            this.index = num;
            return this;
        }

        public Builder withUnicode(String str) {
            this.unicode = str;
            return this;
        }
    }

    public /* synthetic */ ConversationRatingOption(Builder builder, C51821 c51821) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ConversationRatingOption conversationRatingOption = (ConversationRatingOption) obj;
            if (this.index != conversationRatingOption.index) {
                return false;
            }
            String str = this.emoji;
            if (str == null ? conversationRatingOption.emoji != null : !str.equals(conversationRatingOption.emoji)) {
                return false;
            }
            String str2 = this.unicode;
            String str3 = conversationRatingOption.unicode;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public Integer getIndex() {
        return Integer.valueOf(this.index);
    }

    public String getUnicode() {
        return this.unicode;
    }

    public int hashCode() {
        int i = this.index * 31;
        String str = this.emoji;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.unicode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.emoji);
        parcel.writeString(this.unicode);
    }

    private ConversationRatingOption(Builder builder) {
        Integer num = builder.index;
        this.index = num == null ? -1 : num.intValue();
        String str = builder.emoji;
        this.emoji = str == null ? "" : str;
        String str2 = builder.unicode;
        this.unicode = str2 != null ? str2 : "";
    }

    public ConversationRatingOption(Parcel parcel) {
        this.index = parcel.readInt();
        this.emoji = parcel.readString();
        this.unicode = parcel.readString();
    }
}
