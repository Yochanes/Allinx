package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Unit;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class Utils {

    /* JADX INFO: renamed from: a */
    public static final Type[] f59467a = new Type[0];

    /* JADX INFO: renamed from: b */
    public static boolean f59468b = true;

    /* JADX INFO: compiled from: Proguard */
    public static final class GenericArrayTypeImpl implements GenericArrayType {

        /* JADX INFO: renamed from: a */
        public final Type f59469a;

        public GenericArrayTypeImpl(Type type) {
            this.f59469a = type;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Utils.m21894b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f59469a;
        }

        public final int hashCode() {
            return this.f59469a.hashCode();
        }

        public final String toString() {
            return AbstractC0000a.m19p(new StringBuilder(), Utils.m21907o(this.f59469a), "[]");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParameterizedTypeImpl implements ParameterizedType {

        /* JADX INFO: renamed from: a */
        public final Type f59470a;

        /* JADX INFO: renamed from: b */
        public final Type f59471b;

        /* JADX INFO: renamed from: c */
        public final Type[] f59472c;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                Utils.m21893a(type3);
            }
            this.f59470a = type;
            this.f59471b = type2;
            this.f59472c = (Type[]) typeArr.clone();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Utils.m21894b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f59472c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f59470a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.f59471b;
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f59472c) ^ this.f59471b.hashCode();
            Type type = this.f59470a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.f59472c;
            int length = typeArr.length;
            Type type = this.f59471b;
            if (length == 0) {
                return Utils.m21907o(type);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(Utils.m21907o(type));
            sb.append("<");
            sb.append(Utils.m21907o(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(Utils.m21907o(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WildcardTypeImpl implements WildcardType {

        /* JADX INFO: renamed from: a */
        public final Type f59473a;

        /* JADX INFO: renamed from: b */
        public final Type f59474b;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                Utils.m21893a(typeArr[0]);
                this.f59474b = null;
                this.f59473a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            Utils.m21893a(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f59474b = typeArr2[0];
            this.f59473a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Utils.m21894b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.f59474b;
            return type != null ? new Type[]{type} : Utils.f59467a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f59473a};
        }

        public final int hashCode() {
            Type type = this.f59474b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f59473a.hashCode() + 31);
        }

        public final String toString() {
            Type type = this.f59474b;
            if (type != null) {
                return "? super " + Utils.m21907o(type);
            }
            Type type2 = this.f59473a;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + Utils.m21907o(type2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21893a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21894b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m21894b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX INFO: renamed from: c */
    public static Type m21895c(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m21895c(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m21895c(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: d */
    public static Type m21896d(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index ", " not in range [0,");
        sbM20q.append(actualTypeArguments.length);
        sbM20q.append(") for ");
        sbM20q.append(parameterizedType);
        throw new IllegalArgumentException(sbM20q.toString());
    }

    /* JADX INFO: renamed from: e */
    public static Class m21897e(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m21897e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m21897e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    /* JADX INFO: renamed from: f */
    public static Type m21898f(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return m21905m(type, cls, m21895c(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m21899g(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m21899g(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m21899g(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21900h(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m21901i(Type type) {
        return f59468b && type == Unit.class;
    }

    /* JADX INFO: renamed from: j */
    public static IllegalArgumentException m21902j(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder sbM21r = AbstractC0000a.m21r(String.format(str, objArr), "\n    for method ");
        sbM21r.append(method.getDeclaringClass().getSimpleName());
        sbM21r.append(".");
        sbM21r.append(method.getName());
        return new IllegalArgumentException(sbM21r.toString(), exc);
    }

    /* JADX INFO: renamed from: k */
    public static IllegalArgumentException m21903k(Method method, int i, String str, Object... objArr) {
        return m21902j(method, null, str + " (" + Platform.f59395b.mo21874a(method, i) + ")", objArr);
    }

    /* JADX INFO: renamed from: l */
    public static IllegalArgumentException m21904l(Method method, Exception exc, int i, String str, Object... objArr) {
        return m21902j(method, exc, str + " (" + Platform.f59395b.mo21874a(method, i) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type m21905m(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 == null) {
                type3 = typeVariable;
            } else {
                Type typeM21895c = m21895c(type, cls, cls2);
                if (typeM21895c instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    for (int i = 0; i < typeParameters.length; i++) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) typeM21895c).getActualTypeArguments()[i];
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            if (type3 == typeVariable) {
                return type3;
            }
            type4 = type3;
        }
        if (type4 instanceof Class) {
            Class cls3 = (Class) type4;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeM21905m = m21905m(type, cls, componentType);
                return componentType == typeM21905m ? cls3 : new GenericArrayTypeImpl(typeM21905m);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeM21905m2 = m21905m(type, cls, genericComponentType);
            return genericComponentType == typeM21905m2 ? genericArrayType : new GenericArrayTypeImpl(typeM21905m2);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeM21905m3 = m21905m(type, cls, ownerType);
            boolean z2 = typeM21905m3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeM21905m4 = m21905m(type, cls, actualTypeArguments[i2]);
                if (typeM21905m4 != actualTypeArguments[i2]) {
                    if (!z2) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z2 = true;
                    }
                    actualTypeArguments[i2] = typeM21905m4;
                }
            }
            return z2 ? new ParameterizedTypeImpl(typeM21905m3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z3 = type4 instanceof WildcardType;
        Type type5 = type4;
        if (z3) {
            WildcardType wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeM21905m5 = m21905m(type, cls, lowerBounds[0]);
                type5 = wildcardType;
                if (typeM21905m5 != lowerBounds[0]) {
                    return new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{typeM21905m5});
                }
            } else {
                type5 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeM21905m6 = m21905m(type, cls, upperBounds[0]);
                    type5 = wildcardType;
                    if (typeM21905m6 != upperBounds[0]) {
                        return new WildcardTypeImpl(new Type[]{typeM21905m6}, f59467a);
                    }
                }
            }
        }
        return type5;
    }

    /* JADX INFO: renamed from: n */
    public static void m21906n(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m21907o(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
