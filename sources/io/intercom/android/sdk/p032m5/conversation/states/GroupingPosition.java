package io.intercom.android.sdk.p032m5.conversation.states;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "", "<init>", "(Ljava/lang/String;I)V", "STANDALONE", "TOP", "MIDDLE", "BOTTOM", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class GroupingPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GroupingPosition[] $VALUES;
    public static final GroupingPosition STANDALONE = new GroupingPosition("STANDALONE", 0);
    public static final GroupingPosition TOP = new GroupingPosition("TOP", 1);
    public static final GroupingPosition MIDDLE = new GroupingPosition("MIDDLE", 2);
    public static final GroupingPosition BOTTOM = new GroupingPosition("BOTTOM", 3);

    private static final /* synthetic */ GroupingPosition[] $values() {
        return new GroupingPosition[]{STANDALONE, TOP, MIDDLE, BOTTOM};
    }

    static {
        GroupingPosition[] groupingPositionArr$values = $values();
        $VALUES = groupingPositionArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(groupingPositionArr$values);
    }

    private GroupingPosition(String str, int i) {
    }

    @NotNull
    public static EnumEntries<GroupingPosition> getEntries() {
        return $ENTRIES;
    }

    public static GroupingPosition valueOf(String str) {
        return (GroupingPosition) Enum.valueOf(GroupingPosition.class, str);
    }

    public static GroupingPosition[] values() {
        return (GroupingPosition[]) $VALUES.clone();
    }
}
