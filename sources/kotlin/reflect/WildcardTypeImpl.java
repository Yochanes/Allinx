package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/reflect/WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/TypeImpl;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalStdlibApi
final class WildcardTypeImpl implements WildcardType, TypeImpl {

    /* JADX INFO: renamed from: c */
    public static final WildcardTypeImpl f51737c = new WildcardTypeImpl(null, null);

    /* JADX INFO: renamed from: a */
    public final Type f51738a;

    /* JADX INFO: renamed from: b */
    public final Type f51739b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/reflect/WildcardTypeImpl$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public WildcardTypeImpl(Type type, Type type2) {
        this.f51738a = type;
        this.f51739b = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f51739b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f51739b;
        if (type != null) {
            return "? super " + TypesJVMKt.m18667a(type);
        }
        Type type2 = this.f51738a;
        if (type2 == null || Intrinsics.m18594b(type2, Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.m18667a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f51738a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
