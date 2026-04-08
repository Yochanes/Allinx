package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MutabilityQualifier {

    /* JADX INFO: renamed from: a */
    public static final MutabilityQualifier f53125a;

    /* JADX INFO: renamed from: b */
    public static final MutabilityQualifier f53126b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ MutabilityQualifier[] f53127c;

    static {
        MutabilityQualifier mutabilityQualifier = new MutabilityQualifier("READ_ONLY", 0);
        f53125a = mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2 = new MutabilityQualifier("MUTABLE", 1);
        f53126b = mutabilityQualifier2;
        f53127c = new MutabilityQualifier[]{mutabilityQualifier, mutabilityQualifier2};
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) f53127c.clone();
    }
}
