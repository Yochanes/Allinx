package com.engagelab.privates.push.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.engagelab.privates.common.annotation.AllClass;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AllClass
public class NotificationMessage implements Parcelable {
    public static final Parcelable.Creator<NotificationMessage> CREATOR = new C2511a();
    public static final int NOTIFICATION_STYLE_BIG_PICTURE = 3;
    public static final int NOTIFICATION_STYLE_BIG_TEXT = 1;
    public static final int NOTIFICATION_STYLE_INBOX = 2;
    private int badge;
    private String bigPicture;
    private String bigText;
    private int builderId;
    private String category;
    private String channelId;
    private String content;
    private int defaults;
    private String displayForeground;
    private Bundle extras;
    private int importance;
    private String[] inbox;
    private String intentSsl;
    private String intentUri;
    private String largeIcon;
    private String messageId;
    private int notificationId;
    private String overrideMessageId;
    private byte platform;
    private String platformMessageId;
    private int priority;
    private String smallIcon;
    private String sound;
    private int style;
    private String title;

    /* JADX INFO: renamed from: com.engagelab.privates.push.api.NotificationMessage$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2511a implements Parcelable.Creator<NotificationMessage> {
        /* JADX INFO: renamed from: a */
        public NotificationMessage m13185a(Parcel parcel) {
            return new NotificationMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NotificationMessage createFromParcel(Parcel parcel) {
            return m13185a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NotificationMessage[] newArray(int i) {
            return m13186a(i);
        }

        /* JADX INFO: renamed from: a */
        public NotificationMessage[] m13186a(int i) {
            return new NotificationMessage[i];
        }
    }

    public NotificationMessage() {
        this.messageId = "";
        this.overrideMessageId = "";
        this.platform = (byte) 0;
        this.platformMessageId = "";
        this.notificationId = 0;
        this.smallIcon = "";
        this.largeIcon = "";
        this.title = "";
        this.content = "";
        this.extras = null;
        this.style = 0;
        this.bigText = "";
        this.inbox = null;
        this.bigPicture = "";
        this.priority = 0;
        this.importance = -1;
        this.defaults = -1;
        this.sound = "";
        this.channelId = "";
        this.intentUri = "";
        this.intentSsl = "";
        this.badge = 0;
        this.displayForeground = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getBadge() {
        return this.badge;
    }

    public String getBigPicture() {
        return this.bigPicture;
    }

    public String getBigText() {
        return this.bigText;
    }

    public int getBuilderId() {
        return this.builderId;
    }

    public String getCategory() {
        return this.category;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getContent() {
        return this.content;
    }

    public int getDefaults() {
        return this.defaults;
    }

    public String getDisplayForeground() {
        return this.displayForeground;
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public int getImportance() {
        return this.importance;
    }

    public String[] getInbox() {
        return this.inbox;
    }

    public String getIntentSsl() {
        return this.intentSsl;
    }

    public String getIntentUri() {
        return this.intentUri;
    }

    public String getLargeIcon() {
        return this.largeIcon;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getNotificationId() {
        return this.notificationId;
    }

    public String getOverrideMessageId() {
        return this.overrideMessageId;
    }

    public byte getPlatform() {
        return this.platform;
    }

    public String getPlatformMessageId() {
        return this.platformMessageId;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getSmallIcon() {
        return this.smallIcon;
    }

    public String getSound() {
        return this.sound;
    }

    public int getStyle() {
        return this.style;
    }

    public String getTitle() {
        return this.title;
    }

    public NotificationMessage setBadge(int i) {
        this.badge = i;
        return this;
    }

    public NotificationMessage setBigPicture(String str) {
        this.bigPicture = str;
        return this;
    }

    public NotificationMessage setBigText(String str) {
        this.bigText = str;
        return this;
    }

    public NotificationMessage setBuilderId(int i) {
        this.builderId = i;
        return this;
    }

    public NotificationMessage setCategory(String str) {
        this.category = str;
        return this;
    }

    public NotificationMessage setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public NotificationMessage setContent(String str) {
        this.content = str;
        return this;
    }

    public NotificationMessage setDefaults(int i) {
        this.defaults = i;
        return this;
    }

    public NotificationMessage setDisplayForeground(String str) {
        this.displayForeground = str;
        return this;
    }

    public NotificationMessage setExtras(Bundle bundle) {
        this.extras = bundle;
        return this;
    }

    public NotificationMessage setImportance(int i) {
        this.importance = i;
        return this;
    }

    public NotificationMessage setInbox(String[] strArr) {
        this.inbox = strArr;
        return this;
    }

    public NotificationMessage setIntentSsl(String str) {
        this.intentSsl = str;
        return this;
    }

    public NotificationMessage setIntentUri(String str) {
        this.intentUri = str;
        return this;
    }

    public NotificationMessage setLargeIcon(String str) {
        this.largeIcon = str;
        return this;
    }

    public NotificationMessage setMessageId(String str) {
        this.messageId = str;
        return this;
    }

    public NotificationMessage setNotificationId(int i) {
        this.notificationId = i;
        return this;
    }

    public NotificationMessage setOverrideMessageId(String str) {
        this.overrideMessageId = str;
        return this;
    }

    public NotificationMessage setPlatform(byte b2) {
        this.platform = b2;
        return this;
    }

    public NotificationMessage setPlatformMessageId(String str) {
        this.platformMessageId = str;
        return this;
    }

    public NotificationMessage setPriority(int i) {
        this.priority = i;
        return this;
    }

    public NotificationMessage setSmallIcon(String str) {
        this.smallIcon = str;
        return this;
    }

    public NotificationMessage setSound(String str) {
        this.sound = str;
        return this;
    }

    public NotificationMessage setStyle(int i) {
        this.style = i;
        return this;
    }

    public NotificationMessage setTitle(String str) {
        this.title = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n{\n  messageId=");
        sb.append(this.messageId);
        sb.append(",\n  overrideMessageId=");
        sb.append(this.overrideMessageId);
        sb.append(",\n  platform=");
        sb.append((int) this.platform);
        sb.append(",\n  platformMessageId='");
        sb.append(this.platformMessageId);
        sb.append(",\n  notificationId=");
        sb.append(this.notificationId);
        sb.append(",\n  smallIcon=");
        sb.append(this.smallIcon);
        sb.append(",\n  largeIcon=");
        sb.append(this.largeIcon);
        sb.append(",\n  title=");
        sb.append(this.title);
        sb.append(",\n  content=");
        sb.append(this.content);
        sb.append(",\n  extras=");
        sb.append(MTCommonLog.toLogString(this.extras));
        sb.append(",\n  layoutId=");
        sb.append(this.builderId);
        sb.append(",\n  style=");
        sb.append(this.style);
        sb.append(",\n  bigText=");
        sb.append(this.bigText);
        sb.append(",\n  inbox=");
        sb.append(Arrays.toString(this.inbox));
        sb.append(",\n  bigPicture=");
        sb.append(this.bigPicture);
        sb.append(",\n  priority=");
        sb.append(this.priority);
        sb.append(",\n  importance=");
        sb.append(this.importance);
        sb.append(",\n  defaults=");
        sb.append(this.defaults);
        sb.append(",\n  category=");
        sb.append(this.category);
        sb.append(",\n  sound=");
        sb.append(this.sound);
        sb.append(",\n  channelId=");
        sb.append(this.channelId);
        sb.append(",\n  intentUri=");
        sb.append(this.intentUri);
        sb.append(",\n  badge=");
        sb.append(this.badge);
        sb.append(",\n  displayForeground=");
        return AbstractC0000a.m19p(sb, this.displayForeground, ",\n}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.messageId);
        parcel.writeString(this.overrideMessageId);
        parcel.writeString(this.displayForeground);
        parcel.writeByte(this.platform);
        parcel.writeString(this.platformMessageId);
        parcel.writeInt(this.notificationId);
        parcel.writeString(this.smallIcon);
        parcel.writeString(this.largeIcon);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeBundle(this.extras);
        parcel.writeInt(this.builderId);
        parcel.writeInt(this.style);
        parcel.writeString(this.bigText);
        parcel.writeStringArray(this.inbox);
        parcel.writeString(this.bigPicture);
        parcel.writeInt(this.priority);
        parcel.writeInt(this.importance);
        parcel.writeInt(this.defaults);
        parcel.writeString(this.category);
        parcel.writeString(this.sound);
        parcel.writeString(this.channelId);
        parcel.writeString(this.intentUri);
        parcel.writeInt(this.badge);
    }

    public NotificationMessage(Parcel parcel) {
        this.messageId = "";
        this.overrideMessageId = "";
        this.platform = (byte) 0;
        this.platformMessageId = "";
        this.notificationId = 0;
        this.smallIcon = "";
        this.largeIcon = "";
        this.title = "";
        this.content = "";
        this.extras = null;
        this.style = 0;
        this.bigText = "";
        this.inbox = null;
        this.bigPicture = "";
        this.priority = 0;
        this.importance = -1;
        this.defaults = -1;
        this.sound = "";
        this.channelId = "";
        this.intentUri = "";
        this.intentSsl = "";
        this.badge = 0;
        this.displayForeground = "";
        this.messageId = parcel.readString();
        this.overrideMessageId = parcel.readString();
        this.displayForeground = parcel.readString();
        this.platform = parcel.readByte();
        this.platformMessageId = parcel.readString();
        this.notificationId = parcel.readInt();
        this.smallIcon = parcel.readString();
        this.largeIcon = parcel.readString();
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.extras = parcel.readBundle();
        this.builderId = parcel.readInt();
        this.style = parcel.readInt();
        this.bigText = parcel.readString();
        this.inbox = parcel.createStringArray();
        this.bigPicture = parcel.readString();
        this.priority = parcel.readInt();
        this.importance = parcel.readInt();
        this.defaults = parcel.readInt();
        this.category = parcel.readString();
        this.sound = parcel.readString();
        this.channelId = parcel.readString();
        this.intentUri = parcel.readString();
        this.badge = parcel.readInt();
    }
}
