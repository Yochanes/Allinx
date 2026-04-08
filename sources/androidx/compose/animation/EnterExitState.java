package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/EnterExitState;", "", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class EnterExitState {

    /* JADX INFO: renamed from: a */
    public static final EnterExitState f4117a;

    /* JADX INFO: renamed from: b */
    public static final EnterExitState f4118b;

    /* JADX INFO: renamed from: c */
    public static final EnterExitState f4119c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnterExitState[] f4120d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f4121f;

    static {
        EnterExitState enterExitState = new EnterExitState("PreEnter", 0);
        f4117a = enterExitState;
        EnterExitState enterExitState2 = new EnterExitState("Visible", 1);
        f4118b = enterExitState2;
        EnterExitState enterExitState3 = new EnterExitState("PostExit", 2);
        f4119c = enterExitState3;
        EnterExitState[] enterExitStateArr = {enterExitState, enterExitState2, enterExitState3};
        f4120d = enterExitStateArr;
        f4121f = EnumEntriesKt.m18563a(enterExitStateArr);
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) f4120d.clone();
    }
}
