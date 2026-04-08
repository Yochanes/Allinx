package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ConversationRating implements Parcelable {
    public static final Parcelable.Creator<ConversationRating> CREATOR = new C51811();
    private final List<ConversationRatingOption> options;
    private int ratingIndex;
    private String remark;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.ConversationRating$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51811 implements Parcelable.Creator<ConversationRating> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationRating createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConversationRating[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRating createFromParcel(Parcel parcel) {
            return new ConversationRating(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConversationRating[] newArray(int i) {
            return new ConversationRating[i];
        }
    }

    public ConversationRating(int i, String str, List<ConversationRatingOption> list) {
        this.ratingIndex = i;
        this.remark = str;
        this.options = list;
    }

    public static ConversationRating fromBlock(Block block) {
        return block == null ? new ConversationRating(-1, "", new ArrayList()) : new ConversationRating(block.getRatingIndex(), block.getRemark(), block.getOptions());
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
            ConversationRating conversationRating = (ConversationRating) obj;
            if (this.ratingIndex != conversationRating.ratingIndex) {
                return false;
            }
            String str = this.remark;
            if (str == null ? conversationRating.remark != null : !str.equals(conversationRating.remark)) {
                return false;
            }
            List<ConversationRatingOption> list = this.options;
            List<ConversationRatingOption> list2 = conversationRating.options;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public Integer getRatingIndex() {
        return Integer.valueOf(this.ratingIndex);
    }

    public String getRemark() {
        return this.remark;
    }

    public int hashCode() {
        int i = this.ratingIndex * 31;
        String str = this.remark;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<ConversationRatingOption> list = this.options;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public void setRatingIndex(int i) {
        this.ratingIndex = i;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeList(this.options);
    }

    public ConversationRating(Parcel parcel) {
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
    }
}
