package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class FilteredAnnotations implements Annotations {

    /* JADX INFO: renamed from: a */
    public final Annotations f52347a;

    /* JADX INFO: renamed from: b */
    public final Function1 f52348b;

    public FilteredAnnotations(Annotations annotations, Function1 function1) {
        this.f52347a = annotations;
        this.f52348b = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: H */
    public final boolean mo18994H(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        if (((Boolean) this.f52348b.invoke(fqName)).booleanValue()) {
            return this.f52347a.mo18994H(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: h */
    public final AnnotationDescriptor mo18995h(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        if (((Boolean) this.f52348b.invoke(fqName)).booleanValue()) {
            return this.f52347a.mo18995h(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        Annotations annotations = this.f52347a;
        if ((annotations instanceof Collection) && ((Collection) annotations).isEmpty()) {
            return false;
        }
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            FqName fqNameMo18990c = it.next().mo18990c();
            if (fqNameMo18990c != null && ((Boolean) this.f52348b.invoke(fqNameMo18990c)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : this.f52347a) {
            FqName fqNameMo18990c = annotationDescriptor.mo18990c();
            if (fqNameMo18990c != null && ((Boolean) this.f52348b.invoke(fqNameMo18990c)).booleanValue()) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }
}
