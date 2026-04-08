package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class PrimitiveType$typeFqName$2 extends Lambda implements Function0<FqName> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PrimitiveType f52042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveType$typeFqName$2(PrimitiveType primitiveType) {
        super(0);
        this.f52042a = primitiveType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return StandardNames.f52059k.m19587c(this.f52042a.f52037a);
    }
}
