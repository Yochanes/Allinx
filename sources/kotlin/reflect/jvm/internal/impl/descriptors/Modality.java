package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Modality {

    /* JADX INFO: renamed from: a */
    public static final Modality f52266a;

    /* JADX INFO: renamed from: b */
    public static final Modality f52267b;

    /* JADX INFO: renamed from: c */
    public static final Modality f52268c;

    /* JADX INFO: renamed from: d */
    public static final Modality f52269d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ Modality[] f52270f;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    static {
        Modality modality = new Modality("FINAL", 0);
        f52266a = modality;
        Modality modality2 = new Modality("SEALED", 1);
        f52267b = modality2;
        Modality modality3 = new Modality("OPEN", 2);
        f52268c = modality3;
        Modality modality4 = new Modality("ABSTRACT", 3);
        f52269d = modality4;
        f52270f = new Modality[]{modality, modality2, modality3, modality4};
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) f52270f.clone();
    }
}
