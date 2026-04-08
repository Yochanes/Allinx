package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$toTypeProjection$1$descriptorRenderer$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6224x8e300b6 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.m18599g(withOptions, "$this$withOptions");
        withOptions.mo19780h(ClassifierNamePolicy.FULLY_QUALIFIED.f54207a);
        return Unit.f51459a;
    }
}
