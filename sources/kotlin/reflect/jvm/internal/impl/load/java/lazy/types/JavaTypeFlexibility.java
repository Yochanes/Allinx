package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaTypeFlexibility {

    /* JADX INFO: renamed from: a */
    public static final JavaTypeFlexibility f53083a;

    /* JADX INFO: renamed from: b */
    public static final JavaTypeFlexibility f53084b;

    /* JADX INFO: renamed from: c */
    public static final JavaTypeFlexibility f53085c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JavaTypeFlexibility[] f53086d;

    static {
        JavaTypeFlexibility javaTypeFlexibility = new JavaTypeFlexibility("INFLEXIBLE", 0);
        f53083a = javaTypeFlexibility;
        JavaTypeFlexibility javaTypeFlexibility2 = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        f53084b = javaTypeFlexibility2;
        JavaTypeFlexibility javaTypeFlexibility3 = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        f53085c = javaTypeFlexibility3;
        f53086d = new JavaTypeFlexibility[]{javaTypeFlexibility, javaTypeFlexibility2, javaTypeFlexibility3};
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) f53086d.clone();
    }
}
