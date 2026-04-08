package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NullabilityQualifier {

    /* JADX INFO: renamed from: a */
    public static final NullabilityQualifier f53129a;

    /* JADX INFO: renamed from: b */
    public static final NullabilityQualifier f53130b;

    /* JADX INFO: renamed from: c */
    public static final NullabilityQualifier f53131c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ NullabilityQualifier[] f53132d;

    static {
        NullabilityQualifier nullabilityQualifier = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);
        f53129a = nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2 = new NullabilityQualifier("NULLABLE", 1);
        f53130b = nullabilityQualifier2;
        NullabilityQualifier nullabilityQualifier3 = new NullabilityQualifier("NOT_NULL", 2);
        f53131c = nullabilityQualifier3;
        f53132d = new NullabilityQualifier[]{nullabilityQualifier, nullabilityQualifier2, nullabilityQualifier3};
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) f53132d.clone();
    }
}
