package androidx.compose.material3.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/internal/InputPhase;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class InputPhase {

    /* JADX INFO: renamed from: a */
    public static final InputPhase f15589a;

    /* JADX INFO: renamed from: b */
    public static final InputPhase f15590b;

    /* JADX INFO: renamed from: c */
    public static final InputPhase f15591c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InputPhase[] f15592d;

    static {
        InputPhase inputPhase = new InputPhase("Focused", 0);
        f15589a = inputPhase;
        InputPhase inputPhase2 = new InputPhase("UnfocusedEmpty", 1);
        f15590b = inputPhase2;
        InputPhase inputPhase3 = new InputPhase("UnfocusedNotEmpty", 2);
        f15591c = inputPhase3;
        f15592d = new InputPhase[]{inputPhase, inputPhase2, inputPhase3};
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) f15592d.clone();
    }
}
