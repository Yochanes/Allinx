package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyPackageFragmentDescriptor extends PackageFragmentDescriptorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyPackageFragmentDescriptor(ModuleDescriptor module, FqName fqName) {
        super(module, fqName);
        Intrinsics.m18599g(module, "module");
        Intrinsics.m18599g(fqName, "fqName");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ MemberScope mo18867o() {
        return MemberScope.Empty.f54457b;
    }
}
