package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class DescriptorRendererImpl$renderTypeConstructor$1 extends Lambda implements Function1<KotlinType, Object> {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRendererImpl$renderTypeConstructor$1 f54234a = new DescriptorRendererImpl$renderTypeConstructor$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.m18599g(it, "it");
        if (!(it instanceof StubTypeForBuilderInference)) {
            return it;
        }
        throw null;
    }
}
