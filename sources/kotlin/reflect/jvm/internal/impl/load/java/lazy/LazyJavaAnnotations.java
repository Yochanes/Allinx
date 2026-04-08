package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f52913a;

    /* JADX INFO: renamed from: b */
    public final JavaAnnotationOwner f52914b;

    /* JADX INFO: renamed from: c */
    public final boolean f52915c;

    /* JADX INFO: renamed from: d */
    public final MemoizedFunctionToNullable f52916d;

    public LazyJavaAnnotations(LazyJavaResolverContext c2, JavaAnnotationOwner annotationOwner, boolean z2) {
        Intrinsics.m18599g(c2, "c");
        Intrinsics.m18599g(annotationOwner, "annotationOwner");
        this.f52913a = c2;
        this.f52914b = annotationOwner;
        this.f52915c = z2;
        this.f52916d = c2.f52922a.f52888a.m20083h(new LazyJavaAnnotations$annotationDescriptors$1(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: H */
    public final boolean mo18994H(FqName fqName) {
        return Annotations.DefaultImpls.m18998b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: h */
    public final AnnotationDescriptor mo18995h(FqName fqName) {
        AnnotationDescriptor annotationDescriptor;
        Intrinsics.m18599g(fqName, "fqName");
        JavaAnnotationOwner javaAnnotationOwner = this.f52914b;
        JavaAnnotation javaAnnotationMo19137h = javaAnnotationOwner.mo19137h(fqName);
        if (javaAnnotationMo19137h != null && (annotationDescriptor = (AnnotationDescriptor) this.f52916d.invoke(javaAnnotationMo19137h)) != null) {
            return annotationDescriptor;
        }
        Name name = JavaAnnotationMapper.f52843a;
        return JavaAnnotationMapper.m19213a(fqName, javaAnnotationOwner, this.f52913a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return this.f52914b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        JavaAnnotationOwner javaAnnotationOwner = this.f52914b;
        TransformingSequence transformingSequenceM20372n = SequencesKt.m20372n(CollectionsKt.m18444n(javaAnnotationOwner.getAnnotations()), this.f52916d);
        Name name = JavaAnnotationMapper.f52843a;
        return new FilteringSequence.C62391();
    }
}
