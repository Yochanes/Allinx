package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class UtilsKt {
    /* JADX INFO: renamed from: a */
    public static final void m19168a(LookupTracker.DO_NOTHING do_nothing, LookupLocation from, ClassDescriptor scopeOwner, Name name) {
        Intrinsics.m18599g(do_nothing, "<this>");
        Intrinsics.m18599g(from, "from");
        Intrinsics.m18599g(scopeOwner, "scopeOwner");
        Intrinsics.m18599g(name, "name");
    }

    /* JADX INFO: renamed from: b */
    public static final void m19169b(LookupTracker.DO_NOTHING do_nothing, LookupLocation from, PackageFragmentDescriptor scopeOwner, Name name) {
        Intrinsics.m18599g(do_nothing, "<this>");
        Intrinsics.m18599g(from, "from");
        Intrinsics.m18599g(scopeOwner, "scopeOwner");
        Intrinsics.m18599g(name, "name");
        scopeOwner.mo18952c().m19586b();
        Intrinsics.m18598f(name.m19608b(), "name.asString()");
    }
}
