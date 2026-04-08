package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class CompositeAnnotations$findAnnotation$1 extends Lambda implements Function1<Annotations, AnnotationDescriptor> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FqName f52345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations$findAnnotation$1(FqName fqName) {
        super(1);
        this.f52345a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Annotations it = (Annotations) obj;
        Intrinsics.m18599g(it, "it");
        return it.mo18995h(this.f52345a);
    }
}
