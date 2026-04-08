package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS(3),
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: a */
    public final boolean f54205a;

    /* JADX INFO: renamed from: b */
    public final boolean f54206b;

    /* synthetic */ AnnotationArgumentsRenderingPolicy(int i) {
        this((i & 1) == 0, false);
    }

    AnnotationArgumentsRenderingPolicy(boolean z2, boolean z3) {
        this.f54205a = z2;
        this.f54206b = z3;
    }
}
