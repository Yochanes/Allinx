package com.google.gson.internal;

import androidx.activity.compose.C0044a;
import com.google.firebase.crashlytics.internal.C4639a;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class ConstructorConstructor {
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private final List<ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z2, List<ReflectionAccessFilter> list) {
        this.instanceCreators = map;
        this.useJdkUnsafe = z2;
        this.reflectionFilters = list;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map m15270a() {
        return lambda$newMapConstructor$17();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Collection m15271b() {
        return lambda$newCollectionConstructor$10();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Map m15272c() {
        return lambda$newMapConstructor$15();
    }

    public static String checkInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m15273d(String str) {
        return lambda$get$3(str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m15274e(Class cls) {
        return lambda$newUnsafeAllocator$19(cls);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m15275f(Type type) {
        return lambda$newSpecialCollectionConstructor$6(type);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m15276g(InstanceCreator instanceCreator, Type type) {
        return lambda$get$0(instanceCreator, type);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Map m15277h() {
        return lambda$newMapConstructor$18();
    }

    private static boolean hasStringKeyType(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && GsonTypes.getRawType(actualTypeArguments[0]) == String.class;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m15278i(InstanceCreator instanceCreator, Type type) {
        return lambda$get$1(instanceCreator, type);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Map m15279j() {
        return lambda$newMapConstructor$16();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m15280k(String str) {
        return lambda$newDefaultConstructor$8(str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Collection m15281l() {
        return lambda$newCollectionConstructor$11();
    }

    private static /* synthetic */ Object lambda$get$0(InstanceCreator instanceCreator, Type type) {
        return instanceCreator.createInstance(type);
    }

    private static /* synthetic */ Object lambda$get$1(InstanceCreator instanceCreator, Type type) {
        return instanceCreator.createInstance(type);
    }

    private static /* synthetic */ Object lambda$get$2(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Object lambda$get$3(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Object lambda$get$4(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Collection lambda$newCollectionConstructor$10() {
        return new ArrayList();
    }

    private static /* synthetic */ Collection lambda$newCollectionConstructor$11() {
        return new LinkedHashSet();
    }

    private static /* synthetic */ Collection lambda$newCollectionConstructor$12() {
        return new TreeSet();
    }

    private static /* synthetic */ Collection lambda$newCollectionConstructor$13() {
        return new ArrayDeque();
    }

    private static /* synthetic */ Object lambda$newDefaultConstructor$7(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Object lambda$newDefaultConstructor$8(String str) {
        throw new JsonIOException(str);
    }

    private static /* synthetic */ Object lambda$newDefaultConstructor$9(Constructor constructor) {
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e3.getCause());
        }
    }

    private static /* synthetic */ Map lambda$newMapConstructor$14() {
        return new LinkedTreeMap();
    }

    private static /* synthetic */ Map lambda$newMapConstructor$15() {
        return new LinkedHashMap();
    }

    private static /* synthetic */ Map lambda$newMapConstructor$16() {
        return new TreeMap();
    }

    private static /* synthetic */ Map lambda$newMapConstructor$17() {
        return new ConcurrentHashMap();
    }

    private static /* synthetic */ Map lambda$newMapConstructor$18() {
        return new ConcurrentSkipListMap();
    }

    private static /* synthetic */ Object lambda$newSpecialCollectionConstructor$5(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }

    private static /* synthetic */ Object lambda$newSpecialCollectionConstructor$6(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }

    private static /* synthetic */ Object lambda$newUnsafeAllocator$19(Class cls) {
        try {
            return UnsafeAllocator.INSTANCE.newInstance(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    private static /* synthetic */ Object lambda$newUnsafeAllocator$20(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m15282m(Type type) {
        return lambda$newSpecialCollectionConstructor$5(type);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m15283n(String str) {
        return lambda$newDefaultConstructor$7(str);
    }

    private static ObjectConstructor<? extends Collection<? extends Object>> newCollectionConstructor(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new C4639a(11);
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new C4639a(12);
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new C4639a(13);
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new C4639a(14);
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls, ReflectionAccessFilter.FilterResult filterResult) {
        String strTryMakeAccessible;
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
                if (filterResult == filterResult2 || (ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) && (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    return (filterResult != filterResult2 || (strTryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) == null) ? new C0044a(declaredConstructor, 27) : new C4813b(strTryMakeAccessible, 2);
                }
                return new C4813b("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.", 1);
            } catch (NoSuchMethodException unused) {
            }
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newCollectionConstructor(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newMapConstructor(type, cls);
        }
        return null;
    }

    private static ObjectConstructor<? extends Map<? extends Object, Object>> newMapConstructor(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(LinkedTreeMap.class) && hasStringKeyType(type)) {
            return new C4639a(6);
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new C4639a(7);
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new C4639a(8);
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new C4639a(9);
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new C4639a(10);
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new C4863c(0, type);
        }
        if (cls == EnumMap.class) {
            return new C4863c(1, type);
        }
        return null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new C0044a(cls, 28);
        }
        String strM2C = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            strM2C = AbstractC0000a.m2C(strM2C, " Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        return new C4813b(strM2C, 0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m15284o(String str) {
        return lambda$newUnsafeAllocator$20(str);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Map m15285p() {
        return lambda$newMapConstructor$14();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m15286q(String str) {
        return lambda$get$2(str);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Collection m15287r() {
        return lambda$newCollectionConstructor$12();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Object m15288s(Constructor constructor) {
        return lambda$newDefaultConstructor$9(constructor);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Collection m15289t() {
        return lambda$newCollectionConstructor$13();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Object m15290u(String str) {
        return lambda$get$4(str);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        return get(typeToken, true);
    }

    public String toString() {
        return this.instanceCreators.toString();
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken, boolean z2) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        InstanceCreator<?> instanceCreator = this.instanceCreators.get(type);
        if (instanceCreator != null) {
            return new C4812a(instanceCreator, type, 0);
        }
        InstanceCreator<?> instanceCreator2 = this.instanceCreators.get(rawType);
        if (instanceCreator2 != null) {
            return new C4812a(instanceCreator2, type, 1);
        }
        ObjectConstructor<T> objectConstructorNewSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
        if (objectConstructorNewSpecialCollectionConstructor != null) {
            return objectConstructorNewSpecialCollectionConstructor;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        ObjectConstructor<T> objectConstructorNewDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (objectConstructorNewDefaultConstructor != null) {
            return objectConstructorNewDefaultConstructor;
        }
        ObjectConstructor<T> objectConstructorNewDefaultImplementationConstructor = newDefaultImplementationConstructor(type, rawType);
        if (objectConstructorNewDefaultImplementationConstructor != null) {
            return objectConstructorNewDefaultImplementationConstructor;
        }
        String strCheckInstantiable = checkInstantiable(rawType);
        if (strCheckInstantiable != null) {
            return new C4813b(strCheckInstantiable, 3);
        }
        if (!z2) {
            return new C4813b("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.", 4);
        }
        if (filterResult == ReflectionAccessFilter.FilterResult.ALLOW) {
            return newUnsafeAllocator(rawType);
        }
        return new C4813b("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.", 5);
    }
}
