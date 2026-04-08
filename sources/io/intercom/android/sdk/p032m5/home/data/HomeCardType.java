package io.intercom.android.sdk.p032m5.home.data;

import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCardType;", "", "<init>", "(Ljava/lang/String;I)V", "SPACES", "RECENT_CONVERSATION", "NEW_CONVERSATION", "HELP_CENTER", "EXTERNAL_LINKS", "MESSENGER_APP", "RECENT_TICKETS", "TICKET_LINKS", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class HomeCardType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HomeCardType[] $VALUES;

    @SerializedName("spaces")
    public static final HomeCardType SPACES = new HomeCardType("SPACES", 0);

    @SerializedName(MetricTracker.Object.RECENT_CONVERSATION)
    public static final HomeCardType RECENT_CONVERSATION = new HomeCardType("RECENT_CONVERSATION", 1);

    @SerializedName("new_conversation")
    public static final HomeCardType NEW_CONVERSATION = new HomeCardType("NEW_CONVERSATION", 2);

    @SerializedName(MetricTracker.Object.HELP_CENTER)
    public static final HomeCardType HELP_CENTER = new HomeCardType("HELP_CENTER", 3);

    @SerializedName("external_links")
    public static final HomeCardType EXTERNAL_LINKS = new HomeCardType("EXTERNAL_LINKS", 4);

    @SerializedName("messenger_app")
    public static final HomeCardType MESSENGER_APP = new HomeCardType("MESSENGER_APP", 5);

    @SerializedName(MetricTracker.Object.RECENT_TICKET)
    public static final HomeCardType RECENT_TICKETS = new HomeCardType("RECENT_TICKETS", 6);

    @SerializedName("ticket_links")
    public static final HomeCardType TICKET_LINKS = new HomeCardType("TICKET_LINKS", 7);

    private static final /* synthetic */ HomeCardType[] $values() {
        return new HomeCardType[]{SPACES, RECENT_CONVERSATION, NEW_CONVERSATION, HELP_CENTER, EXTERNAL_LINKS, MESSENGER_APP, RECENT_TICKETS, TICKET_LINKS};
    }

    static {
        HomeCardType[] homeCardTypeArr$values = $values();
        $VALUES = homeCardTypeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(homeCardTypeArr$values);
    }

    private HomeCardType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<HomeCardType> getEntries() {
        return $ENTRIES;
    }

    public static HomeCardType valueOf(String str) {
        return (HomeCardType) Enum.valueOf(HomeCardType.class, str);
    }

    public static HomeCardType[] values() {
        return (HomeCardType[]) $VALUES.clone();
    }
}
