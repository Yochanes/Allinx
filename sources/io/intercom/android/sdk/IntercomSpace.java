package io.intercom.android.sdk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomSpace;", "", "<init>", "(Ljava/lang/String;I)V", "Home", "Messages", "HelpCenter", "Tickets", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class IntercomSpace {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IntercomSpace[] $VALUES;
    public static final IntercomSpace Home = new IntercomSpace("Home", 0);
    public static final IntercomSpace Messages = new IntercomSpace("Messages", 1);
    public static final IntercomSpace HelpCenter = new IntercomSpace("HelpCenter", 2);
    public static final IntercomSpace Tickets = new IntercomSpace("Tickets", 3);

    private static final /* synthetic */ IntercomSpace[] $values() {
        return new IntercomSpace[]{Home, Messages, HelpCenter, Tickets};
    }

    static {
        IntercomSpace[] intercomSpaceArr$values = $values();
        $VALUES = intercomSpaceArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(intercomSpaceArr$values);
    }

    private IntercomSpace(String str, int i) {
    }

    @NotNull
    public static EnumEntries<IntercomSpace> getEntries() {
        return $ENTRIES;
    }

    public static IntercomSpace valueOf(String str) {
        return (IntercomSpace) Enum.valueOf(IntercomSpace.class, str);
    }

    public static IntercomSpace[] values() {
        return (IntercomSpace[]) $VALUES.clone();
    }
}
