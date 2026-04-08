package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AnnotatedImpl implements Annotated {

    /* JADX INFO: renamed from: a */
    public final Annotations f52316a;

    public AnnotatedImpl(Annotations annotations) {
        if (annotations != null) {
            this.f52316a = annotations;
        } else {
            m18988A(0);
            throw null;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m18988A(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f52316a;
        if (annotations != null) {
            return annotations;
        }
        m18988A(1);
        throw null;
    }
}
