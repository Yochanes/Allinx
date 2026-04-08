package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {

    /* JADX INFO: renamed from: a */
    public final Annotation f52649a;

    public ReflectJavaAnnotation(Annotation annotation) {
        Intrinsics.m18599g(annotation, "annotation");
        this.f52649a = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* JADX INFO: renamed from: d */
    public final ClassId mo19121d() {
        return ReflectClassUtilKt.m19117a(JvmClassMappingKt.m18572b(JvmClassMappingKt.m18571a(this.f52649a)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* JADX INFO: renamed from: e */
    public final ArrayList mo19122e() throws IllegalAccessException, InvocationTargetException {
        Annotation annotation = this.f52649a;
        Method[] declaredMethods = JvmClassMappingKt.m18572b(JvmClassMappingKt.m18571a(annotation)).getDeclaredMethods();
        Intrinsics.m18598f(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, new Object[0]);
            Intrinsics.m18598f(objInvoke, "method.invoke(annotation)");
            arrayList.add(ReflectJavaAnnotationArgument.Factory.m19124a(objInvoke, Name.m19605e(method.getName())));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaAnnotation) {
            return this.f52649a == ((ReflectJavaAnnotation) obj).f52649a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f52649a);
    }

    public final String toString() {
        return ReflectJavaAnnotation.class.getName() + ": " + this.f52649a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* JADX INFO: renamed from: w */
    public final ReflectJavaClass mo19123w() {
        return new ReflectJavaClass(JvmClassMappingKt.m18572b(JvmClassMappingKt.m18571a(this.f52649a)));
    }
}
