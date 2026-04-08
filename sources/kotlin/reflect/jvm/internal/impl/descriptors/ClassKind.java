package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassKind {

    /* JADX INFO: renamed from: a */
    public static final ClassKind f52235a;

    /* JADX INFO: renamed from: b */
    public static final ClassKind f52236b;

    /* JADX INFO: renamed from: c */
    public static final ClassKind f52237c;

    /* JADX INFO: renamed from: d */
    public static final ClassKind f52238d;

    /* JADX INFO: renamed from: f */
    public static final ClassKind f52239f;

    /* JADX INFO: renamed from: g */
    public static final ClassKind f52240g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ ClassKind[] f52241i;

    static {
        ClassKind classKind = new ClassKind("CLASS", 0);
        f52235a = classKind;
        ClassKind classKind2 = new ClassKind("INTERFACE", 1);
        f52236b = classKind2;
        ClassKind classKind3 = new ClassKind("ENUM_CLASS", 2);
        f52237c = classKind3;
        ClassKind classKind4 = new ClassKind("ENUM_ENTRY", 3);
        f52238d = classKind4;
        ClassKind classKind5 = new ClassKind("ANNOTATION_CLASS", 4);
        f52239f = classKind5;
        ClassKind classKind6 = new ClassKind("OBJECT", 5);
        f52240g = classKind6;
        f52241i = new ClassKind[]{classKind, classKind2, classKind3, classKind4, classKind5, classKind6};
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) f52241i.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18893a() {
        return this == f52240g || this == f52238d;
    }
}
