package kotlin.reflect.jvm.internal.calls;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class AnnotationConstructorCallerKt$$Lambda$0 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Class f51973a;

    /* JADX INFO: renamed from: b */
    public final Map f51974b;

    /* JADX INFO: renamed from: c */
    public final Lazy f51975c;

    /* JADX INFO: renamed from: d */
    public final Lazy f51976d;

    /* JADX INFO: renamed from: e */
    public final List f51977e;

    public AnnotationConstructorCallerKt$$Lambda$0(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f51973a = cls;
        this.f51974b = map;
        this.f51975c = lazy;
        this.f51976d = lazy2;
        this.f51977e = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zM18594b;
        boolean z2;
        Class annotationClass = this.f51973a;
        Intrinsics.m18599g(annotationClass, "$annotationClass");
        Map map = this.f51974b;
        Lazy lazy = this.f51975c;
        Lazy lazy2 = this.f51976d;
        List methods = this.f51977e;
        Intrinsics.m18599g(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) lazy2.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) lazy.getValue();
            }
        }
        boolean z3 = false;
        if (!Intrinsics.m18594b(name, "equals") || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(ArraysKt.m18364d0(objArr));
            sb.append(')');
            throw new KotlinReflectionInternalError(sb.toString());
        }
        Object objM18357X = ArraysKt.m18357X(objArr);
        Annotation annotation = objM18357X instanceof Annotation ? (Annotation) objM18357X : null;
        if (Intrinsics.m18594b(annotation != null ? JvmClassMappingKt.m18572b(JvmClassMappingKt.m18571a(annotation)) : null, annotationClass)) {
            List<Method> list = methods;
            if ((list instanceof Collection) && list.isEmpty()) {
                z2 = true;
                if (z2) {
                }
            } else {
                for (Method method2 : list) {
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objM18357X, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zM18594b = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zM18594b = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zM18594b = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zM18594b = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zM18594b = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zM18594b = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zM18594b = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zM18594b = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zM18594b = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zM18594b = Intrinsics.m18594b(obj2, objInvoke);
                    }
                    if (!zM18594b) {
                        z2 = false;
                        break;
                    }
                }
                z2 = true;
                if (z2) {
                    z3 = true;
                }
            }
        }
        return Boolean.valueOf(z3);
    }
}
