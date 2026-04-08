package com.exchange.allin.p024ui.widgets;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/widgets/TabSlotsEx;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class TabSlotsEx {

    /* JADX INFO: renamed from: a */
    public static final TabSlotsEx f41336a;

    /* JADX INFO: renamed from: b */
    public static final TabSlotsEx f41337b;

    /* JADX INFO: renamed from: c */
    public static final TabSlotsEx f41338c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ TabSlotsEx[] f41339d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f41340f;

    static {
        TabSlotsEx tabSlotsEx = new TabSlotsEx("Tabs", 0);
        f41336a = tabSlotsEx;
        TabSlotsEx tabSlotsEx2 = new TabSlotsEx("Divider", 1);
        f41337b = tabSlotsEx2;
        TabSlotsEx tabSlotsEx3 = new TabSlotsEx("Indicator", 2);
        f41338c = tabSlotsEx3;
        TabSlotsEx[] tabSlotsExArr = {tabSlotsEx, tabSlotsEx2, tabSlotsEx3};
        f41339d = tabSlotsExArr;
        f41340f = EnumEntriesKt.m18563a(tabSlotsExArr);
    }

    public static TabSlotsEx valueOf(String str) {
        return (TabSlotsEx) Enum.valueOf(TabSlotsEx.class, str);
    }

    public static TabSlotsEx[] values() {
        return (TabSlotsEx[]) f41339d.clone();
    }
}
