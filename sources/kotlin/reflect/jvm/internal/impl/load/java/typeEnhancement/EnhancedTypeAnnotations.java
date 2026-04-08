package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class EnhancedTypeAnnotations implements Annotations {

    /* JADX INFO: renamed from: a */
    public final FqName f53114a;

    public EnhancedTypeAnnotations(FqName fqNameToMatch) {
        Intrinsics.m18599g(fqNameToMatch, "fqNameToMatch");
        this.f53114a = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: H */
    public final boolean mo18994H(FqName fqName) {
        return Annotations.DefaultImpls.m18998b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: h */
    public final AnnotationDescriptor mo18995h(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        if (fqName.equals(this.f53114a)) {
            return EnhancedTypeAnnotationDescriptor.f53113a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return EmptyIterator.f51495a;
    }
}
