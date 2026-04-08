package org.jetbrains.anko;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/jetbrains/anko/UiMode;", "", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class UiMode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ UiMode[] f58166a = {new UiMode("NORMAL", 0), new UiMode("CAR", 1), new UiMode("DESK", 2), new UiMode("TELEVISION", 3), new UiMode("APPLIANCE", 4), new UiMode("WATCH", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    UiMode EF5;

    public static UiMode valueOf(String str) {
        return (UiMode) Enum.valueOf(UiMode.class, str);
    }

    public static UiMode[] values() {
        return (UiMode[]) f58166a.clone();
    }
}
