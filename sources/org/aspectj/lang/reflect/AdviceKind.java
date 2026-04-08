package org.aspectj.lang.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AdviceKind {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AdviceKind[] f57991a = {new AdviceKind("BEFORE", 0), new AdviceKind("AFTER", 1), new AdviceKind("AFTER_RETURNING", 2), new AdviceKind("AFTER_THROWING", 3), new AdviceKind("AROUND", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    AdviceKind EF5;

    public static AdviceKind valueOf(String str) {
        return (AdviceKind) Enum.valueOf(AdviceKind.class, str);
    }

    public static AdviceKind[] values() {
        return (AdviceKind[]) f57991a.clone();
    }
}
