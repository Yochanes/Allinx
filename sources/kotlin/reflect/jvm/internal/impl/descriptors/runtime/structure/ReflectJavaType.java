package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ReflectJavaType implements JavaType {

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory {
        /* JADX INFO: renamed from: a */
        public static ReflectJavaType m19164a(Type type) {
            Intrinsics.m18599g(type, "type");
            boolean z2 = type instanceof Class;
            if (z2) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z2 && ((Class) type).isArray())) ? new ReflectJavaArrayType(type) : type instanceof WildcardType ? new ReflectJavaWildcardType((WildcardType) type) : new ReflectJavaClassifierType(type);
        }
    }

    /* JADX INFO: renamed from: H */
    public abstract Type mo19130H();

    public final boolean equals(Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.m18594b(mo19130H(), ((ReflectJavaType) obj).mo19130H());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: h */
    public JavaAnnotation mo19137h(FqName fqName) {
        Object next;
        Intrinsics.m18599g(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.m18594b(((JavaAnnotation) next).mo19121d().m19577b(), fqName)) {
                break;
            }
        }
        return (JavaAnnotation) next;
    }

    public final int hashCode() {
        return mo19130H().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo19130H();
    }
}
