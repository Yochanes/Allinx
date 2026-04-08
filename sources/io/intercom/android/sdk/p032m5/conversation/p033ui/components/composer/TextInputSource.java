package io.intercom.android.sdk.p032m5.conversation.p033ui.components.composer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/composer/TextInputSource;", "", "<init>", "(Ljava/lang/String;I)V", "KEYBOARD", "VOICE_ONLY", "EDITED_VOICE_INPUT", "CLEARED_VOICE_INPUT", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TextInputSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextInputSource[] $VALUES;
    public static final TextInputSource KEYBOARD = new TextInputSource("KEYBOARD", 0);
    public static final TextInputSource VOICE_ONLY = new TextInputSource("VOICE_ONLY", 1);
    public static final TextInputSource EDITED_VOICE_INPUT = new TextInputSource("EDITED_VOICE_INPUT", 2);
    public static final TextInputSource CLEARED_VOICE_INPUT = new TextInputSource("CLEARED_VOICE_INPUT", 3);

    private static final /* synthetic */ TextInputSource[] $values() {
        return new TextInputSource[]{KEYBOARD, VOICE_ONLY, EDITED_VOICE_INPUT, CLEARED_VOICE_INPUT};
    }

    static {
        TextInputSource[] textInputSourceArr$values = $values();
        $VALUES = textInputSourceArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(textInputSourceArr$values);
    }

    private TextInputSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TextInputSource> getEntries() {
        return $ENTRIES;
    }

    public static TextInputSource valueOf(String str) {
        return (TextInputSource) Enum.valueOf(TextInputSource.class, str);
    }

    public static TextInputSource[] values() {
        return (TextInputSource[]) $VALUES.clone();
    }
}
