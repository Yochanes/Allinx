package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleModuleClassResolver implements ModuleClassResolver {

    /* JADX INFO: renamed from: a */
    public JavaDescriptorResolver f52933a;

    /* JADX INFO: renamed from: a */
    public final ClassDescriptor m19236a(JavaClass javaClass) {
        JavaDescriptorResolver javaDescriptorResolver = this.f52933a;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver.m19983a(javaClass);
        }
        Intrinsics.m18606n("resolver");
        throw null;
    }
}
