package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class PackageFragmentProviderImpl$getSubPackagesOf$1 extends Lambda implements Function1<PackageFragmentDescriptor, FqName> {

    /* JADX INFO: renamed from: a */
    public static final PackageFragmentProviderImpl$getSubPackagesOf$1 f52286a = new PackageFragmentProviderImpl$getSubPackagesOf$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PackageFragmentDescriptor it = (PackageFragmentDescriptor) obj;
        Intrinsics.m18599g(it, "it");
        return it.mo18952c();
    }
}
