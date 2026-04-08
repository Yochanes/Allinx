package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/DeprecationLevel;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class DeprecationLevel {

    /* JADX INFO: renamed from: a */
    public static final DeprecationLevel f51412a;

    /* JADX INFO: renamed from: b */
    public static final DeprecationLevel f51413b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ DeprecationLevel[] f51414c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f51415d;

    static {
        DeprecationLevel deprecationLevel = new DeprecationLevel("WARNING", 0);
        f51412a = deprecationLevel;
        DeprecationLevel deprecationLevel2 = new DeprecationLevel("ERROR", 1);
        f51413b = deprecationLevel2;
        DeprecationLevel[] deprecationLevelArr = {deprecationLevel, deprecationLevel2, new DeprecationLevel("HIDDEN", 2)};
        f51414c = deprecationLevelArr;
        f51415d = EnumEntriesKt.m18563a(deprecationLevelArr);
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f51414c.clone();
    }
}
