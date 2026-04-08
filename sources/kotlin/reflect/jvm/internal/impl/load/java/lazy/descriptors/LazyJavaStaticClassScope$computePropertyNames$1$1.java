package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements Function1<MemberScope, Collection<? extends Name>> {

    /* JADX INFO: renamed from: a */
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 f53070a = new LazyJavaStaticClassScope$computePropertyNames$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MemberScope it = (MemberScope) obj;
        Intrinsics.m18599g(it, "it");
        return it.mo19037c();
    }
}
