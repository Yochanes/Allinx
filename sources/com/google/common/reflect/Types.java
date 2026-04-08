package com.google.common.reflect;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.CheckForNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class Types {
    private static final Joiner COMMA_JOINER = Joiner.m14761on(", ").useForNull("null");

    /* JADX INFO: renamed from: com.google.common.reflect.Types$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C44971 extends TypeVisitor {
        final /* synthetic */ AtomicReference val$result;

        public C44971(AtomicReference atomicReference) {
            this.val$result = atomicReference;
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitClass(Class<?> cls) {
            this.val$result.set(cls.getComponentType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitGenericArrayType(GenericArrayType genericArrayType) {
            this.val$result.set(genericArrayType.getGenericComponentType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitTypeVariable(TypeVariable<?> typeVariable) {
            this.val$result.set(Types.access$100(typeVariable.getBounds()));
        }

        @Override // com.google.common.reflect.TypeVisitor
        public void visitWildcardType(WildcardType wildcardType) {
            this.val$result.set(Types.access$100(wildcardType.getUpperBounds()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static abstract class ClassOwnership {
        public static final ClassOwnership OWNED_BY_ENCLOSING_CLASS = new C44981("OWNED_BY_ENCLOSING_CLASS", 0);
        public static final ClassOwnership LOCAL_CLASS_HAS_NO_OWNER = new C44992("LOCAL_CLASS_HAS_NO_OWNER", 1);
        private static final /* synthetic */ ClassOwnership[] $VALUES = $values();
        static final ClassOwnership JVM_BEHAVIOR = detectJvmBehavior();

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$1 */
        /* JADX INFO: compiled from: Proguard */
        public enum C44981 extends ClassOwnership {
            public C44981(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            public Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$1LocalClass, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class C1LocalClass<T> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$2 */
        /* JADX INFO: compiled from: Proguard */
        public enum C44992 extends ClassOwnership {
            public C44992(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.Types.ClassOwnership
            @CheckForNull
            public Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$ClassOwnership$3 */
        /* JADX INFO: compiled from: Proguard */
        public class C45003 extends C1LocalClass<String> {
        }

        private static /* synthetic */ ClassOwnership[] $values() {
            return new ClassOwnership[]{OWNED_BY_ENCLOSING_CLASS, LOCAL_CLASS_HAS_NO_OWNER};
        }

        private ClassOwnership(String str, int i) {
        }

        private static ClassOwnership detectJvmBehavior() {
            new C45003();
            ParameterizedType parameterizedType = (ParameterizedType) C45003.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.getOwnerType(C1LocalClass.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }

        public static ClassOwnership valueOf(String str) {
            return (ClassOwnership) Enum.valueOf(ClassOwnership.class, str);
        }

        public static ClassOwnership[] values() {
            return (ClassOwnership[]) $VALUES.clone();
        }

        @CheckForNull
        public abstract Class<?> getOwnerType(Class<?> cls);

        public /* synthetic */ ClassOwnership(String str, int i, C44971 c44971) {
            this(str, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = JavaVersion.CURRENT.usedInGenericType(type);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return AbstractC0000a.m19p(new StringBuilder(), Types.toString(this.componentType), "[]");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static abstract class JavaVersion {
        private static final /* synthetic */ JavaVersion[] $VALUES;
        static final JavaVersion CURRENT;
        public static final JavaVersion JAVA6;
        public static final JavaVersion JAVA7;
        public static final JavaVersion JAVA8;
        public static final JavaVersion JAVA9;

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$1 */
        /* JADX INFO: compiled from: Proguard */
        public enum C45011 extends JavaVersion {
            public C45011(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public /* bridge */ /* synthetic */ Type newArrayType(Type type) {
                return newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                Preconditions.checkNotNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public GenericArrayType newArrayType(Type type) {
                return new GenericArrayTypeImpl(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$2 */
        /* JADX INFO: compiled from: Proguard */
        public enum C45022 extends JavaVersion {
            public C45022(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                return type instanceof Class ? Types.getArrayClass((Class) type) : new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return (Type) Preconditions.checkNotNull(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$3 */
        /* JADX INFO: compiled from: Proguard */
        public enum C45033 extends JavaVersion {
            public C45033(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                return JavaVersion.JAVA7.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA7.usedInGenericType(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$4 */
        /* JADX INFO: compiled from: Proguard */
        public enum C45044 extends JavaVersion {
            public C45044(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type newArrayType(Type type) {
                return JavaVersion.JAVA8.newArrayType(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public String typeName(Type type) {
                return JavaVersion.JAVA8.typeName(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            public Type usedInGenericType(Type type) {
                return JavaVersion.JAVA8.usedInGenericType(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$5 */
        /* JADX INFO: compiled from: Proguard */
        public class C45055 extends TypeCapture<Map.Entry<String, int[][]>> {
        }

        /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$6 */
        /* JADX INFO: compiled from: Proguard */
        public class C45066 extends TypeCapture<int[]> {
        }

        private static /* synthetic */ JavaVersion[] $values() {
            return new JavaVersion[]{JAVA6, JAVA7, JAVA8, JAVA9};
        }

        static {
            C45011 c45011 = new C45011("JAVA6", 0);
            JAVA6 = c45011;
            C45022 c45022 = new C45022("JAVA7", 1);
            JAVA7 = c45022;
            C45033 c45033 = new C45033("JAVA8", 2);
            JAVA8 = c45033;
            C45044 c45044 = new C45044("JAVA9", 3);
            JAVA9 = c45044;
            $VALUES = $values();
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new C45055().capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = c45033;
                    return;
                } else {
                    CURRENT = c45044;
                    return;
                }
            }
            if (new C45066().capture() instanceof Class) {
                CURRENT = c45022;
            } else {
                CURRENT = c45011;
            }
        }

        private JavaVersion(String str, int i) {
        }

        public static JavaVersion valueOf(String str) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, str);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) $VALUES.clone();
        }

        public boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        public abstract Type newArrayType(Type type);

        public String typeName(Type type) {
            return Types.toString(type);
        }

        public final ImmutableList<Type> usedInGenericType(Type[] typeArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Type type : typeArr) {
                builder.add(usedInGenericType(type));
            }
            return builder.build();
        }

        public abstract Type usedInGenericType(Type type);

        public /* synthetic */ JavaVersion(String str, int i, C44971 c44971) {
            this(str, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NativeTypeVariableEquals<X> {
        static final boolean NATIVE_TYPE_VARIABLE_ONLY = !NativeTypeVariableEquals.class.getTypeParameters()[0].equals(Types.newArtificialTypeVariable(NativeTypeVariableEquals.class, "X", new Type[0]));
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> argumentsList;

        @CheckForNull
        private final Type ownerType;
        private final Class<?> rawType;

        public ParameterizedTypeImpl(@CheckForNull Type type, Class<?> cls, Type[] typeArr) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkArgument(typeArr.length == cls.getTypeParameters().length);
            Types.access$200(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = JavaVersion.CURRENT.usedInGenericType(typeArr);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && com.google.common.base.Objects.equal(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.access$300(this.argumentsList);
        }

        @Override // java.lang.reflect.ParameterizedType
        @CheckForNull
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null) {
                JavaVersion javaVersion = JavaVersion.CURRENT;
                if (javaVersion.jdkTypeDuplicatesOwnerName()) {
                    sb.append(javaVersion.typeName(this.ownerType));
                    sb.append('.');
                }
            }
            sb.append(this.rawType.getName());
            sb.append('<');
            Joiner joinerAccess$400 = Types.access$400();
            ImmutableList<Type> immutableList = this.argumentsList;
            JavaVersion javaVersion2 = JavaVersion.CURRENT;
            Objects.requireNonNull(javaVersion2);
            sb.append(joinerAccess$400.join(Iterables.transform(immutableList, new C4509c(javaVersion2))));
            sb.append('>');
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TypeVariableImpl<D extends GenericDeclaration> {
        private final ImmutableList<Type> bounds;
        private final D genericDeclaration;
        private final String name;

        public TypeVariableImpl(D d, String str, Type[] typeArr) {
            Types.access$200(typeArr, "bound for type variable");
            this.genericDeclaration = (D) Preconditions.checkNotNull(d);
            this.name = (String) Preconditions.checkNotNull(str);
            this.bounds = ImmutableList.copyOf(typeArr);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!NativeTypeVariableEquals.NATIVE_TYPE_VARIABLE_ONLY) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (this.name.equals(typeVariable.getName()) && this.genericDeclaration.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                TypeVariableImpl typeVariableImplAccess$500 = TypeVariableInvocationHandler.access$500((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj));
                if (this.name.equals(typeVariableImplAccess$500.getName()) && this.genericDeclaration.equals(typeVariableImplAccess$500.getGenericDeclaration()) && this.bounds.equals(typeVariableImplAccess$500.bounds)) {
                    return true;
                }
            }
            return false;
        }

        public Type[] getBounds() {
            return Types.access$300(this.bounds);
        }

        public D getGenericDeclaration() {
            return this.genericDeclaration;
        }

        public String getName() {
            return this.name;
        }

        public String getTypeName() {
            return this.name;
        }

        public int hashCode() {
            return this.genericDeclaration.hashCode() ^ this.name.hashCode();
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TypeVariableInvocationHandler implements InvocationHandler {
        private static final ImmutableMap<String, Method> typeVariableMethods;
        private final TypeVariableImpl<?> typeVariableImpl;

        static {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (Method method : TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.put(method.getName(), method);
                }
            }
            typeVariableMethods = builder.buildKeepingLast();
        }

        public TypeVariableInvocationHandler(TypeVariableImpl<?> typeVariableImpl) {
            this.typeVariableImpl = typeVariableImpl;
        }

        public static /* synthetic */ TypeVariableImpl access$500(TypeVariableInvocationHandler typeVariableInvocationHandler) {
            return typeVariableInvocationHandler.typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object obj, Method method, @CheckForNull Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = typeVariableMethods.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.typeVariableImpl, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableList<Type> lowerBounds;
        private final ImmutableList<Type> upperBounds;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.access$200(typeArr, "lower bound for wildcard");
            Types.access$200(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.CURRENT;
            this.lowerBounds = javaVersion.usedInGenericType(typeArr);
            this.upperBounds = javaVersion.usedInGenericType(typeArr2);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.access$300(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.access$300(this.upperBounds);
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            UnmodifiableIterator<Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(" super ");
                sb.append(JavaVersion.CURRENT.typeName(next));
            }
            for (Type type : Types.access$600(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(JavaVersion.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    private Types() {
    }

    public static /* synthetic */ Type access$100(Type[] typeArr) {
        return subtypeOfComponentType(typeArr);
    }

    public static /* synthetic */ void access$200(Type[] typeArr, String str) {
        disallowPrimitiveType(typeArr, str);
    }

    public static /* synthetic */ Type[] access$300(Collection collection) {
        return toArray(collection);
    }

    public static /* synthetic */ Joiner access$400() {
        return COMMA_JOINER;
    }

    public static /* synthetic */ Iterable access$600(Iterable iterable) {
        return filterUpperBounds(iterable);
    }

    private static void disallowPrimitiveType(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Preconditions.checkArgument(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    private static Iterable<Type> filterUpperBounds(Iterable<Type> iterable) {
        return Iterables.filter(iterable, Predicates.not(Predicates.equalTo(Object.class)));
    }

    public static Class<?> getArrayClass(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    @CheckForNull
    public static Type getComponentType(Type type) {
        Preconditions.checkNotNull(type);
        AtomicReference atomicReference = new AtomicReference();
        new C44971(atomicReference).visit(type);
        return (Type) atomicReference.get();
    }

    public static Type newArrayType(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.CURRENT.newArrayType(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Preconditions.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return supertypeOf(newArrayType(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        Preconditions.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return subtypeOf(newArrayType(upperBounds[0]));
    }

    public static <D extends GenericDeclaration> TypeVariable<D> newArtificialTypeVariable(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return newTypeVariableImpl(d, str, typeArr);
    }

    public static ParameterizedType newParameterizedType(Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    public static ParameterizedType newParameterizedTypeWithOwner(@CheckForNull Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return newParameterizedType(cls, typeArr);
        }
        Preconditions.checkNotNull(typeArr);
        Preconditions.checkArgument(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    private static <D extends GenericDeclaration> TypeVariable<D> newTypeVariableImpl(D d, String str, Type[] typeArr) {
        return (TypeVariable) Reflection.newProxy(TypeVariable.class, new TypeVariableInvocationHandler(new TypeVariableImpl(d, str, typeArr)));
    }

    @VisibleForTesting
    public static WildcardType subtypeOf(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    @CheckForNull
    private static Type subtypeOfComponentType(Type[] typeArr) {
        for (Type type : typeArr) {
            Type componentType = getComponentType(type);
            if (componentType != null) {
                if (componentType instanceof Class) {
                    Class cls = (Class) componentType;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return subtypeOf(componentType);
            }
        }
        return null;
    }

    @VisibleForTesting
    public static WildcardType supertypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    private static Type[] toArray(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    public static String toString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
