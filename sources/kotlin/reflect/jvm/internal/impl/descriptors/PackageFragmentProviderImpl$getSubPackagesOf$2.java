package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends Lambda implements Function1<FqName, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FqName f52287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageFragmentProviderImpl$getSubPackagesOf$2(FqName fqName) {
        super(1);
        this.f52287a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FqName it = (FqName) obj;
        Intrinsics.m18599g(it, "it");
        return Boolean.valueOf(!it.m19588d() && Intrinsics.m18594b(it.m19589e(), this.f52287a));
    }
}
