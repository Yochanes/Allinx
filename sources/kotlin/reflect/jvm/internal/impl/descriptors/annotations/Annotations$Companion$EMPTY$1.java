package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Annotations$Companion$EMPTY$1 implements Annotations {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: H */
    public final boolean mo18994H(FqName fqName) {
        return Annotations.DefaultImpls.m18998b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: h */
    public final AnnotationDescriptor mo18995h(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return EmptyIterator.f51495a;
    }

    public final String toString() {
        return "EMPTY";
    }
}
