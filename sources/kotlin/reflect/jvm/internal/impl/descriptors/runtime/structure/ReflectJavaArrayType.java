package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* JADX INFO: renamed from: a */
    public final Type f52653a;

    /* JADX INFO: renamed from: b */
    public final ReflectJavaType f52654b;

    /* JADX INFO: renamed from: c */
    public final EmptyList f52655c;

    public ReflectJavaArrayType(Type reflectType) {
        ReflectJavaType reflectJavaTypeM19164a;
        Intrinsics.m18599g(reflectType, "reflectType");
        this.f52653a = reflectType;
        if (!(reflectType instanceof GenericArrayType)) {
            if (reflectType instanceof Class) {
                Class cls = (Class) reflectType;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.m18598f(componentType, "getComponentType()");
                    reflectJavaTypeM19164a = ReflectJavaType.Factory.m19164a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        Type genericComponentType = ((GenericArrayType) reflectType).getGenericComponentType();
        Intrinsics.m18598f(genericComponentType, "genericComponentType");
        reflectJavaTypeM19164a = ReflectJavaType.Factory.m19164a(genericComponentType);
        this.f52654b = reflectJavaTypeM19164a;
        this.f52655c = EmptyList.f51496a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    /* JADX INFO: renamed from: D */
    public final ReflectJavaType mo19129D() {
        return this.f52654b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    /* JADX INFO: renamed from: H */
    public final Type mo19130H() {
        return this.f52653a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return this.f52655c;
    }
}
