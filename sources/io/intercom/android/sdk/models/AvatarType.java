package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/models/AvatarType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "FACEPILE", "LAYERED_BUBBLES", "LOGO", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AvatarType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AvatarType[] $VALUES;
    public static final AvatarType UNKNOWN = new AvatarType("UNKNOWN", 0);

    @SerializedName("facepile")
    public static final AvatarType FACEPILE = new AvatarType("FACEPILE", 1);

    @SerializedName("layered_bubbles")
    public static final AvatarType LAYERED_BUBBLES = new AvatarType("LAYERED_BUBBLES", 2);

    @SerializedName("logo")
    public static final AvatarType LOGO = new AvatarType("LOGO", 3);

    private static final /* synthetic */ AvatarType[] $values() {
        return new AvatarType[]{UNKNOWN, FACEPILE, LAYERED_BUBBLES, LOGO};
    }

    static {
        AvatarType[] avatarTypeArr$values = $values();
        $VALUES = avatarTypeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(avatarTypeArr$values);
    }

    private AvatarType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AvatarType> getEntries() {
        return $ENTRIES;
    }

    public static AvatarType valueOf(String str) {
        return (AvatarType) Enum.valueOf(AvatarType.class, str);
    }

    public static AvatarType[] values() {
        return (AvatarType[]) $VALUES.clone();
    }
}
