package com.engagelab.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class MobileNumberMessage implements Parcelable {
    public static final Parcelable.Creator<MobileNumberMessage> CREATOR = new C2509a();
    private int code;
    private String mobileNumber;
    private int sequence;

    /* JADX INFO: renamed from: com.engagelab.privates.push.api.MobileNumberMessage$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2509a implements Parcelable.Creator<MobileNumberMessage> {
        /* JADX INFO: renamed from: a */
        public MobileNumberMessage m13181a(Parcel parcel) {
            return new MobileNumberMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MobileNumberMessage createFromParcel(Parcel parcel) {
            return m13181a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MobileNumberMessage[] newArray(int i) {
            return m13182a(i);
        }

        /* JADX INFO: renamed from: a */
        public MobileNumberMessage[] m13182a(int i) {
            return new MobileNumberMessage[i];
        }
    }

    public MobileNumberMessage() {
        this.sequence = 0;
        this.code = -1;
        this.mobileNumber = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public int getSequence() {
        return this.sequence;
    }

    public MobileNumberMessage setCode(int i) {
        this.code = i;
        return this;
    }

    public MobileNumberMessage setMobileNumber(String str) {
        this.mobileNumber = str;
        return this;
    }

    public MobileNumberMessage setSequence(int i) {
        this.sequence = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{\n  sequence=");
        sb.append(this.sequence);
        sb.append(",\n  code=");
        sb.append(this.code);
        sb.append(",\n  mobileNumber=");
        return AbstractC0000a.m19p(sb, this.mobileNumber, "\n}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.code);
        parcel.writeString(this.mobileNumber);
    }

    public MobileNumberMessage(Parcel parcel) {
        this.sequence = 0;
        this.code = -1;
        this.mobileNumber = "";
        this.sequence = parcel.readInt();
        this.code = parcel.readInt();
        this.mobileNumber = parcel.readString();
    }
}
