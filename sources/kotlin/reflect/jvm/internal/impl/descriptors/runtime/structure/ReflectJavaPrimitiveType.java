package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {

    /* JADX INFO: renamed from: a */
    public final Class f52674a;

    public ReflectJavaPrimitiveType(Class reflectType) {
        Intrinsics.m18599g(reflectType, "reflectType");
        this.f52674a = reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    /* JADX INFO: renamed from: H */
    public final Type mo19130H() {
        return this.f52674a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        return EmptyList.f51496a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    public final PrimitiveType getType() {
        Class cls = Void.TYPE;
        Class cls2 = this.f52674a;
        if (Intrinsics.m18594b(cls2, cls)) {
            return null;
        }
        return JvmPrimitiveType.m19990b(cls2.getName()).m19992d();
    }
}
