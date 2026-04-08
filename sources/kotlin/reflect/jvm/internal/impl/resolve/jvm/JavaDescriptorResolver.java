package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaDescriptorResolver {

    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageFragmentProvider f54394a;

    /* JADX INFO: renamed from: b */
    public final JavaResolverCache f54395b;

    public JavaDescriptorResolver(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider) {
        JavaResolverCache javaResolverCache = JavaResolverCache.f52854a;
        this.f54394a = lazyJavaPackageFragmentProvider;
        this.f54395b = javaResolverCache;
    }

    /* JADX INFO: renamed from: a */
    public final ClassDescriptor m19983a(JavaClass javaClass) {
        FqName fqNameMo19136c = javaClass.mo19136c();
        ReflectJavaClass reflectJavaClassMo19142q = javaClass.mo19142q();
        if (reflectJavaClassMo19142q != null) {
            ClassDescriptor classDescriptorM19983a = m19983a(reflectJavaClassMo19142q);
            MemberScope memberScopeMo18891s0 = classDescriptorM19983a != null ? classDescriptorM19983a.mo18891s0() : null;
            ClassifierDescriptor classifierDescriptorMo19244f = memberScopeMo18891s0 != null ? memberScopeMo18891s0.mo19244f(javaClass.getName(), NoLookupLocation.f52690j) : null;
            if (classifierDescriptorMo19244f instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorMo19244f;
            }
        } else {
            FqName fqNameM19589e = fqNameMo19136c.m19589e();
            Intrinsics.m18598f(fqNameM19589e, "fqName.parent()");
            LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.m18402D(this.f54394a.mo18953a(fqNameM19589e));
            if (lazyJavaPackageFragment != null) {
                LazyJavaPackageScope lazyJavaPackageScope = lazyJavaPackageFragment.f53011p.f52946d;
                lazyJavaPackageScope.getClass();
                return lazyJavaPackageScope.m19281w(javaClass.getName(), javaClass);
            }
        }
        return null;
    }
}
