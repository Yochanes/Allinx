package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/RangeSliderComponents;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class RangeSliderComponents {

    /* JADX INFO: renamed from: a */
    public static final RangeSliderComponents f14213a;

    /* JADX INFO: renamed from: b */
    public static final RangeSliderComponents f14214b;

    /* JADX INFO: renamed from: c */
    public static final RangeSliderComponents f14215c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ RangeSliderComponents[] f14216d;

    static {
        RangeSliderComponents rangeSliderComponents = new RangeSliderComponents("ENDTHUMB", 0);
        f14213a = rangeSliderComponents;
        RangeSliderComponents rangeSliderComponents2 = new RangeSliderComponents("STARTTHUMB", 1);
        f14214b = rangeSliderComponents2;
        RangeSliderComponents rangeSliderComponents3 = new RangeSliderComponents("TRACK", 2);
        f14215c = rangeSliderComponents3;
        f14216d = new RangeSliderComponents[]{rangeSliderComponents, rangeSliderComponents2, rangeSliderComponents3};
    }

    public static RangeSliderComponents valueOf(String str) {
        return (RangeSliderComponents) Enum.valueOf(RangeSliderComponents.class, str);
    }

    public static RangeSliderComponents[] values() {
        return (RangeSliderComponents[]) f14216d.clone();
    }
}
