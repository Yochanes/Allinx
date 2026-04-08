package com.engagelab.privates.push.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class NotificationLayout implements Parcelable {
    public static final Parcelable.Creator<NotificationLayout> CREATOR = new C2510a();
    private int contentViewId;
    private int iconResourceId;
    private int iconViewId;
    private int layoutId;
    private int timeViewId;
    private int titleViewId;

    /* JADX INFO: renamed from: com.engagelab.privates.push.api.NotificationLayout$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2510a implements Parcelable.Creator<NotificationLayout> {
        /* JADX INFO: renamed from: a */
        public NotificationLayout m13183a(Parcel parcel) {
            return new NotificationLayout(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NotificationLayout createFromParcel(Parcel parcel) {
            return m13183a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NotificationLayout[] newArray(int i) {
            return m13184a(i);
        }

        /* JADX INFO: renamed from: a */
        public NotificationLayout[] m13184a(int i) {
            return new NotificationLayout[i];
        }
    }

    public NotificationLayout() {
        this.layoutId = 0;
        this.iconViewId = 0;
        this.iconResourceId = 0;
        this.titleViewId = 0;
        this.contentViewId = 0;
        this.timeViewId = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getContentViewId() {
        return this.contentViewId;
    }

    public int getIconResourceId() {
        return this.iconResourceId;
    }

    public int getIconViewId() {
        return this.iconViewId;
    }

    public int getLayoutId() {
        return this.layoutId;
    }

    public int getTimeViewId() {
        return this.timeViewId;
    }

    public int getTitleViewId() {
        return this.titleViewId;
    }

    public NotificationLayout setContentViewId(int i) {
        this.contentViewId = i;
        return this;
    }

    public NotificationLayout setIconResourceId(int i) {
        this.iconResourceId = i;
        return this;
    }

    public NotificationLayout setIconViewId(int i) {
        this.iconViewId = i;
        return this;
    }

    public NotificationLayout setLayoutId(int i) {
        this.layoutId = i;
        return this;
    }

    public NotificationLayout setTimeViewId(int i) {
        this.timeViewId = i;
        return this;
    }

    public NotificationLayout setTitleViewId(int i) {
        this.titleViewId = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{\n  layoutId=");
        sb.append(this.layoutId);
        sb.append(",\n  iconViewId=");
        sb.append(this.iconViewId);
        sb.append(",\n  titleViewId=");
        sb.append(this.titleViewId);
        sb.append(",\n  contentViewId=");
        sb.append(this.contentViewId);
        sb.append(",\n  timeViewId=");
        return AbstractC0000a.m11h(this.timeViewId, "\n}", sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.layoutId);
        parcel.writeInt(this.iconViewId);
        parcel.writeInt(this.iconResourceId);
        parcel.writeInt(this.titleViewId);
        parcel.writeInt(this.contentViewId);
        parcel.writeInt(this.timeViewId);
    }

    public NotificationLayout(Parcel parcel) {
        this.layoutId = 0;
        this.iconViewId = 0;
        this.iconResourceId = 0;
        this.titleViewId = 0;
        this.contentViewId = 0;
        this.timeViewId = 0;
        this.layoutId = parcel.readInt();
        this.iconViewId = parcel.readInt();
        this.iconResourceId = parcel.readInt();
        this.titleViewId = parcel.readInt();
        this.contentViewId = parcel.readInt();
        this.timeViewId = parcel.readInt();
    }
}
