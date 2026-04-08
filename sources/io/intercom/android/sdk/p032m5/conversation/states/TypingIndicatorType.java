package io.intercom.android.sdk.p032m5.conversation.states;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TypingIndicatorType;", "", "<init>", "(Ljava/lang/String;I)V", "ADMIN", "NONE", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TypingIndicatorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TypingIndicatorType[] $VALUES;
    public static final TypingIndicatorType ADMIN = new TypingIndicatorType("ADMIN", 0);
    public static final TypingIndicatorType NONE = new TypingIndicatorType("NONE", 1);

    private static final /* synthetic */ TypingIndicatorType[] $values() {
        return new TypingIndicatorType[]{ADMIN, NONE};
    }

    static {
        TypingIndicatorType[] typingIndicatorTypeArr$values = $values();
        $VALUES = typingIndicatorTypeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(typingIndicatorTypeArr$values);
    }

    private TypingIndicatorType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TypingIndicatorType> getEntries() {
        return $ENTRIES;
    }

    public static TypingIndicatorType valueOf(String str) {
        return (TypingIndicatorType) Enum.valueOf(TypingIndicatorType.class, str);
    }

    public static TypingIndicatorType[] values() {
        return (TypingIndicatorType[]) $VALUES.clone();
    }
}
