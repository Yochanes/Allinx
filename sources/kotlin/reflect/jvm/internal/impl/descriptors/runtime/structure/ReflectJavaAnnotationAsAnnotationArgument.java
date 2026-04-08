package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaAnnotationAsAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaAnnotationAsAnnotationArgument {

    /* JADX INFO: renamed from: b */
    public final Annotation f52651b;

    public ReflectJavaAnnotationAsAnnotationArgument(Name name, Annotation annotation) {
        super(name);
        this.f52651b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument
    /* JADX INFO: renamed from: a */
    public final ReflectJavaAnnotation mo19125a() {
        return new ReflectJavaAnnotation(this.f52651b);
    }
}
