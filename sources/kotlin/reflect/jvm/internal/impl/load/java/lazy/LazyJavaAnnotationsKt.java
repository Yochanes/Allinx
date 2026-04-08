package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyJavaAnnotationsKt {
    /* JADX INFO: renamed from: a */
    public static final LazyJavaAnnotations m19233a(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner annotationsOwner) {
        Intrinsics.m18599g(lazyJavaResolverContext, "<this>");
        Intrinsics.m18599g(annotationsOwner, "annotationsOwner");
        return new LazyJavaAnnotations(lazyJavaResolverContext, annotationsOwner, false);
    }
}
