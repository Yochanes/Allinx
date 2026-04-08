package com.engagelab.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class WakeMessage implements Parcelable {
    public static final int ACTIVITY = 8;
    public static final int BIND_SERVICE = 2;
    public static final int CONTENT_PROVIDER = 4;
    public static final Parcelable.Creator<WakeMessage> CREATOR = new C2506a();
    public static final int START_SERVICE = 1;
    private String packageName;
    private int type;

    /* JADX INFO: renamed from: com.engagelab.privates.core.api.WakeMessage$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2506a implements Parcelable.Creator<WakeMessage> {
        /* JADX INFO: renamed from: a */
        public WakeMessage m13175a(Parcel parcel) {
            return new WakeMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ WakeMessage createFromParcel(Parcel parcel) {
            return m13175a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ WakeMessage[] newArray(int i) {
            return m13176a(i);
        }

        /* JADX INFO: renamed from: a */
        public WakeMessage[] m13176a(int i) {
            return new WakeMessage[i];
        }
    }

    public WakeMessage() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getType() {
        return this.type;
    }

    public WakeMessage setPackageName(String str) {
        this.packageName = str;
        return this;
    }

    public WakeMessage setType(int i) {
        this.type = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{\n  type=");
        sb.append(this.type);
        sb.append(",\n  packageName=");
        return AbstractC0000a.m19p(sb, this.packageName, "\n}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.packageName);
    }

    public WakeMessage(Parcel parcel) {
        this.type = parcel.readInt();
        this.packageName = parcel.readString();
    }
}
