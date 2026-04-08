package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractScopeAdapter implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: a */
    public final Set mo19035a() {
        return mo19995i().mo19035a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: b */
    public Collection mo19036b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.m18599g(name, "name");
        return mo19995i().mo19036b(name, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: c */
    public final Set mo19037c() {
        return mo19995i().mo19037c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: d */
    public Collection mo19038d(Name name, LookupLocation lookupLocation) {
        Intrinsics.m18599g(name, "name");
        return mo19995i().mo19038d(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    /* JADX INFO: renamed from: e */
    public final Set mo19039e() {
        return mo19995i().mo19039e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: f */
    public final ClassifierDescriptor mo19244f(Name name, LookupLocation location) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(location, "location");
        return mo19995i().mo19244f(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: g */
    public Collection mo19040g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.m18599g(kindFilter, "kindFilter");
        return mo19995i().mo19040g(kindFilter, function1);
    }

    /* JADX INFO: renamed from: h */
    public final MemberScope m19994h() {
        if (!(mo19995i() instanceof AbstractScopeAdapter)) {
            return mo19995i();
        }
        MemberScope memberScopeMo19995i = mo19995i();
        Intrinsics.m18597e(memberScopeMo19995i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractScopeAdapter) memberScopeMo19995i).m19994h();
    }

    /* JADX INFO: renamed from: i */
    public abstract MemberScope mo19995i();
}
