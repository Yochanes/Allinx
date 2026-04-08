package me.jessyan.autosize.external;

import android.os.Parcel;
import android.os.Parcelable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ExternalAdaptInfo implements Parcelable {
    public static final Parcelable.Creator<ExternalAdaptInfo> CREATOR = new C63541();
    private boolean isBaseOnWidth;
    private float sizeInDp;

    /* JADX INFO: renamed from: me.jessyan.autosize.external.ExternalAdaptInfo$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C63541 implements Parcelable.Creator<ExternalAdaptInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ExternalAdaptInfo createFromParcel(Parcel parcel) {
            return createFromParcel2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ExternalAdaptInfo[] newArray(int i) {
            return newArray2(i);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
        public ExternalAdaptInfo createFromParcel2(Parcel parcel) {
            return new ExternalAdaptInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
        public ExternalAdaptInfo[] newArray2(int i) {
            return new ExternalAdaptInfo[i];
        }
    }

    public ExternalAdaptInfo(boolean z2) {
        this.isBaseOnWidth = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getSizeInDp() {
        return this.sizeInDp;
    }

    public boolean isBaseOnWidth() {
        return this.isBaseOnWidth;
    }

    public void setBaseOnWidth(boolean z2) {
        this.isBaseOnWidth = z2;
    }

    public void setSizeInDp(float f) {
        this.sizeInDp = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalAdaptInfo{isBaseOnWidth=");
        sb.append(this.isBaseOnWidth);
        sb.append(", sizeInDp=");
        return AbstractC0000a.m16m(sb, this.sizeInDp, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isBaseOnWidth ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.sizeInDp);
    }

    public ExternalAdaptInfo(boolean z2, float f) {
        this.isBaseOnWidth = z2;
        this.sizeInDp = f;
    }

    public ExternalAdaptInfo(Parcel parcel) {
        this.isBaseOnWidth = parcel.readByte() != 0;
        this.sizeInDp = parcel.readFloat();
    }
}
