package me.jessyan.autosize;

import android.os.Parcel;
import android.os.Parcelable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DisplayMetricsInfo implements Parcelable {
    public static final Parcelable.Creator<DisplayMetricsInfo> CREATOR = new C63521();
    private float density;
    private int densityDpi;
    private float scaledDensity;
    private int screenHeightDp;
    private int screenWidthDp;
    private float xdpi;

    /* JADX INFO: renamed from: me.jessyan.autosize.DisplayMetricsInfo$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C63521 implements Parcelable.Creator<DisplayMetricsInfo> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DisplayMetricsInfo createFromParcel(Parcel parcel) {
            return createFromParcel2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DisplayMetricsInfo[] newArray(int i) {
            return newArray2(i);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
        public DisplayMetricsInfo createFromParcel2(Parcel parcel) {
            return new DisplayMetricsInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
        public DisplayMetricsInfo[] newArray2(int i) {
            return new DisplayMetricsInfo[i];
        }
    }

    public DisplayMetricsInfo(float f, int i, float f2, float f3) {
        this.density = f;
        this.densityDpi = i;
        this.scaledDensity = f2;
        this.xdpi = f3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDensity() {
        return this.density;
    }

    public int getDensityDpi() {
        return this.densityDpi;
    }

    public float getScaledDensity() {
        return this.scaledDensity;
    }

    public int getScreenHeightDp() {
        return this.screenHeightDp;
    }

    public int getScreenWidthDp() {
        return this.screenWidthDp;
    }

    public float getXdpi() {
        return this.xdpi;
    }

    public void setDensity(float f) {
        this.density = f;
    }

    public void setDensityDpi(int i) {
        this.densityDpi = i;
    }

    public void setScaledDensity(float f) {
        this.scaledDensity = f;
    }

    public void setScreenHeightDp(int i) {
        this.screenHeightDp = i;
    }

    public void setScreenWidthDp(int i) {
        this.screenWidthDp = i;
    }

    public void setXdpi(float f) {
        this.xdpi = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DisplayMetricsInfo{density=");
        sb.append(this.density);
        sb.append(", densityDpi=");
        sb.append(this.densityDpi);
        sb.append(", scaledDensity=");
        sb.append(this.scaledDensity);
        sb.append(", xdpi=");
        sb.append(this.xdpi);
        sb.append(", screenWidthDp=");
        sb.append(this.screenWidthDp);
        sb.append(", screenHeightDp=");
        return AbstractC0000a.m17n(sb, this.screenHeightDp, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.density);
        parcel.writeInt(this.densityDpi);
        parcel.writeFloat(this.scaledDensity);
        parcel.writeFloat(this.xdpi);
        parcel.writeInt(this.screenWidthDp);
        parcel.writeInt(this.screenHeightDp);
    }

    public DisplayMetricsInfo(float f, int i, float f2, float f3, int i2, int i3) {
        this.density = f;
        this.densityDpi = i;
        this.scaledDensity = f2;
        this.xdpi = f3;
        this.screenWidthDp = i2;
        this.screenHeightDp = i3;
    }

    public DisplayMetricsInfo(Parcel parcel) {
        this.density = parcel.readFloat();
        this.densityDpi = parcel.readInt();
        this.scaledDensity = parcel.readFloat();
        this.xdpi = parcel.readFloat();
        this.screenWidthDp = parcel.readInt();
        this.screenHeightDp = parcel.readInt();
    }
}
