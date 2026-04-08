package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class JvmBuiltInsCustomizer$getFunctions$2 extends Lambda implements Function1<MemberScope, Collection<? extends SimpleFunctionDescriptor>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Name f52216a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getFunctions$2(Name name) {
        super(1);
        this.f52216a = name;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MemberScope it = (MemberScope) obj;
        Intrinsics.m18599g(it, "it");
        return it.mo19038d(this.f52216a, NoLookupLocation.f52683a);
    }
}
