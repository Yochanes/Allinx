package io.intercom.android.sdk.survey;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/survey/CloseEventTrigger;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSE_BUTTON", "CTA", "SECONDARY_CTA_EXTERNAL_LINK", "SECONDARY_CTA_DEEP_LINK", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CloseEventTrigger {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CloseEventTrigger[] $VALUES;
    public static final CloseEventTrigger CLOSE_BUTTON = new CloseEventTrigger("CLOSE_BUTTON", 0);
    public static final CloseEventTrigger CTA = new CloseEventTrigger("CTA", 1);
    public static final CloseEventTrigger SECONDARY_CTA_EXTERNAL_LINK = new CloseEventTrigger("SECONDARY_CTA_EXTERNAL_LINK", 2);
    public static final CloseEventTrigger SECONDARY_CTA_DEEP_LINK = new CloseEventTrigger("SECONDARY_CTA_DEEP_LINK", 3);

    private static final /* synthetic */ CloseEventTrigger[] $values() {
        return new CloseEventTrigger[]{CLOSE_BUTTON, CTA, SECONDARY_CTA_EXTERNAL_LINK, SECONDARY_CTA_DEEP_LINK};
    }

    static {
        CloseEventTrigger[] closeEventTriggerArr$values = $values();
        $VALUES = closeEventTriggerArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(closeEventTriggerArr$values);
    }

    private CloseEventTrigger(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CloseEventTrigger> getEntries() {
        return $ENTRIES;
    }

    public static CloseEventTrigger valueOf(String str) {
        return (CloseEventTrigger) Enum.valueOf(CloseEventTrigger.class, str);
    }

    public static CloseEventTrigger[] values() {
        return (CloseEventTrigger[]) $VALUES.clone();
    }
}
