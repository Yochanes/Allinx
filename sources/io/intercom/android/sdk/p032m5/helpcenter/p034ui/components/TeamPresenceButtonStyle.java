package io.intercom.android.sdk.p032m5.helpcenter.p034ui.components;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TeamPresenceButtonStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TeamPresenceButtonStyle[] $VALUES;
    public static final TeamPresenceButtonStyle PRIMARY = new TeamPresenceButtonStyle("PRIMARY", 0);
    public static final TeamPresenceButtonStyle SECONDARY = new TeamPresenceButtonStyle("SECONDARY", 1);

    private static final /* synthetic */ TeamPresenceButtonStyle[] $values() {
        return new TeamPresenceButtonStyle[]{PRIMARY, SECONDARY};
    }

    static {
        TeamPresenceButtonStyle[] teamPresenceButtonStyleArr$values = $values();
        $VALUES = teamPresenceButtonStyleArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(teamPresenceButtonStyleArr$values);
    }

    private TeamPresenceButtonStyle(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TeamPresenceButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static TeamPresenceButtonStyle valueOf(String str) {
        return (TeamPresenceButtonStyle) Enum.valueOf(TeamPresenceButtonStyle.class, str);
    }

    public static TeamPresenceButtonStyle[] values() {
        return (TeamPresenceButtonStyle[]) $VALUES.clone();
    }
}
