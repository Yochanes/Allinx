package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    /* JADX INFO: renamed from: H */
    public abstract Member mo19152H();

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m19157I(Type[] typeArr, Annotation[][] annotationArr, boolean z2) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        String str;
        boolean z3;
        Java8ParameterNamesLoader.Cache cache;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        Java8ParameterNamesLoader java8ParameterNamesLoader = Java8ParameterNamesLoader.f52639a;
        Member member = mo19152H();
        Intrinsics.m18599g(member, "member");
        Java8ParameterNamesLoader.Cache cache2 = Java8ParameterNamesLoader.f52640b;
        if (cache2 == null) {
            synchronized (java8ParameterNamesLoader) {
                cache2 = Java8ParameterNamesLoader.f52640b;
                if (cache2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        cache = new Java8ParameterNamesLoader.Cache(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.m19120d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
                    } catch (NoSuchMethodException unused) {
                        cache = new Java8ParameterNamesLoader.Cache(null, null);
                    }
                    Java8ParameterNamesLoader.f52640b = cache;
                    cache2 = cache;
                }
            }
        }
        Method method2 = cache2.f52641a;
        if (method2 == null || (method = cache2.f52642b) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(member, new Object[0]);
            Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, new Object[0]);
                Intrinsics.m18597e(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            ReflectJavaType reflectJavaTypeM19164a = ReflectJavaType.Factory.m19164a(typeArr[i]);
            if (arrayList != null) {
                str = (String) CollectionsKt.m18406G(i + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + reflectJavaTypeM19164a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z2) {
                z3 = true;
                if (i != typeArr.length - 1) {
                    z3 = false;
                }
            }
            arrayList2.add(new ReflectJavaValueParameter(reflectJavaTypeM19164a, annotationArr[i], str, z3));
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.m18594b(mo19152H(), ((ReflectJavaMember) obj).mo19152H());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final Collection getAnnotations() {
        Member memberMo19152H = mo19152H();
        Intrinsics.m18597e(memberMo19152H, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo19152H).getDeclaredAnnotations();
        return declaredAnnotations != null ? ReflectJavaAnnotationOwnerKt.m19127b(declaredAnnotations) : EmptyList.f51496a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public final Name getName() {
        String name = mo19152H().getName();
        Name nameM19605e = name != null ? Name.m19605e(name) : null;
        return nameM19605e == null ? SpecialNames.f54040a : nameM19605e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final Visibility getVisibility() {
        int modifiers = mo19152H().getModifiers();
        return Modifier.isPublic(modifiers) ? Visibilities.Public.f52312c : Modifier.isPrivate(modifiers) ? Visibilities.Private.f52309c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.f52616c : JavaVisibilities.ProtectedAndPackage.f52615c : JavaVisibilities.PackageVisibility.f52614c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: h */
    public final JavaAnnotation mo19137h(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        Member memberMo19152H = mo19152H();
        Intrinsics.m18597e(memberMo19152H, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberMo19152H).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return ReflectJavaAnnotationOwnerKt.m19126a(declaredAnnotations, fqName);
        }
        return null;
    }

    public final int hashCode() {
        return mo19152H().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    /* JADX INFO: renamed from: i */
    public final boolean mo19138i() {
        return Modifier.isStatic(mo19152H().getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isAbstract() {
        return Modifier.isAbstract(mo19152H().getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isFinal() {
        return Modifier.isFinal(mo19152H().getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    /* JADX INFO: renamed from: m */
    public final ReflectJavaClass mo19158m() {
        Class<?> declaringClass = mo19152H().getDeclaringClass();
        Intrinsics.m18598f(declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }

    public final String toString() {
        return getClass().getName() + ": " + mo19152H();
    }
}
