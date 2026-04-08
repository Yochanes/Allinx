package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class CompositeAnnotations implements Annotations {

    /* JADX INFO: renamed from: a */
    public final List f52344a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C60331 extends Lambda implements Function1<Annotations, Sequence<? extends AnnotationDescriptor>> {

        /* JADX INFO: renamed from: a */
        public static final C60331 f52346a = new C60331(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Annotations it = (Annotations) obj;
            Intrinsics.m18599g(it, "it");
            return CollectionsKt.m18444n(it);
        }
    }

    public CompositeAnnotations(List list) {
        this.f52344a = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: H */
    public final boolean mo18994H(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        Iterator it = CollectionsKt.m18444n(this.f52344a).f51494a.iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).mo18994H(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: h */
    public final AnnotationDescriptor mo18995h(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        FilteringSequence.C62391 c62391 = new FilteringSequence.C62391();
        return (AnnotationDescriptor) (!c62391.hasNext() ? null : c62391.next());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        List list = this.f52344a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return new FlatteningSequence.C62401();
    }

    public CompositeAnnotations(Annotations... annotationsArr) {
        this.f52344a = ArraysKt.m18364d0(annotationsArr);
    }
}
