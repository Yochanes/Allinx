package com.engagelab.privates.push.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import com.engagelab.privates.common.log.MTCommonLog;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class CustomMessage implements Parcelable {
    public static final Parcelable.Creator<CustomMessage> CREATOR = new C2508a();
    private String content;
    private String contentType;
    private Bundle extras;
    private String messageId;
    private byte platform;
    private String platformMessageId;
    private String title;

    /* JADX INFO: renamed from: com.engagelab.privates.push.api.CustomMessage$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2508a implements Parcelable.Creator<CustomMessage> {
        /* JADX INFO: renamed from: a */
        public CustomMessage m13179a(Parcel parcel) {
            return new CustomMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CustomMessage createFromParcel(Parcel parcel) {
            return m13179a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CustomMessage[] newArray(int i) {
            return m13180a(i);
        }

        /* JADX INFO: renamed from: a */
        public CustomMessage[] m13180a(int i) {
            return new CustomMessage[i];
        }
    }

    public CustomMessage() {
        this.messageId = null;
        this.platform = (byte) 0;
        this.platformMessageId = null;
        this.title = null;
        this.content = null;
        this.contentType = null;
        this.extras = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContent() {
        return this.content;
    }

    public String getContentType() {
        return this.contentType;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public byte getPlatform() {
        return this.platform;
    }

    public String getPlatformMessageId() {
        return this.platformMessageId;
    }

    public String getTitle() {
        return this.title;
    }

    public CustomMessage setContent(String str) {
        this.content = str;
        return this;
    }

    public CustomMessage setContentType(String str) {
        this.contentType = str;
        return this;
    }

    public CustomMessage setExtras(Bundle bundle) {
        this.extras = bundle;
        return this;
    }

    public CustomMessage setMessageId(String str) {
        this.messageId = str;
        return this;
    }

    public CustomMessage setPlatform(byte b2) {
        this.platform = b2;
        return this;
    }

    public CustomMessage setPlatformMessageId(String str) {
        this.platformMessageId = str;
        return this;
    }

    public CustomMessage setTitle(String str) {
        this.title = str;
        return this;
    }

    public String toString() {
        return "\n{\n  messageId=" + this.messageId + ",\n  platform=" + ((int) this.platform) + ",\n  platformMessageId=" + this.platformMessageId + ",\n  title=" + this.title + ",\n  content=" + this.content + ",\n  contentType=" + this.contentType + ",\n  extras=" + MTCommonLog.toLogString(this.extras) + "\n}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.messageId);
        parcel.writeByte(this.platform);
        parcel.writeString(this.platformMessageId);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.contentType);
        parcel.writeBundle(this.extras);
    }

    public CustomMessage(Parcel parcel) {
        this.messageId = null;
        this.platform = (byte) 0;
        this.platformMessageId = null;
        this.title = null;
        this.content = null;
        this.contentType = null;
        this.extras = null;
        this.messageId = parcel.readString();
        this.platform = parcel.readByte();
        this.platformMessageId = parcel.readString();
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.contentType = parcel.readString();
        this.extras = parcel.readBundle();
    }
}
