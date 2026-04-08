package com.king.ultraswiperefresh;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/king/ultraswiperefresh/NestedScrollMode;", "", "refresh_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class NestedScrollMode {

    /* JADX INFO: renamed from: a */
    public static final NestedScrollMode f43007a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ NestedScrollMode[] f43008b;

    static {
        NestedScrollMode nestedScrollMode = new NestedScrollMode("Translate", 0);
        f43007a = nestedScrollMode;
        f43008b = new NestedScrollMode[]{nestedScrollMode, new NestedScrollMode("FixedContent", 1), new NestedScrollMode("FixedBehind", 2), new NestedScrollMode("FixedFront", 3)};
    }

    public static NestedScrollMode valueOf(String str) {
        return (NestedScrollMode) Enum.valueOf(NestedScrollMode.class, str);
    }

    public static NestedScrollMode[] values() {
        return (NestedScrollMode[]) f43008b.clone();
    }
}
