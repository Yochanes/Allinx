package com.chiclaim.android.downloader;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/chiclaim/android/downloader/UpgradeDialogInfo;", "Landroid/os/Parcelable;", "CREATOR", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class UpgradeDialogInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public String f35088a;

    /* JADX INFO: renamed from: b */
    public String f35089b;

    /* JADX INFO: renamed from: c */
    public String f35090c;

    /* JADX INFO: renamed from: d */
    public String f35091d;

    /* JADX INFO: renamed from: f */
    public String f35092f;

    /* JADX INFO: renamed from: g */
    public boolean f35093g;

    /* JADX INFO: renamed from: i */
    public int f35094i;

    /* JADX INFO: renamed from: j */
    public String f35095j;

    /* JADX INFO: renamed from: n */
    public boolean f35096n;

    /* JADX INFO: renamed from: o */
    public boolean f35097o;

    /* JADX INFO: renamed from: p */
    public boolean f35098p;

    /* JADX INFO: renamed from: com.chiclaim.android.downloader.UpgradeDialogInfo$CREATOR, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcom/chiclaim/android/downloader/UpgradeDialogInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/chiclaim/android/downloader/UpgradeDialogInfo;", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
    public static final class Companion implements Parcelable.Creator<UpgradeDialogInfo> {
        @Override // android.os.Parcelable.Creator
        public final UpgradeDialogInfo createFromParcel(Parcel parcel) {
            Intrinsics.m18599g(parcel, "parcel");
            UpgradeDialogInfo upgradeDialogInfo = new UpgradeDialogInfo();
            upgradeDialogInfo.f35094i = -1;
            upgradeDialogInfo.f35097o = true;
            upgradeDialogInfo.f35098p = true;
            upgradeDialogInfo.f35088a = parcel.readString();
            upgradeDialogInfo.f35089b = parcel.readString();
            upgradeDialogInfo.f35090c = parcel.readString();
            upgradeDialogInfo.f35091d = parcel.readString();
            upgradeDialogInfo.f35092f = parcel.readString();
            upgradeDialogInfo.f35093g = parcel.readInt() != 0;
            upgradeDialogInfo.f35094i = parcel.readInt();
            upgradeDialogInfo.f35095j = parcel.readString();
            upgradeDialogInfo.f35096n = parcel.readInt() != 0;
            upgradeDialogInfo.f35097o = parcel.readInt() != 0;
            upgradeDialogInfo.f35098p = parcel.readInt() != 0;
            return upgradeDialogInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final UpgradeDialogInfo[] newArray(int i) {
            return new UpgradeDialogInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.m18599g(parcel, "parcel");
        parcel.writeString(this.f35088a);
        parcel.writeString(this.f35089b);
        parcel.writeString(this.f35090c);
        parcel.writeString(this.f35091d);
        parcel.writeString(this.f35092f);
        parcel.writeInt(this.f35093g ? 1 : 0);
        parcel.writeInt(this.f35094i);
        parcel.writeString(this.f35095j);
        parcel.writeInt(this.f35096n ? 1 : 0);
        parcel.writeInt(this.f35097o ? 1 : 0);
        parcel.writeInt(this.f35098p ? 1 : 0);
    }
}
