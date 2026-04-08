package kotlin.p044io;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/FileWalkDirection;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class FileWalkDirection {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ FileWalkDirection[] f51618a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f51619b;

    static {
        FileWalkDirection[] fileWalkDirectionArr = {new FileWalkDirection("TOP_DOWN", 0), new FileWalkDirection("BOTTOM_UP", 1)};
        f51618a = fileWalkDirectionArr;
        f51619b = EnumEntriesKt.m18563a(fileWalkDirectionArr);
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f51618a.clone();
    }
}
