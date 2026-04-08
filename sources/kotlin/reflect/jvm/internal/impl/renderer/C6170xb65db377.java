package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class C6170xb65db377 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

    /* JADX INFO: renamed from: a */
    public static final C6170xb65db377 f54219a = new C6170xb65db377(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.m18599g(withOptions, "$this$withOptions");
        withOptions.mo19772d(DescriptorRendererModifier.f54236c);
        return Unit.f51459a;
    }
}
