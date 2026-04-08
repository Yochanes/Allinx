package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6222x21acc51c extends Lambda implements Function1<UnwrappedType, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final C6222x21acc51c f55013a = new C6222x21acc51c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType it = (UnwrappedType) obj;
        Intrinsics.m18598f(it, "it");
        return Boolean.valueOf(it.mo19953I0() instanceof CapturedTypeConstructor);
    }
}
