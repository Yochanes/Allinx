package com.king.ultraswiperefresh;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/king/ultraswiperefresh/UltraSwipeHeaderState;", "", "refresh_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class UltraSwipeHeaderState {

    /* JADX INFO: renamed from: a */
    public static final UltraSwipeHeaderState f43013a;

    /* JADX INFO: renamed from: b */
    public static final UltraSwipeHeaderState f43014b;

    /* JADX INFO: renamed from: c */
    public static final UltraSwipeHeaderState f43015c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ UltraSwipeHeaderState[] f43016d;

    static {
        UltraSwipeHeaderState ultraSwipeHeaderState = new UltraSwipeHeaderState("PullDownToRefresh", 0);
        f43013a = ultraSwipeHeaderState;
        UltraSwipeHeaderState ultraSwipeHeaderState2 = new UltraSwipeHeaderState("ReleaseToRefresh", 1);
        f43014b = ultraSwipeHeaderState2;
        UltraSwipeHeaderState ultraSwipeHeaderState3 = new UltraSwipeHeaderState("Refreshing", 2);
        f43015c = ultraSwipeHeaderState3;
        f43016d = new UltraSwipeHeaderState[]{ultraSwipeHeaderState, ultraSwipeHeaderState2, ultraSwipeHeaderState3};
    }

    public static UltraSwipeHeaderState valueOf(String str) {
        return (UltraSwipeHeaderState) Enum.valueOf(UltraSwipeHeaderState.class, str);
    }

    public static UltraSwipeHeaderState[] values() {
        return (UltraSwipeHeaderState[]) f43016d.clone();
    }
}
