package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/SheetValue;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SheetValue {

    /* JADX INFO: renamed from: a */
    public static final SheetValue f14414a;

    /* JADX INFO: renamed from: b */
    public static final SheetValue f14415b;

    /* JADX INFO: renamed from: c */
    public static final SheetValue f14416c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ SheetValue[] f14417d;

    static {
        SheetValue sheetValue = new SheetValue("Hidden", 0);
        f14414a = sheetValue;
        SheetValue sheetValue2 = new SheetValue("Expanded", 1);
        f14415b = sheetValue2;
        SheetValue sheetValue3 = new SheetValue("PartiallyExpanded", 2);
        f14416c = sheetValue3;
        f14417d = new SheetValue[]{sheetValue, sheetValue2, sheetValue3};
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) f14417d.clone();
    }
}
