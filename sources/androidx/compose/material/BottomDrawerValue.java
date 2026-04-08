package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/BottomDrawerValue;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BottomDrawerValue {

    /* JADX INFO: renamed from: a */
    public static final BottomDrawerValue f10239a;

    /* JADX INFO: renamed from: b */
    public static final BottomDrawerValue f10240b;

    /* JADX INFO: renamed from: c */
    public static final BottomDrawerValue f10241c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ BottomDrawerValue[] f10242d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f10243f;

    static {
        BottomDrawerValue bottomDrawerValue = new BottomDrawerValue("Closed", 0);
        f10239a = bottomDrawerValue;
        BottomDrawerValue bottomDrawerValue2 = new BottomDrawerValue("Open", 1);
        f10240b = bottomDrawerValue2;
        BottomDrawerValue bottomDrawerValue3 = new BottomDrawerValue("Expanded", 2);
        f10241c = bottomDrawerValue3;
        BottomDrawerValue[] bottomDrawerValueArr = {bottomDrawerValue, bottomDrawerValue2, bottomDrawerValue3};
        f10242d = bottomDrawerValueArr;
        f10243f = EnumEntriesKt.m18563a(bottomDrawerValueArr);
    }

    public static BottomDrawerValue valueOf(String str) {
        return (BottomDrawerValue) Enum.valueOf(BottomDrawerValue.class, str);
    }

    public static BottomDrawerValue[] values() {
        return (BottomDrawerValue[]) f10242d.clone();
    }
}
