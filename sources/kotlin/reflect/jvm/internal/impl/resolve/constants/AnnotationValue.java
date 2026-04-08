package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationValue extends ConstantValue<AnnotationDescriptor> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationValue(AnnotationDescriptor value) {
        super(value);
        Intrinsics.m18599g(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* JADX INFO: renamed from: a */
    public final KotlinType mo19958a(ModuleDescriptor module) {
        Intrinsics.m18599g(module, "module");
        return ((AnnotationDescriptor) this.f54370a).getType();
    }
}
