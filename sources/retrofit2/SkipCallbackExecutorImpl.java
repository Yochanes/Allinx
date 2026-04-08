package retrofit2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SkipCallbackExecutorImpl implements SkipCallbackExecutor {

    /* JADX INFO: renamed from: a */
    public static final SkipCallbackExecutor f59466a = new SkipCallbackExecutorImpl();

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + SkipCallbackExecutor.class.getName() + "()";
    }
}
