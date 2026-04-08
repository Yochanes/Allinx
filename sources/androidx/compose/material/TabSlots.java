package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/TabSlots;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TabSlots {

    /* JADX INFO: renamed from: a */
    public static final TabSlots f11470a;

    /* JADX INFO: renamed from: b */
    public static final TabSlots f11471b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ TabSlots[] f11472c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f11473d;

    static {
        TabSlots tabSlots = new TabSlots("Tabs", 0);
        TabSlots tabSlots2 = new TabSlots("Divider", 1);
        f11470a = tabSlots2;
        TabSlots tabSlots3 = new TabSlots("Indicator", 2);
        f11471b = tabSlots3;
        TabSlots[] tabSlotsArr = {tabSlots, tabSlots2, tabSlots3};
        f11472c = tabSlotsArr;
        f11473d = EnumEntriesKt.m18563a(tabSlotsArr);
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) f11472c.clone();
    }
}
