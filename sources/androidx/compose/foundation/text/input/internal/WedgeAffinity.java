package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class WedgeAffinity {

    /* JADX INFO: renamed from: a */
    public static final WedgeAffinity f9181a;

    /* JADX INFO: renamed from: b */
    public static final WedgeAffinity f9182b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ WedgeAffinity[] f9183c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f9184d;

    static {
        WedgeAffinity wedgeAffinity = new WedgeAffinity("Start", 0);
        f9181a = wedgeAffinity;
        WedgeAffinity wedgeAffinity2 = new WedgeAffinity("End", 1);
        f9182b = wedgeAffinity2;
        WedgeAffinity[] wedgeAffinityArr = {wedgeAffinity, wedgeAffinity2};
        f9183c = wedgeAffinityArr;
        f9184d = EnumEntriesKt.m18563a(wedgeAffinityArr);
    }

    public static WedgeAffinity valueOf(String str) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, str);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) f9183c.clone();
    }
}
