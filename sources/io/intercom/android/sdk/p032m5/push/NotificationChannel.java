package io.intercom.android.sdk.p032m5.push;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/push/NotificationChannel;", "", "channelName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getChannelName", "()Ljava/lang/String;", "CHAT_REPLIES_CHANNEL", "NEW_CHATS_CHANNEL", "ACTIONS_CHANNEL", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NotificationChannel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NotificationChannel[] $VALUES;

    @NotNull
    private final String channelName;
    public static final NotificationChannel CHAT_REPLIES_CHANNEL = new NotificationChannel("CHAT_REPLIES_CHANNEL", 0, "intercom_chat_replies_channel");
    public static final NotificationChannel NEW_CHATS_CHANNEL = new NotificationChannel("NEW_CHATS_CHANNEL", 1, "intercom_new_chats_channel");
    public static final NotificationChannel ACTIONS_CHANNEL = new NotificationChannel("ACTIONS_CHANNEL", 2, "intercom_actions_channel");

    private static final /* synthetic */ NotificationChannel[] $values() {
        return new NotificationChannel[]{CHAT_REPLIES_CHANNEL, NEW_CHATS_CHANNEL, ACTIONS_CHANNEL};
    }

    static {
        NotificationChannel[] notificationChannelArr$values = $values();
        $VALUES = notificationChannelArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(notificationChannelArr$values);
    }

    private NotificationChannel(String str, int i, String str2) {
        this.channelName = str2;
    }

    @NotNull
    public static EnumEntries<NotificationChannel> getEntries() {
        return $ENTRIES;
    }

    public static NotificationChannel valueOf(String str) {
        return (NotificationChannel) Enum.valueOf(NotificationChannel.class, str);
    }

    public static NotificationChannel[] values() {
        return (NotificationChannel[]) $VALUES.clone();
    }

    @NotNull
    public final String getChannelName() {
        return this.channelName;
    }
}
