package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaClassObjectAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaClassObjectAnnotationArgument {

    /* JADX INFO: renamed from: b */
    public final Class f52665b;

    public ReflectJavaClassObjectAnnotationArgument(Name name, Class cls) {
        super(name);
        this.f52665b = cls;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument
    /* JADX INFO: renamed from: c */
    public final ReflectJavaType mo19146c() {
        return ReflectJavaType.Factory.m19164a(this.f52665b);
    }
}
