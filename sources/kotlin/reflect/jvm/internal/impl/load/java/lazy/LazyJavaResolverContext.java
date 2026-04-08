package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyJavaResolverContext {

    /* JADX INFO: renamed from: a */
    public final JavaResolverComponents f52922a;

    /* JADX INFO: renamed from: b */
    public final TypeParameterResolver f52923b;

    /* JADX INFO: renamed from: c */
    public final Object f52924c;

    /* JADX INFO: renamed from: d */
    public final Object f52925d;

    /* JADX INFO: renamed from: e */
    public final JavaTypeResolver f52926e;

    public LazyJavaResolverContext(JavaResolverComponents javaResolverComponents, TypeParameterResolver typeParameterResolver, Lazy lazy) {
        Intrinsics.m18599g(typeParameterResolver, "typeParameterResolver");
        this.f52922a = javaResolverComponents;
        this.f52923b = typeParameterResolver;
        this.f52924c = lazy;
        this.f52925d = lazy;
        this.f52926e = new JavaTypeResolver(this, typeParameterResolver);
    }
}
