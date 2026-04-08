package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6030x246a49e3 extends Lambda implements Function1<DeclarationDescriptor, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final C6030x246a49e3 f52302a = new C6030x246a49e3(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeclarationDescriptor it = (DeclarationDescriptor) obj;
        Intrinsics.m18599g(it, "it");
        return Boolean.valueOf(!(it instanceof ConstructorDescriptor));
    }
}
