package com.engagelab.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class Address implements Parcelable {
    public static final Parcelable.Creator<Address> CREATOR = new C2503a();
    private String[] defaultHost;
    private String[] defaultIp;
    private int defaultPort;
    private String defaultReportUrl;
    private String[] sisHostArray;
    private String[] sisIpArray;
    private int sisPort;

    /* JADX INFO: renamed from: com.engagelab.privates.core.api.Address$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2503a implements Parcelable.Creator<Address> {
        /* JADX INFO: renamed from: a */
        public Address m13169a(Parcel parcel) {
            return new Address(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Address createFromParcel(Parcel parcel) {
            return m13169a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Address[] newArray(int i) {
            return m13170a(i);
        }

        /* JADX INFO: renamed from: a */
        public Address[] m13170a(int i) {
            return new Address[i];
        }
    }

    public Address() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String[] getDefaultHost() {
        return this.defaultHost;
    }

    public String[] getDefaultIp() {
        return this.defaultIp;
    }

    public int getDefaultPort() {
        return this.defaultPort;
    }

    public String getDefaultReportUrl() {
        return this.defaultReportUrl;
    }

    public String[] getSisHostArray() {
        return this.sisHostArray;
    }

    public String[] getSisIpArray() {
        return this.sisIpArray;
    }

    public int getSisPort() {
        return this.sisPort;
    }

    public Address setDefaultHost(String[] strArr) {
        this.defaultHost = strArr;
        return this;
    }

    public Address setDefaultIp(String[] strArr) {
        this.defaultIp = strArr;
        return this;
    }

    public Address setDefaultPort(int i) {
        this.defaultPort = i;
        return this;
    }

    public Address setDefaultReportUrl(String str) {
        this.defaultReportUrl = str;
        return this;
    }

    public Address setSisHostArray(String... strArr) {
        this.sisHostArray = strArr;
        return this;
    }

    public Address setSisIpArray(String... strArr) {
        this.sisIpArray = strArr;
        return this;
    }

    public Address setSisPort(int i) {
        this.sisPort = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{\n  sisHostArray=");
        sb.append(this.sisHostArray);
        sb.append(",\n  sisIpArray=");
        sb.append(this.sisIpArray);
        sb.append(",\n  sisPort=");
        sb.append(this.sisPort);
        sb.append(",\n  defaultHost=");
        sb.append(this.defaultHost);
        sb.append(",\n  defaultIp=");
        sb.append(this.defaultIp);
        sb.append(",\n  defaultHost=");
        sb.append(this.defaultHost);
        sb.append(",\n  defaultPort=");
        sb.append(this.defaultPort);
        sb.append(",\n  defaultReportUrl=");
        return AbstractC0000a.m19p(sb, this.defaultReportUrl, "\n}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.sisHostArray);
        parcel.writeStringArray(this.sisIpArray);
        parcel.writeInt(this.sisPort);
        parcel.writeStringArray(this.defaultHost);
        parcel.writeStringArray(this.defaultIp);
        parcel.writeInt(this.defaultPort);
        parcel.writeString(this.defaultReportUrl);
    }

    public Address(Parcel parcel) {
        this.sisHostArray = parcel.createStringArray();
        this.sisIpArray = parcel.createStringArray();
        this.sisPort = parcel.readInt();
        this.defaultHost = parcel.createStringArray();
        this.defaultIp = parcel.createStringArray();
        this.defaultPort = parcel.readInt();
        this.defaultReportUrl = parcel.readString();
    }
}
