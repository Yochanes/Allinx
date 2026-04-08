package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class GradientType {

    /* JADX INFO: renamed from: a */
    public static final GradientType f34560a;

    /* JADX INFO: renamed from: b */
    public static final GradientType f34561b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ GradientType[] f34562c;

    static {
        GradientType gradientType = new GradientType("LINEAR", 0);
        f34560a = gradientType;
        GradientType gradientType2 = new GradientType("RADIAL", 1);
        f34561b = gradientType2;
        f34562c = new GradientType[]{gradientType, gradientType2};
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) f34562c.clone();
    }
}
