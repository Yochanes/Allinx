package androidx.compose.p013ui.focus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CustomDestinationResult {

    /* JADX INFO: renamed from: a */
    public static final CustomDestinationResult f17429a;

    /* JADX INFO: renamed from: b */
    public static final CustomDestinationResult f17430b;

    /* JADX INFO: renamed from: c */
    public static final CustomDestinationResult f17431c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ CustomDestinationResult[] f17432d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f17433f;

    static {
        CustomDestinationResult customDestinationResult = new CustomDestinationResult("None", 0);
        f17429a = customDestinationResult;
        CustomDestinationResult customDestinationResult2 = new CustomDestinationResult("Cancelled", 1);
        f17430b = customDestinationResult2;
        CustomDestinationResult customDestinationResult3 = new CustomDestinationResult("Redirected", 2);
        f17431c = customDestinationResult3;
        CustomDestinationResult[] customDestinationResultArr = {customDestinationResult, customDestinationResult2, customDestinationResult3, new CustomDestinationResult("RedirectCancelled", 3)};
        f17432d = customDestinationResultArr;
        f17433f = EnumEntriesKt.m18563a(customDestinationResultArr);
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) f17432d.clone();
    }
}
