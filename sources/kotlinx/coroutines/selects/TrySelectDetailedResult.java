package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TrySelectDetailedResult {

    /* JADX INFO: renamed from: a */
    public static final TrySelectDetailedResult f56534a;

    /* JADX INFO: renamed from: b */
    public static final TrySelectDetailedResult f56535b;

    /* JADX INFO: renamed from: c */
    public static final TrySelectDetailedResult f56536c;

    /* JADX INFO: renamed from: d */
    public static final TrySelectDetailedResult f56537d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ TrySelectDetailedResult[] f56538f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f56539g;

    static {
        TrySelectDetailedResult trySelectDetailedResult = new TrySelectDetailedResult("SUCCESSFUL", 0);
        f56534a = trySelectDetailedResult;
        TrySelectDetailedResult trySelectDetailedResult2 = new TrySelectDetailedResult("REREGISTER", 1);
        f56535b = trySelectDetailedResult2;
        TrySelectDetailedResult trySelectDetailedResult3 = new TrySelectDetailedResult("CANCELLED", 2);
        f56536c = trySelectDetailedResult3;
        TrySelectDetailedResult trySelectDetailedResult4 = new TrySelectDetailedResult("ALREADY_SELECTED", 3);
        f56537d = trySelectDetailedResult4;
        TrySelectDetailedResult[] trySelectDetailedResultArr = {trySelectDetailedResult, trySelectDetailedResult2, trySelectDetailedResult3, trySelectDetailedResult4};
        f56538f = trySelectDetailedResultArr;
        f56539g = EnumEntriesKt.m18563a(trySelectDetailedResultArr);
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) f56538f.clone();
    }
}
