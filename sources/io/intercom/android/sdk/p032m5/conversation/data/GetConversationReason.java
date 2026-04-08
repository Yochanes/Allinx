package io.intercom.android.sdk.p032m5.conversation.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_COMMENT", "NEXUS_CONNECTED", "NETWORK_CONNECTED", "OPEN_CONVERSATION", "POLLING", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class GetConversationReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GetConversationReason[] $VALUES;
    public static final GetConversationReason NEW_COMMENT = new GetConversationReason("NEW_COMMENT", 0);
    public static final GetConversationReason NEXUS_CONNECTED = new GetConversationReason("NEXUS_CONNECTED", 1);
    public static final GetConversationReason NETWORK_CONNECTED = new GetConversationReason("NETWORK_CONNECTED", 2);
    public static final GetConversationReason OPEN_CONVERSATION = new GetConversationReason("OPEN_CONVERSATION", 3);
    public static final GetConversationReason POLLING = new GetConversationReason("POLLING", 4);

    private static final /* synthetic */ GetConversationReason[] $values() {
        return new GetConversationReason[]{NEW_COMMENT, NEXUS_CONNECTED, NETWORK_CONNECTED, OPEN_CONVERSATION, POLLING};
    }

    static {
        GetConversationReason[] getConversationReasonArr$values = $values();
        $VALUES = getConversationReasonArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(getConversationReasonArr$values);
    }

    private GetConversationReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<GetConversationReason> getEntries() {
        return $ENTRIES;
    }

    public static GetConversationReason valueOf(String str) {
        return (GetConversationReason) Enum.valueOf(GetConversationReason.class, str);
    }

    public static GetConversationReason[] values() {
        return (GetConversationReason[]) $VALUES.clone();
    }
}
