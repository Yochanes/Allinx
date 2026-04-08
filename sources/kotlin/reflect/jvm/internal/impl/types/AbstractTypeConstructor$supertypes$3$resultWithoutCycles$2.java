package kotlin.reflect.jvm.internal.impl.types;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2 extends Lambda implements Function1<KotlinType, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractTypeConstructor f54791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.f54791a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.m18599g(it, "it");
        this.f54791a.mo19019n(it);
        return Unit.f51459a;
    }
}
