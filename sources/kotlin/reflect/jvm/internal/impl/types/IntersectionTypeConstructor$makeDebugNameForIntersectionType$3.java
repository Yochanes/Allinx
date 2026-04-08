package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$3 extends Lambda implements Function1<KotlinType, CharSequence> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f54823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(Function1 function1) {
        super(1);
        this.f54823a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.m18598f(it, "it");
        return this.f54823a.invoke(it).toString();
    }
}
