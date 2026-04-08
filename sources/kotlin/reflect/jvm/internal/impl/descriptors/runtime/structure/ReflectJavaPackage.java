package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {

    /* JADX INFO: renamed from: a */
    public final FqName f52673a;

    public ReflectJavaPackage(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        this.f52673a = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    /* JADX INFO: renamed from: c */
    public final FqName mo19162c() {
        return this.f52673a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaPackage) {
            return Intrinsics.m18594b(this.f52673a, ((ReflectJavaPackage) obj).f52673a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return EmptyList.f51496a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: h */
    public final JavaAnnotation mo19137h(FqName fqName) {
        Intrinsics.m18599g(fqName, "fqName");
        return null;
    }

    public final int hashCode() {
        return this.f52673a.hashCode();
    }

    public final String toString() {
        return ReflectJavaPackage.class.getName() + ": " + this.f52673a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    /* JADX INFO: renamed from: o */
    public final void mo19163o(Function1 function1) {
    }
}
