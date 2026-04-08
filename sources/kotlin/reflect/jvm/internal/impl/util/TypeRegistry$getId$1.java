package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class TypeRegistry$getId$1 extends Lambda implements Function1<String, Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TypeRegistry f55083a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeRegistry$getId$1(TypeRegistry typeRegistry) {
        super(1);
        this.f55083a = typeRegistry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.m18599g(it, "it");
        return Integer.valueOf(this.f55083a.f55082b.getAndIncrement());
    }
}
