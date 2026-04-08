package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/InputPhase;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class InputPhase {

    /* JADX INFO: renamed from: a */
    public static final InputPhase f10659a;

    /* JADX INFO: renamed from: b */
    public static final InputPhase f10660b;

    /* JADX INFO: renamed from: c */
    public static final InputPhase f10661c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InputPhase[] f10662d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f10663f;

    static {
        InputPhase inputPhase = new InputPhase("Focused", 0);
        f10659a = inputPhase;
        InputPhase inputPhase2 = new InputPhase("UnfocusedEmpty", 1);
        f10660b = inputPhase2;
        InputPhase inputPhase3 = new InputPhase("UnfocusedNotEmpty", 2);
        f10661c = inputPhase3;
        InputPhase[] inputPhaseArr = {inputPhase, inputPhase2, inputPhase3};
        f10662d = inputPhaseArr;
        f10663f = EnumEntriesKt.m18563a(inputPhaseArr);
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) f10662d.clone();
    }
}
