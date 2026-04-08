package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AnnotatedCallableKind {

    /* JADX INFO: renamed from: a */
    public static final AnnotatedCallableKind f54501a;

    /* JADX INFO: renamed from: b */
    public static final AnnotatedCallableKind f54502b;

    /* JADX INFO: renamed from: c */
    public static final AnnotatedCallableKind f54503c;

    /* JADX INFO: renamed from: d */
    public static final AnnotatedCallableKind f54504d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AnnotatedCallableKind[] f54505f;

    static {
        AnnotatedCallableKind annotatedCallableKind = new AnnotatedCallableKind("FUNCTION", 0);
        f54501a = annotatedCallableKind;
        AnnotatedCallableKind annotatedCallableKind2 = new AnnotatedCallableKind("PROPERTY", 1);
        f54502b = annotatedCallableKind2;
        AnnotatedCallableKind annotatedCallableKind3 = new AnnotatedCallableKind("PROPERTY_GETTER", 2);
        f54503c = annotatedCallableKind3;
        AnnotatedCallableKind annotatedCallableKind4 = new AnnotatedCallableKind("PROPERTY_SETTER", 3);
        f54504d = annotatedCallableKind4;
        f54505f = new AnnotatedCallableKind[]{annotatedCallableKind, annotatedCallableKind2, annotatedCallableKind3, annotatedCallableKind4};
    }

    public static AnnotatedCallableKind valueOf(String str) {
        return (AnnotatedCallableKind) Enum.valueOf(AnnotatedCallableKind.class, str);
    }

    public static AnnotatedCallableKind[] values() {
        return (AnnotatedCallableKind[]) f54505f.clone();
    }
}
