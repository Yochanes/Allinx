package kotlin.p044io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/path/PathWalkOption;", "", "kotlin-stdlib-jdk7"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@WasExperimental
public final class PathWalkOption {

    /* JADX INFO: renamed from: a */
    public static final PathWalkOption f51631a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ PathWalkOption[] f51632b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f51633c;

    static {
        PathWalkOption pathWalkOption = new PathWalkOption("INCLUDE_DIRECTORIES", 0);
        PathWalkOption pathWalkOption2 = new PathWalkOption("BREADTH_FIRST", 1);
        f51631a = pathWalkOption2;
        PathWalkOption[] pathWalkOptionArr = {pathWalkOption, pathWalkOption2, new PathWalkOption("FOLLOW_LINKS", 2)};
        f51632b = pathWalkOptionArr;
        f51633c = EnumEntriesKt.m18563a(pathWalkOptionArr);
    }

    public static PathWalkOption valueOf(String str) {
        return (PathWalkOption) Enum.valueOf(PathWalkOption.class, str);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[]) f51632b.clone();
    }
}
