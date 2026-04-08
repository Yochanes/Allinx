package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/TabSlots;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class TabSlots {

    /* JADX INFO: renamed from: a */
    public static final TabSlots f14824a;

    /* JADX INFO: renamed from: b */
    public static final TabSlots f14825b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ TabSlots[] f14826c;

    /* JADX INFO: Fake field, exist only in values array */
    TabSlots EF0;

    static {
        TabSlots tabSlots = new TabSlots("Tabs", 0);
        TabSlots tabSlots2 = new TabSlots("Divider", 1);
        f14824a = tabSlots2;
        TabSlots tabSlots3 = new TabSlots("Indicator", 2);
        f14825b = tabSlots3;
        f14826c = new TabSlots[]{tabSlots, tabSlots2, tabSlots3};
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) f14826c.clone();
    }
}
