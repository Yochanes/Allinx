package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PackageFragmentDescriptorImpl extends DeclarationDescriptorNonRootImpl implements PackageFragmentDescriptor {

    /* JADX INFO: renamed from: f */
    public final FqName f52541f;

    /* JADX INFO: renamed from: g */
    public final String f52542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageFragmentDescriptorImpl(ModuleDescriptor module, FqName fqName) {
        super(module, Annotations.Companion.f52337a, fqName.m19591g(), SourceElement.f52298a);
        Intrinsics.m18599g(module, "module");
        Intrinsics.m18599g(fqName, "fqName");
        this.f52541f = fqName;
        this.f52542g = "package " + fqName + " of " + module;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: F */
    public final Object mo18881F(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.mo18901f(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    /* JADX INFO: renamed from: c */
    public final FqName mo18952c() {
        return this.f52541f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ DeclarationDescriptor mo18828e() {
        return mo18828e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    /* JADX INFO: renamed from: g */
    public SourceElement mo18829g() {
        return SourceElement.f52298a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return this.f52542g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: e */
    public final ModuleDescriptor mo18828e() {
        DeclarationDescriptor declarationDescriptorMo18828e = super.mo18828e();
        Intrinsics.m18597e(declarationDescriptorMo18828e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (ModuleDescriptor) declarationDescriptorMo18828e;
    }
}
