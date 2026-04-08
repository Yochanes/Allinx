package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class ErasedOverridabilityCondition$isOverridable$signatureTypes$1 extends Lambda implements Function1<ValueParameterDescriptor, KotlinType> {

    /* JADX INFO: renamed from: a */
    public static final ErasedOverridabilityCondition$isOverridable$signatureTypes$1 f52724a = new ErasedOverridabilityCondition$isOverridable$signatureTypes$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ValueParameterDescriptor) obj).getType();
    }
}
