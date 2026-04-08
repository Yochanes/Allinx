package com.engagelab.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class MTProtocol implements Parcelable {
    public static final Parcelable.Creator<MTProtocol> CREATOR = new C2504a();
    private byte[] body;
    private int command;
    private long rid;
    private String threadName;
    private int version;

    /* JADX INFO: renamed from: com.engagelab.privates.core.api.MTProtocol$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2504a implements Parcelable.Creator<MTProtocol> {
        /* JADX INFO: renamed from: a */
        public MTProtocol m13171a(Parcel parcel) {
            return new MTProtocol(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MTProtocol createFromParcel(Parcel parcel) {
            return m13171a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MTProtocol[] newArray(int i) {
            return m13172a(i);
        }

        /* JADX INFO: renamed from: a */
        public MTProtocol[] m13172a(int i) {
            return new MTProtocol[i];
        }
    }

    public MTProtocol() {
        this.rid = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getBody() {
        return this.body;
    }

    public int getCommand() {
        return this.command;
    }

    public long getRid() {
        return this.rid;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public int getVersion() {
        return this.version;
    }

    public MTProtocol setBody(byte[] bArr) {
        this.body = bArr;
        return this;
    }

    public MTProtocol setCommand(int i) {
        this.command = i;
        return this;
    }

    public MTProtocol setRid(long j) {
        this.rid = j;
        return this;
    }

    public MTProtocol setThreadName(String str) {
        this.threadName = str;
        return this;
    }

    public MTProtocol setVersion(int i) {
        this.version = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{\n  rid=");
        sb.append(this.rid);
        sb.append(",\n  command=");
        sb.append(this.command);
        sb.append(",\n  version=");
        sb.append(this.version);
        sb.append(",\n  body=");
        sb.append(this.body);
        sb.append(",\n  threadName=");
        return AbstractC0000a.m19p(sb, this.threadName, "\n}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.rid);
        parcel.writeInt(this.command);
        parcel.writeInt(this.version);
        parcel.writeByteArray(this.body);
        parcel.writeString(this.threadName);
    }

    public MTProtocol(Parcel parcel) {
        this.rid = 0L;
        this.rid = parcel.readInt();
        this.command = parcel.readInt();
        this.version = parcel.readInt();
        this.body = parcel.createByteArray();
        this.threadName = parcel.readString();
    }
}
