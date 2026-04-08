package com.king.ultraswiperefresh;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/king/ultraswiperefresh/UltraSwipeFooterState;", "", "refresh_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class UltraSwipeFooterState {

    /* JADX INFO: renamed from: a */
    public static final UltraSwipeFooterState f43009a;

    /* JADX INFO: renamed from: b */
    public static final UltraSwipeFooterState f43010b;

    /* JADX INFO: renamed from: c */
    public static final UltraSwipeFooterState f43011c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ UltraSwipeFooterState[] f43012d;

    static {
        UltraSwipeFooterState ultraSwipeFooterState = new UltraSwipeFooterState("PullUpToLoad", 0);
        f43009a = ultraSwipeFooterState;
        UltraSwipeFooterState ultraSwipeFooterState2 = new UltraSwipeFooterState("ReleaseToLoad", 1);
        f43010b = ultraSwipeFooterState2;
        UltraSwipeFooterState ultraSwipeFooterState3 = new UltraSwipeFooterState("Loading", 2);
        f43011c = ultraSwipeFooterState3;
        f43012d = new UltraSwipeFooterState[]{ultraSwipeFooterState, ultraSwipeFooterState2, ultraSwipeFooterState3};
    }

    public static UltraSwipeFooterState valueOf(String str) {
        return (UltraSwipeFooterState) Enum.valueOf(UltraSwipeFooterState.class, str);
    }

    public static UltraSwipeFooterState[] values() {
        return (UltraSwipeFooterState[]) f43012d.clone();
    }
}
