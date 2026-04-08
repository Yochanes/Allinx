package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SelectionHandleAnchor {

    /* JADX INFO: renamed from: a */
    public static final SelectionHandleAnchor f9768a;

    /* JADX INFO: renamed from: b */
    public static final SelectionHandleAnchor f9769b;

    /* JADX INFO: renamed from: c */
    public static final SelectionHandleAnchor f9770c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ SelectionHandleAnchor[] f9771d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f9772f;

    static {
        SelectionHandleAnchor selectionHandleAnchor = new SelectionHandleAnchor("Left", 0);
        f9768a = selectionHandleAnchor;
        SelectionHandleAnchor selectionHandleAnchor2 = new SelectionHandleAnchor("Middle", 1);
        f9769b = selectionHandleAnchor2;
        SelectionHandleAnchor selectionHandleAnchor3 = new SelectionHandleAnchor("Right", 2);
        f9770c = selectionHandleAnchor3;
        SelectionHandleAnchor[] selectionHandleAnchorArr = {selectionHandleAnchor, selectionHandleAnchor2, selectionHandleAnchor3};
        f9771d = selectionHandleAnchorArr;
        f9772f = EnumEntriesKt.m18563a(selectionHandleAnchorArr);
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) f9771d.clone();
    }
}
