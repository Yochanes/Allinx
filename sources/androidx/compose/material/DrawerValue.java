package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/DrawerValue;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DrawerValue {

    /* JADX INFO: renamed from: a */
    public static final DrawerValue f10591a;

    /* JADX INFO: renamed from: b */
    public static final DrawerValue f10592b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ DrawerValue[] f10593c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f10594d;

    static {
        DrawerValue drawerValue = new DrawerValue("Closed", 0);
        f10591a = drawerValue;
        DrawerValue drawerValue2 = new DrawerValue("Open", 1);
        f10592b = drawerValue2;
        DrawerValue[] drawerValueArr = {drawerValue, drawerValue2};
        f10593c = drawerValueArr;
        f10594d = EnumEntriesKt.m18563a(drawerValueArr);
    }

    public static DrawerValue valueOf(String str) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, str);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) f10593c.clone();
    }
}
