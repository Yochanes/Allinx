package com.squareup.moshi.internal;

import com.squareup.moshi.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Util {

    /* JADX INFO: renamed from: a */
    public static final Set f43425a = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: b */
    public static final Type[] f43426b = new Type[0];

    /* JADX INFO: renamed from: c */
    public static final Map f43427c;

    /* JADX INFO: compiled from: Proguard */
    public static final class GenericArrayTypeImpl implements GenericArrayType {
        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Types.m15423a(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return Util.m15424a(null) + "[]";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ParameterizedTypeImpl implements ParameterizedType {
        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Types.m15423a(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            throw null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return null;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return null;
        }

        public final int hashCode() {
            Arrays.hashCode((Object[]) null);
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WildcardTypeImpl implements WildcardType {
        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Types.m15423a(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            return Util.f43426b;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{null};
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "? extends " + Util.m15424a(null);
        }
    }

    static {
        try {
            Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f43427c = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static String m15424a(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }
}
