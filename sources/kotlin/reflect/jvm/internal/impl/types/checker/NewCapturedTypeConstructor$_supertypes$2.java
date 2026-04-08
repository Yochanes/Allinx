package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class NewCapturedTypeConstructor$_supertypes$2 extends Lambda implements Function0<List<? extends UnwrappedType>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NewCapturedTypeConstructor f54920a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$_supertypes$2(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        super(0);
        this.f54920a = newCapturedTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function0 = this.f54920a.f54915b;
        if (function0 != null) {
            return (List) function0.invoke();
        }
        return null;
    }
}
