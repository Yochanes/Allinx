package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/MutatePriority;", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class MutatePriority {

    /* JADX INFO: renamed from: a */
    public static final MutatePriority f4460a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ MutatePriority[] f4461b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f4462c;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        f4460a = mutatePriority;
        MutatePriority[] mutatePriorityArr = {mutatePriority, new MutatePriority("UserInput", 1), new MutatePriority("PreventUserInput", 2)};
        f4461b = mutatePriorityArr;
        f4462c = EnumEntriesKt.m18563a(mutatePriorityArr);
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) f4461b.clone();
    }
}
