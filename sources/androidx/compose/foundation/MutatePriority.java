package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/MutatePriority;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class MutatePriority {

    /* JADX INFO: renamed from: a */
    public static final MutatePriority f5091a;

    /* JADX INFO: renamed from: b */
    public static final MutatePriority f5092b;

    /* JADX INFO: renamed from: c */
    public static final MutatePriority f5093c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ MutatePriority[] f5094d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f5095f;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        f5091a = mutatePriority;
        MutatePriority mutatePriority2 = new MutatePriority("UserInput", 1);
        f5092b = mutatePriority2;
        MutatePriority mutatePriority3 = new MutatePriority("PreventUserInput", 2);
        f5093c = mutatePriority3;
        MutatePriority[] mutatePriorityArr = {mutatePriority, mutatePriority2, mutatePriority3};
        f5094d = mutatePriorityArr;
        f5095f = EnumEntriesKt.m18563a(mutatePriorityArr);
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) f5094d.clone();
    }
}
