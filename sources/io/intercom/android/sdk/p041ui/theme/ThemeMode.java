package io.intercom.android.sdk.p041ui.theme;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/ui/theme/ThemeMode;", "", "<init>", "(Ljava/lang/String;I)V", "SYSTEM", "LIGHT", "DARK", "intercom-sdk-ui_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ThemeMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ThemeMode[] $VALUES;
    public static final ThemeMode SYSTEM = new ThemeMode("SYSTEM", 0);
    public static final ThemeMode LIGHT = new ThemeMode("LIGHT", 1);
    public static final ThemeMode DARK = new ThemeMode("DARK", 2);

    private static final /* synthetic */ ThemeMode[] $values() {
        return new ThemeMode[]{SYSTEM, LIGHT, DARK};
    }

    static {
        ThemeMode[] themeModeArr$values = $values();
        $VALUES = themeModeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(themeModeArr$values);
    }

    private ThemeMode(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ThemeMode> getEntries() {
        return $ENTRIES;
    }

    public static ThemeMode valueOf(String str) {
        return (ThemeMode) Enum.valueOf(ThemeMode.class, str);
    }

    public static ThemeMode[] values() {
        return (ThemeMode[]) $VALUES.clone();
    }
}
