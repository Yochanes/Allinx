package com.engagelab.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class TagMessage implements Parcelable {
    public static final Parcelable.Creator<TagMessage> CREATOR = new C2513a();
    private int code;
    private String queryTag;
    private boolean queryTagValid;
    private int sequence;
    private String[] tags;

    /* JADX INFO: renamed from: com.engagelab.privates.push.api.TagMessage$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2513a implements Parcelable.Creator<TagMessage> {
        /* JADX INFO: renamed from: a */
        public TagMessage m13189a(Parcel parcel) {
            return new TagMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TagMessage createFromParcel(Parcel parcel) {
            return m13189a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TagMessage[] newArray(int i) {
            return m13190a(i);
        }

        /* JADX INFO: renamed from: a */
        public TagMessage[] m13190a(int i) {
            return new TagMessage[i];
        }
    }

    public TagMessage() {
        this.sequence = 0;
        this.code = -1;
        this.tags = new String[0];
        this.queryTag = "";
        this.queryTagValid = false;
    }

    public static Parcelable.Creator<TagMessage> getCREATOR() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    public String getQueryTag() {
        return this.queryTag;
    }

    public int getSequence() {
        return this.sequence;
    }

    public String[] getTags() {
        return this.tags;
    }

    public boolean isQueryTagValid() {
        return this.queryTagValid;
    }

    public TagMessage setCode(int i) {
        this.code = i;
        return this;
    }

    public TagMessage setQueryTag(String str) {
        this.queryTag = str;
        return this;
    }

    public TagMessage setQueryTagValid(boolean z2) {
        this.queryTagValid = z2;
        return this;
    }

    public TagMessage setSequence(int i) {
        this.sequence = i;
        return this;
    }

    public TagMessage setTags(String[] strArr) {
        this.tags = strArr;
        return this;
    }

    public String toString() {
        return "\n{\n  sequence=" + this.sequence + ",\n  code=" + this.code + ",\n  tag=" + Arrays.toString(this.tags) + ",\n  queryTag=" + this.queryTag + ",\n  queryTagValid=" + this.queryTagValid + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.code);
        parcel.writeStringArray(this.tags);
        parcel.writeString(this.queryTag);
        parcel.writeByte(this.queryTagValid ? (byte) 1 : (byte) 0);
    }

    public TagMessage(Parcel parcel) {
        this.sequence = 0;
        this.code = -1;
        this.tags = new String[0];
        this.queryTag = "";
        this.queryTagValid = false;
        this.sequence = parcel.readInt();
        this.code = parcel.readInt();
        this.tags = parcel.createStringArray();
        this.queryTag = parcel.readString();
        this.queryTagValid = parcel.readByte() != 0;
    }
}
