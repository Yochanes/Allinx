package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ReactionReply implements Parcelable {

    @Nullable
    private Integer reactionIndex;
    private final List<Reaction> reactionSet;
    public static final ReactionReply NULL = new ReactionReply(new Builder());
    public static final Parcelable.Creator<ReactionReply> CREATOR = new C56331();

    /* JADX INFO: renamed from: io.intercom.android.sdk.models.ReactionReply$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C56331 implements Parcelable.Creator<ReactionReply> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ReactionReply createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ReactionReply[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionReply createFromParcel(Parcel parcel) {
            return new ReactionReply(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionReply[] newArray(int i) {
            return new ReactionReply[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {
        Integer reaction_index;
        List<Reaction> reaction_set;

        public ReactionReply build() {
            return new ReactionReply(this);
        }
    }

    public ReactionReply(Builder builder) {
        this.reactionIndex = builder.reaction_index;
        ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(builder.reaction_set));
        this.reactionSet = arrayList;
        List<Reaction> list = builder.reaction_set;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public static boolean isNull(ReactionReply reactionReply) {
        return NULL.equals(reactionReply) || reactionReply == null;
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
            ReactionReply reactionReply = (ReactionReply) obj;
            if (!this.reactionSet.equals(reactionReply.reactionSet)) {
                return false;
            }
            Integer num = this.reactionIndex;
            Integer num2 = reactionReply.reactionIndex;
            if (num != null) {
                return num.equals(num2);
            }
            if (num2 == null) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Integer getReactionIndex() {
        return this.reactionIndex;
    }

    public List<Reaction> getReactionSet() {
        return this.reactionSet;
    }

    public int hashCode() {
        int iHashCode = this.reactionSet.hashCode() * 31;
        Integer num = this.reactionIndex;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public void setReactionIndex(int i) {
        this.reactionIndex = Integer.valueOf(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.reactionIndex == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.reactionIndex.intValue());
        }
        parcel.writeList(this.reactionSet);
    }

    public ReactionReply(Parcel parcel) {
        this.reactionIndex = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        ArrayList arrayList = new ArrayList();
        this.reactionSet = arrayList;
        parcel.readList(arrayList, Reaction.class.getClassLoader());
    }
}
