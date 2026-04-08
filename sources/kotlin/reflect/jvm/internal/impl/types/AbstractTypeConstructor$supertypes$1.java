package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AbstractTypeConstructor$supertypes$1 extends Lambda implements Function0<AbstractTypeConstructor.Supertypes> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractTypeConstructor f54787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$1(AbstractTypeConstructor abstractTypeConstructor) {
        super(0);
        this.f54787a = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new AbstractTypeConstructor.Supertypes(this.f54787a.mo18840g());
    }
}
