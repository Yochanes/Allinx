package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6063xd2f8c9a5 extends Lambda implements Function1<MemberScope, Collection<? extends PropertyDescriptor>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Name f53069a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6063xd2f8c9a5(Name name) {
        super(1);
        this.f53069a = name;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MemberScope it = (MemberScope) obj;
        Intrinsics.m18599g(it, "it");
        return it.mo19036b(this.f53069a, NoLookupLocation.f52687f);
    }
}
