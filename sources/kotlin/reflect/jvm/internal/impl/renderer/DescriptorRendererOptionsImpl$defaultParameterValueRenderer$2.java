package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 extends Lambda implements Function1<ValueParameterDescriptor, String> {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 f54302a = new DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ValueParameterDescriptor it = (ValueParameterDescriptor) obj;
        Intrinsics.m18599g(it, "it");
        return "...";
    }
}
