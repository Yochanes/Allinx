package io.intercom.android.sdk.api;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/api/Platform;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "Cordova", "ReactNative", "Flutter", "Native", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Platform {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Platform[] $VALUES;

    @NotNull
    private final String identifier;
    public static final Platform Cordova = new Platform("Cordova", 0, PlatformIdentifierUtilKt.CORDOVA_HEADER);
    public static final Platform ReactNative = new Platform("ReactNative", 1, PlatformIdentifierUtilKt.REACT_NATIVE_HEADER);
    public static final Platform Flutter = new Platform("Flutter", 2, PlatformIdentifierUtilKt.FLUTTER_HEADER);
    public static final Platform Native = new Platform("Native", 3, PlatformIdentifierUtilKt.NATIVE_SDK);

    private static final /* synthetic */ Platform[] $values() {
        return new Platform[]{Cordova, ReactNative, Flutter, Native};
    }

    static {
        Platform[] platformArr$values = $values();
        $VALUES = platformArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(platformArr$values);
    }

    private Platform(String str, int i, String str2) {
        this.identifier = str2;
    }

    @NotNull
    public static EnumEntries<Platform> getEntries() {
        return $ENTRIES;
    }

    public static Platform valueOf(String str) {
        return (Platform) Enum.valueOf(Platform.class, str);
    }

    public static Platform[] values() {
        return (Platform[]) $VALUES.clone();
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }
}
