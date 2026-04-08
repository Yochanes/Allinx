package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DeprecationLevelValue {

    /* JADX INFO: renamed from: a */
    public static final DeprecationLevelValue f54385a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ DeprecationLevelValue[] f54386b;

    /* JADX INFO: Fake field, exist only in values array */
    DeprecationLevelValue EF0;

    static {
        DeprecationLevelValue deprecationLevelValue = new DeprecationLevelValue("WARNING", 0);
        DeprecationLevelValue deprecationLevelValue2 = new DeprecationLevelValue("ERROR", 1);
        f54385a = deprecationLevelValue2;
        f54386b = new DeprecationLevelValue[]{deprecationLevelValue, deprecationLevelValue2, new DeprecationLevelValue("HIDDEN", 2)};
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) f54386b.clone();
    }
}
