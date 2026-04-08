package com.engagelab.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class PlatformTokenMessage implements Parcelable {
    public static final Parcelable.Creator<PlatformTokenMessage> CREATOR = new C2512a();
    private byte platform;
    private String region;
    private String token;

    /* JADX INFO: renamed from: com.engagelab.privates.push.api.PlatformTokenMessage$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2512a implements Parcelable.Creator<PlatformTokenMessage> {
        /* JADX INFO: renamed from: a */
        public PlatformTokenMessage m13187a(Parcel parcel) {
            return new PlatformTokenMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PlatformTokenMessage createFromParcel(Parcel parcel) {
            return m13187a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PlatformTokenMessage[] newArray(int i) {
            return m13188a(i);
        }

        /* JADX INFO: renamed from: a */
        public PlatformTokenMessage[] m13188a(int i) {
            return new PlatformTokenMessage[i];
        }
    }

    public PlatformTokenMessage() {
        this.region = "NULL";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte getPlatform() {
        return this.platform;
    }

    public String getRegion() {
        return this.region;
    }

    public String getToken() {
        return this.token;
    }

    public PlatformTokenMessage setPlatform(byte b2) {
        this.platform = b2;
        return this;
    }

    public PlatformTokenMessage setRegion(String str) {
        this.region = str;
        return this;
    }

    public PlatformTokenMessage setToken(String str) {
        this.token = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{\n  platform=");
        sb.append((int) this.platform);
        sb.append(",\n  token=");
        sb.append(this.token);
        sb.append("\n  region=");
        return AbstractC0000a.m19p(sb, this.region, "\n}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.platform);
        parcel.writeString(this.token);
        parcel.writeString(this.region);
    }

    public PlatformTokenMessage(Parcel parcel) {
        this.region = "NULL";
        this.platform = parcel.readByte();
        this.token = parcel.readString();
        this.region = parcel.readString();
    }
}
