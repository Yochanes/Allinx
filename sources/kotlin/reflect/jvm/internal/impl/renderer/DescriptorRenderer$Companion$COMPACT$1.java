package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorRenderer$Companion$COMPACT$1 extends Lambda implements Function1<DescriptorRendererOptions, Unit> {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRenderer$Companion$COMPACT$1 f54213a = new DescriptorRenderer$Companion$COMPACT$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DescriptorRendererOptions withOptions = (DescriptorRendererOptions) obj;
        Intrinsics.m18599g(withOptions, "$this$withOptions");
        withOptions.mo19788l();
        withOptions.mo19772d(EmptySet.f51498a);
        return Unit.f51459a;
    }
}
