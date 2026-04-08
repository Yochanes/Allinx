package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorRenderer$Companion$DEBUG_TEXT$1 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRenderer$Companion$DEBUG_TEXT$1 f54217a = new DescriptorRenderer$Companion$DEBUG_TEXT$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.m18599g(withOptions, "$this$withOptions");
        withOptions.mo19768b();
        withOptions.mo19780h(ClassifierNamePolicy.FULLY_QUALIFIED.f54207a);
        withOptions.mo19772d(DescriptorRendererModifier.f54236c);
        return Unit.f51459a;
    }
}
