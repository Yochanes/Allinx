package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 f54221a = new DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.m18599g(withOptions, "$this$withOptions");
        withOptions.mo19788l();
        withOptions.mo19772d(EmptySet.f51498a);
        withOptions.mo19780h(ClassifierNamePolicy.SHORT.f54208a);
        withOptions.mo19778g();
        withOptions.mo19774e(ParameterNameRenderingPolicy.f54312c);
        withOptions.mo19766a();
        withOptions.mo19770c();
        withOptions.mo19792o();
        withOptions.mo19786k();
        return Unit.f51459a;
    }
}
