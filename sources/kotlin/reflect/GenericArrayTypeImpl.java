package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/reflect/GenericArrayTypeImpl;", "Ljava/lang/reflect/GenericArrayType;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalStdlibApi
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {

    /* JADX INFO: renamed from: a */
    public final Type f51709a;

    public GenericArrayTypeImpl(Type elementType) {
        Intrinsics.m18599g(elementType, "elementType");
        this.f51709a = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return Intrinsics.m18594b(this.f51709a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f51709a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return TypesJVMKt.m18667a(this.f51709a) + "[]";
    }

    public final int hashCode() {
        return this.f51709a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
