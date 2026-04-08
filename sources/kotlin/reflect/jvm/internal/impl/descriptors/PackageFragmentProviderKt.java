package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PackageFragmentProviderKt {
    /* JADX INFO: renamed from: a */
    public static final void m18957a(PackageFragmentProvider packageFragmentProvider, FqName fqName, ArrayList arrayList) {
        Intrinsics.m18599g(packageFragmentProvider, "<this>");
        Intrinsics.m18599g(fqName, "fqName");
        if (packageFragmentProvider instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized) packageFragmentProvider).mo18955b(fqName, arrayList);
        } else {
            arrayList.addAll(packageFragmentProvider.mo18953a(fqName));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m18958b(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        Intrinsics.m18599g(packageFragmentProvider, "<this>");
        Intrinsics.m18599g(fqName, "fqName");
        return packageFragmentProvider instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized) packageFragmentProvider).mo18956c(fqName) : m18959c(packageFragmentProvider, fqName).isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m18959c(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        Intrinsics.m18599g(packageFragmentProvider, "<this>");
        Intrinsics.m18599g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        m18957a(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }
}
