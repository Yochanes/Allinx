package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/PausedCompositionState;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PausedCompositionState {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ PausedCompositionState[] f16427a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f16428b;

    static {
        PausedCompositionState[] pausedCompositionStateArr = {new PausedCompositionState("Invalid", 0), new PausedCompositionState("Cancelled", 1), new PausedCompositionState("InitialPending", 2), new PausedCompositionState("RecomposePending", 3), new PausedCompositionState("ApplyPending", 4), new PausedCompositionState("Applied", 5)};
        f16427a = pausedCompositionStateArr;
        f16428b = EnumEntriesKt.m18563a(pausedCompositionStateArr);
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) f16427a.clone();
    }
}
