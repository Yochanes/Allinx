package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface TypeParameterResolver {

    /* JADX INFO: compiled from: Proguard */
    public static final class EMPTY implements TypeParameterResolver {

        /* JADX INFO: renamed from: a */
        public static final EMPTY f52934a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        /* JADX INFO: renamed from: a */
        public final TypeParameterDescriptor mo19235a(JavaTypeParameter javaTypeParameter) {
            Intrinsics.m18599g(javaTypeParameter, "javaTypeParameter");
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    TypeParameterDescriptor mo19235a(JavaTypeParameter javaTypeParameter);
}
