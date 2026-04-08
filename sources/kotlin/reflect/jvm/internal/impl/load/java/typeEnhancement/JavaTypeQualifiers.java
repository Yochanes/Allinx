package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaTypeQualifiers {

    /* JADX INFO: renamed from: e */
    public static final JavaTypeQualifiers f53120e = new JavaTypeQualifiers(null, false);

    /* JADX INFO: renamed from: a */
    public final NullabilityQualifier f53121a;

    /* JADX INFO: renamed from: b */
    public final MutabilityQualifier f53122b;

    /* JADX INFO: renamed from: c */
    public final boolean f53123c;

    /* JADX INFO: renamed from: d */
    public final boolean f53124d;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z2, boolean z3) {
        this.f53121a = nullabilityQualifier;
        this.f53122b = mutabilityQualifier;
        this.f53123c = z2;
        this.f53124d = z3;
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, boolean z2) {
        this(nullabilityQualifier, null, z2, false);
    }
}
