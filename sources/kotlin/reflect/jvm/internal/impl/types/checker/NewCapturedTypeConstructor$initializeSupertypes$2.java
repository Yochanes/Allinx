package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class NewCapturedTypeConstructor$initializeSupertypes$2 extends Lambda implements Function0<List<? extends UnwrappedType>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f54921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$initializeSupertypes$2(ArrayList arrayList) {
        super(0);
        this.f54921a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f54921a;
    }
}
