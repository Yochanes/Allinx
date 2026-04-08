package org.aspectj.lang.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PerClauseKind {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ PerClauseKind[] f57994a = {new PerClauseKind("SINGLETON", 0), new PerClauseKind("PERTHIS", 1), new PerClauseKind("PERTARGET", 2), new PerClauseKind("PERCFLOW", 3), new PerClauseKind("PERCFLOWBELOW", 4), new PerClauseKind("PERTYPEWITHIN", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    PerClauseKind EF5;

    public static PerClauseKind valueOf(String str) {
        return (PerClauseKind) Enum.valueOf(PerClauseKind.class, str);
    }

    public static PerClauseKind[] values() {
        return (PerClauseKind[]) f57994a.clone();
    }
}
