package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/IntrinsicMinMax;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class IntrinsicMinMax {

    /* JADX INFO: renamed from: a */
    public static final IntrinsicMinMax f18456a;

    /* JADX INFO: renamed from: b */
    public static final IntrinsicMinMax f18457b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ IntrinsicMinMax[] f18458c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f18459d;

    static {
        IntrinsicMinMax intrinsicMinMax = new IntrinsicMinMax("Min", 0);
        f18456a = intrinsicMinMax;
        IntrinsicMinMax intrinsicMinMax2 = new IntrinsicMinMax("Max", 1);
        f18457b = intrinsicMinMax2;
        IntrinsicMinMax[] intrinsicMinMaxArr = {intrinsicMinMax, intrinsicMinMax2};
        f18458c = intrinsicMinMaxArr;
        f18459d = EnumEntriesKt.m18563a(intrinsicMinMaxArr);
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) f18458c.clone();
    }
}
