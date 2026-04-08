package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorRenderer$Companion$HTML$1 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRenderer$Companion$HTML$1 f54220a = new DescriptorRenderer$Companion$HTML$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.m18599g(withOptions, "$this$withOptions");
        withOptions.mo19791n();
        withOptions.mo19772d(DescriptorRendererModifier.f54236c);
        return Unit.f51459a;
    }
}
