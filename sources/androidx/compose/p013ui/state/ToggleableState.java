package androidx.compose.p013ui.state;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/state/ToggleableState;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ToggleableState {

    /* JADX INFO: renamed from: a */
    public static final ToggleableState f19878a;

    /* JADX INFO: renamed from: b */
    public static final ToggleableState f19879b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ToggleableState[] f19880c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f19881d;

    static {
        ToggleableState toggleableState = new ToggleableState("On", 0);
        f19878a = toggleableState;
        ToggleableState toggleableState2 = new ToggleableState("Off", 1);
        f19879b = toggleableState2;
        ToggleableState[] toggleableStateArr = {toggleableState, toggleableState2, new ToggleableState("Indeterminate", 2)};
        f19880c = toggleableStateArr;
        f19881d = EnumEntriesKt.m18563a(toggleableStateArr);
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) f19880c.clone();
    }
}
