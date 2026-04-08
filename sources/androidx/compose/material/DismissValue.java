package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/DismissValue;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DismissValue {

    /* JADX INFO: renamed from: a */
    public static final DismissValue f10462a;

    /* JADX INFO: renamed from: b */
    public static final DismissValue f10463b;

    /* JADX INFO: renamed from: c */
    public static final DismissValue f10464c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ DismissValue[] f10465d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f10466f;

    static {
        DismissValue dismissValue = new DismissValue("Default", 0);
        f10462a = dismissValue;
        DismissValue dismissValue2 = new DismissValue("DismissedToEnd", 1);
        f10463b = dismissValue2;
        DismissValue dismissValue3 = new DismissValue("DismissedToStart", 2);
        f10464c = dismissValue3;
        DismissValue[] dismissValueArr = {dismissValue, dismissValue2, dismissValue3};
        f10465d = dismissValueArr;
        f10466f = EnumEntriesKt.m18563a(dismissValueArr);
    }

    public static DismissValue valueOf(String str) {
        return (DismissValue) Enum.valueOf(DismissValue.class, str);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) f10465d.clone();
    }
}
