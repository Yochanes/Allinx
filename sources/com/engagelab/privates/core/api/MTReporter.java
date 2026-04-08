package com.engagelab.privates.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class MTReporter implements Parcelable {
    public static final Parcelable.Creator<MTReporter> CREATOR = new C2505a();
    private String content;
    private String type;

    /* JADX INFO: renamed from: com.engagelab.privates.core.api.MTReporter$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2505a implements Parcelable.Creator<MTReporter> {
        /* JADX INFO: renamed from: a */
        public MTReporter m13173a(Parcel parcel) {
            return new MTReporter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MTReporter createFromParcel(Parcel parcel) {
            return m13173a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MTReporter[] newArray(int i) {
            return m13174a(i);
        }

        /* JADX INFO: renamed from: a */
        public MTReporter[] m13174a(int i) {
            return new MTReporter[i];
        }
    }

    public MTReporter() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContent() {
        return this.content;
    }

    public String getType() {
        return this.type;
    }

    public MTReporter setContent(String str) {
        this.content = str;
        return this;
    }

    public MTReporter setType(String str) {
        this.type = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.content);
    }

    public MTReporter(Parcel parcel) {
        this.type = parcel.readString();
        this.content = parcel.readString();
    }
}
