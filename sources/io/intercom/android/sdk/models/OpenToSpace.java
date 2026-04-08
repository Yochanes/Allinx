package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/models/OpenToSpace;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "MESSAGES", "CONVERSATION", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class OpenToSpace {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OpenToSpace[] $VALUES;

    @SerializedName("home")
    public static final OpenToSpace HOME = new OpenToSpace("HOME", 0);

    @SerializedName("messages")
    public static final OpenToSpace MESSAGES = new OpenToSpace("MESSAGES", 1);

    @SerializedName("conversation")
    public static final OpenToSpace CONVERSATION = new OpenToSpace("CONVERSATION", 2);

    private static final /* synthetic */ OpenToSpace[] $values() {
        return new OpenToSpace[]{HOME, MESSAGES, CONVERSATION};
    }

    static {
        OpenToSpace[] openToSpaceArr$values = $values();
        $VALUES = openToSpaceArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(openToSpaceArr$values);
    }

    private OpenToSpace(String str, int i) {
    }

    @NotNull
    public static EnumEntries<OpenToSpace> getEntries() {
        return $ENTRIES;
    }

    public static OpenToSpace valueOf(String str) {
        return (OpenToSpace) Enum.valueOf(OpenToSpace.class, str);
    }

    public static OpenToSpace[] values() {
        return (OpenToSpace[]) $VALUES.clone();
    }
}
