package com.engagelab.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class AliasMessage implements Parcelable {
    public static final Parcelable.Creator<AliasMessage> CREATOR = new C2507a();
    private String alias;
    private int code;
    private int sequence;

    /* JADX INFO: renamed from: com.engagelab.privates.push.api.AliasMessage$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2507a implements Parcelable.Creator<AliasMessage> {
        /* JADX INFO: renamed from: a */
        public AliasMessage m13177a(Parcel parcel) {
            return new AliasMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AliasMessage createFromParcel(Parcel parcel) {
            return m13177a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AliasMessage[] newArray(int i) {
            return m13178a(i);
        }

        /* JADX INFO: renamed from: a */
        public AliasMessage[] m13178a(int i) {
            return new AliasMessage[i];
        }
    }

    public AliasMessage() {
        this.sequence = 0;
        this.code = -1;
        this.alias = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.alias;
    }

    public int getCode() {
        return this.code;
    }

    public int getSequence() {
        return this.sequence;
    }

    public AliasMessage setAlias(String str) {
        this.alias = str;
        return this;
    }

    public AliasMessage setCode(int i) {
        this.code = i;
        return this;
    }

    public AliasMessage setSequence(int i) {
        this.sequence = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{\n  sequence=");
        sb.append(this.sequence);
        sb.append(",\n  code=");
        sb.append(this.code);
        sb.append(",\n  alias=");
        return AbstractC0000a.m19p(sb, this.alias, "\n}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.code);
        parcel.writeString(this.alias);
    }

    public AliasMessage(Parcel parcel) {
        this.sequence = 0;
        this.code = -1;
        this.alias = "";
        this.sequence = parcel.readInt();
        this.code = parcel.readInt();
        this.alias = parcel.readString();
    }
}
