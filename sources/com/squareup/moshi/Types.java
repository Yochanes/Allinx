package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public final class Types {

    /* JADX INFO: renamed from: com.squareup.moshi.Types$1 */
    /* JADX INFO: compiled from: Proguard */
    class C50411 implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            name.getClass();
            switch (name) {
                case "toString":
                    throw null;
                case "equals":
                    Object obj2 = objArr[0];
                    throw null;
                case "hashCode":
                    return 0;
                case "annotationType":
                    return null;
                default:
                    return method.invoke(obj, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15423a(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? m15423a(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof Util.ParameterizedTypeImpl) {
                actualTypeArguments = null;
                ((Util.ParameterizedTypeImpl) parameterizedType).getClass();
            } else {
                actualTypeArguments = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof Util.ParameterizedTypeImpl) {
                actualTypeArguments2 = null;
                ((Util.ParameterizedTypeImpl) parameterizedType2).getClass();
            } else {
                actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            }
            return m15423a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m15423a(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return m15423a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
}
