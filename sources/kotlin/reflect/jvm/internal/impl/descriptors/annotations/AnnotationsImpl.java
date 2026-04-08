package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationsImpl implements Annotations {

    /* JADX INFO: renamed from: a */
    public final List f52338a;

    public AnnotationsImpl(List list) {
        this.f52338a = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: H */
    public final boolean mo18994H(FqName fqName) {
        return Annotations.DefaultImpls.m18998b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: h */
    public final AnnotationDescriptor mo18995h(FqName fqName) {
        return Annotations.DefaultImpls.m18997a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return this.f52338a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return this.f52338a.iterator();
    }

    public final String toString() {
        return this.f52338a.toString();
    }
}
