package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class LazyThreadSafetyMode {

    /* JADX INFO: renamed from: a */
    public static final LazyThreadSafetyMode f51421a;

    /* JADX INFO: renamed from: b */
    public static final LazyThreadSafetyMode f51422b;

    /* JADX INFO: renamed from: c */
    public static final LazyThreadSafetyMode f51423c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ LazyThreadSafetyMode[] f51424d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f51425f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        f51421a = lazyThreadSafetyMode;
        LazyThreadSafetyMode lazyThreadSafetyMode2 = new LazyThreadSafetyMode("PUBLICATION", 1);
        f51422b = lazyThreadSafetyMode2;
        LazyThreadSafetyMode lazyThreadSafetyMode3 = new LazyThreadSafetyMode("NONE", 2);
        f51423c = lazyThreadSafetyMode3;
        LazyThreadSafetyMode[] lazyThreadSafetyModeArr = {lazyThreadSafetyMode, lazyThreadSafetyMode2, lazyThreadSafetyMode3};
        f51424d = lazyThreadSafetyModeArr;
        f51425f = EnumEntriesKt.m18563a(lazyThreadSafetyModeArr);
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f51424d.clone();
    }
}
