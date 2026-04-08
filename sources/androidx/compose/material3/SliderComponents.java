package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/SliderComponents;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class SliderComponents {

    /* JADX INFO: renamed from: a */
    public static final SliderComponents f14428a;

    /* JADX INFO: renamed from: b */
    public static final SliderComponents f14429b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ SliderComponents[] f14430c;

    static {
        SliderComponents sliderComponents = new SliderComponents("THUMB", 0);
        f14428a = sliderComponents;
        SliderComponents sliderComponents2 = new SliderComponents("TRACK", 1);
        f14429b = sliderComponents2;
        f14430c = new SliderComponents[]{sliderComponents, sliderComponents2};
    }

    public static SliderComponents valueOf(String str) {
        return (SliderComponents) Enum.valueOf(SliderComponents.class, str);
    }

    public static SliderComponents[] values() {
        return (SliderComponents[]) f14430c.clone();
    }
}
