package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface PackageFragmentDescriptor extends ClassOrPackageFragmentDescriptor {
    /* JADX INFO: renamed from: c */
    FqName mo18952c();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: e */
    ModuleDescriptor mo18828e();

    /* JADX INFO: renamed from: o */
    MemberScope mo18867o();
}
