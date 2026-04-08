package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/models/HeaderBackdropType;", "", "<init>", "(Ljava/lang/String;I)V", "SOLID", "COLORS", "IMAGE", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class HeaderBackdropType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HeaderBackdropType[] $VALUES;

    @SerializedName("solid")
    public static final HeaderBackdropType SOLID = new HeaderBackdropType("SOLID", 0);

    @SerializedName("colors")
    public static final HeaderBackdropType COLORS = new HeaderBackdropType("COLORS", 1);

    @SerializedName(AppearanceType.IMAGE)
    public static final HeaderBackdropType IMAGE = new HeaderBackdropType("IMAGE", 2);

    private static final /* synthetic */ HeaderBackdropType[] $values() {
        return new HeaderBackdropType[]{SOLID, COLORS, IMAGE};
    }

    static {
        HeaderBackdropType[] headerBackdropTypeArr$values = $values();
        $VALUES = headerBackdropTypeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(headerBackdropTypeArr$values);
    }

    private HeaderBackdropType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<HeaderBackdropType> getEntries() {
        return $ENTRIES;
    }

    public static HeaderBackdropType valueOf(String str) {
        return (HeaderBackdropType) Enum.valueOf(HeaderBackdropType.class, str);
    }

    public static HeaderBackdropType[] values() {
        return (HeaderBackdropType[]) $VALUES.clone();
    }
}
