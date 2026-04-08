package org.jetbrains.anko;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/jetbrains/anko/ScreenSize;", "", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class ScreenSize {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ScreenSize[] f58165a = {new ScreenSize("SMALL", 0), new ScreenSize("NORMAL", 1), new ScreenSize("LARGE", 2), new ScreenSize("XLARGE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ScreenSize EF5;

    public static ScreenSize valueOf(String str) {
        return (ScreenSize) Enum.valueOf(ScreenSize.class, str);
    }

    public static ScreenSize[] values() {
        return (ScreenSize[]) f58165a.clone();
    }
}
