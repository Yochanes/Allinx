package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaLiteralAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaLiteralAnnotationArgument {

    /* JADX INFO: renamed from: b */
    public final Object f52671b;

    public ReflectJavaLiteralAnnotationArgument(Object obj, Name name) {
        super(name);
        this.f52671b = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument
    public final Object getValue() {
        return this.f52671b;
    }
}
